/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Em_Function;

import Login.Booking_OBJ;
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
public class To_Operate extends HttpServlet {

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
        if(request.getParameter("Add") != null){
            String sID = request.getParameter("ProcessOrDelete");
            Booking_OBJ bk = LD.get_Booking_by_ID(sID);
            request.getSession().setAttribute("Just_Added_To_Op", bk);
            LD.Insert_To_Operation(bk);
            RequestDispatcher rd = request.getRequestDispatcher("Functionalities/Show_Operation.jsp");
            rd.forward(request, response);
        }
        else{
            StringBuilder sb = new StringBuilder();
        for(String i : request.getParameterValues("ProcessOrDelete")){
                sb.append(i);
        }
        String tempS = sb.toString();
        for(int i = 0; i < tempS.length();i++){
           LD.Delete_From_Booking(Character.toString(tempS.charAt(i)));
        }
        RequestDispatcher rd = request.getRequestDispatcher("Functionalities/Show_Booking.jsp");
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
            Logger.getLogger(To_Operate.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(To_Operate.class.getName()).log(Level.SEVERE, null, ex);
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
