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
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            var list ;
            $(function () {
                $("#datepicker").datepicker({ dateFormat: 'dd-mm-yy' });
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
        <Pre>
        <form action="${pageContext.request.contextPath}/Booking_Serv">
<!--            <label for="datepicker">Enter Your Date of Birth:</label>--> 
            
            Nurses: <select name="Employ_List" id="Employ_L">
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
            Choose your date: <input type="text" name="date" id="datepicker">
            Choose your time: <select name="Time" id="TimeSelect">
                <%
                List<String> Time = LD.Time_Gene();
                for(int i = 0; i < Time.size();i++){
                    
%>
                <option><%=Time.get(i)%></option>
            <%
            }
            %>
            </select>
            Choose your service: <select name="Serv">
                                <%
                List<String> Serv = LD.getServ();
                for(int i = 0; i < Serv.size();i++){
                    
%>
                <option><%=Serv.get(i)%></option>
                            <%
            }
            %>
            </select>
            <input type="submit" value="Submit">
        </form>
        </pre>    
    </body>
</html>