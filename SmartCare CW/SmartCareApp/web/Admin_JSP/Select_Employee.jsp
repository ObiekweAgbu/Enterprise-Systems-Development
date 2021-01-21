<%-- 
    Document   : Select_Employee
    Created on : Jan 20, 2021, 3:03:36 AM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Login.LoginData"%>
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
        <script>
             $(function () {
                $("#datepicker").datepicker({ dateFormat: 'yy-mm-dd' });
            });
            
        </script>
        <style>
            html {
                background-color: #eff7e1;
            }
            section {
                margin: 100px auto;
            }
        </style>
         <title>Admin Page</title>
    
     </head>
     <body>
         <section class="section-select-employee section-spacing">
         <form action="Edit_Booking.jsp" class="book-form">
             <div class="row">
		<div class="col span-1-of-3">
		    <label for="Employ_List">List</label>
		</div>
		<div class="col span-2-of-3">
		     <select id="Employ_List" name="Employ_List">
			<%
                          LoginData LD = new LoginData();
                          List<String> Demploy_list = new ArrayList<>();
                          List<String> Nemploy_list = new ArrayList<>();
                          Demploy_list = LD.Get_Doc_Nurse_List(1);
                          Nemploy_list = LD.Get_Doc_Nurse_List(0);
                          for(int i = 0; i < Demploy_list.size();i++){
                          %>
                              <option><%=Demploy_list.get(i)%></option>
                          <%
                          }
                          for(int i = 0; i < Nemploy_list.size();i++){
                          %>
                              <option><%=Nemploy_list.get(i)%></option>
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
            <input type="text" name="date" id="datepicker">
        </div>
    </div>
    
    <div cllass="row">
        <div class="col span-1-of-3">
		    <label>&nbsp;</label>
	</div>

        <div class="col span-2-of-3">
            <input type="submit" value="OK"/>
        </div>
    </div>
        </form>
     </body>
  </html>
