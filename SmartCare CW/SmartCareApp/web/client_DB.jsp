<%-- 
    Document   : client_DB
    Created on : Dec 16, 2020, 9:22:13 PM
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
        <h1>Client Dashboard</h1>
    </body>
</html>
