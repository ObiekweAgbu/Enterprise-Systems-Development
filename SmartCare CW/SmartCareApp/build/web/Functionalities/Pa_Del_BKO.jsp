<%-- 
    Document   : Pa_Del_BKO
    Created on : Jan 20, 2021, 4:27:10 AM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
<%@page import="Login.Booking_OBJ"%>
<%@page import="Login.LoginData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            function noCheck(){
                if(document.querySelectorAll('input[type = "checkbox"]:checked').length == 0){
                alert("You have to choose at least 1");
                return false;
            }
            if(document.querySelectorAll('input[type = "checkbox"]:checked').length > 1){
                alert("You can only delete one at a time");
                return false;
            }
        }
        </script>
         <link rel="stylesheet" type="text/css" href="./assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="./assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
        <title>Client Dashboard</title>
         <style>
            table {border: 0;
            align-content: center;
            }
            
            th,td {
                border: 1px solid black;
                text-align: center;
                font-size: 80%;
                border-collapse: separate;
                padding: 20px 30px;
            }
            .container{
                display: flex;
                justify-content: center;
                margin: 100px auto;
                
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
                    <div class="container">
        <%
        LoginData LD = new LoginData();
        String uName = (String) session.getAttribute("user");
        List<Booking_OBJ> BKOL = LD.get_PA_Booking_List(uName);
        %>
        <h3>Active Appointment</h3>
        <section>
        <form action="${pageContext.request.contextPath}/Delete_From_Booking">
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Employee Name</th>
                    <th>Date</th>
                    <th>Time</th>
                    <th>Service</th>
                    <th>Slot</th>
                    <th>Select</th>
                   
                </tr>
            </thead>
            <tbody>
                <%
                for(int i = 0 ; i < BKOL.size();i++){
                %>
                <tr>
                    <td><%= BKOL.get(i).getsID() %></td>
                    <td><%= LD.get_eName_From_eID(BKOL.get(i).geteID() ) %></td>
                    <td><%= BKOL.get(i).getsDate() %></td>
                    <td><%= BKOL.get(i).getsTime() %></td>
                    <td><%= BKOL.get(i).getsName() %></td>
                    <td><%= BKOL.get(i).getsSlot() %></td>
                    <td><input type="checkbox" name="Del_BKO" value="<%= BKOL.get(i).getsID() %>" /></td>
                    
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
            <input type="submit" value="Delete" onclick="return noCheck();" style="margin-top: 30px;"/>
          </form>
        </section>
            </div>
        
    </body>
        <%@include file="../Admin_JSP/Adding_Doctor_Nurse.jsp"%>
        <%@include file="../footer.jsp"%>
</html>
