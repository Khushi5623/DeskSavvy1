package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>DeskSavvy</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/droid_sans_400-droid_sans_700.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    /* Basic styles for demo purposes */\n");
      out.write("    body {\n");
      out.write("\n");
      out.write("      font-family: Arial, sans-serif;\n");
      out.write("      line-height: 1.6;\n");
      out.write("      background-color: #f0f0f0;\n");
      out.write("      margin: 0;\n");
      out.write("      padding: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .container {\n");
      out.write("      max-width: 600px;\n");
      out.write("      margin: 20px auto;\n");
      out.write("      background-color: #fff;\n");
      out.write("      padding: 20px;\n");
      out.write("      border-radius: 8px;\n");
      out.write("      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h2 {\n");
      out.write("      text-align: center;\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-group {\n");
      out.write("      margin-bottom: 15px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    label {\n");
      out.write("      display: block;\n");
      out.write("      margin-bottom: 5px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"],\n");
      out.write("    input[type=\"email\"],\n");
      out.write("    input[type=\"password\"] {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 10px;\n");
      out.write("      font-size: 16px;\n");
      out.write("      border: 1px solid #ccc;\n");
      out.write("      border-radius: 4px;\n");
      out.write("      box-sizing: border-box;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    button {\n");
      out.write("      background-color: #4CAF50;\n");
      out.write("      color: #fff;\n");
      out.write("      padding: 12px 20px;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 4px;\n");
      out.write("      cursor: pointer;\n");
      out.write("      font-size: 16px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    button:hover {\n");
      out.write("      background-color: #45a049;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    @media screen and (max-width: 768px) {\n");
      out.write("      .container {\n");
      out.write("        width: 90%;\n");
      out.write("        margin: 10px auto;\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

        HttpSession st=request.getSession();
        String user=(String)st.getAttribute("user1");
        String pass=(String)st.getAttribute("pass1");
        if(user==null||pass==null)
          response.sendRedirect("index.jsp?msg=Please login first!!!!");  
        
      out.write("\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("     \n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"index.html\"><span>DeskSavvy-</span>Add Employee Portal</a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\">\n");
      out.write("        <ul>\n");
      out.write("          <li class=\"active\"><a href=\"office_home.jsp\"><span>Home</span></a></li>\n");
      out.write("          <li><a href=\"addEmp.jsp\"><span>Add Employee</span></a></li>\n");
      out.write("          <li><a href=\"viewemp.jsp\"><span>View Employee</span></a></li>\n");
      out.write("          <li><a href=\"empsal.jsp\"><span>Emp Salary</span></a></li>\n");
      out.write("         <li><a href=\"attendance_data.jsp\"><span>Attendance Data</span></a></li>\n");
      out.write("        <li><a href=\"leave_data.jsp\"><span>View Leave</span></a></li>\n");
      out.write("       </ul>\n");
      out.write("      </div> </div>\n");
      out.write("      </div>\n");
      out.write("      </div> \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      \n");
      out.write(" <div class=\"container\">\n");
      out.write("    <h2>Employee Registration</h2>\n");
      out.write("    <form method=\"post\" action=\"addemp\" name=\"frm\" onsubmit=\"return abc();\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"srno\">Name</label>\n");
      out.write("        <input type=\"text\" name=\"t1\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"email\">Department <label>\n");
      out.write("          <input type=\"text\" name=\"t2\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"Course\">City</label>\n");
      out.write("        <input type=\"text\" name=\"t3\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"Branch\">State</label>\n");
      out.write("        <input type=\"text\" name=\"t4\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"contact\">Address</label>\n");
      out.write("        <input type=\"text\" name=\"t5\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"email\">Pin</label>\n");
      out.write("        <input type=\"text\" name=\"t6\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"Address\">Phone no</label>\n");
      out.write("        <input type=\"text\" name=\"t7\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"Address\">E-mail</label>\n");
      out.write("        <input type=\"email\" name=\"t8\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <button type=\"submit\">Register</button>\n");
 
                            String m=request.getParameter("msg");
                            if(m!=null)
                                out.println("<p style='color:red';>"+m+"</p>");
                            
      out.write("  \n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("       </body>\n");
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
