package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregar_005flibro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Contact Us</title>\n");
      out.write("<meta name=\"keywords\" content=\"keyword1, keyword2, keyword3, etc...\" />\n");
      out.write("<meta name=\"description\" content=\"Description of website here...\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<!--[if IE ]>\n");
      out.write("<link href=\"css/ie.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"leftMain\"> <a href=\"index.html\"><img src=\"images/logo.gif\" alt=\"School Website\" border=\"0\" /></a>\n");
      out.write("  <div id=\"navbar\">\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"index.html\">Home</a></li>\n");
      out.write("      <li><a href=\"history.html\">School History</a></li>\n");
      out.write("      <li><a href=\"mission.html\">School Mission</a></li>\n");
      out.write("      <li><a href=\"classes.html\">Our Classes</a></li>\n");
      out.write("      <li><a href=\"guarantee.html\">Our Guarantee</a></li>\n");
      out.write("      <li><a href=\"getinvolved.html\">Get Involved</a></li>\n");
      out.write("      <li><a href=\"directions.html\">Directions</a></li>\n");
      out.write("      <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"navbarAlt\">\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"contact.html\">Email Contact Form</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"main\">\n");
      out.write("  <div align=\"right\"><img src=\"images/contact-us.gif\" alt=\"Contact Us\" /></div>\n");
      out.write("  <div id=\"mainphotos\"><img src=\"images/photo-1.jpg\" alt=\"Photo 1\" /><img src=\"images/photo-2.jpg\" alt=\"Photo 2\" /><img src=\"images/learning-is-fun.gif\" alt=\"Learning is Fun\" /><img src=\"images/photo-3.jpg\" alt=\"Photo 3\" /></div>\n");
      out.write("  <div id=\"maintext\">\n");
      out.write("    <p>\n");
      out.write("    </p>\n");
      out.write("    <p><br />\n");
      out.write("    <br />\n");
      out.write("      \n");
      out.write("</p>\n");
      out.write(" \n");
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"process.php\">\n");
      out.write("        <label>Nombre:<br />\n");
      out.write("        <input type=\"text\" name=\"nombre\" value=\"\"  id=\"name\" />\n");
      out.write("        \n");
      out.write("        </label>\n");
      out.write("        <p>\n");
      out.write("          <label>Numero de ejemplar:<br />\n");
      out.write("        <input type=\"text\" name=\"no_ejemplar\" value=\"\" id=\"email\" />\n");
      out.write("        \n");
      out.write("        </label>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("          <label>Paginas:<br />\n");
      out.write("        <input type=\"text\" name=\"paginas\" value=\"\" />\n");
      out.write("        \n");
      out.write("        </label>\n");
      out.write("        </p>\n");
      out.write("    <p>\n");
      out.write("          <label>Tema:<br />\n");
      out.write("        <input type=\"text\" name=\"tema\" value=\"\" />\n");
      out.write("        \n");
      out.write("        </label>\n");
      out.write("        </p>\n");
      out.write("    <p>\n");
      out.write("          <label>Código Autor:<br />\n");
      out.write("        <input type=\"text\" name=\"nombre\" value=\"\" />\n");
      out.write("        \n");
      out.write("        </label>\n");
      out.write("        </p>\n");
      out.write("    <p>\n");
      out.write("          <label>Código Estado:<br />\n");
      out.write("        <input type=\"text\" name=\"cod_estado\" value=\"\" />\n");
      out.write("        \n");
      out.write("        </label>\n");
      out.write("        </p>\n");
      out.write("    \n");
      out.write("        <p>\n");
      out.write("          <input type=\"submit\" name=\"Submit\" value=\"Send\" />\n");
      out.write("        </p>\n");
      out.write("      </form>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"clear\"></div>\n");
      out.write("  <div id=\"footer\"> &copy; Your Company Name | <a href=\"sitemap.html\">Site Map</a><br />\n");
      out.write("    <!-- This template is provided free of charge as long as you keep the link to http://webdevelopmentquote.com -->\n");
      out.write("    <a href=\"http://webdevelopmentquote.com/\" target=\"_blank\" style=\"text-decoration:none;\">Web Development</a> by WebDevelopmentQuote.com</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"font-size: 0.8em; text-align: center; margin-top: 1.0em; margin-bottom: 1.0em;\">\n");
      out.write("Design downloaded from <a href=\"http://www.freewebtemplates.com/\">Free Templates</a> - your source for free web templates\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
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
