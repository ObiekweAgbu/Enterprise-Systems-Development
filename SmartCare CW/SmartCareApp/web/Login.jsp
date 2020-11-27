<%-- 
    Document   : Login
    Created on : Nov 26, 2020, 10:28:23 PM
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
        <h1>Login form</h1>
        <form action="LoginController" method = "post">
            Username: <input type="text" name="UserID"/><br>
            Password: <input type="text" name="Password"/><br>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
