<%-- 
    Document   : Log_Out
    Created on : Jan 19, 2021, 4:06:03 AM
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
        <%
        session.invalidate();
        response.sendRedirect("Login.jsp");
        %>
    </body>
</html>
