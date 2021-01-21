package org.apache.jsp.Functionalities;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Note_005fTo_005fSpe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Functionalities/../footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/user/css/grid.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/user/css/style.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;1,300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("            #Note {\n");
      out.write("                width: 50%;\n");
      out.write("                margin: 200px auto;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"Header\">\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"row\">   \n");
      out.write("                    <img src=\"../assets/user/img/doctor_logo.png\" alt=\"Smart Care logo\" class=\"logo\">\n");
      out.write("                    <ul class=\"main-nav\">\n");
      out.write("                        <li><a href=\"#Header\">Home</a></li>\n");
      out.write("                        <li><a href=\"../Functionalities/Show_Booking.jsp\">Show Booking</a></li>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Log_Out.jsp\">Log out</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("            <div class=\"big-text-box\">\n");
      out.write("\t\t<h1>Welcome Doctor ");
      out.print(session.getAttribute("user"));
      out.write(" \n");
      out.write("                    <br>to Smart Care<br>The place to Goodbye Diseases,<br>And Hello healthy body.</h1>\n");
      out.write("\t    </div>\n");
      out.write("        </header>\n");
      out.write("         <div class=\"row\" id=\"Note\">\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Transfer_To_Spe\">\n");
      out.write("            <div class=\"row\" style=\"margin-bottom: 20px;\"><h4>Please add some notes to the specialist</h4></div>\n");
      out.write("            <div class=\"row\">     \n");
      out.write("                    <input type=\"text\" name=\"note_To_Spe\" value=\"\" />  \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: 20px;\">\n");
      out.write("                <input type=\"submit\" value=\"OK\" />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("         </div>\n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./assets/user/css/grid.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./assets/user/style.css\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col span-1-of-2\">\n");
      out.write("\t\t\t\t<ul class=\"navigation-link\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">About us</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Blog</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Press</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">iOS App</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Android App</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col span-1-of-2\">\n");
      out.write("\t\t\t\t<ul class=\"navigation-icon\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><ion-icon name=\"logo-facebook\" class=\"navigation-icon-facebook\"></ion-icon></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><ion-icon name=\"logo-twitter\" class=\"navigation-icon-twitter\"></ion-icon></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><ion-icon name=\"logo-google\" class=\"navigation-icon-google\"></ion-icon></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><ion-icon name=\"logo-instagram\" class=\"navigation-icon-instagram\"></ion-icon></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<p>Copyright &copy; 2021 by group 22. All rights reserved.</p>\n");
      out.write("                        <p> Minh Nguyen &mdash; Quan Bui &mdash; ObiekweAgbu &mdash; Lam Ha &mdash; Xue Er</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("    </body>\n");
      out.write("    <!-- Icon   -->\n");
      out.write("    <script src=\"https://unpkg.com/ionicons@5.1.2/dist/ionicons.js\"></script>\n");
      out.write("    <!-- JQuery   -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <!-- Waypoints triggers a function when scrolling to an element -->\n");
      out.write("    <script src=\"../assets/user/js/jquery.waypoints.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"../assets/user/js/script.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("      \n");
      out.write("</html>\n");
      out.write("\n");
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
