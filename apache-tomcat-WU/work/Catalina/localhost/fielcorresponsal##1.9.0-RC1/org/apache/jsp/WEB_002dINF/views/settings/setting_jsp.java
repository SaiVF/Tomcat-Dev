/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.0
 * Generated at: 2017-05-29 20:26:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.settings;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/tags/parent.tag", Long.valueOf(1490290378000L));
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      if (_jspx_meth_t_005fparent_005f0(_jspx_page_context))
        return;
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(\"#form-change-password\").submit(function(e) {\n");
      out.write("\t\te.preventDefault();\n");
      out.write("\t\t$('#myModalReading').modal('show');\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\ttype: $(this).attr(\"method\"),\n");
      out.write("\t\t\turl: $(this).attr(\"action\"),\n");
      out.write("\t\t\tdata: {\n");
      out.write("\t\t\t\tpass_actual: $(\"#password_actual\").val(),\n");
      out.write("\t\t\t\tpass_nueva: $(\"#password_nuevo\").val(),\n");
      out.write("\t\t\t\tpass_confirm: $(\"#password_conf\").val()\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tsuccess: function(data) {\n");
      out.write("\t\t\t\t$('#myModalReading').modal('hide');\n");
      out.write("\t\t\t\twindow.location.replace('/fielcorresponsal/?change_password=true');\n");
      out.write("\t\t\t\t//var mensaje = \"<div class='alert alert-success' role='alert'>Contraseña modificada con éxito.</div>\";\n");
      out.write("\t\t\t\t//$(\".msg-box .alert\").remove();\n");
      out.write("\t\t\t\t//$(\".msg-box .success\").remove();\n");
      out.write("\t\t\t\t//$(\".msg-box\").append(mensaje);\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror: function(data, err) {\n");
      out.write("\t\t\t\t$('#myModalReading').modal('hide');\n");
      out.write("\t\t\t\tvar errors = $.parseJSON(data.responseText);\n");
      out.write("\t\t\t\tconsole.log(errors);\n");
      out.write("\t\t\t\tconsole.log(errors.message);\n");
      out.write("\t\t\t\ttry {\n");
      out.write("\t\t\t\t\tvar msj = $.parseJSON(errors.message);\n");
      out.write("\t\t\t\t\tconsole.log(msj);\n");
      out.write("\t\t\t\t\tvar mensaje = \"<div class='alert alert-danger' role='alert'>\"+ msj.message +\"</div>\";\n");
      out.write("\t\t\t\t}catch (err) {\n");
      out.write("\t\t\t\t\tvar mensaje = \"<div class='alert alert-danger' role='alert'>\"+ errors.message +\"</div>\";\n");
      out.write("\t\t\t\t}\t\t\t\t\n");
      out.write("\t\t\t\t$(\".msg-box .success\").remove();\n");
      out.write("\t\t\t\t$(\".msg-box .alert\").remove();\n");
      out.write("\t\t\t\t$(\".msg-box\").append(mensaje);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>");
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
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
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
      javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
      javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${body}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write('\n');
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
