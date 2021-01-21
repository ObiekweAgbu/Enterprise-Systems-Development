/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Em_Function;

import Login.LoginData;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lil Shil
 */
public class From_Operation extends HttpServlet {

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
        LoginData LD = new LoginData();
        String oID = request.getParameter("get_OID");
        String cID = LD.get_cID_From_oID(oID);
        request.getSession().setAttribute("oID_to_Pres", oID);
        request.getSession().setAttribute("cID_to_Pres", cID);
        if(request.getParameter("To_Pres") != null){
            RequestDispatcher rd = request.getRequestDispatcher("Functionalities/Add_Prep.jsp");
            rd.forward(request, response);
        }
        else if(request.getParameter("To_Payment") != null){
            LD.From_Op_To_Payment(oID);
            RequestDispatcher rd = request.getRequestDispatcher("Functionalities/Payment.jsp");
            rd.forward(request, response);
        }
        else if(request.getParameter("To_Delay") != null){
            LD.set_Op_To_Delay(oID);
            System.out.println("oID ne: " + oID);
            RequestDispatcher rd = request.getRequestDispatcher("Functionalities/Show_Operation.jsp");
            rd.forward(request, response);
        }
        else if(request.getParameter("To_SP") != null){
            RequestDispatcher rd = request.getRequestDispatcher("Functionalities/Note_To_Spe.jsp");
            rd.forward(request, response);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(From_Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            Logger.getLogger(From_Operation.class.getName()).log(Level.SEVERE, null, ex);
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
