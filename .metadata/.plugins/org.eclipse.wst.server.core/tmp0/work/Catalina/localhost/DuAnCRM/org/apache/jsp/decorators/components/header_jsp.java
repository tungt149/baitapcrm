/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-07-03 12:46:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.decorators.components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import UrlUtil.urlUtil;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1624779096264L));
    _jspx_dependants.put("jar:file:/C:/Users/admin/Desktop/CRM/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/DuAnCRM/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("UrlUtil.urlUtil");
  }

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<!-- Header Layout -->\r\n");
      out.write("<div class=\"mdk-header-layout js-mdk-header-layout\">\r\n");
      out.write("<!-- Header -->\r\n");
      out.write("<div id=\"header\" class=\"mdk-header bg-dark js-mdk-header m-0\" data-fixed data-effects=\"waterfall\">\r\n");
      out.write("    <div class=\"mdk-header__content\">\r\n");
      out.write("        <div class=\"navbar navbar-expand-sm navbar-main navbar-dark bg-dark pr-0\" id=\"navbar\" data-primary>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- Navbar toggler -->\r\n");
      out.write("\r\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right d-block d-md-none\" type=\"button\" data-toggle=\"sidebar\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("\r\n");
      out.write("                <!-- Navbar Brand -->\r\n");
      out.write("                <a  href=\"");
      out.print(request.getContextPath() + urlUtil.URL_DASHBOARD);
      out.write("\"class=\"navbar-brand\">\r\n");
      out.write("                    <img class=\"navbar-brand-icon\" src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" height=\"50\" alt=\"Cybersoft\" />\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <span class=\"mr-3\"></span>\r\n");
      out.write("\r\n");
      out.write("                <form class=\"search-form d-none d-xl-flex flex mr-3\" action=\"fixed-index.html\">\r\n");
      out.write("                    <button class=\"btn\" type=\"submit\">\r\n");
      out.write("                        <i class=\"material-icons\">search</i>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search\" />\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"nav navbar-nav ml-auto d-none d-md-flex border-left\">\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a href=\"#notifications_menu\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" data-caret=\"false\">\r\n");
      out.write("                            <i class=\"material-icons nav-icon navbar-notifications-indicator\">\r\n");
      out.write("                                notifications_none\r\n");
      out.write("                            </i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div id=\"notifications_menu\" class=\"dropdown-menu dropdown-menu-right navbar-notifications-menu\">\r\n");
      out.write("                            <div class=\"dropdown-item d-flex align-items-center py-2\">\r\n");
      out.write("                                <span class=\"flex navbar-notifications-menu__title m-0\">\r\n");
      out.write("                                    Notifications\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <a href=\"javascript:void(0)\" class=\"text-muted\">\r\n");
      out.write("                                    <small>Clear all</small>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"navbar-notifications-menu__content\" data-perfect-scrollbar>\r\n");
      out.write("                                <div class=\"py-2\">\r\n");
      out.write("                                    <div class=\"dropdown-item d-flex\">\r\n");
      out.write("                                        <div class=\"mr-3\">\r\n");
      out.write("                                            <div class=\"avatar avatar-sm\" style=\"width: 32px; height: 32px\">\r\n");
      out.write("                                                <img src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" alt=\"Avatar\" class=\"avatar-img rounded-circle\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div> \r\n");
      out.write("                                        <div class=\"flex\">\r\n");
      out.write("                                            <a href=\"\">Tiến Hoàng</a> đã bình luận trong\r\n");
      out.write("                                            <a href=\"\">Stack</a><br />\r\n");
      out.write("                                            <small class=\"text-muted\">1 phút trước</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"dropdown-item d-flex\">\r\n");
      out.write("                                        <div class=\"mr-3\">\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <div class=\"avatar avatar-xs\" style=\"width: 32px; height: 32px\">\r\n");
      out.write("                                                    <span class=\"avatar-title bg-purple rounded-circle\">\r\n");
      out.write("                                                        <i class=\"material-icons icon-16pt\">\r\n");
      out.write("                                                        person_add\r\n");
      out.write("                                                        </i>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"flex\">\r\n");
      out.write("                                            Người dùng mới <a href=\"#\">Trần Minh</a> đã đăng ký tài khoản<br />\r\n");
      out.write("                                            <small class=\"text-muted\">1 giờ trước.</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"dropdown-item d-flex\">\r\n");
      out.write("                                        <div class=\"mr-3\">\r\n");
      out.write("                                            <a href=\"#\">\r\n");
      out.write("                                                <div class=\"avatar avatar-xs\" style=\"width: 32px; height: 32px\">\r\n");
      out.write("                                                    <span class=\"avatar-title rounded-circle\">JD</span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"flex\">\r\n");
      out.write("                                            <a href=\"#\">Mẫn Nhi</a>\r\n");
      out.write("                                            <small class=\"text-muted\">nhắn bạn:</small><br />\r\n");
      out.write("                                            <div>\r\n");
      out.write("                                                Chào mọi người, vui lòng lưu ý cuộc hẹn lúc 3 giờ chiều\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <small class=\"text-muted\">2 phút trước đây</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"dropdown-item d-flex\">\r\n");
      out.write("                                        <div class=\"mr-3\">\r\n");
      out.write("                                            <div class=\"avatar avatar-sm\" style=\"width: 32px; height: 32px\">\r\n");
      out.write("                                                <img src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" alt=\"Avatar\" class=\"avatar-img rounded-circle\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"flex\">\r\n");
      out.write("                                            <a href=\"\">Tuấn</a> đã bình luận trong\r\n");
      out.write("                                            <a href=\"\">Stack</a><br />\r\n");
      out.write("                                            <small class=\"text-muted\">1 phút trước</small>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"dropdown-item text-center navbar-notifications-menu__footer\">\r\n");
      out.write("                                View All\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"nav navbar-nav d-none d-sm-flex border-left navbar-border navbar-height align-items-center\">\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a href=\"#account_menu\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" data-caret=\"false\">\r\n");
      out.write("                            <span class=\"avatar avatar-sm\">\r\n");
      out.write("                                <span class=\"avatar-title rounded-circle bg-warning\">\r\n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div id=\"account_menu\" class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                            <div class=\"dropdown-item-text dropdown-item-text--lh\">\r\n");
      out.write("                                <div><strong>Thanh Tuấn</strong></div>\r\n");
      out.write("                                <div>@tuanphan</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                            <a class=\"dropdown-item active\" href=\"");
      //  c:url
      org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
      boolean _jspx_th_c_005furl_005f3_reused = false;
      try {
        _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
        _jspx_th_c_005furl_005f3.setParent(null);
        // /decorators/components/header.jsp(133,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005furl_005f3.setValue(urlUtil.URL_DASHBOARD );
        int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
        if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
        _jspx_th_c_005furl_005f3_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f3_reused);
      }
      out.write("\">\r\n");
      out.write("                                Dashboard\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"");
      //  c:url
      org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
      boolean _jspx_th_c_005furl_005f4_reused = false;
      try {
        _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
        _jspx_th_c_005furl_005f4.setParent(null);
        // /decorators/components/header.jsp(136,59) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005furl_005f4.setValue(urlUtil.URL_PROFILE );
        int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
        if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
        _jspx_th_c_005furl_005f4_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f4, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f4_reused);
      }
      out.write("\"> \r\n");
      out.write("                                My profile\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"");
      //  c:url
      org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
      boolean _jspx_th_c_005furl_005f5_reused = false;
      try {
        _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
        _jspx_th_c_005furl_005f5.setParent(null);
        // /decorators/components/header.jsp(139,59) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005furl_005f5.setValue(urlUtil.URL_ACCOUNT_EDIT );
        int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
        if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
        _jspx_th_c_005furl_005f5_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f5, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f5_reused);
      }
      out.write("\">\r\n");
      out.write("                                Edit account\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"");
      //  c:url
      org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
      boolean _jspx_th_c_005furl_005f6_reused = false;
      try {
        _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
        _jspx_th_c_005furl_005f6.setParent(null);
        // /decorators/components/header.jsp(143,59) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005furl_005f6.setValue(urlUtil.URL_LOGIN );
        int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
        if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
        _jspx_th_c_005furl_005f6_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f6, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f6_reused);
      }
      out.write("\">Logout</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
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
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /decorators/components/header.jsp(20,56) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/assets/images/logo.png");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /decorators/components/header.jsp(53,58) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/assets/images/256_daniel-gaffey-1060698-unsplash.jpg");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /decorators/components/header.jsp(100,58) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("/assets/images/256_daniel-gaffey-1060698-unsplash.jpg");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }
}