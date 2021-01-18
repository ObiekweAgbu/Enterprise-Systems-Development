<%-- 
    Document   : Select Date
    Created on : Jan 17, 2021, 10:26:04 PM
    Author     : Lil Shil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <title>Java Date Picker</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
             $(function () {
                $("#datepicker").datepicker({ dateFormat: 'yy-mm-dd' });
            });
            
        </script>
    </head>
    <body>
        <form action="Show_Booking.jsp">
            Choose your date: <input type="text" name="date" id="datepicker">
            <input type="submit" value="OK" />
        </form>
    </body>
</html>
