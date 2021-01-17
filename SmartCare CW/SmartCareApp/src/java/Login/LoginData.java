package Login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

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
    
    public void Add_Patient(String uname,String pass,String name, String DOB, String address,String PO,String Type) throws SQLException{
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
        
        String q3 = "INSERT INTO `demo`.`clients` (`cName`, `cDOB`, `cAddress`, `cPO`, `cType`, `uName`) VALUES (";
        String q4 = "'"+name +"', '"+ DOB+"', '"+ address+"', '"+ PO+"', '"+Type+"', '"+uname+"')";
        
        String InsertToUser = q1+q2;
        String InsertToClient = q3+q4;
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        ms.executeUpdate(InsertToUser);
        ms.executeUpdate(InsertToClient);
        
        System.out.println("Added client");
        
    }
    
    public void Add_Doc_or_Nurse(String eName,String ePO, String eDOB, String eAddress, String uName, String ePass, String Role) throws SQLException{
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String q1 = "INSERT INTO `demo`.`users` (`uname`, `passwd`, `job`) VALUES (";
        String q2 = "'"+ uName+"', '"+ePass+"', '"+Role+"')";
        
        String q3 = "INSERT INTO `demo`.`employee` (`eName`, `eAddress`,`ePO`, `uName`,`eDOB`,eRole) VALUES ('";
        String q4 = eName + "', '" + eAddress + "', '" + ePO+ "', '" + uName + "', '" + eDOB + "', '" +Role+"')";
        String InsertToUser = q1+q2;
        String InsertToEmployee = q3+q4;
        
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        ms.executeUpdate(InsertToUser);
        ms.executeUpdate(InsertToEmployee);
        
        System.out.println("Added Doctor or Nurse");
        
    }
    
    public void Add_Request(String eName, String eDOB, String eAddress, String ePO, String uName, String ePass, String Role) throws SQLException{
    try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        
        String q1 = "INSERT INTO `demo`.`adding_request` (`rName`, `rDOB`, `rAddress`, `rPO`, `rUname`, `rPW`, `rJob`) VALUES ( ";
        String q2 = "'" + eName +"','"+eDOB+"','"+eAddress+"','"+ePO+"','"+uName+"','"+ePass+"','"+Role+"');";
        
        String InsertToRequest = q1+q2;
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        ms.executeUpdate(InsertToRequest);
        
        System.out.println("Added REquest");
    }
    
    public void Add_From_Request(String IDs){
        
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        
        try{
            String q = "SELECT * FROM demo.adding_request where rID=";
            con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            List<Request> list = new ArrayList<>();
            for(int i = 0 ; i < IDs.length();i++){
                int id = Character.getNumericValue(IDs.charAt(i));
                ms = con.createStatement();
                rs = ms.executeQuery(q + Integer.toString(id));
                
                while(rs.next()){
                Request nq = new Request();
                nq.setID(rs.getString("rID"));
                nq.setName(rs.getString("rName"));
                nq.setDOB(rs.getString("rDOB"));
                nq.setAddress(rs.getString("rAddress"));
                nq.setPO(rs.getString("rPO"));
                nq.setUname(rs.getString("rUname"));
                nq.setPW(rs.getString("rPW"));
                nq.setJob(rs.getString("rJob"));
                list.add(nq);
                }
            }
            for(Request i : list){
                Add_Doc_or_Nurse(i.getName(), i.getPO(), i.getDOB(), i.getAddress(), i.getUname(), i.getPW(), i.getJob());
                Delete_From_Request(i.getID());
            }
        }
        catch (Exception e){
            
        }
    }
    public List<Request> Display_Request() throws SQLException{
        String q1 = "SELECT * FROM demo.adding_request;";
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q1);
        
        List<Request> list = new ArrayList<Request>();
        
        while(rs.next()){
            Request rq = new Request();
            rq.setID(rs.getString("rID"));
            rq.setName(rs.getString("rName"));
            rq.setDOB(rs.getString("rDOB"));
            rq.setAddress(rs.getString("rAddress"));
            rq.setPO(rs.getString("rPO"));
            rq.setUname(rs.getString("rUname"));
            rq.setPW(rs.getString("rPW"));
            rq.setJob(rs.getString("rJob"));
            list.add(rq);
        }
        return list;
        
    }

    public void Delete_From_Request(String id) throws SQLException {
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String q = "DELETE FROM demo.adding_request where rID =" + id;
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        ms.executeUpdate(q);
        
        System.out.println("Deleted ID: " + id +"from Request");
        
        
    }
    
    public List<String> Get_Doc_Nurse_List (int mode) throws SQLException{
        JSONArray arr = new JSONArray();
        JSONObject tmp;
        List<String> tempList = new ArrayList<>();
        
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String q = null;
        
        if(mode == 1){
            q = "SELECT * FROM demo.employee where eRole='doctor';";
        }
        else{
            q = "SELECT * FROM demo.employee where eRole='nurse';";
        }
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q);
        
        while(rs.next()){
            tmp = new JSONObject();
            tmp.put("name", rs.getString("eName"));
            arr.put(tmp);
            tempList.add(rs.getString("eName"));
        }
        return tempList;
    }
    public List<String> Time_Gene(){
    List<String> tempList = new ArrayList<>();
    String hour = "09";
    String minute = "00";
    
    while(!hour.equals("18") || !minute.equals("10")){
        StringBuilder sb = new StringBuilder();
        sb.append(hour);
        sb.append(":");
        sb.append(minute);
        if(minute.equals("50")){
            int h = Integer.parseInt(hour);
            h = h + 1;
            hour = Integer.toString(h);
            minute = "00"; 
        }
        else{
            int mini = Integer.parseInt(minute);
            mini += 10;
            minute = Integer.toString(mini);
        }
        tempList.add(sb.toString());
    }
    return tempList;
    }
    
    public List<String> getServ() throws SQLException{
        List<String> tempList = new ArrayList<>();
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        
        String q = "SELECT * FROM demo.services";
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q);
        
        while(rs.next()){
            tempList.add(rs.getString("sName"));
        }
        return tempList;
    }
    
    public void Insert_To_Booking(String eName, String cUname, String sDate, String sTime,String sName,String sSlot) throws SQLException{
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        String eID = get_eID_from_Name(eName);
        String cID = get_uID_from_Uname(cUname);
        sTime = sTime + ":00";
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        
        String q1 = "INSERT INTO `demo`.`booking_slots` (`eID`, `cID`, `sDate`, `sTime`, `sName`, `sSlot`) VALUES (' ";
        String q2 = eID + "','"+cID+ "','"+sDate+ "','"+sTime+ "','"+sName+ "','"+sSlot+"');";
        try {
            con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            ms = con.createStatement();
            ms.executeUpdate(q1+q2);
            System.out.println("Added to Booking");
        } catch (SQLException ex) {
            Logger.getLogger(LoginData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean check_Book_Slot(String sDate, String sTime,String eName) throws SQLException{
        List<String> timeList = Time_Gene();
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        String eID = get_eID_from_Name(eName);
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        
        String q = "SELECT * FROM demo.booking_slots where eID = '" + eID +"' and sDate ='" + sDate +"'";
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q);
        while(rs.next()){
            String time = rs.getTime("sTime").toString();
            
            int slot = Integer.parseInt(rs.getString("sSlot"));
            time = time.substring(0, 5);
            System.out.println("Time from mysql " + time);
            int index = timeList.indexOf(time);
            for(int i = 0; i < slot;i++){
                timeList.set(index, "!");
                index++;
            }
        }
        if(timeList.contains(sTime)){
            return true;
        }
        return false;
    }
    
    public String get_eID_from_Name(String eName) throws SQLException{
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String eID = "";
        String q = "SELECT * FROM demo.employee where eName = '" + eName +"'";
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q);
        
        while(rs.next()){
            eID = rs.getString("eID");
        }
        return eID;
    }
    
    public String get_uID_from_Uname(String Uname) throws SQLException{
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String eID = "";
        String q = "SELECT * FROM demo.clients where uName = '" + Uname +"'";
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q);
        
        while(rs.next()){
            eID = rs.getString("cID");
        }
        return eID;
    }
    
    public String get_Slot_From_Service_Name(String sName) throws SQLException{
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String eID = "";
        String q = "SELECT * FROM demo.services where sName = '" + sName +"'";
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q);
        
        while(rs.next()){
            eID = rs.getString("sSlot");
        }
        return eID;
    }
    
}
