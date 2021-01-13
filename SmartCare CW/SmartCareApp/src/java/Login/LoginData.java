package Login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lil Shil
 */
public class LoginData {
    public LoginData() {
    }
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String dbName = "demo";
    String userId = "root";
    String password = "admin";
    public String checkLog(String user, String pass){
        

        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        
        try{
            String q = "SELECT * FROM demo.users where uname='" + user + "' and passwd='" + pass+"'";
            con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            ms = con.createStatement();
            rs = ms.executeQuery(q);
            while(rs.next()){
                System.out.print("Success");
                return rs.getString("job");
            }
        }
        catch (Exception e){
            
        }
        return "!";
    }
    
    public boolean check_Reg(String uname){
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        
        try{
            String q = "SELECT * FROM demo.users where uname='" + uname +"'";
            con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            ms = con.createStatement();
            rs = ms.executeQuery(q);
            while(rs.next()){
                System.out.println("Alrd exist");
                return false;
            }
        }
        catch (Exception e){
            
        }
        return true;
    }
    
    public void Add_Patient(String uname,String pass,String name, String address,String Type) throws SQLException{
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String job = "client";
        String q1 = "INSERT INTO `demo`.`users` (`uname`, `passwd`, `job`) VALUES (";
        String q2 = "'"+ uname+"', '"+pass+"', '"+job+"')";
        
        String q3 = "INSERT INTO `demo`.`clients` (`cName`, `cAddress`, `cType`, `uName`) VALUES (";
        String q4 = "'"+name +"', '"+ address+"', '"+Type+"', '"+uname+"')";
        
        String InsertToUser = q1+q2;
        String InsertToClient = q3+q4;
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        ms.executeUpdate(InsertToUser);
        ms.executeUpdate(InsertToClient);
        
        System.out.println("Added client");
        
    }
}
