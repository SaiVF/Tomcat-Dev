/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.0
 * Generated at: 2017-05-29 20:27:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.seguros;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pendientes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("ctfn:permite", py.com.roshka.fielcorresponsal.utils.GeneralUtils.class, "permiteAccion", new Class[] {java.util.List.class, java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/tags/parent.tag", Long.valueOf(1490290378000L));
    _jspx_dependants.put("/WEB-INF/custom-funcions.tld", Long.valueOf(1490290378000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1479759956000L));
    _jspx_dependants.put("jar:file:/home/oem/Programas/apache-tomcat-8.5.6/webapps/fielcorresponsal%23%231.9.0-RC1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153399482000L));
    _jspx_dependants.put("jar:file:/home/oem/Programas/apache-tomcat-8.5.6/webapps/fielcorresponsal%23%231.9.0-RC1/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153399482000L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_t_005fparent_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("        <h4 class=\"modal-title\" id=\"myModalLabel\">Ayuda</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <span><b>Shift + c: </b> Editar \"Tipo Documento\" Cliente</span><br>\n");
      out.write("        <span><b>Shift + b: </b> Editar \"Tipo Documento\" Beneficiario</span>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"myModalReading\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"\" style=\"padding-top: 200px;\">\n");
      out.write("      <div class=\"modal-loading\">\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\tactiveHeader(\"assurancePage\");\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$('.collapse').on('show.bs.collapse', function () {\n");
      out.write("\t\t\tvar element = \"#\"+$(this).attr('id');\n");
      out.write("\t\t\tvar tab = $('tr[data-target=\"'+element+'\"]').children('td').children('div').children('span');\n");
      out.write("\t\t\ttab.removeClass(\"glyphicon-chevron-down\");\n");
      out.write("\t\t\ttab.addClass(\"glyphicon glyphicon-chevron-up\");\n");
      out.write("\t\t});\n");
      out.write("\t\t$('.collapse').on('hidden.bs.collapse', function () {\n");
      out.write("\t\t\tvar element = \"#\"+$(this).attr('id');\n");
      out.write("\t\t\tvar tab = $('tr[data-target=\"'+element+'\"]').children('td').children('div').children('span');\n");
      out.write("\t\t\ttab.addClass(\"glyphicon-chevron-down\");\n");
      out.write("\t\t\ttab.removeClass(\"glyphicon-chevron-up\");\n");
      out.write("\t\t});\n");
      out.write("\t\t$('.link-ver-mas').each(function (){\n");
      out.write("\t\t\tvar detalles_id = $(this).attr('id');\n");
      out.write("\t\t\tvar caja_detalles = $(this).next().attr('id');\n");
      out.write("\t\t\t$('#' + detalles_id).on('click', function () {\n");
      out.write("\t\t\t\tvar cerrada = $('#' + caja_detalles).hasClass('hidden');\n");
      out.write("\t\t\t\tif(cerrada){\n");
      out.write("\t\t\t\t\t$('#' + detalles_id).text(\"- Detalles\");\n");
      out.write("\t\t\t\t\t$('#' + caja_detalles).removeClass('hidden');\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t$('#' + detalles_id).text(\"+ Detalles\");\n");
      out.write("\t\t\t\t\t$('#' + caja_detalles).addClass('hidden');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$('#inp-nro-ci').focusout(function(){\n");
      out.write("\t\t\tif($('#inp-nro-ci').val().trim()!==\"\"){\n");
      out.write("\t\t\t\t$('#myModalReading').modal('show');\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl : '/fielcorresponsal/assurance/pending/poli',\n");
      out.write("\t\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\tnroCi : $('#inp-nro-ci').val()\n");
      out.write("\t\t\t\t\t\t/*type : $('#type-assurance').val(),*/\t\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\ttype : 'GET',\n");
      out.write("\t\t\t\t\tsuccess : function(result) {\n");
      out.write("\t\t\t\t\t\t$('#myModalReading').modal('hide');\n");
      out.write("\t\t\t\t\t\t$('#contenedor-polizas').html(result);\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\terror : function(result) {\n");
      out.write("\t\t\t\t\t\t$('#myModalReading').modal('hide');\n");
      out.write("\t\t\t\t\t\t$('#boxMessage').html(message(\"error\", \"Ha ocurrido un error al consultar las pólizas del cliente\"));\n");
      out.write("\t\t\t\t\t\t$('#boxMessage').slideDown(300);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("// \t\t$('#mas_Detalles_azul').on('click', function () {\n");
      out.write("// \t\t\tvar cerrada = $('#caja-azul-detalles').hasClass('hidden');\n");
      out.write("// \t\t\tif(cerrada){\n");
      out.write("// \t\t\t\t$('#mas_Detalles_azul').text(\"- Detalles\");\n");
      out.write("// \t\t\t\t$('#caja-azul-detalles').removeClass('hidden');\n");
      out.write("// \t\t\t}else{\n");
      out.write("// \t\t\t\t$('#mas_Detalles_azul').text(\"+ Detalles\");\n");
      out.write("// \t\t\t\t$('#caja-azul-detalles').addClass('hidden');\n");
      out.write("// \t\t\t}\n");
      out.write("// \t\t});\n");
      out.write("// \t\t$('#mas_Detalles_verde').on('click', function () {\n");
      out.write("// \t\t\tvar cerrada = $('#caja-verde-detalles').hasClass('hidden');\n");
      out.write("// \t\t\tif(cerrada){\n");
      out.write("// \t\t\t\t$('#mas_Detalles_verde').text(\"- Detalles\");\n");
      out.write("// \t\t\t\t$('#caja-verde-detalles').removeClass('hidden');\n");
      out.write("// \t\t\t}else{\n");
      out.write("// \t\t\t\t$('#mas_Detalles_verde').text(\"+ Detalles\");\n");
      out.write("// \t\t\t\t$('#caja-verde-detalles').addClass('hidden');\n");
      out.write("// \t\t\t}\n");
      out.write("// \t\t});\n");
      out.write("\t</script>\n");
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
      // /WEB-INF/views/seguros/pendientes.jsp(49,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctfn:permite(acciones_permitidas, \"VENTA_SEGURO\") or ctfn:permite(acciones_permitidas, \"PREVENTA_SEGURO\")}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t \t\t<button onclick=\"location.href='/fielcorresponsal/assurance/select';\" class=\"btn-seguro-nuevo\">Nuevo Seguro</button>\n");
          out.write("\t\t\t\t \t");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/views/seguros/pendientes.jsp(70,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/assurance");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
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
      out.write("\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdr-0\">\n");
      out.write("\t\t<div id=\"homeLeftPanel\" class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdl-0\">\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-lg-12 col-lg-6 col-lg-6 title-page\">\n");
      out.write("\t\t\t\t<h2>Seguros</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-lg-12 col-lg-6 col-lg-6 content-list-icons\">\n");
      out.write("\t\t\t\t<ul class=\"icon\">\n");
      out.write("\t\t\t\t\t<li><a href=\"/fielcorresponsal/reports\" data-toggle=\"tooltip\" title=\"Reportes\"><span class=\"icon-chart-bar\" aria-hidden=\"true\" style=\"color: rgb(51, 122, 183);\"></span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\" title=\"Imprimir\"><span class=\"icon-print\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\" title=\"Mensajes\"><span class=\"icon-comment\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/fielcorresponsal/settings/change_password\" data-toggle=\"tooltip\" title=\"Configuración\"><span class=\"icon-cog\" aria-hidden=\"true\" style=\"color: rgb(51, 122, 183);\"></span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\" title=\"Ayuda\"><span class=\"icon-help-circled\" aria-hidden=\"true\"></span></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div> \t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0\">\n");
      out.write("\t\t\t<hr class=\"line-blue\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0\" id=\"boxMessage\" style=\"display: none;\">\n");
      out.write("\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ERROR}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"hasError\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0 info-util-box\">\n");
      out.write("\t\t  <div class=\"col-xs-1 info-util-icon-box\">\n");
      out.write("\t\t  \t<span class=\"icon-info-circled info-util-icon\"></span>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  <div class=\"col-xs-11\" style=\"padding-left: 0px;\">\n");
      out.write("\t\t    <h3 class=\"info-util-title\">INFORMACIÓN ÚTIL</h3>\n");
      out.write("\t\t    <span class=\"info-util-text-point\"></span>\n");
      out.write("\t\t    <span class=\"info-util-text\">Busca pagos pendientes por número de cédula de identidad</span><br>\n");
      out.write("  \t\t\t<span class=\"info-util-text-point\"></span>\n");
      out.write("  \t\t\t<span class=\"info-util-text\">Contratá un \"Nuevo seguro\"</span>\t\t\n");
      out.write("\t\t  </div>\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 search-content pdlr-0\">\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 pdlr-0\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0\">\n");
      out.write("\t\t\t\t \t<input type=\"text\" id=\"inp-nro-ci\" class=\"form-control\" style=\"height: 50px;border-radius: 10px;\" placeholder=\"Buscar cédula de identidad. (Presione TAB para buscar)\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 pdr-0\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!--div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 caja-label-colores\">\n");
      out.write("\t\t\t<div class=\"col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-md-4 col-lg-3\">\n");
      out.write("\t\t\t\t\t<label class=\"label-red-vencidos\">Vencidos: 1</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-md-4 col-lg-3\">\n");
      out.write("\t\t\t\t\t<label class=\"label-blue-pendientes\">Pendientes: 1</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div-->\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0\" id=\"contenedor-polizas\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--iv class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0 link-previous\">\n");
      out.write("\t\t\t<a class=\"linkSeguroHome\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\"><span class=\"glyphicon glyphicon-chevron-left\"> </span><span> Seguros</span></a>\n");
      out.write("\t\t</div-->\n");
      out.write("\t</div>\n");
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
