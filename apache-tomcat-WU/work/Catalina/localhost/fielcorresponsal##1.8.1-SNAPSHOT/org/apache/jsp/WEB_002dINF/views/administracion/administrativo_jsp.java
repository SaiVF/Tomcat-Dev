/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.0
 * Generated at: 2017-05-23 21:18:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.administracion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administrativo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/tags/parent.tag", Long.valueOf(1490290378000L));
    _jspx_dependants.put("jar:file:/home/oem/Programas/apache-tomcat-8.5.6/webapps/fielcorresponsal%23%231.8.1-SNAPSHOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153399482000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.2.1.RELEASE.jar", Long.valueOf(1479760400000L));
    _jspx_dependants.put("/WEB-INF/custom-funcions.tld", Long.valueOf(1490290378000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1479759956000L));
    _jspx_dependants.put("jar:file:/home/oem/Programas/apache-tomcat-8.5.6/webapps/fielcorresponsal%23%231.8.1-SNAPSHOT/WEB-INF/lib/spring-webmvc-3.2.1.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1359028012000L));
    _jspx_dependants.put("jar:file:/home/oem/Programas/apache-tomcat-8.5.6/webapps/fielcorresponsal%23%231.8.1-SNAPSHOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153399482000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_t_005fparent_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"myModalReading\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" data-backdrop=\"static\" data-keyboard=\"false\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"\" style=\"padding-top: 200px;\">\n");
      out.write("      <div class=\"modal-loading\">\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$.ajaxSetup({\n");
      out.write("    \t\"error\":function(jqXHR, mensaje) { \n");
      out.write("    \t\tvar errorData = jqXHR.responseJSON;\n");
      out.write("\t\t\tvar mensaje = \"Ocurrió un error...(\"+errorData.code+\") \"+errorData.message;\n");
      out.write("\t\t\t$('#boxMessage').html(message(\"error\", mensaje));\t\n");
      out.write("\t\t\t$('#boxMessage').slideDown(300);\n");
      out.write("\t\t\t$('#myModalReading').modal('hide');   \n");
      out.write("        }\n");
      out.write("\t});\n");
      out.write("    function serviciosAjax() {\n");
      out.write("        $.getJSON('/fielcorresponsal/administration/servicios/json', function(data) {\n");
      out.write("                $.each( data, function(){\n");
      out.write("                    $(\"#select_servicio\").append('<option value=\"'+ this.id +'\">'+ this.nombre +'</option>')\n");
      out.write("                \t})            \t\n");
      out.write("        \t});\n");
      out.write("    }\n");
      out.write("    function agenciasAjax() {\n");
      out.write("        $.getJSON('/fielcorresponsal/administration/agencias/json', function(data) {\n");
      out.write("                $.each( data, function(){\n");
      out.write("                    $(\"#select_agencia\").append('<option value=\"'+ this.id +'\">'+ this.nombre +'</option>')\n");
      out.write("                \t})            \t\n");
      out.write("        \t});\n");
      out.write("    }\n");
      out.write("    function agenciasSucursalesAjax(idAgencia) {\n");
      out.write("        $.getJSON('/fielcorresponsal/administration/agencias/sucursales/json?agenciaId='+idAgencia, function(data) {\n");
      out.write("        \t\t$(\"#select_sucursal\").empty();\n");
      out.write("        \t\t$(\"#select_sucursal\").append('<option value=\"0\" selected>Todas las Sucursales</option>');\n");
      out.write("                $.each( data, function(){\n");
      out.write("                    $(\"#select_sucursal\").append('<option value=\"'+ this.pooNro +'\">'+ this.direccion +'</option>')\n");
      out.write("                \t})            \t\n");
      out.write("        \t});\n");
      out.write("    }\n");
      out.write("    function agenciasTiposAjax() {\n");
      out.write("        $.getJSON('/fielcorresponsal/administration/agencias/tipos/json', function(data) {\n");
      out.write("                $.each( data, function(){\n");
      out.write("                    $(\"#select_tipo\").append('<option value=\"'+ this.value +'\">'+ this.name +'</option>')\n");
      out.write("                \t})            \t\n");
      out.write("        \t});\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function movimientoAjax(IdMovimiento) {\n");
      out.write("        $.getJSON('/fielcorresponsal/administration/movimiento/json?movtoId='+IdMovimiento, function(data) {\n");
      out.write("                $.each( data, function(){\n");
      out.write("                \t$('#boxMessage').empty();\n");
      out.write("                    $(\"#cliente_nombre\").text(data.nombresPersona + \" \" + data.apellidosPersona);\n");
      out.write("                    $(\"#cliente_tipodoc\").text(data.tipoDocumentoPersona);\n");
      out.write("                    $(\"#cliente_nrodoc\").text(data.nroDocumentoPersona);\n");
      out.write("                    $(\"#mov_moneda\").text(data.moneda.nombrePlural);\n");
      out.write("                    $(\"#mov_fecha\").text(data.fechaHoraMovimiento);\n");
      out.write("                    $(\"#mov_monto\").text(data.montoMovimiento);\n");
      out.write("                    $(\"#mov_operacion\").text(data.operacionDescripcion);\n");
      out.write("                    /*si es desembolsos, visualizar botones de re-impresión*/\n");
      out.write("                    if(data.operacionId == 300){\n");
      out.write("                        $('#btn-desembolsos-pagare').removeClass(\"hidden\");\t\n");
      out.write("                        $('#btn-desembolsos-liquidacion').removeClass(\"hidden\");\t\n");
      out.write("                        $('#btn-desembolsos-solicitud').removeClass(\"hidden\");\n");
      out.write("                    }else{\n");
      out.write("                        $('#btn-desembolsos-pagare').addClass(\"hidden\");\t\n");
      out.write("                        $('#btn-desembolsos-liquidacion').addClass(\"hidden\");\t\n");
      out.write("                        $('#btn-desembolsos-solicitud').addClass(\"hidden\");\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                })  \n");
      out.write("                $('#myModalReading').modal('hide');          \t\n");
      out.write("        \t});\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function actualizarABMReportes() {\n");
      out.write("    \tserviciosAjax();\n");
      out.write("    \tagenciasAjax();\n");
      out.write("    \tagenciasTiposAjax();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\tactiveHeader(\"adminPage\");\n");
      out.write("\t\t$('#myModalReading').modal('hide');\n");
      out.write("\t});\n");
      out.write("\t$('#myTabs a').click(function (e) {\n");
      out.write("\t\t  e.preventDefault();\n");
      out.write("\t\t  var url = $(this).data('url');\n");
      out.write("\t\t  $(\"#abm\").load( url );\n");
      out.write("\t\t  var id = $(this).attr('id');\n");
      out.write("\t\t  if (id.localeCompare(\"reportes-tab\") === 0){\n");
      out.write("\t\t\t  actualizarABMReportes();\n");
      out.write("\t\t  }\n");
      out.write("\t\t  \n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$('#abm').on('click', '.icon-pencil', function () {\n");
      out.write("\t\tvar filtro = $(this).attr(\"id\"); \n");
      out.write("\t\t$(this).addClass(\"select-btn-pen-enable\");\n");
      out.write("\t\t$('#select_'+filtro).removeClass(\"appearance-none\");\n");
      out.write("\t\t$('#select_'+filtro).prop(\"disabled\", false);\t\t\n");
      out.write("\t});\n");
      out.write("\tfunction agregarParametrosYabrirVentana(url){\n");
      out.write("\t\tvar agenciaSelect = document.getElementById(\"select_agencia\");\n");
      out.write("\t\tvar agenciaId = agenciaSelect.options[agenciaSelect.selectedIndex].value;\n");
      out.write("\n");
      out.write("\t\tvar servicioSelect = document.getElementById(\"select_servicio\");\n");
      out.write("\t\tvar servicioId = servicioSelect.options[servicioSelect.selectedIndex].value;\n");
      out.write("\n");
      out.write("\t\tvar agenciaSucursalSelect = document.getElementById(\"select_sucursal\");\n");
      out.write("\t\tvar agenciaSucursalId = agenciaSucursalSelect.options[agenciaSucursalSelect.selectedIndex].value;\n");
      out.write("\n");
      out.write("\t\tvar tipoAgenciaSelect = document.getElementById(\"select_tipo\");\n");
      out.write("\t\tvar tipoAgencia = tipoAgenciaSelect.options[tipoAgenciaSelect.selectedIndex].value;\n");
      out.write("\n");
      out.write("\t\tvar comisionCheck = document.getElementById(\"comisionCNB\");\n");
      out.write("\t\tvar comision = \"\";\n");
      out.write("\t\tif (comisionCheck.checked){\n");
      out.write("\t\t\tcomision = comisionCheck.value;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tvar fechaInicio = document.getElementById(\"fechaDesde\").value;\n");
      out.write("\t\tvar fechaFin = document.getElementById(\"fechaHasta\").value;\n");
      out.write("\n");
      out.write("\t\tif (fechaInicio == null ||fechaInicio ===\"\" ||  fechaFin ==null || fechaFin ===\"\" ){\n");
      out.write("\t\t\t$('#boxMessage').html(message(\"error\", \"La fecha desde y hasta son requeridas.\"));\n");
      out.write("\t\t\t$('#boxMessage').slideDown(300);\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tvar regex = /^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[\\/]\\d{4}$/;\n");
      out.write("\t\t\tvar regexInicio =fechaInicio.match(regex);\n");
      out.write("\t\t\tvar regexFin =fechaFin.match(regex);\n");
      out.write("\t\t\tif(regexInicio!=null && regexFin!=null ){\n");
      out.write("\t\t\t\t$('#boxMessage').hide();\n");
      out.write("\t\t\t\turl = url + \"?agenciaId=\"+agenciaId+\"&servicioId=\"+servicioId\n");
      out.write("\t\t\t\t+\"&agenciaSucursalId=\"+agenciaSucursalId\n");
      out.write("\t\t\t\t+\"&fechaInicio=\"+fechaInicio+\"&fechaFin=\"+fechaFin\n");
      out.write("\t\t\t\t+\"&tipoAgencia=\"+tipoAgencia+\"&comisionCNB=\"+comision;\n");
      out.write("\t\t\t\twindow.open(url);\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\t$('#boxMessage').html(message(\"error\", \"El formato de la fecha es incorrecto.\"));\n");
      out.write("\t\t\t\t$('#boxMessage').slideDown(300);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t};\n");
      out.write("\t$('#abm').on('click', '#resumenMovAgePdf', function () {\n");
      out.write("\t\tvar url = $(this).data('url');\n");
      out.write("\t\tagregarParametrosYabrirVentana(url);\n");
      out.write("\t});\n");
      out.write("\t$('#abm').on('click', '#listaMovAgePdf', function () {\n");
      out.write("\t\tvar url = $(this).data('url');\n");
      out.write("\t\tagregarParametrosYabrirVentana(url);\t\t\n");
      out.write("\t});\n");
      out.write("\t$('#abm').on('click', '#listaMovAgeXlsx', function () {\n");
      out.write("\t\tvar url = $(this).data('url');\n");
      out.write("\t\tagregarParametrosYabrirVentana(url);\t\n");
      out.write("\t\t\t\n");
      out.write("\t});\t\n");
      out.write("\n");
      out.write("\t$('#abm').bind(\"DOMSubtreeModified\",function(){\n");
      out.write("\t\tvar fechaIni = $('#fechaDesde').val();\n");
      out.write("\t\tvar fechaFin = $('#fechaHasta').val();\n");
      out.write("\t\tif (fechaIni ===\"\"){\n");
      out.write("\t\t\t$('#fechaDesde').val(fechaActual());\n");
      out.write("\t\t}  \n");
      out.write("\t\tif(fechaFin ===\"\"){\n");
      out.write("\t\t\t$('#fechaHasta').val(fechaActual());\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t$('#abm').on('change', '#select_agencia', function() {\n");
      out.write("\t    var val = $(\"#select_agencia option:selected\").val();\n");
      out.write("\t    if(val ===\"0\"){\n");
      out.write("\t    \t$(\"#select_sucursal\").empty();\n");
      out.write("    \t\t$(\"#select_sucursal\").append('<option value=\"0\" selected>Todas las Sucursales</option>');\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tagenciasSucursalesAjax(val);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t$('#abm').on('click', '#buscar_movimiento', function () {\n");
      out.write("\t\tvar movimientoID = document.getElementById(\"movimientoID\").value;\n");
      out.write("\t\tif(movimientoID==null || movimientoID===\"\"){\n");
      out.write("\t\t\t$('#boxMessage').html(message(\"error\", \"El ID de movimiento es requerido.\"));\n");
      out.write("\t\t\t$('#boxMessage').slideDown(300);\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\t$('#myModalReading').modal('show');\n");
      out.write("\t\t\tmovimientoAjax(movimientoID);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/administracion/administrativo.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("formatoFecha");
      // /WEB-INF/views/administracion/administrativo.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/administracion/administrativo.jsp(9,0) 'dd/MM/yyyy'",_jsp_getExpressionFactory().createValueExpression("dd/MM/yyyy",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /WEB-INF/views/administracion/administrativo.jsp(10,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("formatoMoneda");
      // /WEB-INF/views/administracion/administrativo.jsp(10,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/administracion/administrativo.jsp(10,0) '#,##0'",_jsp_getExpressionFactory().createValueExpression("#,##0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    }
    return false;
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
      // /WEB-INF/views/administracion/administrativo.jsp(26,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctfn:permite(acciones_permitidas, \"ADMINISTRATIVO\")}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("  \t\t\t\t\t<li role=\"presentation\"><a href=\"#reportes\" id=\"reportes-tab\" role=\"tab\" data-toggle=\"tab\" aria-controls=\"abm\" aria-expanded=\"true\" data-url=\"/fielcorresponsal/administration/reportes\">Reportes</a></li>\n");
          out.write("  \t\t\t\t");
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
      // /WEB-INF/views/administracion/administrativo.jsp(29,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctfn:permite(acciones_permitidas, \"REIMPRESIONES\")}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("  \t\t\t\t\t<li role=\"presentation\"><a href=\"#reimpresiones\" id=\"reimpresiones-tab\" role=\"tab\" data-toggle=\"tab\" aria-controls=\"abm\" aria-expanded=\"true\" data-url=\"/fielcorresponsal/administration/reimpresiones\">Reimpresiones</a></li>\n");
          out.write("  \t\t\t\t");
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
      out.write("\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdr-0\">\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdl-0\">\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 title-page\">\n");
      out.write("\t\t\t\t<h2>Administrativo</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0 sub-title-page\">\n");
      out.write("\t\t\t<ul id=\"myTabs\" class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("  \t\t\t\t<li role=\"presentation\" hidden=\"true\"><a href=\"#agencias\" class=\"item-disabled\" id=\"agencias-tab\" role=\"tab\" data-toggle=\"tab\" aria-controls=\"abm\" aria-expanded=\"true\" data-url=\"/fielcorresponsal/administration/agencias\">Agencias</a></li>\n");
      out.write("  \t\t\t\t<li role=\"presentation\" hidden=\"true\"><a href=\"#agencias-sucursales\" class=\"item-disabled\" id=\"agencias-sucursales-tab\" role=\"tab\" data-toggle=\"tab\" aria-controls=\"abm\" aria-expanded=\"true\" data-url=\"/fielcorresponsal/administration/agencias/sucursales\" >Sucursales de Agencias</a></li>\n");
      out.write("  \t\t\t\t<li role=\"presentation\" hidden=\"true\"><a href=\"#usuarios\" class=\"item-disabled\" id=\"usuarios-tab\" role=\"tab\" data-toggle=\"tab\" aria-controls=\"abm\" aria-expanded=\"true\" data-url=\"/fielcorresponsal/administration/usuarios\">Usuarios</a></li>\n");
      out.write("  \t\t\t\t<li role=\"presentation\" hidden=\"true\"><a href=\"#terminales\" class=\"item-disabled\" id=\"terminales-tab\" role=\"tab\" data-toggle=\"tab\" aria-controls=\"abm\" aria-expanded=\"true\" data-url=\"/fielcorresponsal/administration/terminales\">Terminales</a></li>\n");
      out.write("  \t\t\t\t<li role=\"presentation\" hidden=\"true\"><a href=\"#servicios\" class=\"item-disabled\" id=\"servicios-tab\" role=\"tab\" data-toggle=\"tab\" aria-controls=\"abm\" aria-expanded=\"true\" data-url=\"/fielcorresponsal/administration/servicios\">Servicios</a></li>\n");
      out.write("  \t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("  \t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("  \t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div class=\"tab-content\" id=\"myTabContent\"> \n");
      out.write("\t\t\t\t<div class=\"tab-pane fade active in\" role=\"tabpanel\" id=\"abm\"> \n");
      out.write("\t\t\t\t\t<div id=\"abm\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0 info-util-box\">\n");
      out.write("\t\t\t\t\t  <div class=\"col-xs-1 info-util-icon-box\">\n");
      out.write("\t\t\t\t\t  \t<span class=\"icon-info-circled info-util-icon\"></span>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t  <div class=\"col-xs-11\" style=\"padding-left: 0px;\">\n");
      out.write("\t\t\t\t\t    <h3 class=\"info-util-title\">INFORMACIÓN ÚTIL</h3>\n");
      out.write("\t\t\t\t\t    <span class=\"info-util-text-point\"></span>\n");
      out.write("\t\t\t\t\t    <span class=\"info-util-text\">Haga click en las pestañas habilitadas.</span><br>\t\t\n");
      out.write("\t\t\t\t\t  </div>\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
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