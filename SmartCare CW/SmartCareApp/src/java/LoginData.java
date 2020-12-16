



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
    
    public boolean checkLog(String user, String pass){
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://localhost:3306/";
        String dbName = "demo";
        String userId = "root";
        String password = "admin";

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
                return true;
            }
        }
        catch (Exception e){
        }
        
        
        return false;
    }
}
