<%-- 
    Document   : Show_Booking
    Created on : Jan 17, 2021, 10:18:38 PM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
<%@page import="Login.Booking_OBJ"%>
<%@page import="Login.LoginData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
        <title>JSP Page</title>
        <script>
            function MoreThanOneCheck(){
                if(document.querySelectorAll('input[type = "checkbox"]:checked').length > 1){
                alert("You can only process one at a time");
                return false;
            }
            }
        </script>
        <style>
            table {border: 0; }

            th, td {
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
                        <li><a href="Functionalities/Show_Booking.jsp">Show Booking</a></li>
                        <li><a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a></li>
                    </ul>
                </div>
            </nav>
            <div class="big-text-box">
		<h1>Welcome <%=session.getAttribute("user") %> 
                    <br>to Smart Care<br>The place to Goodbye Diseases,<br>And Hello healthy body.</h1>
	    </div>
        </header>
        <jsp:include page="Select Date.jsp" />
        <div class="Container">
        <section>
        <%
        String date = request.getParameter("date");
        session.setAttribute("Date_Book", date);
        String uName = (String) request.getSession().getAttribute("user");
        session.setAttribute("uName_Book", uName);
        LoginData LD = new LoginData();
        if(date != null){
            List<Booking_OBJ> bko = LD.get_Booking_List(uName, date);
        %>
        <h1>Booking for: <%= request.getParameter("date") %></h1>
        <%
            if(bko.isEmpty()){
        %>
            You don't have any booking for today
            <a href="Show_Operation.jsp">To Operation</a>

            <%
            }
        else{
            %>
        <form action="${pageContext.request.contextPath}/To_Operate">        
            <table>
                <thead>
                    <th>Booking ID</th>
                    <th>Client Name</th>
                    <th>Time</th>
                    <th>Service</th>
                    <th></th>
                </thead>
                <tbody>
                    <%
                    for(int i = 0; i < bko.size();i++){
                    %>
                    <tr>
                        <td><%= bko.get(i).getsID() %></td>
                        <td><%= bko.get(i).getcID() %></td>
                        <td><%= bko.get(i).getsTime() %></td>
                        <td><%= bko.get(i).getsName() %></td>
                        <td>
                        <input type="checkbox" name="ProcessOrDelete" value="<%=bko.get(i).getsID()%>" />
                    </td>
                    </tr>
                    <%
                    }
                    %>
                </tbody>
                
            </table>               
                <div class="row">
	            <div class="col span-1-of-3">
			<input type="submit" value="Process Booking" name="Add" onclick="return MoreThanOneCheck();" />
		    </div>
                    
                    <div class="col span-1-of-3">
                        <input type="submit" value="Delete" />
		    </div>
		</div>        
        </form>
        <%
            }
        }
        %>
       </section>
       </div>
    </body>
    <%@include file="../footer.jsp"%>
</html>
