/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-19 08:04:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.workbench.transaction;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("<link href=\"../../jquery/bootstrap_3.3.0/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".mystage{\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\tvertical-align: middle;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write(".closingDate{\n");
      out.write("\tfont-size : 15px;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tvertical-align: middle;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\t\n");
      out.write("<script type=\"text/javascript\" src=\"../../jquery/jquery-1.11.1-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../jquery/bootstrap_3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t//默认情况下取消和保存按钮是隐藏的\n");
      out.write("\tvar cancelAndSaveBtnDefault = true;\n");
      out.write("\t\n");
      out.write("\t$(function(){\n");
      out.write("\t\t$(\"#remark\").focus(function(){\n");
      out.write("\t\t\tif(cancelAndSaveBtnDefault){\n");
      out.write("\t\t\t\t//设置remarkDiv的高度为130px\n");
      out.write("\t\t\t\t$(\"#remarkDiv\").css(\"height\",\"130px\");\n");
      out.write("\t\t\t\t//显示\n");
      out.write("\t\t\t\t$(\"#cancelAndSaveBtn\").show(\"2000\");\n");
      out.write("\t\t\t\tcancelAndSaveBtnDefault = false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#cancelBtn\").click(function(){\n");
      out.write("\t\t\t//显示\n");
      out.write("\t\t\t$(\"#cancelAndSaveBtn\").hide();\n");
      out.write("\t\t\t//设置remarkDiv的高度为130px\n");
      out.write("\t\t\t$(\"#remarkDiv\").css(\"height\",\"90px\");\n");
      out.write("\t\t\tcancelAndSaveBtnDefault = true;\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\".remarkDiv\").mouseover(function(){\n");
      out.write("\t\t\t$(this).children(\"div\").children(\"div\").show();\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\".remarkDiv\").mouseout(function(){\n");
      out.write("\t\t\t$(this).children(\"div\").children(\"div\").hide();\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\".myHref\").mouseover(function(){\n");
      out.write("\t\t\t$(this).children(\"span\").css(\"color\",\"red\");\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\".myHref\").mouseout(function(){\n");
      out.write("\t\t\t$(this).children(\"span\").css(\"color\",\"#E6E6E6\");\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t//阶段提示框\n");
      out.write("\t\t$(\".mystage\").popover({\n");
      out.write("            trigger:'manual',\n");
      out.write("            placement : 'bottom',\n");
      out.write("            html: 'true',\n");
      out.write("            animation: false\n");
      out.write("        }).on(\"mouseenter\", function () {\n");
      out.write("                    var _this = this;\n");
      out.write("                    $(this).popover(\"show\");\n");
      out.write("                    $(this).siblings(\".popover\").on(\"mouseleave\", function () {\n");
      out.write("                        $(_this).popover('hide');\n");
      out.write("                    });\n");
      out.write("                }).on(\"mouseleave\", function () {\n");
      out.write("                    var _this = this;\n");
      out.write("                    setTimeout(function () {\n");
      out.write("                        if (!$(\".popover:hover\").length) {\n");
      out.write("                            $(_this).popover(\"hide\")\n");
      out.write("                        }\n");
      out.write("                    }, 100);\n");
      out.write("                });\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<!-- 返回按钮 -->\n");
      out.write("\t<div style=\"position: relative; top: 35px; left: 10px;\">\n");
      out.write("\t\t<a href=\"javascript:void(0);\" onclick=\"window.history.back();\"><span class=\"glyphicon glyphicon-arrow-left\" style=\"font-size: 20px; color: #DDDDDD\"></span></a>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 大标题 -->\n");
      out.write("\t<div style=\"position: relative; left: 40px; top: -30px;\">\n");
      out.write("\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t<h3>动力节点-交易01 <small>￥5,000</small></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; height: 50px; width: 250px;  top: -72px; left: 700px;\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default\" onclick=\"window.location.href='edit.jsp';\"><span class=\"glyphicon glyphicon-edit\"></span> 编辑</button>\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-minus\"></span> 删除</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- 阶段状态 -->\n");
      out.write("\t<div style=\"position: relative; left: 40px; top: -50px;\">\n");
      out.write("\t\t阶段&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-ok-circle mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"资质审查\" style=\"color: #90F790;\"></span>\n");
      out.write("\t\t-----------\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-ok-circle mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"需求分析\" style=\"color: #90F790;\"></span>\n");
      out.write("\t\t-----------\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-ok-circle mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"价值建议\" style=\"color: #90F790;\"></span>\n");
      out.write("\t\t-----------\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-ok-circle mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"确定决策者\" style=\"color: #90F790;\"></span>\n");
      out.write("\t\t-----------\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-map-marker mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"提案/报价\" style=\"color: #90F790;\"></span>\n");
      out.write("\t\t-----------\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-record mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"谈判/复审\"></span>\n");
      out.write("\t\t-----------\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-record mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"成交\"></span>\n");
      out.write("\t\t-----------\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-record mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"丢失的线索\"></span>\n");
      out.write("\t\t-----------\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-record mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"因竞争丢失关闭\"></span>\n");
      out.write("\t\t-----------\n");
      out.write("\t\t<span class=\"closingDate\">2010-10-10</span>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 详细信息 -->\n");
      out.write("\t<div style=\"position: relative; top: 0px;\">\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">所有者</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>zhangsan</b></div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">金额</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>5,000</b></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 10px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">名称</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>动力节点-交易01</b></div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">预计成交日期</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>2017-02-07</b></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 20px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">客户名称</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>动力节点</b></div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">阶段</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>谈判/复审</b></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 30px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">类型</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>新业务</b></div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">可能性</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>90</b></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 40px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">来源</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>广告</b></div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">市场活动源</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>发传单</b></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 50px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">联系人名称</div>\n");
      out.write("\t\t\t<div style=\"width: 500px;position: relative; left: 200px; top: -20px;\"><b>李四</b></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 550px; background: #D5D5D5; position: relative; top: -20px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 60px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">创建者</div>\n");
      out.write("\t\t\t<div style=\"width: 500px;position: relative; left: 200px; top: -20px;\"><b>zhangsan&nbsp;&nbsp;</b><small style=\"font-size: 10px; color: gray;\">2017-01-18 10:10:10</small></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 550px; background: #D5D5D5; position: relative; top: -20px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 70px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">修改者</div>\n");
      out.write("\t\t\t<div style=\"width: 500px;position: relative; left: 200px; top: -20px;\"><b>zhangsan&nbsp;&nbsp;</b><small style=\"font-size: 10px; color: gray;\">2017-01-19 10:10:10</small></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 550px; background: #D5D5D5; position: relative; top: -20px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 80px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">描述</div>\n");
      out.write("\t\t\t<div style=\"width: 630px;position: relative; left: 200px; top: -20px;\">\n");
      out.write("\t\t\t\t<b>\n");
      out.write("\t\t\t\t\t这是一条线索的描述信息 （线索转换之后会将线索的描述转换到交易的描述中）\n");
      out.write("\t\t\t\t</b>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 850px; background: #D5D5D5; position: relative; top: -20px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 90px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">联系纪要</div>\n");
      out.write("\t\t\t<div style=\"width: 630px;position: relative; left: 200px; top: -20px;\">\n");
      out.write("\t\t\t\t<b>\n");
      out.write("\t\t\t\t\t&nbsp;\n");
      out.write("\t\t\t\t</b>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 850px; background: #D5D5D5; position: relative; top: -20px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 100px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">下次联系时间</div>\n");
      out.write("\t\t\t<div style=\"width: 500px;position: relative; left: 200px; top: -20px;\"><b>&nbsp;</b></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -20px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 备注 -->\n");
      out.write("\t<div style=\"position: relative; top: 100px; left: 40px;\">\n");
      out.write("\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t<h4>备注</h4>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- 备注1 -->\n");
      out.write("\t\t<div class=\"remarkDiv\" style=\"height: 60px;\">\n");
      out.write("\t\t\t<img title=\"zhangsan\" src=\"../../image/user-thumbnail.png\" style=\"width: 30px; height:30px;\">\n");
      out.write("\t\t\t<div style=\"position: relative; top: -40px; left: 40px;\" >\n");
      out.write("\t\t\t\t<h5>哎呦！</h5>\n");
      out.write("\t\t\t\t<font color=\"gray\">交易</font> <font color=\"gray\">-</font> <b>动力节点-交易01</b> <small style=\"color: gray;\"> 2017-01-22 10:10:10 由zhangsan</small>\n");
      out.write("\t\t\t\t<div style=\"position: relative; left: 500px; top: -30px; height: 30px; width: 100px; display: none;\">\n");
      out.write("\t\t\t\t\t<a class=\"myHref\" href=\"javascript:void(0);\"><span class=\"glyphicon glyphicon-edit\" style=\"font-size: 20px; color: #E6E6E6;\"></span></a>\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t<a class=\"myHref\" href=\"javascript:void(0);\"><span class=\"glyphicon glyphicon-remove\" style=\"font-size: 20px; color: #E6E6E6;\"></span></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- 备注2 -->\n");
      out.write("\t\t<div class=\"remarkDiv\" style=\"height: 60px;\">\n");
      out.write("\t\t\t<img title=\"zhangsan\" src=\"../../image/user-thumbnail.png\" style=\"width: 30px; height:30px;\">\n");
      out.write("\t\t\t<div style=\"position: relative; top: -40px; left: 40px;\" >\n");
      out.write("\t\t\t\t<h5>呵呵！</h5>\n");
      out.write("\t\t\t\t<font color=\"gray\">交易</font> <font color=\"gray\">-</font> <b>动力节点-交易01</b> <small style=\"color: gray;\"> 2017-01-22 10:20:10 由zhangsan</small>\n");
      out.write("\t\t\t\t<div style=\"position: relative; left: 500px; top: -30px; height: 30px; width: 100px; display: none;\">\n");
      out.write("\t\t\t\t\t<a class=\"myHref\" href=\"javascript:void(0);\"><span class=\"glyphicon glyphicon-edit\" style=\"font-size: 20px; color: #E6E6E6;\"></span></a>\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t<a class=\"myHref\" href=\"javascript:void(0);\"><span class=\"glyphicon glyphicon-remove\" style=\"font-size: 20px; color: #E6E6E6;\"></span></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"remarkDiv\" style=\"background-color: #E6E6E6; width: 870px; height: 90px;\">\n");
      out.write("\t\t\t<form role=\"form\" style=\"position: relative;top: 10px; left: 10px;\">\n");
      out.write("\t\t\t\t<textarea id=\"remark\" class=\"form-control\" style=\"width: 850px; resize : none;\" rows=\"2\"  placeholder=\"添加备注...\"></textarea>\n");
      out.write("\t\t\t\t<p id=\"cancelAndSaveBtn\" style=\"position: relative;left: 737px; top: 10px; display: none;\">\n");
      out.write("\t\t\t\t\t<button id=\"cancelBtn\" type=\"button\" class=\"btn btn-default\">取消</button>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\">保存</button>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 阶段历史 -->\n");
      out.write("\t<div>\n");
      out.write("\t\t<div style=\"position: relative; top: 100px; left: 40px;\">\n");
      out.write("\t\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t\t<h4>阶段历史</h4>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div style=\"position: relative;top: 0px;\">\n");
      out.write("\t\t\t\t<table id=\"activityTable\" class=\"table table-hover\" style=\"width: 900px;\">\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr style=\"color: #B3B3B3;\">\n");
      out.write("\t\t\t\t\t\t\t<td>阶段</td>\n");
      out.write("\t\t\t\t\t\t\t<td>金额</td>\n");
      out.write("\t\t\t\t\t\t\t<td>可能性</td>\n");
      out.write("\t\t\t\t\t\t\t<td>预计成交日期</td>\n");
      out.write("\t\t\t\t\t\t\t<td>创建时间</td>\n");
      out.write("\t\t\t\t\t\t\t<td>创建人</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>资质审查</td>\n");
      out.write("\t\t\t\t\t\t\t<td>5,000</td>\n");
      out.write("\t\t\t\t\t\t\t<td>10</td>\n");
      out.write("\t\t\t\t\t\t\t<td>2017-02-07</td>\n");
      out.write("\t\t\t\t\t\t\t<td>2016-10-10 10:10:10</td>\n");
      out.write("\t\t\t\t\t\t\t<td>zhangsan</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>需求分析</td>\n");
      out.write("\t\t\t\t\t\t\t<td>5,000</td>\n");
      out.write("\t\t\t\t\t\t\t<td>20</td>\n");
      out.write("\t\t\t\t\t\t\t<td>2017-02-07</td>\n");
      out.write("\t\t\t\t\t\t\t<td>2016-10-20 10:10:10</td>\n");
      out.write("\t\t\t\t\t\t\t<td>zhangsan</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>谈判/复审</td>\n");
      out.write("\t\t\t\t\t\t\t<td>5,000</td>\n");
      out.write("\t\t\t\t\t\t\t<td>90</td>\n");
      out.write("\t\t\t\t\t\t\t<td>2017-02-07</td>\n");
      out.write("\t\t\t\t\t\t\t<td>2017-02-09 10:10:10</td>\n");
      out.write("\t\t\t\t\t\t\t<td>zhangsan</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div style=\"height: 200px;\"></div>\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}