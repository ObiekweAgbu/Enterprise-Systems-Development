<%-- 
    Document   : book_Mid
    Created on : 18-Jan-2021, 18:30:09
    Author     : obiek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Failed to Book</title>
    </head>
    <body>
        <h1>This Slot is Taken</h1>
        <input type="submit" value="OK" />
         <%
    response.sendRedirect("Book_Doctor.jsp");
%>
    </body>
</html>
