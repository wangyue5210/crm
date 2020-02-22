/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-19 07:59:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.workbench.clue;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class convert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"jquery/bootstrap_3.3.0/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/jquery-1.11.1-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/bootstrap_3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"jquery/bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.min.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/bootstrap-datetimepicker-master/locale/bootstrap-datetimepicker.zh-CN.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function(){\n");
      out.write("\t\t$(\"#isCreateTransaction\").click(function(){\n");
      out.write("\t\t\tif(this.checked){\n");
      out.write("\t\t\t\t$(\"#create-transaction2\").show(200);\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\t$(\"#create-transaction2\").hide(200);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<!-- 搜索市场活动的模态窗口 -->\n");
      out.write("\t<div class=\"modal fade\" id=\"searchActivityModal\" role=\"dialog\" >\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\" style=\"width: 90%;\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">×</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">搜索市场活动</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<div class=\"btn-group\" style=\"position: relative; top: 18%; left: 8px;\">\n");
      out.write("\t\t\t\t\t\t<form class=\"form-inline\" role=\"form\">\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group has-feedback\">\n");
      out.write("\t\t\t\t\t\t    <input type=\"text\" class=\"form-control\" style=\"width: 300px;\" placeholder=\"请输入市场活动名称，支持模糊查询\">\n");
      out.write("\t\t\t\t\t\t    <span class=\"glyphicon glyphicon-search form-control-feedback\"></span>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<table id=\"activityTable\" class=\"table table-hover\" style=\"width: 900px; position: relative;top: 10px;\">\n");
      out.write("\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t<tr style=\"color: #B3B3B3;\">\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>名称</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>开始日期</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>结束日期</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>所有者</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"radio\" name=\"activity\"/></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>发传单</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>2020-10-10</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>2020-10-20</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>zhangsan</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"radio\" name=\"activity\"/></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>发传单</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>2020-10-10</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>2020-10-20</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>zhangsan</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"title\" class=\"page-header\" style=\"position: relative; left: 20px;\">\n");
      out.write("\t\t<h4>转换线索 <small>李四先生-动力节点</small></h4>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"create-customer\" style=\"position: relative; left: 40px; height: 35px;\">\n");
      out.write("\t\t新建客户：动力节点\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"create-contact\" style=\"position: relative; left: 40px; height: 35px;\">\n");
      out.write("\t\t新建联系人：李四先生\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"create-transaction1\" style=\"position: relative; left: 40px; height: 35px; top: 25px;\">\n");
      out.write("\t\t<input type=\"checkbox\" id=\"isCreateTransaction\"/>\n");
      out.write("\t\t为客户创建交易\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"create-transaction2\" style=\"position: relative; left: 40px; top: 20px; width: 80%; background-color: #F7F7F7; display: none;\" >\n");
      out.write("\t\n");
      out.write("\t\t<form>\n");
      out.write("\t\t  <div class=\"form-group\" style=\"width: 400px; position: relative; left: 20px;\">\n");
      out.write("\t\t    <label for=\"amountOfMoney\">金额</label>\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" id=\"amountOfMoney\">\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  <div class=\"form-group\" style=\"width: 400px;position: relative; left: 20px;\">\n");
      out.write("\t\t    <label for=\"tradeName\">交易名称</label>\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" id=\"tradeName\" value=\"动力节点-\">\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  <div class=\"form-group\" style=\"width: 400px;position: relative; left: 20px;\">\n");
      out.write("\t\t    <label for=\"expectedClosingDate\">预计成交日期</label>\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" id=\"expectedClosingDate\">\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  <div class=\"form-group\" style=\"width: 400px;position: relative; left: 20px;\">\n");
      out.write("\t\t    <label for=\"stage\">阶段</label>\n");
      out.write("\t\t    <select id=\"stage\"  class=\"form-control\">\n");
      out.write("\t\t    \t<option></option>\n");
      out.write("\t\t    \t<option>资质审查</option>\n");
      out.write("\t\t    \t<option>需求分析</option>\n");
      out.write("\t\t    \t<option>价值建议</option>\n");
      out.write("\t\t    \t<option>确定决策者</option>\n");
      out.write("\t\t    \t<option>提案/报价</option>\n");
      out.write("\t\t    \t<option>谈判/复审</option>\n");
      out.write("\t\t    \t<option>成交</option>\n");
      out.write("\t\t    \t<option>丢失的线索</option>\n");
      out.write("\t\t    \t<option>因竞争丢失关闭</option>\n");
      out.write("\t\t    </select>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  <div class=\"form-group\" style=\"width: 400px;position: relative; left: 20px;\">\n");
      out.write("\t\t    <label for=\"activity\">市场活动源&nbsp;&nbsp;<a href=\"javascript:void(0);\" data-toggle=\"modal\" data-target=\"#searchActivityModal\" style=\"text-decoration: none;\"><span class=\"glyphicon glyphicon-search\"></span></a></label>\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" id=\"activity\" placeholder=\"点击上面搜索\" readonly>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div id=\"owner\" style=\"position: relative; left: 40px; height: 35px; top: 50px;\">\n");
      out.write("\t\t记录的所有者：<br>\n");
      out.write("\t\t<b>zhangsan</b>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"operation\" style=\"position: relative; left: 40px; height: 35px; top: 100px;\">\n");
      out.write("\t\t<input class=\"btn btn-primary\" type=\"button\" value=\"转换\">\n");
      out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t<input class=\"btn btn-default\" type=\"button\" value=\"取消\">\n");
      out.write("\t</div>\n");
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
