<%-- 
    Document   : Show_Booking
    Created on : Jan 17, 2021, 10:18:38 PM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
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
            function MoreThanOneCheck(){
                if(document.querySelectorAll('input[type = "checkbox"]:checked').length > 1){
                alert("You can only process one at a time");
                return false;
            }
            }
        </script>
    </head>
    <body>
        <jsp:include page="Select Date.jsp" />
        <%
        String date = request.getParameter("date");
        session.setAttribute("Date_Book", date);
//        String uName = (String) request.getSession().getAttribute("user");
        String uName = "eaydin";
        session.setAttribute("uName_Book", uName);
        LoginData LD = new LoginData();
        if(date != null){
            List<Booking_OBJ> bko = LD.get_Booking_List(uName, date);
        %>
        <h1>Booking for: <%= request.getParameter("date") %></h1>
        <%
            if(bko.isEmpty()){
        %>
            You don't have any booking for today
            <a href="Show_Operation.jsp">To Operation</a>

            <%
            }
        else{
            %>
        <form action="${pageContext.request.contextPath}/To_Operate">        
            <table border = "1">
                <thead>
                    <th>Booking ID</th>
                    <th>Client Name</th>
                    <th>Time</th>
                    <th>Service</th>
                    <th></th>
                </thead>
                <tbody>
                    <%
                    for(int i = 0; i < bko.size();i++){
                    %>
                    <tr>
                        <td><%= bko.get(i).getsID() %></td>
                        <td><%= bko.get(i).getcID() %></td>
                        <td><%= bko.get(i).getsTime() %></td>
                        <td><%= bko.get(i).getsName() %></td>
                        <td>
                        <input type="checkbox" name="ProcessOrDelete" value="<%=bko.get(i).getsID()%>" />
                    </td>
                    </tr>
                    <%
                    }
                    %>
                </tbody>
                
            </table>               
                <input type="submit" value="Process Booking" name="Add" onclick="return MoreThanOneCheck();" />
                <input type="submit" value="Delete" />
        </form>

        
        <%
            }
        }
        %>
    </body>
</html>
