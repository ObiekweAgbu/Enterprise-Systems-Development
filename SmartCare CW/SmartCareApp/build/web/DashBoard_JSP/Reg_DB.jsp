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
        <link rel="stylesheet" type="text/css" href="../assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
        <title>Register page</title>
    </head>
    <body>
        <section class="section-register section-spacing" id="Form-Reg">
		<div class="row">
			<h2>Join us and we will take good care of you</h2>
		</div>
		<form method="POST" action="${pageContext.request.contextPath}/Reg_Controller" class="register-form">
		    <div class="row">
			<div class="col span-1-of-3">
				<label for="Username">Usermame</label>
			</div>
			<div class="col span-2-of-3">
				<input id="Username" type="text" name="Uname" placeholder="Username" value="" required>
			</div>
		    </div>
                    
                    <div class="row">
			<div class="col span-1-of-3">
				<label for="Password">Password</label>
			</div>
			<div class="col span-2-of-3">
				<input id="Password" type="password" name="PW" placeholder="Password" value="" required>
			</div>
		    </div>
                    
                    <div class="row">
			<div class="col span-1-of-3">
				<label for="Name">Your Name</label>
			</div>
			<div class="col span-2-of-3">
				<input id="Name" type="text" name="Name" placeholder="Your Name" value="" required>
			</div>
		    </div>
                    
                    <div class="row">
			<div class="col span-1-of-3">
				<label for="DOB">Date of Birth</label>
			</div>
			<div class="col span-2-of-3">
				<input id="DOB" type="text" name="DOB" placeholder="Your Date of Birth" value="" required>
			</div>
		    </div>
                    
                    <div class="row">
			<div class="col span-1-of-3">
				<label for="Address">Your Address</label>
			</div>
			<div class="col span-2-of-3">
				<input id="Address" type="text" name="Address" placeholder="Your Address" value="" required>
			</div>
		    </div>
                    
                    <div class="row">
			<div class="col span-1-of-3">
				<label for="PO">Post Code</label>
			</div>
			<div class="col span-2-of-3">
				<input id="PO" type="text" name="PO" placeholder="Your Post Code" value="" required>
			</div>
		    </div>

		    <div class="row">
			<div class="col span-1-of-3">
				<label>Type</label>
			</div>
			<div class="col span-2-of-3">
				<select name="Type">
					<option value="NHS">NHS</option>
					<option value="Private">Private</option>
				</select>
			</div>
                    </div>

		    <div class="row">
			<div class="col span-1-of-3">
				<label>&nbsp;</label>
			</div>
			<div class="col span-1-of-3">
				<input type="submit" value="Register" class="btn btn-1">
			</div>
                        <div class="col span-1-of-3">
                            <a href="./Login.jsp#Form-Log" style="float: right">Log in?</a>
			</div>
		    </div>
		</form>
	</section>
        
        <!--<a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a>-->

<!--         <form action="/Reg_Controller" method="GET">
            Username: <input type="text" name="Uname" value="" /><br>
            Password: <input type="password" name="PW" value="" /><br>
            Name: <input type="text" name="Name" value="" /><br>
            Date of Birth: <input type="text" name="DOB" value="" /><br>
            Address: <input type="text" name="Address" value="" /><br>
            Post Code: <input type="text" name="PO" value="" /><br>
            Type: <select name="Type">
                <option>NHS</option>
                <option>Private</option>
            </select><br>
            <input type="submit" value="Register" />
        </form>-->
    </body>
  
</html>
