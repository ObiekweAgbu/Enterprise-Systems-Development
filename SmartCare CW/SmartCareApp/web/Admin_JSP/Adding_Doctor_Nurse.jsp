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
        <link rel="stylesheet" type="text/css" href="../assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
        <title>JSP Page</title>
  </head>
 <body>
        <section class="section-register-staff section-spacing" id="Form-Staff">
		<div class="row">
                    <h2>Your participation in the society is our true honor</h2>
		</div>
		<form action="${pageContext.request.contextPath}/Adding_Employee_Servlet" method="POST" class="register-form">
                    <div class="row">
			<div class="col span-1-of-3">
				<label for="Name">Your Name</label>
			</div>
			<div class="col span-2-of-3">
				<input id="Name" type="text" name="eName" placeholder="Your Name" value="" required>
			</div>
		    </div>
                    
                    <div class="row">
			<div class="col span-1-of-3">
				<label for="DOB">Date of Birth</label>
			</div>
			<div class="col span-2-of-3">
				<input id="DOB" type="text" name="eDOB" placeholder="Your Date of Birth" value="" required>
			</div>
		    </div>
                    
                    <div class="row">
			<div class="col span-1-of-3">
				<label for="Address">Your Address</label>
			</div>
			<div class="col span-2-of-3">
				<input id="Address" type="text" name="eAddress" placeholder="Your Address" value="" required>
			</div>
		    </div>
                    
                    <div class="row">
			<div class="col span-1-of-3">
				<label for="PO">Post Code</label>
			</div>
			<div class="col span-2-of-3">
				<input id="PO" type="text" name="ePO" placeholder="Your Post Code" value="" required>
			</div>
		    </div>
                    
		    <div class="row">
			<div class="col span-1-of-3">
				<label for="Username">Usermame</label>
			</div>
			<div class="col span-2-of-3">
				<input id="Username" type="text" name="uName" placeholder="Username" value="" required>
			</div>
		    </div>
                    
                    <div class="row">
			<div class="col span-1-of-3">
				<label for="Password">Password</label>
			</div>
			<div class="col span-2-of-3">
				<input id="Password" type="password" name="ePass" placeholder="Password" value="" required>
			</div>
		    </div>
                
		    <div class="row">
			<div class="col span-1-of-3">
				<label for="Role">Role</label>
			</div>
			<div class="col span-2-of-3">
				<select name="Role" id="Role">
					<option>Nurse</option>
					<option>Doctor</option>
				</select>
			</div>
                    </div>

		    <div class="row">
			<div class="col span-1-of-3">
				<label>&nbsp;</label>
			</div>
			<div class="col span-2-of-3">
				<input type="submit" value="Add" class="btn btn-1">
			</div>
		    </div>
		</form>
	</section>
        
        <!--<a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a>-->
        
        
        
        
        
<!--        <form action="Adding_Employee_Servlet" method="POST">
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
            
        </form>-->
    </body>
  </html>
