/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.0
 * Generated at: 2017-08-03 14:36:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/home/oem/Programas/apache-tomcat-8.5.6/webapps/fielcorresponsal%23%231.10.2-RELEASE/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153399482000L));
    _jspx_dependants.put("/WEB-INF/tags/parent.tag", Long.valueOf(1498675530000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1479759956000L));
    _jspx_dependants.put("jar:file:/home/oem/Programas/apache-tomcat-8.5.6/webapps/fielcorresponsal%23%231.10.2-RELEASE/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153399482000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_t_005fparent_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\tactiveHeader(\"homePage\");\n");
      out.write("\t\t\t$('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("\t\t\tvar mensajeError = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorData.message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('.');
      out.write(' ');
      out.write('(');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorData.code}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")';\n");
      out.write("\t\t\t$('#boxMessage').html(message(\"error\", mensajeError));\n");
      out.write("\t\t\t$('#boxMessage').slideDown(300);\n");
      out.write("\t\t});\n");
      out.write("\t</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_005fparent_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  t:parent
    org.apache.jsp.tag.web.parent_tag _jspx_th_t_005fparent_005f0 = (new org.apache.jsp.tag.web.parent_tag());
    _jsp_getInstanceManager().newInstance(_jspx_th_t_005fparent_005f0);
    _jspx_th_t_005fparent_005f0.setJspContext(_jspx_page_context);
    _jspx_th_t_005fparent_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_t_005fparent_005f0, null));
    _jspx_th_t_005fparent_005f0.doTag();
    _jsp_getInstanceManager().destroyInstance(_jspx_th_t_005fparent_005f0);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("\t<div id=\"homeLeftPanel\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("\t\t<div class=\"col-lg-12 col-lg-12 col-lg-6 col-lg-6 home-saludo\">\n");
      out.write("\t\t\t<h2>Bienvenido</h2>\n");
      out.write("\t\t\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo.agency}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("\t\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-lg-12 col-lg-12 col-lg-6 col-lg-6 content-list-icons\">\n");
      out.write("\t\t\t<ul class=\"icon\">\n");
      out.write("\t\t\t\t<li><a href=\"/fielcorresponsal/reports\" data-toggle=\"tooltip\" title=\"Reportes\"><span class=\"icon-chart-bar\" aria-hidden=\"true\" style=\"color: rgb(51, 122, 183);\"></span></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\" title=\"Imprimir\"><span class=\"icon-print\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\" title=\"Mensajes\"><span class=\"icon-comment\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/fielcorresponsal/settings/change_password\" data-toggle=\"tooltip\" title=\"Configuración\"><span class=\"icon-cog\" aria-hidden=\"true\" style=\"color: rgb(51, 122, 183);\"></span></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\" title=\"Ayuda\"><span class=\"icon-help-circled\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0\" id=\"boxMessage\" style=\"display: none;\">\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("<!--  \t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdl-0\"> -->\n");
      out.write("<!-- \t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\"> -->\n");
      out.write("<!-- \t\t\t<div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 content-yellowPanel\"> -->\n");
      out.write("<!-- \t\t\t\t<div id=\"awardsPanel\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 yellowPanel\"> -->\n");
      out.write("<!-- \t\t\t\t\t<div class=\"col-xs-2 col-sm-2 col-md-1 col-lg-1 icon\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t<span class=\"icon-gift\" aria-hidden=\"true\"></span> -->\n");
      out.write("<!-- \t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t\t<div class=\"col-xs-10 col-sm-10 col-md-11 col-lg-11\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t\t<h1>1.500 puntos</h1> -->\n");
      out.write("<!-- \t\t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t\t<h3>Puesto 15</h3> -->\n");
      out.write("<!-- \t\t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t\t</div>  -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Otra fila -->\n");
      out.write("<!-- \t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 link-content\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-6 pull-rigth\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t\t<a>> Fielco Premios</a> -->\n");
      out.write("<!-- \t\t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-6 pdr-0\">\t -->\n");
      out.write("<!-- \t\t\t\t\t\t\t<a>> Ranking de CNBs</a> -->\n");
      out.write("<!-- \t\t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t</div> -->\n");
      out.write("<!-- \t\t\t<div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 content-orangePanel\"> -->\n");
      out.write("<!-- \t\t\t\t<div id=\"rankingPanel\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 orangePanel\"> -->\n");
      out.write("<!-- \t\t\t\t\t<div class=\"col-xs-2 col-sm-2 col-md-1 col-lg-1 icon\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t<span class=\"icon-star\" aria-hidden=\"true\"></span> -->\n");
      out.write("<!-- \t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t\t<div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t<ol> -->\n");
      out.write("<!-- \t\t\t\t\t\t\t<li>Créditos - Cobro de cuotas</li> -->\n");
      out.write("<!-- \t\t\t\t\t\t\t<li>Tigo compra de minutos</li> -->\n");
      out.write("<!-- \t\t\t\t\t\t\t<li>Tarjetas - Pago de tarjetas</li> -->\n");
      out.write("<!-- \t\t\t\t\t\t</ol> -->\n");
      out.write("<!-- \t\t\t\t\t\tOtra fila -->\n");
      out.write("<!-- \t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 link-content\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\t -->\n");
      out.write("<!-- \t\t\t\t\t\t\t<a>> Ranking de servicios</a> -->\n");
      out.write("<!-- \t\t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t</div> -->\n");
      out.write("<!-- \t\t</div> -->\n");
      out.write("<!-- \t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\"> -->\n");
      out.write("<!-- \t\t\t<div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 content-bluePanel\"> -->\n");
      out.write("<!-- \t\t\t\t<div id=\"infoPanel\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 bluePanel\"> -->\n");
      out.write("<!-- \t\t\t\t\t<div class=\"col-xs-2 col-sm-2 col-md-1 col-lg-1 icon\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t<span class=\"icon-info-circled\" aria-hidden=\"true\"></span> -->\n");
      out.write("<!-- \t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t\t<div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t<label>Nueva Resolución Comisiones</label> -->\n");
      out.write("<!-- \t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. -->\n");
      out.write("<!-- \t\t\t\t\t\t\tSuspendisse laoreet lectus sit amet metus fringilla -->\n");
      out.write("<!-- \t\t\t\t\t\t\tfermentum. Morbi varius venenatis sem in porttitor.</p> -->\n");
      out.write("<!-- \t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t</div> -->\n");
      out.write("<!-- \t\t\t<div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 content-redPanel\"> -->\n");
      out.write("<!-- \t\t\t\t<div id=\"searchPanel\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 redPanel\"> -->\n");
      out.write("<!-- \t\t\t\t\t<div class=\"col-xs-2 col-sm-2 col-md-1 col-lg-1 icon\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t<span class=\"icon-search\" aria-hidden=\"true\"></span> -->\n");
      out.write("<!-- \t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t\t<div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10 pdt-5\"> -->\n");
      out.write("<!-- \t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Buscar producto o servicio\"/> -->\n");
      out.write("<!-- \t\t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t\t</div> -->\n");
      out.write("<!-- \t\t\t</div> -->\n");
      out.write("<!-- \t\t</div> -->\n");
      out.write("<!-- \t</div> -->\n");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
