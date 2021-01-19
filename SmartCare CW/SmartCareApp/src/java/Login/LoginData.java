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
         try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
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
    
    public void Delete_From_Booking(String sID) throws SQLException{
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String q = "DELETE FROM demo.booking_slots where sID =" + sID;
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        ms.executeUpdate(q);
        System.out.println("Deleted ID:" + sID +" from booking");
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
    
    public String get_cName_From_cID(String cID) throws SQLException{
        try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String eID = "";
        String q = "SELECT * FROM demo.clients where cID = '" + cID +"'";
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q);
        
        while(rs.next()){
            eID = rs.getString("cName");
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
   public String get_EID_From_Uname(String Uname) throws SQLException{
    try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String eID = "";
        String q = "SELECT * FROM demo.employee where uName = '" + Uname +"'";
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q);
        
        while(rs.next()){
            eID = rs.getString("eID");
        }
        return eID;
   }
   public List<Booking_OBJ> get_Booking_List(String Uname,String Date) throws SQLException{
       List<Booking_OBJ> tempList = new ArrayList<>();
       String eID = get_EID_From_Uname(Uname);
       System.out.println("eID in Book List " + eID);
       try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
       
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String q = "SELECT * FROM demo.booking_slots where eID = '" + eID +"' and sDate = '" + Date +"'";
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q);
       
        while(rs.next()){
        Booking_OBJ bko = new Booking_OBJ();
        bko.setcID(get_cName_From_cID(rs.getString("cID")));
        bko.setsID(rs.getString("sID"));
        bko.setsName(rs.getString("sName"));
        bko.setsTime(rs.getString("sTime"));
        tempList.add(bko);
        }
       return tempList;
   }
   
   public Booking_OBJ get_Booking_by_ID(String sID) throws SQLException{
       Booking_OBJ bk = new Booking_OBJ();
       try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
       
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String q = "SELECT * FROM demo.booking_slots where sID = '" + sID +"'";
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q);
        
        while(rs.next()){
            bk.setsID(rs.getString("sID"));
            bk.seteID(rs.getString("eID"));
            bk.setcID(rs.getString("cID"));
            bk.setsDate(rs.getString("sDate"));
            bk.setsTime(rs.getString("sTime"));
            bk.setsName(rs.getString("sName"));
            bk.setsSlot(rs.getString("sSlot"));
        }
        
        return bk;
   }
   
   public String Serv_Price_By_sName(String sName) throws SQLException{
       String temp = "";
       
       try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        
       
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        String q = "SELECT * FROM demo.services where sName = '" + sName +"'";
        con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
        ms = con.createStatement();
        rs = ms.executeQuery(q);
        while(rs.next()){
            temp = rs.getString("sPrice");
        }
       return temp;
   }
   
   public void Insert_To_Operation(Booking_OBJ bk) throws SQLException{
       try {
        Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        String charge = Serv_Price_By_sName(bk.getsName());
        Connection con = null;
        Statement ms = null;
        ResultSet rs = null;
        
        String q1 = "INSERT INTO `demo`.`operations` (`eID`, `cID`, `oDate`, `oTime`, `nSlot`, `charge`, `status`, `sName`) VALUES (' ";
        String q2 = bk.geteID() + "','"+bk.getcID()+ "','"+bk.getsDate()+ "','"+bk.getsTime()+ "','"+bk.getsSlot()+ "','"+charge+"', 'processing', '" + bk.getsName()+ "');";
        try {
            con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            ms = con.createStatement();
            ms.executeUpdate(q1+q2);
            System.out.println("Added to Operation");
            Delete_From_Booking(bk.getsID());
        } catch (SQLException ex) {
            Logger.getLogger(LoginData.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   public List<Operation> get_Op(int mode, String Uname,String Date) throws SQLException{
       List<Operation> opL = new ArrayList<>();
       Connection con = null;
       Statement ms = null;
       ResultSet rs = null;
       String eID = get_EID_From_Uname(Uname);
       String q = "";
       if(mode == 0){
           q = "SELECT * FROM demo.operations where status ='processing' and eID ='"+ eID+"' and oDate ='" +Date+"';";
       }
       else{
           q = "SELECT * FROM demo.operations where status ='delay';";
       }
       con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
       ms = con.createStatement();
       rs = ms.executeQuery(q);
       
       while(rs.next()){
           Operation op = new Operation();
           op.setoID(rs.getString("oID"));
           op.seteID(rs.getString("eID"));
           op.setcID(rs.getString("cID"));
           op.setoDate(rs.getString("oDate"));
           op.setoTime(rs.getString("oTime"));
           op.setnSlot(rs.getString("nSlot"));
           op.setCharge(rs.getString("charge"));
           op.setStatus(rs.getString("status"));
           op.setsName(rs.getString("sName"));
           opL.add(op);
       }
       return opL;
   }
   
   public void From_Op_To_Payment(String oID) throws SQLException{
       Connection con = null;
       Statement ms = null;
       ResultSet rs = null;
       Operation op = new Operation();
       String q = "SELECT * FROM demo.operations where oID = '" +oID+"' ";
       con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
       ms = con.createStatement();
       rs = ms.executeQuery(q);
       while(rs.next()){
           op.setoID(rs.getString("oID"));
           op.seteID(rs.getString("eID"));
           op.setcID(rs.getString("cID"));
           op.setoDate(rs.getString("oDate"));
           op.setoTime(rs.getString("oTime"));
           op.setnSlot(rs.getString("nSlot"));
           op.setCharge(rs.getString("charge"));
           op.setStatus(rs.getString("status"));
           op.setsName(rs.getString("sName"));
       }
       
       String q2 = "INSERT INTO `demo`.`invoice` (`cID`, `sName`, `dName`, `total`,`status`) VALUES ('";
       String q3 = op.getcID() +"','"+ op.getsName()+"','No Drug','"+op.getCharge()+"','unpaid') ;";
       ms = con.createStatement();
       ms.executeUpdate(q2+q3);
       System.out.println("Added to invoice without Drug");
       
       String q4 = "DELETE FROM `demo`.`operations` WHERE (`oID` ='";
       String q5 = op.getoID() + "');";
       ms = con.createStatement();
       ms.executeUpdate(q4+q5);
       
       System.out.println("Delete from operation");
       
       
   }
   
   public List<Drug> Drug_List() throws SQLException{
       List<Drug> DL = new ArrayList<>();
       
       Connection con = null;
       Statement ms = null;
       ResultSet rs = null;
       Operation op = new Operation();
       String q = "SELECT * FROM demo.drugs;";
       con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
       ms = con.createStatement();
       rs = ms.executeQuery(q);
       
       while(rs.next()){
           Drug nd = new Drug();
           nd.setdID(rs.getString("dID"));
           nd.setdName(rs.getString("dName"));
           nd.setdPrice(rs.getString("dPrice"));
           nd.setdCat(rs.getString("dCategory"));
           DL.add(nd);
       }
       
       
       return DL;
   }
   
   public String get_cID_From_oID(String oID) throws SQLException{
       String cID = "";
       Connection con = null;
       Statement ms = null;
       ResultSet rs = null;
       Operation op = new Operation();
       String q = "SELECT * FROM demo.operations where oID = '" +oID+"' ";
       con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
       ms = con.createStatement();
       rs = ms.executeQuery(q);
       
       while(rs.next()){
        cID = rs.getString("cID");
       }
       return cID;
   }
   
   public List<Invoice> get_Invoice_From_cID(String cID) throws SQLException{
       List<Invoice> InL = new ArrayList<>();
       Connection con = null;
       Statement ms = null;
       ResultSet rs = null;
       String q = "SELECT * FROM demo.invoice where cID = '" +cID+"' ";
       con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
       ms = con.createStatement();
       rs = ms.executeQuery(q);
       
       while(rs.next()){
           Invoice inv = new Invoice();
           inv.setiID(rs.getString("iID"));
           inv.setcID(rs.getString("cID"));
           inv.setsName(rs.getString("sName"));
           inv.setdName(rs.getString("dName"));
           inv.setTotal(rs.getString("total"));
           inv.setStatus(rs.getString("status"));
           InL.add(inv);
       }
       return InL;
   }
   public String get_DrPrice_from_drName(String drName) throws SQLException{
       String drPrice = "";
       Operation otemp = new Operation();
       Connection con = null;
       Statement ms = null;
       ResultSet rs = null;
       String q = "SELECT * FROM demo.drugs where dName = '" + drName + "'";
       con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
       ms = con.createStatement();
       rs = ms.executeQuery(q);
       
       while(rs.next()){
           drPrice = rs.getString("dPrice");
       }
       return drPrice;
   }
   public void From_Pre_To_Pay(String oID, String drName, String drQuan,String drNote) throws SQLException{
       Operation otemp = new Operation();
       Connection con = null;
       Statement ms = null;
       ResultSet rs = null;
       Operation op = new Operation();
       String q = "SELECT * FROM demo.operations where oID = '" +oID+"' ";
       con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
       ms = con.createStatement();
       rs = ms.executeQuery(q);
       String drPrice = get_DrPrice_from_drName(drName);
       while(rs.next()){
          otemp.setoID(oID);
          otemp.setcID(rs.getString("cID"));
          otemp.seteID(rs.getString("eID"));
          otemp.setoDate(rs.getString("oDate"));
          otemp.setCharge(rs.getString("charge"));
          otemp.setsName(rs.getString("sName"));
       }
       
       double drP = Double.parseDouble(drPrice) * Double.parseDouble(drQuan);
       double opCharge = Double.parseDouble(otemp.getCharge());
       String Final_Price = Double.toString(drP+opCharge);
       String q4 = "INSERT INTO `demo`.`prescription` (`cID`, `eID`, `drName`, `drQuan`, `drNote`, `drTotal`, `prDate`) VALUES ('";
       String q5 = otemp.getcID() + "','" + otemp.geteID()+ "','" + drName+ "','" +drQuan+ "','" +drNote+ "','" +Double.toString(drP)+ "','" + otemp.getoDate() + "');";
       ms = con.createStatement();
       ms.executeUpdate(q4+q5);
       System.out.println("Insert to Prescription");
       
       String q2 = "INSERT INTO `demo`.`invoice` (`cID`, `sName`, `dName`, `total`,`status`) VALUES ('";
       String q3 = otemp.getcID() +"','"+ otemp.getsName()+"','"+drName+"','"+Final_Price+"', 'unpaid');";
       ms = con.createStatement();
       ms.executeUpdate(q2+q3);
       
       System.out.println("Insert to invoice");
       
       String q6 = "DELETE FROM `demo`.`operations` WHERE (`oID` ='";
       String q7 = otemp.getoID() + "');";
       ms = con.createStatement();
       ms.executeUpdate(q6+q7);
       
       System.out.println("Delete from operation");
       
       
   }
   
   public void set_Op_To_Delay(String OIDS) throws SQLException{
       Connection con = null;
       Statement ms = null;
       ResultSet rs = null;
       con = DriverManager.getConnection(connectionUrl+dbName, userId, password);

       for(int i = 0; i < OIDS.length(); i++){
           String q = "UPDATE `demo`.`operations` SET `status` = 'delay' WHERE (`oID` = '";
           String q2 = Character.toString(OIDS.charAt(i)) + "');";
           ms = con.createStatement();
           ms.executeUpdate(q+q2);
       }
   }
   public void set_Op_To_Process(String OIDS) throws SQLException{
       Connection con = null;
       Statement ms = null;
       ResultSet rs = null;
       con = DriverManager.getConnection(connectionUrl+dbName, userId, password);

       for(int i = 0; i < OIDS.length(); i++){
           String q = "UPDATE `demo`.`operations` SET `status` = 'processing' WHERE (`oID` = '";
           String q2 = Character.toString(OIDS.charAt(i)) + "');";
           ms = con.createStatement();
           ms.executeUpdate(q+q2);
       }
   }
   public void Delete_From_Op(String OIDs) throws SQLException{
       Connection con = null;
       Statement ms = null;
       ResultSet rs = null;
       con = DriverManager.getConnection(connectionUrl+dbName, userId, password);

       for(int i = 0; i < OIDs.length(); i++){
           String q6 = "DELETE FROM `demo`.`operations` WHERE (`oID` ='";
           String q7 = Character.toString(OIDs.charAt(i)) + "');";
           ms = con.createStatement();
           ms.executeUpdate(q6+q7);
       }
   }
   
   public void Pay_All(String iIDS) throws SQLException{
       Connection con = null;
       Statement ms = null;
       ResultSet rs = null;
       con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
   
       for(int i = 0; i < iIDS.length(); i++){
           String q = "UPDATE `demo`.`invoice` SET `status` = 'paid' WHERE (`iID` = '";
           String q2 = Character.toString(iIDS.charAt(i)) + "');";
           ms = con.createStatement();
           ms.executeUpdate(q+q2);
       }
   }
}
