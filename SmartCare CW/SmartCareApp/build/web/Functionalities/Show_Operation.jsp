<%-- 
    Document   : Show_Operation
    Created on : Jan 18, 2021, 9:16:44 PM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
<%@page import="Login.Operation"%>
<%@page import="Login.Booking_OBJ"%>
<%@page import="Login.LoginData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function select_check(){
                if(document.querySelectorAll('input[type = "checkbox"]:checked').length > 1){
                alert("You can only process one at a time");
                return false;
            }
                else if(document.querySelectorAll('input[type = "checkbox"]:checked').length == 0){
                    alert("You have to choose at least one");
                    return false;
                }
                
            }
        </script>
    </head>
    <body>
        
        <form action="${pageContext.request.contextPath}/From_Operation">
        
        Processing:<br>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Patient Name</th>
                    <th>Date</th>
                    <th>Time</th>
                    <th>Service</th>
                    <th>Slot</th>
                    <th>Fee</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                    LoginData LD = new LoginData();
                    String date = (String) session.getAttribute("Date_Book");
                    String uName = (String) session.getAttribute("uName_Book");
                    List<Operation> ProOpL = LD.get_Op(0,uName,date);
                    for(int i = 0; i < ProOpL.size();i++){
                    %>
                <tr>    
                    <td><%= ProOpL.get(i).getoID() %></td>
                    <td><%= LD.get_cName_From_cID(ProOpL.get(i).getcID()) %></td>
                    <td><%= ProOpL.get(i).getoDate() %></td>
                    <td><%= ProOpL.get(i).getoTime() %></td>
                    <td><%= ProOpL.get(i).getsName() %></td>
                    <td><%= ProOpL.get(i).getnSlot() %></td>
                    <td><%= ProOpL.get(i).getCharge()%></td>
                    <td> <input type="checkbox" name="get_OID" value="<%= ProOpL.get(i).getoID() %>" id="Pro" /> </td>
                </tr>
                <%
                  }
                  %>
            </tbody>
        </table>
            
            <input type="submit" value="Add Prescription" name="To_Pres" onclick ="return select_check();"/>
            <input type="submit" value="Go to Payment" name="To_Payment" onclick ="return select_check();"/>
            <input type="submit" value="Delay" name="To_Delay" />
            <br>
         </form>
    <form action="${pageContext.request.contextPath}/Op_Delay">
            Delay:<br>
           <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Patient Name</th>
                    <th>Date</th>
                    <th>Time</th>
                    <th>Service</th>
                    <th>Slot</th>
                    <th>Fee</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                    
                    List<Operation> DeOpL = LD.get_Op(1,uName,date);
                    for(int i = 0; i < DeOpL.size();i++){
                    %>
                <tr>    
                    <td><%= DeOpL.get(i).getoID() %></td>
                    <td><%= LD.get_cName_From_cID(DeOpL.get(i).getcID()) %></td>
                    <td><%= DeOpL.get(i).getoDate() %></td>
                    <td><%= DeOpL.get(i).getoTime() %></td>
                    <td><%= DeOpL.get(i).getsName() %></td>
                    <td><%= DeOpL.get(i).getnSlot() %></td>
                    <td><%= DeOpL.get(i).getCharge()%></td>
                    <td>  <input type="checkbox" name="Delete_Or_Move" value="<%= DeOpL.get(i).getoID() %>" /> </td>
                </tr>
                <%
                  }
                  %>
            </tbody>
        </table>
            <input type="submit" value="Delete Opearion" name="Del" />
            <input type="submit" value="Move to Process" name="to_Pro" />
</form>
        
    </body>
</html>
