package org.apache.jsp.Functionalities;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Login.Operation;
import Login.Booking_OBJ;
import Login.LoginData;

public final class Show_005fOperation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function select_check(){\n");
      out.write("                if(document.querySelectorAll('input[type = \"checkbox\"]:checked').length > 1){\n");
      out.write("                alert(\"You can only process one at a time\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("                else if(document.querySelectorAll('input[type = \"checkbox\"]:checked').length == 0){\n");
      out.write("                    alert(\"You have to choose at least one\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/From_Operation\">\n");
      out.write("        \n");
      out.write("        Processing:<br>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Patient Name</th>\n");
      out.write("                    <th>Date</th>\n");
      out.write("                    <th>Time</th>\n");
      out.write("                    <th>Service</th>\n");
      out.write("                    <th>Slot</th>\n");
      out.write("                    <th>Fee</th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    LoginData LD = new LoginData();
                    List<Operation> ProOpL = LD.get_Op(0);
                    for(int i = 0; i < ProOpL.size();i++){
                    
      out.write("\n");
      out.write("                <tr>    \n");
      out.write("                    <td>");
      out.print( ProOpL.get(i).getoID() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( LD.get_cName_From_cID(ProOpL.get(i).getcID()) );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ProOpL.get(i).getoDate() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ProOpL.get(i).getoTime() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ProOpL.get(i).getsName() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ProOpL.get(i).getnSlot() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ProOpL.get(i).getCharge());
      out.write("</td>\n");
      out.write("                    <td> <input type=\"checkbox\" name=\"get_OID\" value=\"");
      out.print( ProOpL.get(i).getoID() );
      out.write("\" id=\"Pro\" /> </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                  }
                  
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Add Prescription\" name=\"To_Pres\" onclick =\"return select_check();\"/>\n");
      out.write("            <input type=\"submit\" value=\"Go to Payment\" name=\"To_Payment\" onclick =\"return select_check();\"/>\n");
      out.write("            <input type=\"submit\" value=\"Delay\" name=\"To_Delay\" />\n");
      out.write("            <br>\n");
      out.write("         </form>\n");
      out.write("    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Op_Delay\">\n");
      out.write("            Delay:<br>\n");
      out.write("           <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Patient Name</th>\n");
      out.write("                    <th>Date</th>\n");
      out.write("                    <th>Time</th>\n");
      out.write("                    <th>Service</th>\n");
      out.write("                    <th>Slot</th>\n");
      out.write("                    <th>Fee</th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    
                    List<Operation> DeOpL = LD.get_Op(1);
                    for(int i = 0; i < DeOpL.size();i++){
                    
      out.write("\n");
      out.write("                <tr>    \n");
      out.write("                    <td>");
      out.print( DeOpL.get(i).getoID() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( LD.get_cName_From_cID(DeOpL.get(i).getcID()) );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeOpL.get(i).getoDate() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeOpL.get(i).getoTime() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeOpL.get(i).getsName() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeOpL.get(i).getnSlot() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( DeOpL.get(i).getCharge());
      out.write("</td>\n");
      out.write("                    <td>  <input type=\"checkbox\" name=\"Delete_Or_Move\" value=\"");
      out.print( DeOpL.get(i).getoID() );
      out.write("\" /> </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                  }
                  
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("</form>\n");
      out.write("        \n");
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
