package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CompanyChanPass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Change Password</title>\n");
      out.write("        <style>\n");
      out.write("            /* Basic styles for demo purposes */\n");
      out.write("            body {\n");
      out.write("\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                line-height: 1.6;\n");
      out.write("                background-color: #f0f0f0;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            .container {\n");
      out.write("                max-width: 600px;\n");
      out.write("                margin: 20px auto;\n");
      out.write("                background-color: #fff;\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                box-shadow: 0 0 10px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("            h2 {\n");
      out.write("                text-align: center;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("            .form-group {\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("            }\n");
      out.write("            label {\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("            }\n");
      out.write("            input[type=\"text\"], input[type=\"email\"], input[type=\"password\"] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            button {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("            button:hover {\n");
      out.write("                background-color: #45a049;\n");
      out.write("            }\n");
      out.write("            @media screen and (max-width: 768px) {\n");
      out.write("                .container {\n");
      out.write("                    width: 90%;\n");
      out.write("                    margin: 10px auto;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("     ");

        HttpSession st=request.getSession();
        String user=(String)st.getAttribute("user1");
        String pass=(String)st.getAttribute("pass1");
        if(user==null||pass==null)
          response.sendRedirect("index.jsp?msg=Please login first!!!!");  
        
      out.write("\n");
      out.write("\n");
      out.write("    <body style=\" background-color: pink \">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Change Password</h2>\n");
      out.write("            <form action=\"sregistration\" method=\"get\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"srno\">Old Password</label>\n");
      out.write("                    <input type=\"text\" name=\"t1\"   required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\">New Password</label>\n");
      out.write("                    <input type=\"text\"  name=\"t2\" required>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <button type=\"submit\" value=\"Change\">Register</button>\n");
      out.write("\n");
      out.write(" \n");
      out.write("                   \n");
      out.write("                            ");

                            String abc=request.getParameter("msg");
                            if(abc!=null)
                            out.println("<h4 style='color:green;'>"+abc+"</h4>");
                            
                            
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
