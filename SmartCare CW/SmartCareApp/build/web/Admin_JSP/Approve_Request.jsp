<%-- 
    Document   : Approve_Request
    Created on : Jan 15, 2021, 10:59:15 AM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
<%@page import="Login.Request"%>
<%@page import="Login.LoginData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script>
        function noTick(){
            if(document.querySelectorAll('input[type = "checkbox"]:checked').length == 0){
                alert("You havent selected any row");
                return false;
            }
        }
        
    </script>
<html>
    <head>
        <title>Approve Request</title>
        <style>
            #container{
                margin:0 auto;
                width: 80%;
                overflow:auto;
            }
            tr:hover {background-color: #D8DA5C }
        </style>
    </head>

    <body>
        <form action="${pageContext.request.contextPath}/Processing_Request_Serv" method="POST">
        
        <table border = "1" class="gridtable" id ="requesttb">
            <thead>
                <tr class="tableheader">
                    <th>ID</th>
                    <th>Name</th>
                    <th>Date of Birth</th>
                    <th>Address</th>
                    <th>Post Code</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Job</th>
                    <th>Options</th>
                    <th></th>
                </tr>
            </thead>
            
            <tbody>
                <%
                LoginData LD = new LoginData();
                List<Request> list = LD.Display_Request();
                for(int i =0 ; i < list.size();i++){
                %>
                <tr>
                    <td><%=list.get(i).getID() %></td>
                    <td><%=list.get(i).getName() %></td>
                    <td><%=list.get(i).getDOB() %></td>
                    <td><%=list.get(i).getAddress() %></td>
                    <td><%=list.get(i).getPO() %></td>
                    <td><%=list.get(i).getUname() %></td>
                    <td><%=list.get(i).getPW() %></td>
                    <td><%=list.get(i).getJob() %></td>
                    <td>
                        <input type="checkbox" name="DeleteOrAdd" value="<%=list.get(i).getID() %>" />
                    </td>
                </tr>
                <%
                }
                %>
                
            </tbody>
            
        </table>
        <input type="submit" value="Delete" name="DeleteBT" onclick="return noTick();" />        
        <input type="submit" value="Add" name="AddBT" onclick="return noTick();" />
    </form>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <br>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a>
    </body>
</html>
