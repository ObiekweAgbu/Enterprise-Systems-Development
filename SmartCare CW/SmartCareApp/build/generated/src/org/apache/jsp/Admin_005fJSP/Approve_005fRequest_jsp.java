package org.apache.jsp.Admin_005fJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Login.Request;
import Login.LoginData;

public final class Approve_005fRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Approve Request</title>\n");
      out.write("        <style>\n");
      out.write("            #container{\n");
      out.write("                margin:0 auto;\n");
      out.write("                width: 80%;\n");
      out.write("                overflow:auto;\n");
      out.write("            }\n");
      out.write("            tr:hover {background-color: #D8DA5C }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Processing_Request_Serv\" method=\"POST\">\n");
      out.write("        \n");
      out.write("        <table border = \"1\" class=\"gridtable\" id =\"requesttb\">\n");
      out.write("            <thead>\n");
      out.write("                <tr class=\"tableheader\">\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Date of Birth</th>\n");
      out.write("                    <th>Address</th>\n");
      out.write("                    <th>Post Code</th>\n");
      out.write("                    <th>Username</th>\n");
      out.write("                    <th>Password</th>\n");
      out.write("                    <th>Job</th>\n");
      out.write("                    <th>Options</th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("            <tbody>\n");
      out.write("                ");

                LoginData LD = new LoginData();
                List<Request> list = LD.Display_Request();
                for(int i =0 ; i < list.size();i++){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(list.get(i).getID() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(list.get(i).getName() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(list.get(i).getDOB() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(list.get(i).getAddress() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(list.get(i).getPO() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(list.get(i).getUname() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(list.get(i).getPW() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(list.get(i).getJob() );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"checkbox\" name=\"DeleteOrAdd\" value=\"");
      out.print(list.get(i).getID() );
      out.write("\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        <input type=\"submit\" value=\"Delete\" name=\"DeleteBT\" />        \n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("//        $(document).ready(function (){\n");
      out.write("//            $(\"#requesttb tbody tr\").click(function() {\n");
      out.write("//               var tabledata = $(this).children(\"td\").map(function() {\n");
      out.write("//                return $(this).text();\n");
      out.write("//            }).get();\n");
      out.write("//            alert(tabledata[0])\n");
      out.write("//            });\n");
      out.write("//        });\n");
      out.write("//        \n");
      out.write("//        $(document).on('click',\".btn_row_delete\", function(e)\n");
      out.write("//    {\n");
      out.write("//      var r = $(this).closest('tr').remove();\n");
      out.write("//    });\n");
      out.write("        \n");
      out.write("    </script>\n");
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
