/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-21 12:56:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.workbench.activity;

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
      out.write("<link href=\"jquery/bootstrap_3.3.0/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/jquery-1.11.1-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/bootstrap_3.3.0/js/bootstrap.min.js\"></script>\n");
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
      out.write("\t\t//页面加载完成后，展现该市场活动关联的备注信息列表\n");
      out.write("\t\tshowRemarkList();\n");
      out.write("\n");
      out.write("\n");
      out.write("        $(\"#remarkBody\").on(\"mouseover\",\".remarkDiv\",function () {\n");
      out.write("            $(this).children(\"div\").children(\"div\").show();\n");
      out.write("        })\n");
      out.write("\n");
      out.write("        $(\"#remarkBody\").on(\"mouseout\",\".remarkDiv\",function () {\n");
      out.write("            $(this).children(\"div\").children(\"div\").hide();\n");
      out.write("        })\n");
      out.write("\n");
      out.write("\n");
      out.write("        //添加备注操作\n");
      out.write("        $(\"#saveBtn\").click(function () {\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            $.ajax({\n");
      out.write("                url: \"workbench/activity/saveRemark.do\",\n");
      out.write("                data:{\n");
      out.write("                    \"noteContent\":$.trim($(\"#remark\").val()),\n");
      out.write("                    \"activityId\": \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\n");
      out.write("\n");
      out.write("                },\n");
      out.write("                type:\"post\",\n");
      out.write("\n");
      out.write("                dataType:\"json\",\n");
      out.write("\n");
      out.write("\n");
      out.write("                success:function(data) {\n");
      out.write("                    /*\n");
      out.write("                    * data\n");
      out.write("                    * {\"success\":true/false,\"ar\":{备注}}\n");
      out.write("                    *\n");
      out.write("                    * */\n");
      out.write("\n");
      out.write("                    if (data.success){\n");
      out.write("\n");
      out.write("                        //清空文本域内容\n");
      out.write("                        $(\"#remark\").val(\"\");\n");
      out.write("\n");
      out.write("                        var html=\"\";\n");
      out.write("                        html+= '<div id=\"'+data.ar.id+'\" class=\"remarkDiv\" style=\"height: 60px;\">';\n");
      out.write("                        html+= '<img title=\"zhangsan\" src=\"image/user-thumbnail.png\" style=\"width: 30px; height:30px;\">';\n");
      out.write("                        html+= '<div style=\"position: relative; top: -40px; left: 40px;\" >';\n");
      out.write("                        html+= '<h5 id=e'+data.ar.id+'>'+ data.ar.noteContent +'</h5>';\n");
      out.write("                        html+= '<font color=\"gray\">市场活动</font> <font color=\"gray\">-</font> <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b> <small style=\"color: gray;\"> '+data.ar.createTime+' 由'+data.ar.createBy+'</small>';\n");
      out.write("                        html+= '<div style=\"position: relative; left: 500px; top: -30px; height: 30px; width: 100px; display: none;\">';\n");
      out.write("                        html+= '<a class=\"myHref\" href=\"javascript:void(0);\" onclick=\"editRemark(\\''+data.ar.id+'\\')\"><span class=\"glyphicon glyphicon-edit\" style=\"font-size: 20px; color: #FF0000;\"></span></a>';\n");
      out.write("                        html+= '&nbsp;&nbsp;&nbsp;&nbsp;';\n");
      out.write("                        html+= '<a class=\"myHref\" href=\"javascript:void(0);\" onclick=\"deleteRemark(\\''+data.ar.id+'\\')\"><span class=\"glyphicon glyphicon-remove\" style=\"font-size: 20px; color: #FF0000;\"></span></a>';\n");
      out.write("                        html+= '</div>';\n");
      out.write("                        html+= '</div>';\n");
      out.write("                        html+= '</div>';\n");
      out.write("\n");
      out.write("                        $(\"#remarkDiv\").before(html);\n");
      out.write("\n");
      out.write("                    }else {\n");
      out.write("                        alert(\"添加失败\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            })\n");
      out.write("\n");
      out.write("        })\n");
      out.write("\n");
      out.write("\n");
      out.write("        //为更新按钮绑定点击事件\n");
      out.write("        $(\"#updateRemarkBtn\").click(function () {\n");
      out.write("            var id =$(\"#remarkId\").val();\n");
      out.write("            $.ajax({\n");
      out.write("                url: \"workbench/activity/updateRemark.do\",\n");
      out.write("                data:{\n");
      out.write("                    \"id\":id,\n");
      out.write("                    \"noteContent\":$.trim($(\"#noteContent\").val())\n");
      out.write("\n");
      out.write("                },\n");
      out.write("                type:\"post\",\n");
      out.write("\n");
      out.write("                dataType:\"json\",\n");
      out.write("\n");
      out.write("\n");
      out.write("                success:function(data) {\n");
      out.write("\n");
      out.write("                    if (data.success){\n");
      out.write("\n");
      out.write("                        //修改备注内容，更新div中对应的信息\n");
      out.write("                        $(\"#e\"+id).html(data.ar.noteContent);\n");
      out.write("                        $(\"#s\"+id).html(data.ar.editTime+\" 由\"+data.ar.editBy);\n");
      out.write("                        $(\"#editRemarkModal\").modal(\"hide\");\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            })\n");
      out.write("\n");
      out.write("        })\n");
      out.write("\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tfunction showRemarkList() {\n");
      out.write("\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl: \"workbench/activity/getRemarkListByAid.do\",\n");
      out.write("\t\t\tdata:{\n");
      out.write("\t\t\t\t\"activityId\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\n");
      out.write("\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\ttype:\"get\",\n");
      out.write("\n");
      out.write("            dataType:\"json\",\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\tsuccess:function(data) {\n");
      out.write("\n");
      out.write("\t\t\t\t/*\n");
      out.write("\t\t\t\t* data [{备注1},{},{}]\n");
      out.write("\t\t\t\t* */\n");
      out.write("\t\t\t\t var html=\"\";\n");
      out.write("\t\t\t\t$.each(data,function (i,n) {\n");
      out.write("\t\t\t\t\t<!-- 备注1 -->\n");
      out.write("\t\t\t\t\thtml+= '<div id=\"'+n.id+'\" class=\"remarkDiv\" style=\"height: 60px;\">';\n");
      out.write("\t\t\t\t\thtml+= '<img title=\"zhangsan\" src=\"image/user-thumbnail.png\" style=\"width: 30px; height:30px;\">';\n");
      out.write("\t\t\t\t\thtml+= '<div style=\"position: relative; top: -40px; left: 40px;\" >';\n");
      out.write("\t\t\t\t\thtml+= '<h5 id=e'+n.id+'>'+ n.noteContent +'</h5>';\n");
      out.write("\t\t\t\t\thtml+= '<font color=\"gray\">市场活动</font> <font color=\"gray\">-</font> <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b> <small id=\"s'+n.id+'\" style=\"color: gray;\"> '+(n.editFlag==0?n.createTime:n.editTime)+' 由'+(n.editFlag==0?n.createBy:n.editBy)+'</small>';\n");
      out.write("\t\t\t\t\thtml+= '<div style=\"position: relative; left: 500px; top: -30px; height: 30px; width: 100px; display: none;\">';\n");
      out.write("\t\t\t\t\thtml+= '<a class=\"myHref\" href=\"javascript:void(0);\" onclick=\"editRemark(\\''+n.id+'\\')\"><span class=\"glyphicon glyphicon-edit\" style=\"font-size: 20px; color: #FF0000;\"></span></a>';\n");
      out.write("\t\t\t\t\thtml+= '&nbsp;&nbsp;&nbsp;&nbsp;';\n");
      out.write("\t\t\t\t\thtml+= '<a class=\"myHref\" href=\"javascript:void(0);\" onclick=\"deleteRemark(\\''+n.id+'\\')\"><span class=\"glyphicon glyphicon-remove\" style=\"font-size: 20px; color: #FF0000;\"></span></a>';\n");
      out.write("\t\t\t\t\thtml+= '</div>';\n");
      out.write("\t\t\t\t\thtml+= '</div>';\n");
      out.write("\t\t\t\t\thtml+= '</div>';\n");
      out.write("\t\t\t\t})\n");
      out.write("\n");
      out.write("\t\t\t\t$(\"#remarkDiv\").before(html);\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t})\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction  editRemark(id) {\n");
      out.write("\n");
      out.write("\n");
      out.write("\t    //将模态窗口中隐藏域中的id进行赋值\n");
      out.write("        $(\"#remarkId\").val(id);\n");
      out.write("\n");
      out.write("\t    var noteContent=$(\"#e\"+id).html();\n");
      out.write("        //0alert(noteContent);\n");
      out.write("        $(\"#noteContent\").val(noteContent);\n");
      out.write("\t    $(\"#editRemarkModal\").modal(\"show\");\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\tfunction deleteRemark(id) {\n");
      out.write("\n");
      out.write("\t    //alert(id);\n");
      out.write("        $.ajax({\n");
      out.write("            url: \"workbench/activity/deleteRemark.do\",\n");
      out.write("            data:{\n");
      out.write("\n");
      out.write("                \"id\":id,\n");
      out.write("\n");
      out.write("            },\n");
      out.write("            type:\"post\",\n");
      out.write("\n");
      out.write("            dataType:\"json\",\n");
      out.write("\n");
      out.write("\n");
      out.write("            success:function(data) {\n");
      out.write("\n");
      out.write("                if(data.success){\n");
      out.write("\n");
      out.write("                   // showRemarkList();\n");
      out.write("                    $(\"#\"+id).remove();\n");
      out.write("\n");
      out.write("                }else {\n");
      out.write("                    alert(\"删除失败\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        })\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<!-- 修改市场活动备注的模态窗口 -->\n");
      out.write("\t<div class=\"modal fade\" id=\"editRemarkModal\" role=\"dialog\">\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t<input type=\"hidden\" id=\"remarkId\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\" style=\"width: 40%;\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("                        <span aria-hidden=\"true\">×</span>\n");
      out.write("                    </button>\n");
      out.write("                    <h4 class=\"modal-title\" id=\"myModalLabel\">修改备注</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"edit-describe\" class=\"col-sm-2 control-label\">内容</label>\n");
      out.write("                            <div class=\"col-sm-10\" style=\"width: 81%;\">\n");
      out.write("                                <textarea class=\"form-control\" rows=\"3\" id=\"noteContent\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" id=\"updateRemarkBtn\">更新</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- 修改市场活动的模态窗口 -->\n");
      out.write("    <div class=\"modal fade\" id=\"editActivityModal\" role=\"dialog\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\" style=\"width: 85%;\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("                        <span aria-hidden=\"true\">×</span>\n");
      out.write("                    </button>\n");
      out.write("                    <h4 class=\"modal-title\" id=\"myModalLabel\">修改市场活动</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                    <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"edit-marketActivityOwner\" class=\"col-sm-2 control-label\">所有者<span style=\"font-size: 15px; color: red;\">*</span></label>\n");
      out.write("                            <div class=\"col-sm-10\" style=\"width: 300px;\">\n");
      out.write("                                <select class=\"form-control\" id=\"edit-marketActivityOwner\">\n");
      out.write("                                    <option>zhangsan</option>\n");
      out.write("                                    <option>lisi</option>\n");
      out.write("                                    <option>wangwu</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <label for=\"edit-marketActivityName\" class=\"col-sm-2 control-label\">名称<span style=\"font-size: 15px; color: red;\">*</span></label>\n");
      out.write("                            <div class=\"col-sm-10\" style=\"width: 300px;\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"edit-marketActivityName\" value=\"发传单\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"edit-startTime\" class=\"col-sm-2 control-label\">开始日期</label>\n");
      out.write("                            <div class=\"col-sm-10\" style=\"width: 300px;\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"edit-startTime\" value=\"2020-10-10\">\n");
      out.write("                            </div>\n");
      out.write("                            <label for=\"edit-endTime\" class=\"col-sm-2 control-label\">结束日期</label>\n");
      out.write("                            <div class=\"col-sm-10\" style=\"width: 300px;\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"edit-endTime\" value=\"2020-10-20\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"edit-cost\" class=\"col-sm-2 control-label\">成本</label>\n");
      out.write("                            <div class=\"col-sm-10\" style=\"width: 300px;\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"edit-cost\" value=\"5,000\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"edit-describe\" class=\"col-sm-2 control-label\">描述</label>\n");
      out.write("                            <div class=\"col-sm-10\" style=\"width: 81%;\">\n");
      out.write("                                <textarea class=\"form-control\" rows=\"3\" id=\"edit-describe\">市场活动Marketing，是指品牌主办或参与的展览会议与公关市场活动，包括自行主办的各类研讨会、客户交流会、演示会、新产品发布会、体验会、答谢会、年会和出席参加并布展或演讲的展览会、研讨会、行业交流会、颁奖典礼等</textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">更新</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\t<!-- 返回按钮 -->\n");
      out.write("\t<div style=\"position: relative; top: 35px; left: 10px;\">\n");
      out.write("\t\t<a href=\"javascript:void(0);\" onclick=\"window.history.back();\"><span class=\"glyphicon glyphicon-arrow-left\" style=\"font-size: 20px; color: #DDDDDD\"></span></a>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 大标题 -->\n");
      out.write("\t<div style=\"position: relative; left: 40px; top: -30px;\">\n");
      out.write("\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t<h3>市场活动-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <small>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.startDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write('~');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.endDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</small></h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; height: 50px; width: 250px;  top: -72px; left: 700px;\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\" data-target=\"#editActivityModal\"><span class=\"glyphicon glyphicon-edit\"></span> 编辑</button>\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-minus\"></span> 删除</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 详细信息 -->\n");
      out.write("\t<div style=\"position: relative; top: -70px;\">\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">所有者</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.owner}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">名称</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 10px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">开始日期</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.startDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">结束日期</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.endDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 20px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">成本</div>\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.cost}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -20px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 30px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">创建者</div>\n");
      out.write("\t\t\t<div style=\"width: 500px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.createBy}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&nbsp;&nbsp;</b><small style=\"font-size: 10px; color: gray;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.createTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</small></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 550px; background: #D5D5D5; position: relative; top: -20px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 40px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">修改者</div>\n");
      out.write("\t\t\t<div style=\"width: 500px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.editBy}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&nbsp;&nbsp;</b><small style=\"font-size: 10px; color: gray;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.editTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</small></div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 550px; background: #D5D5D5; position: relative; top: -20px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 50px;\">\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">描述</div>\n");
      out.write("\t\t\t<div style=\"width: 630px;position: relative; left: 200px; top: -20px;\">\n");
      out.write("\t\t\t\t<b>\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("\t\t\t\t</b>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 850px; background: #D5D5D5; position: relative; top: -20px;\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 备注 -->\n");
      out.write("\t<div id=\"remarkBody\" style=\"position: relative; top: 30px; left: 40px;\">\n");
      out.write("\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t<h4>备注</h4>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"remarkDiv\" style=\"background-color: #E6E6E6; width: 870px; height: 90px;\">\n");
      out.write("\t\t\t<form role=\"form\" style=\"position: relative;top: 10px; left: 10px;\">\n");
      out.write("\t\t\t\t<textarea id=\"remark\" class=\"form-control\" style=\"width: 850px; resize : none;\" rows=\"2\"  placeholder=\"添加备注...\"></textarea>\n");
      out.write("\t\t\t\t<p id=\"cancelAndSaveBtn\" style=\"position: relative;left: 737px; top: 10px; display: none;\">\n");
      out.write("\t\t\t\t\t<button id=\"cancelBtn\" type=\"button\" class=\"btn btn-default\">取消</button>\n");
      out.write("\t\t\t\t\t<button id=\"saveBtn\" type=\"button\" class=\"btn btn-primary\">保存</button>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div style=\"height: 200px;\"></div>\n");
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