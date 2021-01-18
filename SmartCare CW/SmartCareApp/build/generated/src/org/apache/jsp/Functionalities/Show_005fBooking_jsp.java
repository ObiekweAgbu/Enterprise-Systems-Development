package org.apache.jsp.Functionalities;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Login.Booking_OBJ;
import Login.LoginData;

public final class Show_005fBooking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Select Date.jsp", out, false);
      out.write("\n");
      out.write("        ");

        String date = request.getParameter("date");
        String uName = "eaydin";
        LoginData LD = new LoginData();
        if(date != null){
            List<Booking_OBJ> bko = LD.get_Booking_List(uName, date);
        
      out.write("\n");
      out.write("        <h1>Booking for: ");
      out.print( request.getParameter("date") );
      out.write("</h1>\n");
      out.write("        ");

            if(bko.isEmpty()){
        
      out.write("\n");
      out.write("            You don't have any booking for today\n");
      out.write("            ");

            }
        else{
            
      out.write("\n");
      out.write("        <form action=\"To_Operate\">        \n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <th>Booking ID</th>\n");
      out.write("                    <th>Client Name</th>\n");
      out.write("                    <th>Time</th>\n");
      out.write("                    <th>Service</th>\n");
      out.write("                    <th></th>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                    for(int i = 0; i < bko.size();i++){
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( bko.get(i).getsID() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( bko.get(i).getcID() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( bko.get(i).getsTime() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( bko.get(i).getsName() );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("                \n");
      out.write("            </table>               \n");
      out.write("                <input type=\"submit\" value=\"Process Booking\" />   \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            }
        }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
