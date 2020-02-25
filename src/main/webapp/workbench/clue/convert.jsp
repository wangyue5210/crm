<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath%>">
<meta charset="UTF-8">

<link href="jquery/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="jquery/jquery-1.11.1-min.js"></script>
<script type="text/javascript" src="jquery/bootstrap_3.3.0/js/bootstrap.min.js"></script>


<link href="jquery/bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.min.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="jquery/bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.js"></script>
<script type="text/javascript" src="jquery/bootstrap-datetimepicker-master/locale/bootstrap-datetimepicker.zh-CN.js"></script>

<script type="text/javascript">
	$(function(){

		$(".time").datetimepicker({
			minView: "month",
			language:  'zh-CN',
			format: 'yyyy-mm-dd',
			autoclose: true,
			todayBtn: true,
			pickerPosition: "bottom-left"
		});



		$("#isCreateTransaction").click(function(){
			if(this.checked){
				$("#create-transaction2").show(200);
			}else{
				$("#create-transaction2").hide(200);
			}
		});

		//为市场活动源的"放大镜"图标，绑定事件，打开搜索市场活动的模态窗口
		$("#openSearchModalBtn").click(function () {

			$("#searchActivityModal").modal("show");

		})

		//为搜索市场活动的文本框绑定敲键盘事件，如果敲的是回车键，搜索市场活动列表
		$("#aname").keydown(function (event) {

			if(event.keyCode==13){

				//查询并展现市场活动列表
				$.ajax({

					url : "workbench/clue/getActivityListByName.do",
					data : {

						"aname" : $.trim($("#aname").val())

					},
					type : "get",
					dataType : "json",
					success : function (data) {

						/*

							data
								[{市场活动1},{2},{3}]

						 */

						var html = "";

						$.each(data,function (i,n) {

							html += '<tr>';
							html += '<td><input type="radio" name="xz" value="'+n.id+'"/></td>';
							html += '<td id="'+n.id+'">'+n.name+'</td>';
							html += '<td>'+n.startDate+'</td>';
							html += '<td>'+n.endDate+'</td>';
							html += '<td>'+n.owner+'</td>';
							html += '</tr>';

						})



						$("#activitySearchBody").html(html);

					}

				})


				//以上市场活动搜索并展现完毕，不要忘记及时终止当前方法
				return false;

			}

		})

		//为搜索市场活动的提交按钮绑定事件，提交市场活动名称以及提交市场活动id
		$("#submitBtn").click(function () {

			var $xz = $("input[name=xz]:checked");
			if($xz.length==0){

				alert("请选择一条市场活动");

				//选了1条
			}else{

				//取得选中的id
				var id = $xz.val();

				//取得选中的市场活动名称
				var name = $("#"+id).html();

				//将选中的市场活动id和name，赋值到交易表单的市场活动源的相应的元素中
				$("#activityId").val(id);
				$("#activityName").val(name);

				//关闭搜索市场活动的模态窗口
				$("#searchActivityModal").modal("hide");

			}



		})

		//为转换按钮绑定事件，执行线索的转换操作
		$("#convertBtn").click(function () {

			/*

				要为后台发出线索转换的请求，应该发送一个ajax请求呢？还是传统请求？

				在该页面中不需要任何局部刷新的操作，所以我们发出一个传统请求即可


			 */

			//window.location.href = "workbench/clue/convert.do?clueId=xxx";

			/*

				以下分支是为了判断是否需要创建交易，
				但是不论创建交易与否，我们都要做的是线索的转换操作
				同时，需要转换的线索clueId，也必须传递到后台


			 */


			if($("#isCreateTransaction").prop("checked")){

				//alert("挑√了，需要在线索转换的同时，创建一笔交易");
				/*

					如果需要创建交易，那么我们除了为后台传递clueId之外，还需要为后台传递 交易表单中的参数

				 */
				//直接挂载这些参数很麻烦
				//window.location.href = "workbench/clue/convert.do?clueId=xxx&money=xxx&name=xxx&expectedDate=xxx&.....";

				//以提交交易表单的形式，来发出本次传统请求
				//取得交易表单，提交表单
				$("#tranForm").submit();


			}else{

				//alert("没有挑√，只转换线索即可，不需要创建交易");
				window.location.href = "workbench/clue/convert.do?clueId=${param.id}";
			}


		})



	});
</script>

</head>
<body>
	
	<!-- 搜索市场活动的模态窗口 -->
	<div class="modal fade" id="searchActivityModal" role="dialog" >
		<div class="modal-dialog" role="document" style="width: 90%;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">搜索市场活动</h4>
				</div>
				<div class="modal-body">
					<div class="btn-group" style="position: relative; top: 18%; left: 8px;">
						<form class="form-inline" role="form">
						  <div class="form-group has-feedback">
						    <input id="aname" type="text" class="form-control" style="width: 300px;" placeholder="请输入市场活动名称，支持模糊查询">
						    <span class="glyphicon glyphicon-search form-control-feedback"></span>
						  </div>
						</form>
					</div>
					<table id="activityTable" class="table table-hover" style="width: 900px; position: relative;top: 10px;">
						<thead>
							<tr style="color: #B3B3B3;">
								<td></td>
								<td>名称</td>
								<td>开始日期</td>
								<td>结束日期</td>
								<td>所有者</td>
								<td></td>
							</tr>
						</thead>
						<tbody id="activitySearchBody">
<%--							<tr>--%>
<%--								<td><input type="radio" name="activity"/></td>--%>
<%--								<td>发传单</td>--%>
<%--								<td>2020-10-10</td>--%>
<%--								<td>2020-10-20</td>--%>
<%--								<td>zhangsan</td>--%>
<%--							</tr>--%>
<%--							<tr>--%>
<%--								<td><input type="radio" name="activity"/></td>--%>
<%--								<td>发传单</td>--%>
<%--								<td>2020-10-10</td>--%>
<%--								<td>2020-10-20</td>--%>
<%--								<td>zhangsan</td>--%>
<%--							</tr>--%>
						</tbody>
					</table>
				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-primary" id="submitBtn">提交</button>
				</div>
			</div>
		</div>
	</div>

	<div id="title" class="page-header" style="position: relative; left: 20px;">
		<h4>转换线索 <small>${param.fullname}${param.appellation}-${param.company}</small></h4>
	</div>
	<div id="create-customer" style="position: relative; left: 40px; height: 35px;">
		新建客户：${param.company}
	</div>
	<div id="create-contact" style="position: relative; left: 40px; height: 35px;">
		新建联系人：${param.fullname}${param.appellation}
	</div>
	<div id="create-transaction1" style="position: relative; left: 40px; height: 35px; top: 25px;">
		<input type="checkbox" id="isCreateTransaction"/>
		为客户创建交易
	</div>
	<div id="create-transaction2" style="position: relative; left: 40px; top: 20px; width: 80%; background-color: #F7F7F7; display: none;" >

		<input type="hidden" name="flag" value="a"/>


		<input type="hidden" name="clueId" value="${param.id}"/>
	
		<form id="transForm" action="workbench/clue/convert.do" method="post">
		  <div class="form-group" style="width: 400px; position: relative; left: 20px;">
		    <label for="amountOfMoney">金额</label>
		    <input type="text" class="form-control" id="amountOfMoney" name="money">
		  </div>
		  <div class="form-group" style="width: 400px;position: relative; left: 20px;">
		    <label for="tradeName">交易名称</label>
		    <input type="text" class="form-control" id="tradeName" name="name">
		  </div>
		  <div class="form-group" style="width: 400px;position: relative; left: 20px;">
		    <label for="expectedClosingDate">预计成交日期</label>
		    <input type="text" class="form-control time" id="expectedClosingDate" name="expectedDate">
		  </div>
		  <div class="form-group" style="width: 400px;position: relative; left: 20px;">
		    <label for="stage">阶段</label>
		    <select id="stage"  class="form-control" name="stage/">
		    	<option></option>
		    	<c:forEach items="${stageList}" var="s">
					<option value="${s.value}">${s.text}</option>
				</c:forEach>
		    </select>
		  </div>
		  <div class="form-group" style="width: 400px;position: relative; left: 20px;">
		    <label for="activity">市场活动源&nbsp;&nbsp;<a href="javascript:void(0);" id="openSearchModalBtn" style="text-decoration: none;"><span class="glyphicon glyphicon-search"></span></a></label>
		    <input type="text" class="form-control" id="activityName" placeholder="点击上面搜索" readonly>
			  <input type="hidden" id="activityId" name="activityId"/>
		  </div>
		</form>
		
	</div>
	
	<div id="owner" style="position: relative; left: 40px; height: 35px; top: 50px;">
		记录的所有者：<br>
		<b>zhangsan</b>
	</div>
	<div id="operation" style="position: relative; left: 40px; height: 35px; top: 100px;">
		<input class="btn btn-primary" id="convertBtn" type="button" value="转换">
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input class="btn btn-default" type="button" value="取消">
	</div>
</body>
</html>