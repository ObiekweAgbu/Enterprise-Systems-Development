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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <%
        LoginData LD = new LoginData();
        String cID = (String) session.getAttribute("cID_to_Pres");
        List<Invoice> inL = LD.get_Invoice_From_cID(cID);
        session.setAttribute("ListofInvoice", inL);
        System.out.println("Loi khong o day");
        double total = 0;
        %>
        
        <form action="${pageContext.request.contextPath}/Payment_Process">
            <table border="1">
                <thead>
                    <tr>
                        <th>Invoice ID</th>
                        <th>Client ID</th>
                        <th>Service</th>
                        <th>Drug</th>
                        <th>Total</th>
                        <th></th>
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
                
                <br>
                <h1>Total: </h1> <%=total %>
                <input type="submit" value="Pay Now" name="Paid" onclick = "return noCheck();"/>
                <input type="submit" value="Pay Later " name="Unpaid" onclick = "return noCheck();"/>
        </form>
                <br>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a>
    </body>
</html>
