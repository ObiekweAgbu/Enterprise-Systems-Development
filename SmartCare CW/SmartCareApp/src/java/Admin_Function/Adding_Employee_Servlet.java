/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_Function;

import Login.LoginData;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lil Shil
 */
@WebServlet(name = "Adding_Employee_Servlet", urlPatterns = {"/Adding_Employee_Servlet"})

public class Adding_Employee_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
       String eName = request.getParameter("eName");
       String eDOB = request.getParameter("eDOB");
       String eAddress = request.getParameter("eAddress");
       String ePO = request.getParameter("ePO");
       String uName = request.getParameter("uName");
       String ePass = request.getParameter("ePass");
       String Role = request.getParameter("Role");
       
       
       LoginData LD = new LoginData();
       LD.Add_Request(eName, eDOB, eAddress, ePO, uName, ePass, Role);
       String direction = "";
       HttpSession ss =request.getSession();
       String user = (String) ss.getAttribute("user");
       if(user.equals("admin")){
           direction = "DashBoard_JSP/admin.jsp";
       }else{
           direction = "DashBoard_JSP/client_DB.jsp";
       }
       RequestDispatcher rd = request.getRequestDispatcher(direction);
       rd.forward(request, response);
    }
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       RequestDispatcher rd = request.getRequestDispatcher("Adding_Doctor_Nurse.jsp");
       rd.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Adding_Employee_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
