/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.0
 * Generated at: 2017-09-28 19:15:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.inicio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("ctfn:permite", py.com.fielco.fielcorresponsal.utils.GeneralUtils.class, "permiteAccion", new Class[] {java.util.List.class, java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/tags/parent.tag", Long.valueOf(1498675530000L));
    _jspx_dependants.put("jar:file:/home/oem/Programas/apache-tomcat-8.5.6/webapps/fielcorresponsal%23%231.12.0-SNAPSHOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153399482000L));
    _jspx_dependants.put("/WEB-INF/custom-funcions.tld", Long.valueOf(1504036476000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1479759956000L));
    _jspx_dependants.put("/WEB-INF/views/inicio/dashboard.jsp", Long.valueOf(1504036476000L));
    _jspx_dependants.put("jar:file:/home/oem/Programas/apache-tomcat-8.5.6/webapps/fielcorresponsal%23%231.12.0-SNAPSHOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153399482000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/views/inicio/dashboard.jsp(9,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctfn:permite(acciones_permitidas, \"ADMINISTRATIVO\") or ctfn:permite(acciones_permitidas, \"REIMPRESIONES\") }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t<div id=\"administrar\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/administration';\">\n");
          out.write("\t\t\t\t<span class=\"icon-wrench icon icon-hvr\"></span><br>Administrar\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/views/inicio/dashboard.jsp(38,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctfn:permite(acciones_permitidas, \"DESEMBOLSOS\") }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t<div id=\"desembolsos\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/outlays';\">\n");
          out.write("\t\t\t\t<span class=\"icon-loans icon\"></span><br>Desembolsar\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    }
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
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div class=\"col-lg-12 col-lg-12 col-lg-6 col-lg-6 content-list-icons\">\n");
      out.write("\t\t\t<ul class=\"icon\">\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/reports\" data-toggle=\"tooltip\" title=\"Reportes\"><span class=\"icon-chart-bar\" aria-hidden=\"true\" style=\"color: rgb(51, 122, 183);\"></span></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\" title=\"Imprimir\"><span class=\"icon-print\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\" title=\"Mensajes\"><span class=\"icon-comment\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/settings/change_password\" data-toggle=\"tooltip\" title=\"Configuración\"><span class=\"icon-cog\" aria-hidden=\"true\" style=\"color: rgb(51, 122, 183);\"></span></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\" title=\"Ayuda\"><span class=\"icon-help-circled\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"dashboardMenu\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("\t\t<!-- Administrar -->\t\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Western Union -->\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"western\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/westernunion';\">\n");
      out.write("\t\t\t\t<span class=\"icon-wu icon-wester icon\"></span><br>Western Union\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Seguro -->\t\n");
      out.write("\t\t\t<div id=\"seguro\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assurance';\">\n");
      out.write("\t\t\t\t<span class=\"icon-umbrella icon\"></span><br>Seguro\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t<!-- Girisimo -->\n");
      out.write("\t\t\t<div id=\"girisimo\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/orders';\">\n");
      out.write("\t\t\t\t<span class=\"icon-arrows-cw icon\"></span><br>Girísimo\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t<!-- Ahorros -->\n");
      out.write("\t\t\t<div id=\"ahorros\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/savings';\">\n");
      out.write("\t\t\t\t<span class=\"icon-accounts icon\"></span><br>Ahorros\n");
      out.write("\t\t\t</div>\t\t\t\n");
      out.write("\n");
      out.write("\t\t<!-- Desembolsos -->\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t<!-- Creditos -->\n");
      out.write("\t\t\t<div id=\"creditos\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/loans';\">\n");
      out.write("\t\t\t\t<span class=\"icon-dollar icon glyph-size\"></span><br>Créditos\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Tarjetas -->\n");
      out.write("\t\t\t<div id=\"tarjetas\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/cards';\">\n");
      out.write("\t\t\t\t<span class=\"icon-credit-card icon\"></span><br>Tarjetas\n");
      out.write("\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t<!-- Servicios -->\n");
      out.write("\t\t\t<div id=\"servicios\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/services';\">\n");
      out.write("\t\t\t\t<span class=\"icon-th-list icon\"></span><br>Servicios\n");
      out.write("\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t<!-- Depositos -->\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"depositos\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/deposits';\">\n");
      out.write("\t\t\t\t<span class=\"icon-download icon\"></span><br>Depósitos\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- Extracciones -->\n");
      out.write("\t\t\t<div id=\"extracciones\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/withdraw';\">\n");
      out.write("\t\t\t\t<span class=\"icon-upload icon\"></span><br>Extracciones\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Documentos -->\n");
      out.write("\t\t\t<div id=\"documentos\" class=\"col-md-3 btn-blue\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/documents';\">\n");
      out.write("\t\t\t\t<span class=\"icon-doc-text-inv icon\"></span><br>Documentos\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$(\"#ahorros\").addClass(\"disabledbutton\");\n");
      out.write("\t$(\"#western\").addClass(\"disabledbutton\");\n");
      out.write("\t$(\"#girisimo\").addClass(\"disabledbutton\");\n");
      out.write("\t$(\"#creditos\").addClass(\"disabledbutton\");\n");
      out.write("\t$(\"#tarjetas\").addClass(\"disabledbutton\");\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".disabledbutton {\n");
      out.write("    pointer-events: none;\n");
      out.write("    opacity: 0.4;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdl-0\">\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 content-yellowPanel\">\n");
      out.write("\t\t\t\t<div id=\"awardsPanel\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 yellowPanel\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-2 col-sm-2 col-md-1 col-lg-1 icon\">\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-gift\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-10 col-sm-10 col-md-11 col-lg-11\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t<h1>1.500 puntos</h1>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Puesto 15</h3>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tOtra fila\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 link-content\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-6 pull-rigth\">\n");
      out.write("\t\t\t\t\t\t\t<a>> Fielco Premios</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-6 pdr-0\">\t\n");
      out.write("\t\t\t\t\t\t\t<a>> Ranking de CNBs</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 content-orangePanel\">\n");
      out.write("\t\t\t\t<div id=\"rankingPanel\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 orangePanel\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-2 col-sm-2 col-md-1 col-lg-1 icon\">\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-star\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10\">\n");
      out.write("\t\t\t\t\t\t<ol>\n");
      out.write("\t\t\t\t\t\t\t<li>Créditos - Cobro de cuotas</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Tigo compra de minutos</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Tarjetas - Pago de tarjetas</li>\n");
      out.write("\t\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t\t\tOtra fila\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 link-content\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\t\n");
      out.write("\t\t\t\t\t\t\t<a>> Ranking de servicios</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 content-bluePanel\">\n");
      out.write("\t\t\t\t<div id=\"infoPanel\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 bluePanel\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-2 col-sm-2 col-md-1 col-lg-1 icon\">\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-info-circled\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10\">\n");
      out.write("\t\t\t\t\t\t<label>Nueva Resolución Comisiones</label>\n");
      out.write("\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("\t\t\t\t\t\t\tSuspendisse laoreet lectus sit amet metus fringilla\n");
      out.write("\t\t\t\t\t\t\tfermentum. Morbi varius venenatis sem in porttitor.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 content-redPanel\">\n");
      out.write("\t\t\t\t<div id=\"searchPanel\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 redPanel\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-2 col-sm-2 col-md-1 col-lg-1 icon\">\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-search\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10 pdt-5\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Buscar producto o servicio\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div> -->\n");
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
