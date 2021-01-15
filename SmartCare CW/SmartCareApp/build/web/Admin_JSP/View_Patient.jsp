<%-- 
    Document   : View_Patient
    Created on : Jan 13, 2021, 7:01:31 PM
    Author     : Lil Shil
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Patients View:
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        
        
        
        Private:<br>
        <table border="1">
            <thead>

            </thead>
            <tbody>
                <tr>
                    <td>cID</td>
                    <td>cName</td>
                    <td>cDOB</td>
                    <td>cAddress</td>
                    <td>cPO</td>
                    <td>cType</td>
                    <td>uName</td>
                </tr>
                
                <%
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
            String q = "SELECT * FROM demo.clients where cType='private'";
            con = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            ms = con.createStatement();
            rs = ms.executeQuery(q);
            while(rs.next()){
                
                %>
                <tr>
                    <td><%=rs.getInt("cID") %></td>
                    <td><%=rs.getString("cName") %></td>
                    <td><%=rs.getString("cDOB") %></td>
                    <td><%=rs.getString("cAddress") %></td>
                    <td><%=rs.getString("cPO") %></td>
                    <td><%=rs.getString("cType") %></td>
                    <td><%=rs.getString("uName") %></td>
                </tr>
                <%
                }
}
                catch (Exception e){
            
                    }
                    
                %>
            </tbody>
        </table>
        
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        NHS:<br>
        <table border="1">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Address</td>
                <td>Type</td>
                <td>uName</td>
            </tr>
            <tbody>
                <%
                try{
                    String q2 = "SELECT * FROM demo.clients where cType='NHS'";
                    ms = con.createStatement();
                    rs = ms.executeQuery(q2);
                    while(rs.next()){
                %>
                <tr>
                    <td><%=rs.getInt("cID") %></td>
                    <td><%=rs.getString("cName") %></td>
                    <td><%=rs.getString("cDOB") %></td>
                    <td><%=rs.getString("cAddress") %></td>
                    <td><%=rs.getString("cPO") %></td>
                    <td><%=rs.getString("cType") %></td>
                    <td><%=rs.getString("uName") %></td>
                </tr>
                <%
                    }
                }
                catch(Exception e){

                }
                rs.close();
                ms.close();
                con.close();
                %>
                
            </tbody>
            
        </table>



    </body>
</html>
