<%-- 
    Document   : Payment
    Created on : Jan 19, 2021, 1:12:00 AM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
<%@page import="Login.Invoice"%>
<%@page import="Login.LoginData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./assets/user/css/grid.css">
        <link rel="stylesheet" type="text/css" href="./assets/user/css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap" rel="stylesheet">
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
            function noCheck(){
                if(document.querySelectorAll('input[type = "checkbox"]:checked').length == 0){
                alert("You have to choose one");
                return false;
            }
            }
        </script>
    </head>
    <body>
        <div class="Container">
        <section>
        <%
        LoginData LD = new LoginData();
        String cID = (String) session.getAttribute("cID_to_Pres");
        List<Invoice> inL = LD.get_Invoice_From_cID(cID);
        session.setAttribute("ListofInvoice", inL);
        System.out.println("Loi khong o day");
        double total = 0;
        %>
        
        <form action="${pageContext.request.contextPath}/Payment_Process">
            <table>
                <thead>
                    <tr>
                        <th>Invoice ID</th>
                        <th>Client ID</th>
                        <th>Service</th>
                        <th>Drug</th>
                        <th>Total</th>
                        <th>Check Box</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                     <%
                     for(int i = 0; i < inL.size();i++){
                         total += Double.parseDouble(inL.get(i).getTotal());
                     %>
                        <td><%= inL.get(i).getiID() %></td>
                        <td><%= inL.get(i).getcID() %></td>
                        <td><%= inL.get(i).getsName() %></td>
                        <td><%= inL.get(i).getdName() %></td>
                        <td><%= inL.get(i).getTotal() %></td>
                        <td> <input type="checkbox" name="get_iIDS" value="<%= inL.get(i).getiID() %>" /> </td>
                    </tr>
                    <%
                    }
                    %>
                </tbody>
            </table>
                
            <div class="row">
                    <div class="col span-1-of-3">
                        <h4>Total:<%=total %> </h4> 
                    </div>
                    
	            <div class="col span-1-of-3">
			<input type="submit" value="Pay Now" name="Paid" onclick = "return noCheck();"/>
		    </div>
                    
                    <div class="col span-1-of-3">
                        <input type="submit" value="Pay Later " name="Unpaid" onclick = "return noCheck();"/>
		    </div>
	    </div>  
        </form>
        </section>
        </div>
        <!--<a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a>-->
    </body>
</html>

