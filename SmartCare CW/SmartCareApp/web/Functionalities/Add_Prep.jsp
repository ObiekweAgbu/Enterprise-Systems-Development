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
        <title>JSP Page</title>
    </head>
    <body>
        <%
        LoginData LD = new LoginData();
        List<Drug> drL = LD.Drug_List();
        %>
        <form action="${pageContext.request.contextPath}/From_Prep_To_Pay">
            Choose Type of Drug: <select name="Dr_Name">
           <%
           for(int i = 0; i < drL.size();i++){
           %>
           <option><%= drL.get(i).getdName() %></option>
            <%
            }
            %>
            </select><br>
        Drug Quantities: <select name="dr_Quan">
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
        </select><br>
        Note: <input type="text" name="dr_Note" value="" /><br>
        <input type="submit" value="Get Invoice" />
        </form>
        <br>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/Log_Out.jsp">Log out</a>
    </body>
</html>
