<%-- 
    Document   : Patient_Pres
    Created on : Jan 20, 2021, 1:36:06 AM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
<%@page import="Login.Prescription"%>
<%@page import="Login.LoginData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
        <title>JSP Page</title>
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
            .Container{
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
                    <div class="Container">
        <%
        LoginData LD = new LoginData();
        String uName = (String) session.getAttribute("user");
        String cID = LD.get_cID_From_cUname(uName);
        List<Prescription> prL = LD.Pres_List_From_cID(cID);
        %>
        
        <table align-items="Center">
            <thead>
                <tr>
                    <th>Prescription ID</th>
                    <th>Patient Name</th>
                    <th>Employee Name</th>
                    <th>Drug Name</th>
                    <th>Quantity</th>
                    <th>Note</th>
                    <th>Date</th>
                    <th>Total</th>
                </tr>
            </thead>
            <tbody>
                <%
                   for(int i = 0 ; i < prL.size();i++){
                   %> 
                <tr>
                    <td><%= prL.get(i).getpID() %></td>
                    <td><%= LD.get_cName_From_cID(prL.get(i).getcID()) %></td>
                    <td><%= LD.get_eName_From_eID(prL.get(i).geteID())%></td>
                    <td><%= prL.get(i).getDrName() %></td>
                    <td><%= prL.get(i).getDrQuan() %></td>
                    <td><%= prL.get(i).getDrNote() %></td>
                    <td><%= prL.get(i).getPrDate() %></td>
                    <td><%= prL.get(i).getDrTotal() %></td>
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
            </div>
            <%@include file="../Admin_JSP/Adding_Doctor_Nurse.jsp"%>
            <%@include file="../footer.jsp"%>

        
    </body>
</html>
