/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-01-25 01:04:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class read_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/post/../include/header.jsp", Long.valueOf(1548151753268L));
    _jspx_dependants.put("/WEB-INF/views/post/../include/footer.jsp", Long.valueOf(1548057891464L));
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <title>BoardProject | Jiyun</title>\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/bower_components/bootstrap/dist/css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/bower_components/font-awesome/css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/bower_components/Ionicons/css/ionicons.min.css\" type=\"text/css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/dist/css/AdminLTE.min.css\" type=\"text/css\">\r\n");
      out.write("  <!-- AdminLTE Skins. We have chosen the skin-blue for this starter\r\n");
      out.write("        page. However, you can choose any other skin. Make sure you\r\n");
      out.write("        apply the skin class to the body tag so the changes take effect. -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/dist/css/skins/skin-blue.min.css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Font -->\r\n");
      out.write("  <link rel=\"stylesheet\"\r\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 2.1.4 -->\r\n");
      out.write("<script src=\"/resources/plugins/jQuery/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("<body class=\"skin-blue sidebar-mini\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Main Header -->\r\n");
      out.write("  <header class=\"main-header\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Logo -->\r\n");
      out.write("    <a href=\"/spost/list\" class=\"logo\">\r\n");
      out.write("      <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("      <span class=\"logo-mini\"><b>B</b>PJ</span>\r\n");
      out.write("      <!-- logo for regular state and mobile devices -->\r\n");
      out.write("      <span class=\"logo-lg\"><b>BOARD </b>PROJECT</span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Header Navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-static-top\" role=\"navigation\">\r\n");
      out.write("      <!-- Sidebar toggle button-->\r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("      <!-- Navbar Right Menu -->\r\n");
      out.write("      <div class=\"navbar-custom-menu\">\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("          <!-- Messages: style can be found in dropdown.less-->\r\n");
      out.write("          <li class=\"dropdown messages-menu\">\r\n");
      out.write("            <!-- Menu toggle button -->\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <i class=\"fa fa-envelope-o\"></i>\r\n");
      out.write("              <span class=\"label label-success\">4</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <li class=\"header\">You have 4 messages</li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <!-- inner menu: contains the messages -->\r\n");
      out.write("                <ul class=\"menu\">\r\n");
      out.write("                  <li><!-- start message -->\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                      <div class=\"pull-left\">\r\n");
      out.write("                        <!-- User Image -->\r\n");
      out.write("                        <img src=\"resources/dist/img/user-avatar.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <!-- Message title and timestamp -->\r\n");
      out.write("                      <h4>\r\n");
      out.write("                        Support Team\r\n");
      out.write("                        <small><i class=\"fa fa-clock-o\"></i> 5 mins</small>\r\n");
      out.write("                      </h4>\r\n");
      out.write("                      <!-- The message -->\r\n");
      out.write("                      <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <!-- end message -->\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- /.menu -->\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"footer\"><a href=\"#\">See All Messages</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- /.messages-menu -->\r\n");
      out.write("\r\n");
      out.write("          <!-- Notifications Menu -->\r\n");
      out.write("          <li class=\"dropdown notifications-menu\">\r\n");
      out.write("            <!-- Menu toggle button -->\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <i class=\"fa fa-bell-o\"></i>\r\n");
      out.write("              <span class=\"label label-warning\">10</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <li class=\"header\">You have 10 notifications</li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <!-- Inner Menu: contains the notifications -->\r\n");
      out.write("                <ul class=\"menu\">\r\n");
      out.write("                  <li><!-- start notification -->\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                      <i class=\"fa fa-users text-aqua\"></i> 5 new members joined today\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <!-- end notification -->\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"footer\"><a href=\"#\">View all</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- Tasks Menu -->\r\n");
      out.write("          <li class=\"dropdown tasks-menu\">\r\n");
      out.write("            <!-- Menu Toggle Button -->\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <i class=\"fa fa-flag-o\"></i>\r\n");
      out.write("              <span class=\"label label-danger\">9</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <li class=\"header\">You have 9 tasks</li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <!-- Inner menu: contains the tasks -->\r\n");
      out.write("                <ul class=\"menu\">\r\n");
      out.write("                  <li><!-- Task item -->\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                      <!-- Task title and progress text -->\r\n");
      out.write("                      <h3>\r\n");
      out.write("                        Design some buttons\r\n");
      out.write("                        <small class=\"pull-right\">20%</small>\r\n");
      out.write("                      </h3>\r\n");
      out.write("                      <!-- The progress bar -->\r\n");
      out.write("                      <div class=\"progress xs\">\r\n");
      out.write("                        <!-- Change the css width attribute to simulate progress -->\r\n");
      out.write("                        <div class=\"progress-bar progress-bar-aqua\" style=\"width: 20%\" role=\"progressbar\"\r\n");
      out.write("                             aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\r\n");
      out.write("                          <span class=\"sr-only\">20% Complete</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <!-- end task item -->\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"footer\">\r\n");
      out.write("                <a href=\"#\">View all tasks</a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- User Account Menu -->\r\n");
      out.write("          <li class=\"dropdown user user-menu\">\r\n");
      out.write("            <!-- Menu Toggle Button -->\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <!-- The user image in the navbar-->\r\n");
      out.write("              <img src=\"/resources/dist/img/user-avatar.jpg\" class=\"user-image\" alt=\"User Image\">\r\n");
      out.write("              <!-- hidden-xs hides the username on small devices so only the image appears. -->\r\n");
      out.write("              <span class=\"hidden-xs\">Jiyun Kim</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <!-- The user image in the menu -->\r\n");
      out.write("              <li class=\"user-header\">\r\n");
      out.write("                <img src=\"/resources/dist/img/user-avatar.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("\r\n");
      out.write("                <p>Jiyun Kim</p>\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- Menu Body -->\r\n");
      out.write("              <li class=\"user-body\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                    <a href=\"#\">Followers</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                    <a href=\"#\">Sales</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\r\n");
      out.write("                    <a href=\"#\">Friends</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- Menu Footer-->\r\n");
      out.write("              <li class=\"user-footer\">\r\n");
      out.write("                <div class=\"pull-left\">\r\n");
      out.write("                  <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pull-right\">\r\n");
      out.write("                  <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- Control Sidebar Toggle Button -->\r\n");
      out.write("          \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("  <!-- Left side column. contains the logo and sidebar -->\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("  <div class=\"content-wrapper\">\r\n");
      out.write("    <!-- Content Header (Page header) -->\r\n");
      out.write("    <section class=\"content-header\">\r\n");
      out.write("      <h1>\r\n");
      out.write("        Bulletin Board\r\n");
      out.write("        <small>Post something!</small>\r\n");
      out.write("      </h1>\r\n");
      out.write("      <ol class=\"breadcrumb\">\r\n");
      out.write("      <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i>Home</a></li>\r\n");
      out.write("      <li><a href=\"#\">Forms</a></li>\r\n");
      out.write("      <li class=\"active\">General Elements</li>\r\n");
      out.write("      </ol>\r\n");
      out.write("    </section>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Main content -->\r\n");
      out.write("<section class=\"content\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<!-- left column -->\r\n");
      out.write("<div class=\"col-md-12\">\r\n");
      out.write("<!-- general form elements -->\r\n");
      out.write("<div class=\"box box-primary\">\r\n");
      out.write("<div class=\"box-header\">\r\n");
      out.write("<h3 class=\"box-title\">READ POSTS</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.box-header -->\r\n");
      out.write("\r\n");
      out.write("<form role=\"form\" method=\"post\">\r\n");
      out.write("<input type='hidden' name=\"postId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postVO.postId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<div class=\"box-body\">\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label for=\"exampleInputEmail1\">TITLE</label><input type=\"text\" name='postTitle' class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postVO.postTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("readonly=\"readonly\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label for=\"exampleInputPassword1\">CONTENT</label>\r\n");
      out.write("<textarea class=\"form-control\" name=\"postContent\" rows=\"3\" readonly=\"readonly\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postVO.postContent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label for=\"exampleInputEmail1\">WRITER</label> <input type=\"text\"\r\n");
      out.write("name=\"userId\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postVO.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.box-body -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"box-footer\">\r\n");
      out.write("<button type=\"submit\" class=\"btn btn-danger\">MODIFY</button>\r\n");
      out.write("<button type=\"submit\" class=\"btn btn-warning\">REMOVE</button>\r\n");
      out.write("<button type=\"submit\" class=\"btn btn-primary\">LIST</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t\r\n");
      out.write("\tvar formObj = $(\"form[role='form']\");\r\n");
      out.write("\t\r\n");
      out.write("\tconsole.log(formObj);\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".btn-danger\").on(\"click\", function(){\r\n");
      out.write("\t\tformObj.attr(\"action\", \"/post/modify\");\r\n");
      out.write("\t\tformObj.attr(\"method\", \"get\");\r\n");
      out.write("\t\tformObj.submit();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".btn-warning\").on(\"click\", function(){\r\n");
      out.write("\t\tformObj.attr(\"action\", \"/post/remove\");\r\n");
      out.write("\t\tformObj.submit();\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".btn-primary\").on(\"click\", function(){\r\n");
      out.write("\t\tself.location = \"/post/listAll\";\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.box -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.col (left) -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.row -->\r\n");
      out.write("</section>\r\n");
      out.write("<!-- /.content -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Main Footer -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  <!-- Control Sidebar -->\r\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Create the tabs -->\r\n");
      out.write("    <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\r\n");
      out.write("      <li><a href=\"#control-sidebar-home-tab\" data-toggle=\"tab\"><i class=\"fa fa-home\"></i></a></li>\r\n");
      out.write("      \r\n");
      out.write("      <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- Tab panes -->\r\n");
      out.write("    <div class=\"tab-content\">\r\n");
      out.write("      <!-- Home tab content -->\r\n");
      out.write("      <div class=\"tab-pane\" id=\"control-sidebar-home-tab\">\r\n");
      out.write("        <h3 class=\"control-sidebar-heading\">Recent Activity</h3>\r\n");
      out.write("        <ul class=\"control-sidebar-menu\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"javascript:;\">\r\n");
      out.write("              <i class=\"menu-icon fa fa-birthday-cake bg-red\"></i>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"menu-info\">\r\n");
      out.write("                <h4 class=\"control-sidebar-subheading\">Langdon's Birthday</h4>\r\n");
      out.write("\r\n");
      out.write("                <p>Will be 23 on April 24th</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- /.control-sidebar-menu -->\r\n");
      out.write("\r\n");
      out.write("        <h3 class=\"control-sidebar-heading\">Tasks Progress</h3>\r\n");
      out.write("        <ul class=\"control-sidebar-menu\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"javascript:;\">\r\n");
      out.write("              <h4 class=\"control-sidebar-subheading\">\r\n");
      out.write("                Custom Template Design\r\n");
      out.write("                <span class=\"pull-right-container\">\r\n");
      out.write("                    <span class=\"label label-danger pull-right\">70%</span>\r\n");
      out.write("                  </span>\r\n");
      out.write("              </h4>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"progress progress-xxs\">\r\n");
      out.write("                <div class=\"progress-bar progress-bar-danger\" style=\"width: 70%\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- /.control-sidebar-menu -->\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.tab-pane -->\r\n");
      out.write("      <!-- Stats tab content -->\r\n");
      out.write("      <div class=\"tab-pane\" id=\"control-sidebar-stats-tab\">Stats Tab Content</div>\r\n");
      out.write("      <!-- /.tab-pane -->\r\n");
      out.write("      <!-- Settings tab content -->\r\n");
      out.write("      <div class=\"tab-pane\" id=\"control-sidebar-settings-tab\">\r\n");
      out.write("        <form method=\"post\">\r\n");
      out.write("          <h3 class=\"control-sidebar-heading\">General Settings</h3>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label class=\"control-sidebar-subheading\">\r\n");
      out.write("              Report panel usage\r\n");
      out.write("              <input type=\"checkbox\" class=\"pull-right\" checked>\r\n");
      out.write("            </label>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("              Some information about this general settings option\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.form-group -->\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.tab-pane -->\r\n");
      out.write("    </div>\r\n");
      out.write("  </aside>\r\n");
      out.write("  \r\n");
      out.write("  <!-- /.control-sidebar -->\r\n");
      out.write("  <!-- Add the sidebar's background. This div must be placed\r\n");
      out.write("  immediately after the control sidebar -->\r\n");
      out.write("  <div class=\"control-sidebar-bg\"></div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- REQUIRED JS SCRIPTS -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 3 -->\r\n");
      out.write("<script src=\"/resources/bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 3.3.7 -->\r\n");
      out.write("<script src=\"/resources/bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"/resources/dist/js/adminlte.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Optionally, you can add Slimscroll and FastClick plugins.\r\n");
      out.write("     Both of these plugins are recommended to enhance the\r\n");
      out.write("     user experience. -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
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
