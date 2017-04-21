package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cus_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0\"/>\n");
      out.write("  <title>Automobile Maintenance</title>\n");
      out.write("\n");
      out.write("  <!-- CSS  -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/materialize.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("  <link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  \n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("      <div class=\"col s3\"></div>\n");
      out.write("      <div class=\"col s6\"><img class=\"responsive-img\" src=\"images/header.png\"></div>\n");
      out.write("      <div class=\"col s3\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("      <div class=\"col s2\"></div>\n");
      out.write("      <div class=\"col s8\"><img class=\"responsive-img move\" src=\"images/car.png\"></div>\n");
      out.write("       <div class=\"col s2\"></div>\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("      <div class=\"col s1\"></div>\n");
      out.write("      <div class=\"col s2\">\n");
      out.write("      <form  action=\"aboutus.html\">\n");
      out.write("     <input type=\"image\" src=\"images/aboutus_logo.png\" alt=\"submit\" width=\"100\" height=\"100\"></form>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"col s2\">\n");
      out.write("      <form  action=\"promotion.html\">\n");
      out.write("     <input type=\"image\" src=\"images/promotion_logo.png\" alt=\"submit\" width=\"100\" height=\"100\"></form>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"col s2\">\n");
      out.write("      <form  action=\"review.html\">\n");
      out.write("     <input type=\"image\" src=\"images/review_logo.png\" alt=\"submit\" width=\"100\" height=\"100\"></form>\n");
      out.write("     </div>\n");
      out.write("      <div class=\"col s2\">\n");
      out.write("      <form  action=\"service.html\">\n");
      out.write("     <input type=\"image\" src=\"images/service_logo.png\" alt=\"submit\" width=\"100\" height=\"100\"></form>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"col s2\">\n");
      out.write("      <form  action=\"login.html\">\n");
      out.write("     <input type=\"image\" src=\"images/login_icon.png\" alt=\"submit\" width=\"100\" height=\"100\"></form>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"col s1\"></div>\n");
      out.write("     \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!--  Scripts-->\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("  <script src=\"js/materialize.js\"></script>\n");
      out.write("  <script src=\"js/init.js\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
