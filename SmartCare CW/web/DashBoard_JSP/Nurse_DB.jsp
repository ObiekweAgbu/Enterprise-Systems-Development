<%-- 
    Document   : Nurse_DB
    Created on : Dec 16, 2020, 9:22:46 PM
    Author     : Lil Shil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Welcome
        <%=request.getParameter("UserID")%>
        <h1>Nurse Dashboard</h1>
        <a href="Functionalities/Show_Booking.jsp">Show Booking</a>
    </body>
</html>
