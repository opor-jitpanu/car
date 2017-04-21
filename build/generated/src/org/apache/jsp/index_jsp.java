package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0\"/>\n");
      out.write("        <title>Starter Template - Materialize</title>\n");
      out.write("\n");
      out.write("        <!-- CSS  -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/materialize.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("        <link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"light-blue lighten-1\" role=\"navigation\">\n");
      out.write("            <div class=\"nav-wrapper container\"><a id=\"logo-container\" href=\"index.jsp\" class=\"brand-logo\">Automobile Maintenance</a>\n");
      out.write("                <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                    <li><a href=\"promotion.html\">Promotion</a></li>\n");
      out.write("                    <li><a href=\"service.html\">Service</a></li>\n");
      out.write("                    <li><a href=\"aboutus.html\">About us</a></li>\n");
      out.write("                    \n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          \n");
      out.write("                          \n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <a href=\"#\" data-activates=\"nav-mobile\" class=\"button-collapse\"><i class=\"material-icons\">menu</i></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"section no-pad-bot\" id=\"index-banner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <br><br>\n");
      out.write("                <h1 class=\"header center orange-text\">Automobile Maintenance</h1>\n");
      out.write("                <div class=\"row center\">\n");
      out.write("                    <h5 class=\"header col s12 light\">All new Automobile Maintenance System first in the World!</h5>\n");
      out.write("                </div>\n");
      out.write("                <!--<div class=\"row center\"> \n");
      out.write("                  <a href=\"http://materializecss.com/getting-started.html\" id=\"download-button\" class=\"btn-large waves-effect waves-light orange\">Get Started</a>\n");
      out.write("                </div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.roles}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"section\">\n");
      out.write("\n");
      out.write("                <!--   Icon Section   -->\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col s1\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col s4\">\n");
      out.write("                        <div class=\"icon-block\">\n");
      out.write("                            <h2 class=\"center light-blue-text\"> \n");
      out.write("                                <h2 class=\"center light-blue-text\"><i class=\"material-icons\">flash_on</i></h2>\n");
      out.write("                                <h5 class=\"center\">Promotions</h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!-- <h5 class=\"center\">Speeds up development</h5>\n");
      out.write("                     \n");
      out.write("                                 <p class=\"light\">We did most of the heavy lifting for you to provide a default stylings that incorporate our custom components. Additionally, we refined animations and transitions to provide a smoother experience for developers.</p>-->\n");
      out.write("                                <div class=\"row center\"> \n");
      out.write("                                    <a href=\"promotion.html\" id=\"download-button\" class=\"btn-large waves-effect waves-light orange\">Promotions</a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col s1\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col s1\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col s4\">\n");
      out.write("                        <div class=\"icon-block\">\n");
      out.write("                            <h2 class=\"center light-blue-text\"><i class=\"material-icons\">settings</i></h2>\n");
      out.write("                            <h5 class=\"center\">Services</h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row center\"> \n");
      out.write("                                <a href=\"service.html\" id=\"download-button\" class=\"btn-large waves-effect waves-light orange\">Services</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col s1\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col s1\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col s4\">\n");
      out.write("                        <div class=\"icon-block\">\n");
      out.write("                            <h2 class=\"center light-blue-text\"><i class=\"material-icons\">chat</i></h2>\n");
      out.write("                            <h5 class=\"center\">Customers' Reviews</h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row center\"> \n");
      out.write("                                <a href=\"review.html\" id=\"download-button\" class=\"btn-large waves-effect waves-light orange\">Reviews</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col s1\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col s1\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col s4\">\n");
      out.write("                        <div class=\"icon-block\">\n");
      out.write("                            <h2 class=\"center light-blue-text\"><i class=\"material-icons\">group</i></h2>\n");
      out.write("                            <h5 class=\"center\">About Us</h5>\n");
      out.write("\n");
      out.write("                            <div class=\"row center\"> \n");
      out.write("                                <a href=\"aboutus.html\" id=\"download-button\" class=\"btn-large waves-effect waves-light orange\">About us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <div class=\"section\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"page-footer orange\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col l6 s12\">\n");
      out.write("                        <h5 class=\"white-text\">Automobile Maintenance System</h5>\n");
      out.write("                        <p class=\"grey-text text-lighten-4\">We are a team of college students making the Automobile Maintenance System.</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    Made by <a class=\"orange-text text-lighten-3\" href=\"#\">IT KMITL</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--  Scripts-->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/materialize.js\"></script>\n");
      out.write("        <script src=\"js/init.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li><a href=\"LogoutServlet\">Logout</a></li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ sessionScope.user ==null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li><a href=\"login.html\">Login</a></li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
