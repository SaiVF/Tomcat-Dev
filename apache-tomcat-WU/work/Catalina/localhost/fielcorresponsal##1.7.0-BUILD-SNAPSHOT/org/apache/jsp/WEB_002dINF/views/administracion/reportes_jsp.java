/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.0
 * Generated at: 2017-04-27 17:22:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.administracion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reportes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<h3 class=\"tipo-seguro\">ABM de Reportes</h3>\n");
      out.write("<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0\" id=\"boxMessage\" style=\"display: none;\">\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ERROR}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"hasError\">\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${WARNING}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"hasWarning\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12  pdr-1 caja-blanca-rellena\">\n");
      out.write("\t<div class=\"row mb-10\">\n");
      out.write("\t\t<label class=\"col-xs-6 col-sm-6 col-md-3 col-lg-1 pdl-0 text-right label-form-seguro\">Servicios:</label>\n");
      out.write("\t\t<div class=\"col-xs-6 col-sm-6 col-md-3 col-lg-3 pdl-0\">\n");
      out.write("\t\t\t<select class=\"col-xs-4 col-sm-4 col-md-4 col-lg-3 input-pen-without-appearance appearance-none input-pen-tipDoc form-control input-form-seguro \" id=\"select_servicio\" disabled>\n");
      out.write("\t\t\t\t<option value=\"0\" selected>Todos los Servicios</option>\n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t\t<span data-toggle=\"tooltip\" title=\"Cambiar Servicio.\" class=\"icon-pencil select-btn-pen\" style=\"font-size: 100%;margin-left: 0px; margin-right: 0px;}\" id=\"servicio\"></span>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t<label class=\" col-xs-6 col-sm-6 col-md-3 col-lg-1 pdl-0 text-right label-form-seguro\">Agencias:</label>\n");
      out.write("\t\t<div class=\"col-xs-6 col-sm-6 col-md-3 col-lg-3 pdl-0\">\n");
      out.write("\t\t\t<select class=\"col-xs-4 col-sm-4 col-md-4 col-lg-3 input-pen-without-appearance appearance-none input-pen-tipDoc form-control input-form-seguro \" id=\"select_agencia\" disabled>\n");
      out.write("\t\t\t\t<option value=\"0\" selected>Todas las Agencias</option>\n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t\t<span data-toggle=\"tooltip\" title=\"Cambiar Agencia.\" class=\"icon-pencil select-btn-pen\" style=\"font-size: 100%;margin-left: 0px; margin-right: 0px;}\" id=\"agencia\"></span>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t<label class=\" col-xs-6 col-sm-6 col-md-3 col-lg-1 pdl-0 text-right label-form-seguro\">Sucursales:</label>\n");
      out.write("\t\t<div class=\"col-xs-6 col-sm-6 col-md-3 col-lg-3 pdl-0 pdlr-10\">\n");
      out.write("\t\t\t<select class=\"col-xs-4 col-sm-4 col-md-4 col-lg-3 input-pen-without-appearance appearance-none input-pen-tipDoc form-control input-form-seguro \" id=\"select_sucursal\" disabled>\n");
      out.write("\t\t\t\t<option value=\"0\" selected>Todas las Sucursales</option>\n");
      out.write("\t\t\t</select>\t\n");
      out.write("\t\t\t<span data-toggle=\"tooltip\" title=\"Cambiar Sucursal.\" class=\"icon-pencil select-btn-pen\" style=\"font-size: 100%;margin-left: 0px; margin-right: 0px;}\" id=\"sucursal\"></span>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\" row mb-10\">\n");
      out.write("\t\t<label class=\" col-xs-6 col-sm-6 col-md-3 col-lg-1 pdl-0 text-right label-form-seguro\">Fecha Desde:</label>\n");
      out.write("\t\t<div class=\"col-xs-6 col-sm-6 col-md-3 col-lg-2 pdl-0\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<input id=\"fechaDesde\" type=\"text\" value=\"\" class=\"form-control input-form-seguro dateImput\" placeholder=\"dd/mm/aaaa\" title=\"Formato de fecha: dia/mes/año.\" pattern=\"dd/MM/yyyy\" onkeyup=\"this.value=this.value.replace(/^(\\d\\d)(\\d)$/g,'$1/$2').replace(/^(\\d\\d\\/\\d\\d)(\\d+)$/g,'$1/$2').replace(/[^\\d\\/]/g,'')\"/>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<label class=\" col-xs-6 col-sm-6 col-md-3 col-lg-1 pdl-0 text-right label-form-seguro\">Fecha Hasta:</label>\n");
      out.write("\t\t<div class=\"col-xs-6 col-sm-6 col-md-3 col-lg-2 pdl-0\">\n");
      out.write("\t\t\t<input id=\"fechaHasta\"  type=\"text\" value=\"\" class=\"form-control input-form-seguro dateImput\"  placeholder=\"dd/mm/aaaa\" title=\"Formato de fecha: dia/mes/año.\" pattern=\"dd/MM/yyyy\" onkeyup=\"this.value=this.value.replace(/^(\\d\\d)(\\d)$/g,'$1/$2').replace(/^(\\d\\d\\/\\d\\d)(\\d+)$/g,'$1/$2').replace(/[^\\d\\/]/g,'')\"/>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<label class=\" col-xs-6 col-sm-6 col-md-3 col-lg-1 pdl-0 text-right label-form-seguro\">Tipo:</label>\n");
      out.write("\t\t<div class=\"col-xs-6 col-sm-6 col-md-3 col-lg-3 pdl-0\">\n");
      out.write("\t\t\t<select class=\"col-xs-4 col-sm-4 col-md-4 col-lg-3 input-pen-without-appearance appearance-none input-pen-tipDoc form-control input-form-seguro \" id=\"select_tipo\" disabled>\n");
      out.write("\t\t\t\t<option value=\"0\" selected>Todos los Tipos de Agencia</option>\n");
      out.write("\t\t\t</select>\t\n");
      out.write("\t\t\t<span data-toggle=\"tooltip\" title=\"Cambiar Tipo Agencia.\" class=\"icon-pencil select-btn-pen\" style=\"font-size: 100%;margin-left: 0px; margin-right: 0px;}\" id=\"tipo\"></span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<label class=\" col-xs-6 col-sm-6 col-md-3 col-lg-1 pdl-0 text-right label-form-seguro\" for=\"comisionCNB\">Comisión:</label>\n");
      out.write("\t\t<div class=\"col-xs-6 col-sm-6 col-md-3 col-lg-1 pdl-0\">\n");
      out.write("\t\t\t<input id=\"comisionCNB\"  type=\"checkbox\" class=\"form-control input-form-seguro \" value=\"S\" checked=\"checked\"/>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("\n");
      out.write("\t<table class=\"table\">\n");
      out.write("\t\t<thead>\n");
      out.write("\t\t\t<tr class=\"label-blue\">\n");
      out.write("  \t\t\t\t\t<th class=\"text-center\">Reporte</th>\n");
      out.write("  \t\t\t\t\t<th class=\"text-center\">Acción</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</thead>\n");
      out.write("\t\t<tbody>\t\n");
      out.write("\t\t\t<tr>\t\n");
      out.write("\t\t\t\t<td class=\"text-center\">Resumen de Movimientos de CNB</td>\n");
      out.write("\t\t\t\t<td class=\"text-center\">\n");
      out.write("\t\t\t\t\t<i id=\"resumenMovAgePdf\" data-url=\"/fielcorresponsal/administration/reportes/agencias/movimientos/resumen/pdf\" data-toggle=\"tooltip\" title=\"Formato PDF\" class=\"fa fa-file-pdf-o\" style=\"font-size:20px;color:red;\"></i>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"text-center\">Listado de Movimientos de CNB</td>\n");
      out.write("\t\t\t\t<td class=\"text-center\">\n");
      out.write("\t\t\t\t\t<i id=\"listaMovAgePdf\" data-url=\"/fielcorresponsal/administration/reportes/agencias/movimientos/pdf\" data-toggle=\"tooltip\" title=\"Formato PDF\" class=\"fa fa-file-pdf-o\" style=\"font-size:20px;color:red;\"></i>\n");
      out.write("\t\t\t\t\t<i id=\"listaMovAgeXlsx\"  data-url=\"/fielcorresponsal/administration/reportes/agencias/movimientos/xlsx\" data-toggle=\"tooltip\" title=\"Formato Excel\" class=\"fa fa-file-excel-o\" style=\"font-size:20px;color:green;\"></i>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>\n");
      out.write("</div>\t\t\n");
      out.write("\n");
      out.write("\n");
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
}
