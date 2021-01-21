<%-- 
    Document   : Show_Operation
    Created on : Jan 18, 2021, 9:16:44 PM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
<%@page import="Login.Operation"%>
<%@page import="Login.Booking_OBJ"%>
<%@page import="Login.LoginData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="../assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="../assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {broder: 0; }
         
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
        
        <script>
            function select_check(){
                if(document.querySelectorAll('input[type = "checkbox"]:checked').length > 1){
                alert("You can only process one at a time");
                return false;
            }
                else if(document.querySelectorAll('input[type = "checkbox"]:checked').length == 0){
                    alert("You have to choose at least one");
                    return false;
                }
                
            }
        </script>
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
                    <div class="Container">
        <section>
        <form action="${pageContext.request.contextPath}/From_Operation">
        
        <div class="row">
            <h4>Processing</h4>
        </div>
        
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Patient Name</th>
                    <th>Date</th>
                    <th>Time</th>
                    <th>Service</th>
                    <th>Slot</th>
                    <th>Fee</th>
                    <th>Check Box</th>
                </tr>
            </thead>
            <tbody>
                <%
                    LoginData LD = new LoginData();
                    String date = (String) session.getAttribute("Date_Book");
                    String uName = (String) session.getAttribute("uName_Book");
                    List<Operation> ProOpL = LD.get_Op(0,uName,date);
                    for(int i = 0; i < ProOpL.size();i++){
                    %>
                <tr>    
                    <td><%= ProOpL.get(i).getoID() %></td>
                    <td><%= LD.get_cName_From_cID(ProOpL.get(i).getcID()) %></td>
                    <td><%= ProOpL.get(i).getoDate() %></td>
                    <td><%= ProOpL.get(i).getoTime() %></td>
                    <td><%= ProOpL.get(i).getsName() %></td>
                    <td><%= ProOpL.get(i).getnSlot() %></td>
                    <td><%= ProOpL.get(i).getCharge()%></td>
                    <td> <input type="checkbox" name="get_OID" value="<%= ProOpL.get(i).getoID() %>" /> </td>
                </tr>
                <%
                  }
                  %>
            </tbody>
        </table>
            
        <div class="row">
	            <div class="col span-1-of-4">
			<input type="submit" value="Add Prescription" name="To_Pres" onclick ="return select_check();"/>
		    </div>
                    
                    <div class="col span-1-of-4">
                        <input type="submit" value="Go to Payment" name="To_Payment" onclick ="return select_check();"/>
		    </div>
                    <div class="col span-1-of-4">
                        <a href="../Functionalities/Note_To_Spe.jsp" onclick="return select_check()" class="btn btn-1">Go To SpecList</a>
		    </div>
                     
                    <div class="col span-1-of-4">
                        <input type="submit" value="Delay" name="To_Delay" onclick ="return select_check();"/>
		    </div>
	</div>
 
        </form>
        </section>
                    </div>
            <div class="Container">
     
    <section>       
    <form action="${pageContext.request.contextPath}/Op_Delay">
            <div class="row">
                <h4>Delay</h4>
	    </div>
           <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Patient Name</th>
                    <th>Date</th>
                    <th>Time</th>
                    <th>Service</th>
                    <th>Slot</th>
                    <th>Fee</th>
                    <th>Check Box</th>
                </tr>
            </thead>
            <tbody>
                <%
                    
                    List<Operation> DeOpL = LD.get_Op(1,uName,date);
                    for(int i = 0; i < DeOpL.size();i++){
                    %>
                <tr>    
                    <td><%= DeOpL.get(i).getoID() %></td>
                    <td><%= LD.get_cName_From_cID(DeOpL.get(i).getcID()) %></td>
                    <td><%= DeOpL.get(i).getoDate() %></td>
                    <td><%= DeOpL.get(i).getoTime() %></td>
                    <td><%= DeOpL.get(i).getsName() %></td>
                    <td><%= DeOpL.get(i).getnSlot() %></td>
                    <td><%= DeOpL.get(i).getCharge()%></td>
                    <td>  <input type="checkbox" name="Delete_Or_Move" value="<%= DeOpL.get(i).getoID() %>" /> </td>
                </tr>
                <%
                  }
                  %>
            </tbody>
        </table>
            
        <div class="row">
	            <div class="col span-1-of-3">
			<input type="submit" value="Delete Opearion" name="Del" onclick ="return select_check();"/>
		    </div>
                    
                    <div class="col span-1-of-3">
                        <input type="submit" value="Move to Process" name="to_Pro" onclick ="return select_check();"/>
		    </div>
	</div>
            
            
    </form>
    </section> 
            </div>
        <!--<a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a>-->
    </body>
    <%@include file="../footer.jsp"%>
</html>
