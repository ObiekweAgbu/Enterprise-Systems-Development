package org.apache.jsp.Admin_005fJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import Login.LoginData;

public final class Select_005fEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./assets/user/css/grid.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./assets/user/css/style.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("        <script>\n");
      out.write("             $(function () {\n");
      out.write("                $(\"#datepicker\").datepicker({ dateFormat: 'yy-mm-dd' });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("         <title>Admin Page</title>\n");
      out.write("    \n");
      out.write("     </head>\n");
      out.write("     <body>\n");
      out.write("         <section class=\"section-select-employee section-spacing\">\n");
      out.write("         <form action=\"Edit_Booking.jsp\" class=\"book-form\">\n");
      out.write("             <div class=\"row\">\n");
      out.write("\t\t<div class=\"col span-1-of-3\">\n");
      out.write("\t\t    <label for=\"Employ_List\">List</label>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col span-2-of-3\">\n");
      out.write("\t\t     <select id=\"Employ_List\" name=\"Employ_List\">\n");
      out.write("\t\t\t");

                          LoginData LD = new LoginData();
                          List<String> Demploy_list = new ArrayList<>();
                          List<String> Nemploy_list = new ArrayList<>();
                          Demploy_list = LD.Get_Doc_Nurse_List(1);
                          Nemploy_list = LD.Get_Doc_Nurse_List(0);
                          for(int i = 0; i < Demploy_list.size();i++){
                          
      out.write("\n");
      out.write("                              <option>");
      out.print(Demploy_list.get(i));
      out.write("</option>\n");
      out.write("                          ");

                          }
                          for(int i = 0; i < Nemploy_list.size();i++){
                          
      out.write("\n");
      out.write("                              <option>");
      out.print(Nemploy_list.get(i));
      out.write("</option>\n");
      out.write("                          ");

                          }
                          
      out.write("\n");
      out.write("\t\t    </select>\n");
      out.write("\t\t</div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("         \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col span-1-of-3\">\n");
      out.write("            <label for=\"datepicker\">Choose your date</label>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"col span-2-of-3\">\n");
      out.write("            <input type=\"text\" name=\"date\" id=\"datepicker\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div cllass=\"row\">\n");
      out.write("        <div class=\"col span-1-of-3\">\n");
      out.write("\t\t    <label>&nbsp;</label>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("        <div class=\"col span-2-of-3\">\n");
      out.write("            <input type=\"submit\" value=\"OK\" />\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        </form>\n");
      out.write("     </body>\n");
      out.write("  </html>\n");
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
