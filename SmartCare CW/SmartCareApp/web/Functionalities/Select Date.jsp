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
        <link rel="stylesheet" type="text/css" href="./assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="./assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
    </head>
<body>
        <section class="section-spacing">
            <form action="Show_Booking.jsp">
                    <div class="row">
			<div class="col span-2-of-4">
				<label for="datepicker">Choose your date:</label>
			</div>
			<div class="col span-3-of-4">
				<input id="datepicker" type="text" name="date" placeholder="yy-mm-dd" value="">
			</div>
		    </div>
                 
                    <div class="row">
			<div class="col span-1-of-3">
				<label>&nbsp;</label>
			</div>
			<div class="col span-2-of-3">
				<input type="submit" value="OK" class="btn btn-1">
			</div>
		    </div>
<!--            Choose your date: <input type="text" name="date" id="datepicker">
            <input type="submit" value="OK" />-->
            </form>
        </section> 
    </body>
</html>
