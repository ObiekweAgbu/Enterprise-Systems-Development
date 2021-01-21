<%-- 
    Document   : date_Test
    Created on : Jan 16, 2021, 10:28:36 PM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Login.LoginData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Java Date Picker</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            var list ;
            $(function () {
                $("#datepicker").datepicker({ dateFormat: 'yy-mm-dd' });
            });
            $(document).ready(function(){
                $("#TimeSelect").click(function(){
                   if($("#datepicker").val() == ""){
                        alert("You have to select a date")
                   }
                });
            });
            
        </script>
    </head>
    <body>
        <header id="Header">
            <nav>
                <div class="row">   
                    <img src="../assets/user/img/doctor_logo.png" alt="Smart Care logo" class="logo">
                    <ul class="main-nav">
                        <li><a href="#Header">Home</a></li>
                        <li><a href="Book_Doctor.jsp">Book Doctor</a></li>
                        <li><a href="Book_Nurse.jsp">Book Nurse</a></li>
                        <li><a href="#Form-Staff">Add Staff</a></li>
                        <li><a href="Patient_Pres.jsp">Prescription</a></li>
                        <li><a href="Pa_Del_BKO.jsp">Appointment</a></li>
                        <li><a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a></li>
                    </ul>
                </div>
            </nav>
            <div class="big-text-box">
		<h1>Welcome <%=session.getAttribute("user") %> 
                    <br>to Smart Care<br>The place to Goodbye Diseases,<br>And Hello healthy body.</h1>
	    </div>
        </header>
                    <section style="margin-bottom: 20px;"> 
                        <form action="${pageContext.request.contextPath}/Booking_Serv" class="book-form">
                    </section>
               
<!--            <label for="datepicker">Enter Your Date of Birth:</label>--> 

        <div class="row">
		<div class="col span-1-of-3">
		    <label for="Employ_L">Nurses</label>
		</div>
		<div class="col span-2-of-3">
		    <select id="Employ_L" name="Employ_List">
			<%
                           LoginData LD = new LoginData();
                           List<String> employ_list = new ArrayList<>();
                           employ_list=LD.Get_Doc_Nurse_List(0);;
                           for(int i = 0; i < employ_list.size();i++){
                         %>
                           <option><%=employ_list.get(i)%></option>
                        <%
                         }
                         %>
		    </select>
		</div>
        </div>
           
        <div class="row">
		<div class="col span-1-of-3">
		    <label for="datepicker">Choose your date</label>
		</div>
		<div class="col span-2-of-3">
                    <input type="text" name="date" id="datepicker" placeholder="Choose Date">
		</div>
        </div>
                              
        <div class="row">
		<div class="col span-1-of-3">
		    <label for="TimeSelect">Choose your time</label>
		</div>
		<div class="col span-2-of-3">
		    <select name="Time" id="TimeSelect">
			<%
                            List<String> Time = LD.Time_Gene();
                            for(int i = 0; i < Time.size();i++){                  
                        %>
                           <option><%=Time.get(i)%></option>
                        <%
                        }
                        %>
		    </select>
		</div>
        </div>
                   
        <div class="row">
		<div class="col span-1-of-3">
		    <label for="Serv">Choose your service</label>
		</div>
		<div class="col span-2-of-3">
		    <select id="Serv" name="Serv">
			 <%
                              List<String> Serv = LD.getServ();
                              for(int i = 0; i < Serv.size();i++){                   
                         %>
                              <option><%=Serv.get(i)%></option>
                         <%
                          }
                         %>
		    </select>
		</div>
        </div>
                    
        <div class="row">
               <div class="col span-1-of-3">
		    <label>&nbsp;</label>
		</div>
	        <div class="col span-2-of-3">
		    <input type="submit" value="Submit">
		</div>
            </div> 
                    
        </form>
    </body>
         <%@include file="../Admin_JSP/Adding_Doctor_Nurse.jsp"%>
        <%@include file="../footer.jsp"%>
</html>