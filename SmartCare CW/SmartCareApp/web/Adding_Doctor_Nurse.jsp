<%-- 
    Document   : Adding_Doctor_Nurse
    Created on : Jan 14, 2021, 4:51:01 AM
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
        <form action="Adding_Employee_Servlet" method="POST">
            Name: <input type="text" name="eName" value="" /><br>
            Date of Birth: <input type="text" name="eDOB" value="" /><br>
            Address: <input type="text" name="eAddress" value="" /><br>
            Post Code: <input type="text" name="ePO" value="" /><br>
            Username:   <input type="text" name="uName" value="" /><br>
            Initial Password: <input type="text" name="ePass" value="" /><br>
            Role: <select name="Role">
                <option>nurse</option>
                <option>doctor</option>
            </select><br>
            <input type="submit" value="Add" />
            
        </form>
        <br>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a>
    </body>
</html>
