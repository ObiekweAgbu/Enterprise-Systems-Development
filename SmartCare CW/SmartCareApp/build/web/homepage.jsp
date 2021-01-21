<%-- 
    Document   : homepage
    Created on : 15-Jan-2021, 20:15:27
    Author     : hkhanhlam99
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <title>Smart Care</title>
    </head>
    <body>
        <header id="Header">
            <nav>
                <div class="row">   
                    <img src="./assets/user/img/doctor_logo.png" alt="Smart Care logo" class="logo">
                    <ul class="main-nav">
                        <li><a href="#Header">Home</a></li>
                        <li><a href="#Info">About Us</a></li>
                        <li><a href="#Team">Our Team</a></li>
                        <li><a href="#Form-Reg">Sign Up</a></li>
                        <li><a href="Login.jsp#Form-Log">Log in</a></li>
                    </ul>
                </div>
            </nav>
            
            <div class="big-text-box">
		<h1>Welcome to Smart Care<br>The place to Goodbye Diseases,<br>And Hello healthy body.</h1>
	    </div>
        </header>
        
        <section class="section-info section-spacing js-section-info" id="Info">
		<div class="row">
			<h2>What you should know about us</h2>
		</div>
		<div class="row">
                    <h3></h3>
                    <p class="p-long"> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean et ex vitae eros posuere finibus.
                        Proin at iaculis risus. Duis consectetur felis id risus placerat egestas. Sed et purus ac nibh placerat feugiat et sed urna.
                        Proin volutpat lobortis turpis, in laoreet urna tempor non.
                    </p>
                    
                    <h3></h3>
                    <p class="p-long"> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean et ex vitae eros posuere finibus.
                        Proin at iaculis risus. Duis consectetur felis id risus placerat egestas. Sed et purus ac nibh placerat feugiat et sed urna.
                        Proin volutpat lobortis turpis, in laoreet urna tempor non.
                    </p>
		</div>
	</section>
        
        <section class="section-team section-spacing" id="Team">
		<div class="row">
			<h2>your genuine staffs</h2>
		</div>
		<div class="row js-wp-3">
			<div class="col span-1-of-4 box">
				<img src="./assets/user/img/doctor1.jpg" alt="doctor1">
				<h3>DOCTOR</h3>
				<div class="staff-feature">
					<ion-icon name="person" class="icon-small"></ion-icon>
				         Dr. Derek Shepherd
				</div>
				<div class="staff-feature">
					<ion-icon name="home" class="icon-small"></ion-icon>
					25 Knolles Crescent, Welham
				</div>
				<div class="staff-feature">
					<ion-icon name="call" class="icon-small"></ion-icon>
					<a href="#">(343) 325-6361</a>
				</div>
			</div>

			<div class="col span-1-of-4 box">
				<img src="./assets/user/img/doctor2.png" alt="doctor2">
				<h3>DOCTOR</h3>
				<div class="staff-feature">
					<ion-icon name="person" class="icon-small"></ion-icon>
					Dr. Meredith Grey
				</div>
				<div class="staff-feature">
					<ion-icon name="home" class="icon-small"></ion-icon>
					2 Flint Cottages, St. Albans
				</div>
				<div class="staff-feature">
					<ion-icon name="call" class="icon-small"></ion-icon>
					<a href="#">(425) 202-5492</a>
				</div>
			</div>

			<div class="col span-1-of-4 box">
				<img src="./assets/user/img/nurse1.jpg" alt="nurse1">
				<h3>NURSE</h3>
				<div class="staff-feature">
					<ion-icon name="person" class="icon-small"></ion-icon>
					Rose
				</div>
				<div class="staff-feature">
					<ion-icon name="home" class="icon-small"></ion-icon>
					47 West Way, Harpenden
				</div>
				<div class="staff-feature">
					<ion-icon name="call" class="icon-small"></ion-icon>
					<a href="#">(880) 517-9902</a>
				</div>
			</div>

			<div class="col span-1-of-4 box">
				<img src="./assets/user/img/nurse2.jpg" alt="nurse2">
				<h3>NURSE</h3>
				<div class="staff-feature">
					<ion-icon name="person" class="icon-small"></ion-icon>
					Eli Lloyd
				</div>
				<div class="staff-feature">
					<ion-icon name="home" class="icon-small"></ion-icon>
					12 Maxwell Road, St. Albans
				</div>
				<div class="staff-feature">
					<ion-icon name="call" class="icon-small"></ion-icon>
					<a href="#">(711) 988-8736</a>
				</div>
			</div>
		</div>
	</section>
        
        <%@include file="./DashBoard_JSP/Reg_DB.jsp"%>

    </body>
    
   
    <%@ include file="./footer.jsp"%>
    
</html>
