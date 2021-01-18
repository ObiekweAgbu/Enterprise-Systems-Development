package org.apache.jsp.Functionalities;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import Login.LoginData;

public final class Book_005fDoctor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title></title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            var list ;\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#datepicker\").datepicker({ dateFormat: 'dd-mm-yy' });\n");
      out.write("            });\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\"#TimeSelect\").click(function(){\n");
      out.write("                   if($(\"#datepicker\").val() == \"\"){\n");
      out.write("                        alert(\"You have to select a date\")\n");
      out.write("                   }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <Pre>\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Booking_Serv\">\n");
      out.write("<!--            <label for=\"datepicker\">Enter Your Date of Birth:</label>--> \n");
      out.write("            \n");
      out.write("            Doctors: <select name=\"Employ_List\" id=\"Employ_L\">\n");
      out.write("    ");

    LoginData LD = new LoginData();
    List<String> employ_list = new ArrayList<>();
    employ_list=LD.Get_Doc_Nurse_List(1);;
    for(int i = 0; i < employ_list.size();i++){
    
      out.write("\n");
      out.write("    <option>");
      out.print(employ_list.get(i));
      out.write("</option>\n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("    \n");
      out.write("</select>\n");
      out.write("            Choose your date: <input type=\"text\" name=\"date\" id=\"datepicker\">\n");
      out.write("            Choose your time: <select name=\"Time\" id=\"TimeSelect\">\n");
      out.write("                ");

                List<String> Time = LD.Time_Gene();
                for(int i = 0; i < Time.size();i++){
                    

      out.write("\n");
      out.write("                <option>");
      out.print(Time.get(i));
      out.write("</option>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("            </select>\n");
      out.write("            Choose your service: <select name=\"Serv\">\n");
      out.write("                                ");

                List<String> Serv = LD.getServ();
                for(int i = 0; i < Serv.size();i++){
                    

      out.write("\n");
      out.write("                <option>");
      out.print(Serv.get(i));
      out.write("</option>\n");
      out.write("                            ");

            }
            
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" value=\"Submit\">\n");
      out.write("        </form>\n");
      out.write("        </pre>    \n");
      out.write("    </body>\n");
      out.write("</html>");
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
