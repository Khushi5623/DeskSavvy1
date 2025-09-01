package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta name=\"author\" content=\"Aldi Duzha\" />\n");
      out.write("    <meta name=\"description\" content=\"Free Bulma Login Template, part of Awesome Bulma Templates\" />\n");
      out.write("    <meta name=\"keywords\" content=\"bulma, login, page, website, template, free, awesome\" />\n");
      out.write("    <link rel=\"canonical\" href=\"https://aldi.github.io/bulma-login-template/\" />\n");
      out.write("    <title>Desksavvy</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Quicksand\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma@0.9.0/css/bulma.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma-social@1/bin/bulma-social.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.13.0/css/all.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\" />\n");
      out.write("    <style>\n");
      out.write("        td{\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("  <table>\n");
      out.write("    <tr>\n");
      out.write("      <td  >  <a href=\"index.jsp\">  <button class=\"button is-block is-info is-large is-fullwidth\">Home Page</button></a>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("          </td>\n");
      out.write("      \n");
      out.write("          <td>  <a href=\"support.jsp\">  <button class=\"button is-block is-info is-large is-fullwidth\">Employee Log-In</button></a>\n");
      out.write("            </td>\n");
      out.write("            <td >  <a href=\"about.jsp\">  <button class=\"button is-block is-info is-large is-fullwidth\">About Us</button></a>\n");
      out.write("              </td>\n");
      out.write("              <td >  <a href=\"blog.jsp\">  <button class=\"button is-block is-info is-large is-fullwidth\">Blog</button></a>\n");
      out.write("               </td>\n");
      out.write("                <td >  <a href=\"contact.jsp\">  <button class=\"button is-block is-info is-large is-fullwidth\">Contact Us</button></a>\n");
      out.write("                 </td>\n");
      out.write("              \n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("    <section class=\"hero is-fullheight\">\n");
      out.write("      <div class=\"hero-body\">\n");
      out.write("        <div class=\"container has-text-centered\">\n");
      out.write("          <div class=\"column is-4 is-offset-4\">\n");
      out.write("            <div class=\"box \">\n");
      out.write("              <p class=\"subtitle is-4\">Please login to proceed.</p>\n");
      out.write("              <br />\n");
      out.write("              <form action=\"login\" method=\"get\">\n");
      out.write("\n");
      out.write("                <div class=\"field\">\n");
      out.write("                  <p class=\"control has-icons-left has-icons-right\">\n");
      out.write("                    <input class=\"input is-medium\" type=\"text\" name=\"t2\" placeholder=\"User Id\" />\n");
      out.write("                    <span class=\"icon is-medium is-left\">\n");
      out.write("                      <i class=\"fas fa-envelope\"></i>\n");
      out.write("                    </span>\n");
      out.write("                    <span class=\"icon is-medium is-right\">\n");
      out.write("                      <i class=\"fas fa-check\"></i>\n");
      out.write("                    </span>\n");
      out.write("                  </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"field\">\n");
      out.write("                  <p class=\"control has-icons-left\">\n");
      out.write("                    <input class=\"input is-medium\" type=\"password\" name=\"t3\" placeholder=\"Password\" />\n");
      out.write("                    <span class=\"icon is-small is-left\">\n");
      out.write("                      <i class=\"fas fa-lock\"></i>\n");
      out.write("                    </span>\n");
      out.write("                  </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"field\">\n");
      out.write("                 \n");
      out.write("                  <div class=\" is-block is-info is-large is-fullwidth\">\n");
      out.write("                    <select name=\"t1\">\n");
      out.write("                        <option ><h1>Select User Type</h1></option>\n");
      out.write("                    <option value=\"admin\"><h1>Admin</h1></option>\n");
      out.write("<option value=\"company\"><h1>Company</h1></option>\n");
      out.write("                     \n");
      out.write("                    </select>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                   <button class=\"button is-block is-info is-large is-fullwidth\" value=\"LogIn\">Login</button><br />\n");
      out.write("               \n");
      out.write("                \n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"hero-foot\">\n");
      out.write("        <div class=\"container has-text-centered\">\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("  </body>\n");
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
