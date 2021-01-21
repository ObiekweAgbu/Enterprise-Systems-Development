<%-- 
    Document   : Login
    Created on : Nov 26, 2020, 10:28:23 PM
    Author     : Lil Shil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
        <title>Login Page</title>
        <style>
            .section-login {
                padding-top: 200px;
                height: 100vh;
            }
            .back_home {
                position: absolute;
                top: 30px;
                left: 30px;
            }
        </style>
    </head>
    <body>
        <div class="back_home"><a href="./homepage.jsp">Back to Home</a></div>
        <section class="section-login section-spacing" id="Form-Log">
		<div class="row">
			<h2>Login SmartCare App</h2>
		</div>
		<form method="post" action="LoginController" class="login-form">
		    <div class="row">
			<div class="col span-1-of-3">
				<label for="Username">Usermame</label>
			</div>
			<div class="col span-2-of-3">
				<input id="Username" type="text" name="UserID" placeholder="Username" value="" required>
			</div>
		    </div>
                    
                    <div class="row">
			<div class="col span-1-of-3">
				<label for="Password">Password</label>
			</div>
			<div class="col span-2-of-3">
				<input id="Password" type="password" name="Password" placeholder="Password" value="" required>
			</div>
		    </div>
                   
		    <div class="row">
			<div class="col span-1-of-3">
				<label>&nbsp;</label>
			</div>
			<div class="col span-1-of-3">
				<input type="submit" value="Login" class="btn btn-1">
			</div>
                        <div class="col span-1-of-3">
                            <a href="./homepage.jsp#Form-Reg" style="float: right">Register?</a>
			</div>
		    </div>
		</form>
        </section>
 
   
<!--        <h1>Login form</h1>
        <form action="LoginController" method = "post">
            Username: <input type="text" name="UserID"/><br>
            Password: <input type="password" name="Password"/><br>
            <input type="submit" value="Login" />
        </form>
        <a href="DashBoard_JSP/Reg_DB.jsp">Register</a>-->
    </body>
</html>
