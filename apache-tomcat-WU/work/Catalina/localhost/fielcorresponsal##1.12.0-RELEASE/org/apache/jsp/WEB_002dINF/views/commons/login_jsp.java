/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.0
 * Generated at: 2017-10-06 14:43:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.2.1.RELEASE.jar", Long.valueOf(1479760400000L));
    _jspx_dependants.put("jar:file:/home/oem/Programas/apache-tomcat-8.5.6/webapps/fielcorresponsal%23%231.12.0-RELEASE/WEB-INF/lib/spring-webmvc-3.2.1.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1359028012000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1479759956000L));
    _jspx_dependants.put("jar:file:/home/oem/Programas/apache-tomcat-8.5.6/webapps/fielcorresponsal%23%231.12.0-RELEASE/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153399482000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005fform_0026_005frole_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fcssErrorClass_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftype_005fplaceholder_005fpath_005fname_005fid_005fcssErrorClass_005fclass_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005fform_0026_005frole_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fcssErrorClass_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftype_005fplaceholder_005fpath_005fname_005fid_005fcssErrorClass_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005fform_0026_005frole_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fcssErrorClass_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftype_005fplaceholder_005fpath_005fname_005fid_005fcssErrorClass_005fclass_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html style=\"background-color: #00348F;\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>FielCorresponsal</title>\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/commons/includes.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"background-color: #00348F;\">\n");
      out.write("    <div class=\"container\" style=\"padding-top: 100px;\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-5 col-md-offset-3\">\n");
      out.write("            \t<div class=\"col-xs-12 pdlr-0\">\n");
      out.write("            \t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 pdlr-0\" id=\"boxMessage\" style=\"display: none;\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hasError}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"hasError\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorData.message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"errorMessage\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hasSuccess}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"hasSuccess\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorData.message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" id=\"successMessage\">\n");
      out.write("            \t</div>\n");
      out.write("            \n");
      out.write("            \t<h1 style=\"color: white;\">Bienvenidos a: </h1>\n");
      out.write("            \t<div style=\"text-align: right;\">\n");
      out.write("            \t\t<img class=\"logo-fielco\" style=\"height: 80%; width: 80%; margin-bottom: 20px;\" src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\" panel panel-default\" style=\"border-color: #666666; border-radius: 10px;\">\n");
      out.write("                    <!--div class=\"panel-heading\">\n");
      out.write("                    </div-->\n");
      out.write("                    <div class=\"panel-body\" style=\"background-color: #EFEFEF; border-radius: 10px;\">\n");
      out.write("                         ");
      //  sf:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fsf_005fform_0026_005frole_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      try {
        _jspx_th_sf_005fform_005f0.setPageContext(_jspx_page_context);
        _jspx_th_sf_005fform_005f0.setParent(null);
        // /WEB-INF/views/commons/login.jsp(33,25) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_sf_005fform_005f0.setModelAttribute("userInfo");
        // /WEB-INF/views/commons/login.jsp(33,25) null
        _jspx_th_sf_005fform_005f0.setDynamicAttribute(null, "role", "form");
        // /WEB-INF/views/commons/login.jsp(33,25) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_sf_005fform_005f0.setAction("/login");
        // /WEB-INF/views/commons/login.jsp(33,25) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_sf_005fform_005f0.setMethod("POST");
        int[] _jspx_push_body_count_sf_005fform_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_sf_005fform_005f0 = _jspx_th_sf_005fform_005f0.doStartTag();
          if (_jspx_eval_sf_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\n');
              out.write("\n");
              out.write("                            <fieldset>\n");
              out.write("                            \t<label>Usuario:</label>\n");
              out.write("                                <div class=\"form-group\">\n");
              out.write("                                \t");
              if (_jspx_meth_sf_005finput_005f0(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  sf:errors
              org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
              try {
                _jspx_th_sf_005ferrors_005f0.setPageContext(_jspx_page_context);
                _jspx_th_sf_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
                // /WEB-INF/views/commons/login.jsp(39,9) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sf_005ferrors_005f0.setPath("userName");
                // /WEB-INF/views/commons/login.jsp(39,9) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sf_005ferrors_005f0.setCssClass("error");
                int[] _jspx_push_body_count_sf_005ferrors_005f0 = new int[] { 0 };
                try {
                  int _jspx_eval_sf_005ferrors_005f0 = _jspx_th_sf_005ferrors_005f0.doStartTag();
                  if (_jspx_th_sf_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (java.lang.Throwable _jspx_exception) {
                  while (_jspx_push_body_count_sf_005ferrors_005f0[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_sf_005ferrors_005f0.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_sf_005ferrors_005f0.doFinally();
                }
              } finally {
                _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f0);
              }
              out.write("\n");
              out.write("                                </div>\n");
              out.write("                                <label>Contraseña:</label>\n");
              out.write("                                <div class=\"form-group\">\n");
              out.write("                                    ");
              if (_jspx_meth_sf_005finput_005f1(_jspx_th_sf_005fform_005f0, _jspx_page_context, _jspx_push_body_count_sf_005fform_005f0))
                return;
              out.write("\n");
              out.write("                                    ");
              //  sf:errors
              org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
              try {
                _jspx_th_sf_005ferrors_005f1.setPageContext(_jspx_page_context);
                _jspx_th_sf_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
                // /WEB-INF/views/commons/login.jsp(44,36) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sf_005ferrors_005f1.setPath("password");
                // /WEB-INF/views/commons/login.jsp(44,36) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_sf_005ferrors_005f1.setCssClass("error");
                int[] _jspx_push_body_count_sf_005ferrors_005f1 = new int[] { 0 };
                try {
                  int _jspx_eval_sf_005ferrors_005f1 = _jspx_th_sf_005ferrors_005f1.doStartTag();
                  if (_jspx_th_sf_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (java.lang.Throwable _jspx_exception) {
                  while (_jspx_push_body_count_sf_005ferrors_005f1[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_sf_005ferrors_005f1.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_sf_005ferrors_005f1.doFinally();
                }
              } finally {
                _005fjspx_005ftagPool_005fsf_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_sf_005ferrors_005f1);
              }
              out.write(" \n");
              out.write("                                </div>\n");
              out.write("                                <input type=\"submit\" class=\"btn btn-lg btn-success btn-block\" value=\"Ingresar\" style=\"background-color: #FF0014;\"/>\n");
              out.write("                            </fieldset>\n");
              out.write("\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_sf_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_sf_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_sf_005fform_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_sf_005fform_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_sf_005fform_005f0.doFinally();
        }
      } finally {
        _005fjspx_005ftagPool_005fsf_005fform_0026_005frole_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_sf_005fform_005f0);
      }
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\tmostrarError($(\"#hasError\").val(),$(\"#errorMessage\").val());\n");
      out.write("\t\t\tfunction mostrarError(er, msj){\n");
      out.write("\t\t\t\tif (er == \"true\"){\n");
      out.write("\t\t\t\t\t$('#boxMessage').html(message(\"error\", msj));\t\n");
      out.write("\t\t\t\t\t$('#boxMessage').slideDown(300);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t};\n");
      out.write("\t\t\tmostrarMensaje($(\"#hasSuccess\").val(),$(\"#successMessage\").val());\n");
      out.write("\t\t\tfunction mostrarMensaje(sc, msj){\n");
      out.write("\t\t\t\tif (sc == \"true\"){\n");
      out.write("\t\t\t\t\t$('#boxMessage').html(message(\"success\", msj));\t\n");
      out.write("\t\t\t\t\t$('#boxMessage').slideDown(300);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t};\n");
      out.write("\t\t});\t\t\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/commons/login.jsp(27,98) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/resources/images/fielco-logo.png");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fcssErrorClass_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    try {
      _jspx_th_sf_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/views/commons/login.jsp(38,33) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f0.setPath("userName");
      // /WEB-INF/views/commons/login.jsp(38,33) null
      _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "class", "form-control");
      // /WEB-INF/views/commons/login.jsp(38,33) null
      _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "placeholder", "Usuario");
      // /WEB-INF/views/commons/login.jsp(38,33) null
      _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "name", "user");
      // /WEB-INF/views/commons/login.jsp(38,33) null
      _jspx_th_sf_005finput_005f0.setDynamicAttribute(null, "type", "text");
      // /WEB-INF/views/commons/login.jsp(38,33) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f0.setId("user");
      // /WEB-INF/views/commons/login.jsp(38,33) name = cssErrorClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f0.setCssErrorClass("error-input");
      int[] _jspx_push_body_count_sf_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f0 = _jspx_th_sf_005finput_005f0.doStartTag();
        if (_jspx_th_sf_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fsf_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fcssErrorClass_005fclass_005fnobody.reuse(_jspx_th_sf_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftype_005fplaceholder_005fpath_005fname_005fid_005fcssErrorClass_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    try {
      _jspx_th_sf_005finput_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sf_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_005fform_005f0);
      // /WEB-INF/views/commons/login.jsp(43,36) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f1.setPath("password");
      // /WEB-INF/views/commons/login.jsp(43,36) null
      _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "class", "form-control");
      // /WEB-INF/views/commons/login.jsp(43,36) null
      _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "placeholder", "Contraseña");
      // /WEB-INF/views/commons/login.jsp(43,36) null
      _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "name", "password");
      // /WEB-INF/views/commons/login.jsp(43,36) null
      _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "type", "password");
      // /WEB-INF/views/commons/login.jsp(43,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f1.setId("password");
      // /WEB-INF/views/commons/login.jsp(43,36) null
      _jspx_th_sf_005finput_005f1.setDynamicAttribute(null, "value", "");
      // /WEB-INF/views/commons/login.jsp(43,36) name = cssErrorClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sf_005finput_005f1.setCssErrorClass("error-input");
      int[] _jspx_push_body_count_sf_005finput_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_sf_005finput_005f1 = _jspx_th_sf_005finput_005f1.doStartTag();
        if (_jspx_th_sf_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_005finput_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_005finput_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_005finput_005f1.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fsf_005finput_0026_005fvalue_005ftype_005fplaceholder_005fpath_005fname_005fid_005fcssErrorClass_005fclass_005fnobody.reuse(_jspx_th_sf_005finput_005f1);
    }
    return false;
  }
}
