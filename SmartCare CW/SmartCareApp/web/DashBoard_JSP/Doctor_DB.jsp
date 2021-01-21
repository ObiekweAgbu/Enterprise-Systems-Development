<%-- 
    Document   : Doctor_DB
    Created on : Dec 16, 2020, 9:23:21 PM
    Author     : Lil Shil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
        <title>Doctor Dashboard</title>
        <style>
            .container {
                 margin-top: 20px;
                 background: #EBEBEB;
                 border-radius: 5%;
                 padding: 50px;
            }
  
            h3 {
                 display: inline;
            }
            
            .side-nav { 
                 display: none;
            }
    
             .side-nav li {
                 display: block;
            }
    
            .mobile-nav-icon {
                 float:right;
                 cursor: pointer;
            }

            .mobile-nav-icon ion-icon {
                 color: #555;
                 font-size: 200%;
            }
         </style>
    </head>
    <body>
        <header id="Header">
            <nav>
                <div class="row">   
                    <img src="./assets/user/img/doctor_logo.png" alt="Smart Care logo" class="logo">
                    <ul class="main-nav">
                        <li><a href="#Header">Home</a></li>
                        <li><a href="../Functionalities/Show_Booking.jsp">Show Booking</a></li>
                        <li><a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a></li>
                    </ul>
                </div>
            </nav>
            
            <div class="big-text-box">
		<h1>Welcome Doctor <%=session.getAttribute("user") %>  
                    <br>to Smart Care<br>The place to Goodbye Diseases,<br>And Hello healthy body.</h1>
	    </div>
        </header>
    </body>
    <%@include file="../footer.jsp"%>
    
</html>
