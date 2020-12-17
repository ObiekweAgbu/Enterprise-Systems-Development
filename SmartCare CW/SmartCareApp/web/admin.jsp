<%-- 
    Document   : admin
    Created on : Dec 16, 2020, 9:21:23 PM
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
        <h1>admin Dashboard</h1>
    </body>
</html>
