/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lil Shil
 */
@WebFilter(urlPatterns = {"/View_Patient_Servlet", "/Adding_Employee_Servlet","/Delete_From_Booking","/Delete_PA","/Processing_Request_Serv","/View_Patient_Servlet"})
public class Session_Filter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest rq = (HttpServletRequest) request;
        HttpServletResponse rps = (HttpServletResponse) response;
        
        if(rq.getRequestedSessionId() != null && !rq.isRequestedSessionIdValid()){
            System.out.println("Session time out");
            rps.sendRedirect("homepage.jsp");
        }
        else{
            System.out.println("Session is still up");
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        
    }
    
}
