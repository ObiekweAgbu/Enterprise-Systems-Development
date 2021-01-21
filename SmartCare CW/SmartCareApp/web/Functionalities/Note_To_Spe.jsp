<%-- 
    Document   : Note_To_Spe
    Created on : Jan 20, 2021, 2:30:14 AM
    Author     : Lil Shil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="../assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
           
            #Note {
                width: 50%;
                margin: 200px auto;
            }
        </style>
    </head>
    <body>
        <header id="Header">
            <nav>
                <div class="row">   
                    <img src="../assets/user/img/doctor_logo.png" alt="Smart Care logo" class="logo">
                    <ul class="main-nav">
                        <li><a href="#Header">Home</a></li>
                        <li><a href="../Functionalities/Show_Booking.jsp">Show Booking</a></li>
                        <li><a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a></li>
                    </ul>
                </div>
            </nav>
            
            <div class="big-text-box">
		<h1>Welcome Doctor <%=session.getAttribute("user")%> 
                    <br>to Smart Care<br>The place to Goodbye Diseases,<br>And Hello healthy body.</h1>
	    </div>
        </header>
         <div class="row" id="Note">
        <form action="${pageContext.request.contextPath}/Transfer_To_Spe">
            <div class="row" style="margin-bottom: 20px;"><h4>Please add some notes to the specialist</h4></div>
            <div class="row">     
                    <input type="text" name="note_To_Spe" value="" />  
            </div>
            
            <div class="row" style="margin-top: 20px;">
                <input type="submit" value="OK" />
            </div>
            
        </form>
         </div>
    </body>
    <%@include file="../footer.jsp"%>
</html>
