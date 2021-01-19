package org.apache.jsp.Functionalities;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Login.Drug;
import Login.LoginData;

public final class Add_005fPrep_jsp extends org.apache.jasper.runtime.HttpJspBase
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

        LoginData LD = new LoginData();
        List<Drug> drL = LD.Drug_List();
        
      out.write("\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/From_Prep_To_Pay\">\n");
      out.write("            Choose Type of Drug: <select name=\"Dr_Name\">\n");
      out.write("           ");

           for(int i = 0; i < drL.size();i++){
           
      out.write("\n");
      out.write("           <option>");
      out.print( drL.get(i).getdName() );
      out.write("</option>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("            </select><br>\n");
      out.write("        Drug Quantities: <select name=\"dr_Quan\">\n");
      out.write("            <option>1</option>\n");
      out.write("            <option>2</option>\n");
      out.write("            <option>3</option>\n");
      out.write("            <option>4</option>\n");
      out.write("            <option>5</option>\n");
      out.write("            <option>6</option>\n");
      out.write("            <option>7</option>\n");
      out.write("            <option>8</option>\n");
      out.write("            <option>9</option>\n");
      out.write("            <option>10</option>\n");
      out.write("            <option>11</option>\n");
      out.write("            <option>12</option>\n");
      out.write("            <option>13</option>\n");
      out.write("            <option>14</option>\n");
      out.write("            <option>15</option>\n");
      out.write("            <option>16</option>\n");
      out.write("            <option>17</option>\n");
      out.write("            <option>18</option>\n");
      out.write("            <option>19</option>\n");
      out.write("            <option>20</option>\n");
      out.write("        </select><br>\n");
      out.write("        Note: <input type=\"text\" name=\"dr_Note\" value=\"\" /><br>\n");
      out.write("        <input type=\"submit\" value=\"Get Invoice\" />\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Log_Out.jsp\">Log out</a>\n");
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
