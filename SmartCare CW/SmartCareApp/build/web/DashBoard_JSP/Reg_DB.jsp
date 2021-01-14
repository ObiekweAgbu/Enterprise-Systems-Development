<%-- 
    Document   : Reg_DB
    Created on : Jan 13, 2021, 6:00:57 PM
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
        <form action="Reg_Controller" method="GET">
            Username: <input type="text" name="Uname" value="" /><br>
            Password: <input type="password" name="PW" value="" /><br>
            Name: <input type="text" name="Name" value="" /><br>
            Address: <input type="text" name="Address" value="" /><br>
            Type: <select name="Type">
                <option>NHS</option>
                <option>Private</option>
            </select><br>
            <input type="submit" value="Register" />
        </form>
    </body>
</html>
