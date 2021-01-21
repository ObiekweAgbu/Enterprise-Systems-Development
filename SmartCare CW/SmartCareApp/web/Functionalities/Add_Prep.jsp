<%-- 
    Document   : Add_Prep
    Created on : Jan 19, 2021, 1:11:23 AM
    Author     : Lil Shil
--%>

<%@page import="java.util.List"%>
<%@page import="Login.Drug"%>
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
    </head>
    <body>
        <section>
        <%
        LoginData LD = new LoginData();
        List<Drug> drL = LD.Drug_List();
        %>
        <form action="${pageContext.request.contextPath}/From_Prep_To_Pay">
            
             <div class="row">
		<div class="col span-1-of-3">
		    <label for="Dr_Name">Choose Type of Drug</label>
		</div>
		<div class="col span-2-of-3">
                    <select name="Dr_Name" id="Dr_Name">
			<%
                          for(int i = 0; i < drL.size();i++){
                        %>
                          <option><%= drL.get(i).getdName() %></option>
                        <%
                        }
                        %>
		    </select>
		</div>
            </div>
           
            <div class="row">
		<div class="col span-1-of-3">
		    <label for="dr_Quan">Drug Quantities</label>
		</div>
		<div class="col span-2-of-3">
                    <select name="dr_Quan" id="dr_Quan">
			<option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                        <option>6</option>
                        <option>7</option>
                        <option>8</option>
                        <option>9</option>
                        <option>10</option>
                        <option>11</option>
                        <option>12</option>
                        <option>13</option>
                        <option>14</option>
                        <option>15</option>
                        <option>16</option>
                        <option>17</option>
                        <option>18</option>
                        <option>19</option>
                        <option>20</option>
		    </select>
		</div>
            </div>
                    
        <div class="row">
		<div class="col span-1-of-3">
		    <label for="dr_Note">Note</label>
		</div>
		<div class="col span-2-of-3">
		    <input type="text" name="dr_Note" id="dr_Note" value="" placeholder="any Note"/>
		</div>
        </div>
        
        <div class="row">
                <div class="col span-1-of-3">
                    <label>&nbsp;</label>
                </div>
                    
	        <div class="col span-1-of-3">
		    <input type="submit" value="Get Invoice" />
		s</div>
	</div>
        </form>
        </section>
        <!--<a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a>-->
    </body>
</html>
