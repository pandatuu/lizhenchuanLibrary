<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="aaa" uri="http://itcast.cn/common/"  %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html >
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>图书管理系统</title>

<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet">

<!-- DataTables CSS -->
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet"
	type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html">BOOT客户管理系统 v2.0</a>
		</div>
		<!-- /.navbar-header -->

		<ul class="nav navbar-top-links navbar-right">
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-tasks fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-tasks">
					<li><a href="#">
							<div>
								<p>
									<strong>任务 1</strong> <span class="pull-right text-muted">完成40%</span>
								</p>
								<div class="progress progress-striped active">
									<div class="progress-bar progress-bar-success"
										role="progressbar" aria-valuenow="40" aria-valuemin="0"
										aria-valuemax="100" style="width: 40%">
										<span class="sr-only">完成40%</span>
									</div>
								</div>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<p>
									<strong>任务 2</strong> <span class="pull-right text-muted">完成20%</span>
								</p>
								<div class="progress progress-striped active">
									<div class="progress-bar progress-bar-info" role="progressbar"
										aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
										style="width: 20%">
										<span class="sr-only">完成20%</span>
									</div>
								</div>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a class="text-center" href="#"> <strong>查看所有任务</strong>
							<i class="fa fa-angle-right"></i>
					</a></li>
				</ul> <!-- /.dropdown-tasks --></li>
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-bell fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-alerts">
					<li><a href="#">
							<div>
								<i class="fa fa-comment fa-fw"></i> 新回复 <span
									class="pull-right text-muted small">4分钟之前</span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-envelope fa-fw"></i> 新消息 <span
									class="pull-right text-muted small">4分钟之前</span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-tasks fa-fw"></i> 新任务 <span
									class="pull-right text-muted small">4分钟之前</span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-upload fa-fw"></i> 服务器重启 <span
									class="pull-right text-muted small">4分钟之前</span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a class="text-center" href="#"> <strong>查看所有提醒</strong>
							<i class="fa fa-angle-right"></i>
					</a></li>
				</ul> <!-- /.dropdown-alerts --></li>
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-user">
					<li><a href="#"><i class="fa fa-user fa-fw"></i> 用户设置</a></li>
					<li><a href="#"><i class="fa fa-gear fa-fw"></i> 系统设置</a></li>
					<li class="divider"></li>
					<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>
							退出登录</a></li>
				</ul> <!-- /.dropdown-user --></li>
			<!-- /.dropdown -->
		</ul>
		<!-- /.navbar-top-links -->

		<div class="navbar-default sidebar" role="navigation">
			<div class="sidebar-nav navbar-collapse">
				<ul class="nav" id="side-menu">
					<li class="sidebar-search">
						<div class="input-group custom-search-form">
							<input type="text" class="form-control" placeholder="查询内容...">
							<span class="input-group-btn">
								<button class="btn btn-default" type="button">
									<i class="fa fa-search" style="padding: 3px 0 3px 0;"></i>
								</button>
							</span>
						</div> <!-- /input-group -->
					</li>
					<li><a href="customer.action" class="active"><i
							class="fa fa-edit fa-fw"></i> 客户管理</a></li>
					<li><a href="salevisit.action"><i
							class="fa fa-dashboard fa-fw"></i> 客户拜访</a></li>
				</ul>
			</div>
			<!-- /.sidebar-collapse -->
		</div>
		<!-- /.navbar-static-side --> </nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">读者管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">读者信息列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>ID</th>
									<th>读者名称</th>
									<th>读者性别</th>
									<th>读者电话</th>
									<th>读者邮箱</th>
									<th>联系地址</th>
									<th>读者身份证</th>
									<th>信用分</th>
									<th>读者余额</th>
                                    <th></th>
								</tr>
							</thead>
							<tbody>
									<tr>
										<td>${selectrid.rid}</td>
										<td>${selectrid.username}</td>
										<td>${selectrid.sex}</td>
										<td>${selectrid.phone}</td>
										<td>${selectrid.email}</td>
										<td>${selectrid.address}</td>
										<td>${selectrid.idcard}</td>
                                        <td>${selectrid.credit}</td>
                                        <td>${selectrid.money}</td>
                                        <td>
                                            <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer(${selectrid.rid})">修改</a>
                                        </td>
									</tr>
							</tbody>
						</table>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">订单管理</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <div class="panel panel-default">
                <div class="panel-body">
                    <form class="form-inline" action="${pageContext.request.contextPath }/list" method="post">
                        <div class="form-group">
                            <label for="rid">读者ID</label>
                            <input type="text" class="form-control" id="rid" value="${selectrid.rid}" name="id">
                        </div>
                        <div class="form-group">
                            <label for="typeName">订单类型</label>
                            <select	class="form-control" id="typeName" placeholder="订单类型" name="typeName">
                                <option value="">--请选择--</option>
                                <c:forEach items="${fromType}" var="item">
                                    <option value="${item.typeName}">${item.typeName}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary">查询</button>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">读者信息列表${queryvo.typeName}</div>
                        <!-- /.panel-heading -->
                        <table class="table table-bordered table-striped">
                            <c:choose>
                                <<c:when test="${queryvo.typeName=='lend'}">
                                <tbody>
                                <c:forEach items="${page.rows}" var="row">
                                    <tr>
                                        <td>${row.rid}</td>
                                        <td>${row.bid}</td>
                                        <td>${row.lid}</td>
                                        <td>${row.mid}</td>
                                        <td>${row.actualtime}</td>
                                        <td>${row.predicttime}</td>
                                        <td>${row.actualrepaytime}</td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${row.repaystate==0}">未还</c:when>
                                                <c:otherwise>已还</c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${row.overduestate==1}">逾期</c:when>
                                                <c:otherwise>未逾期</c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td>
                                            <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer(${row.rid})">修改</a>
                                            <a href="#" class="btn btn-danger btn-xs" onclick="deleteCustomer(${row.rid})">删除</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                                </c:when>
                                <c:otherwise>
                                    <c:if test="${queryvo.typeName.equals('mail')}">
                                        <tbody>
                                        <c:forEach items="${page.rows}" var="row">
                                            <tr>
                                                <td>${row.rid}</td>
                                                <td>${row.bid}</td>
                                                <td>${row.mid}</td>
                                                <td>${row.address}</td>
                                                <td>${row.phone}</td>
                                                <td>${row.wNumber}</td>
                                                <td>
                                                    <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer(${row.rid})">修改</a>
                                                    <a href="#" class="btn btn-danger btn-xs" onclick="deleteCustomer(${row.rid})">删除</a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </c:if>
                                    <c:if test="${queryvo.typeName.equals('appointment')}">
                                        <tbody>
                                        <c:forEach items="${page.rows}" var="row">
                                            <tr>
                                                <td>${row.rid}</td>
                                                <td>${row.bid}</td>
                                                <td>${row.oid}</td>
                                                <td>${row.appointmentTIme}</td>
                                                <td>
                                                    <c:choose>
                                                        <c:when test="${row.appointmentState==0}">未借走</c:when>
                                                        <c:otherwise>已借走</c:otherwise>
                                                    </c:choose>
                                                </td>
                                                <td>
                                                    <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer(${row.rid})">修改</a>
                                                    <a href="#" class="btn btn-danger btn-xs" onclick="deleteCustomer(${row.rid})">删除</a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </c:if>
                                </c:otherwise>
                            </c:choose>
                        </table>
                        <div class="col-md-12 text-right">
                            <aaa:page url="${pageContext.request.contextPath }/list.action" />
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- 客户编辑对话框 -->
	<div class="modal fade" id="customerEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改读者信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_customer_form">
						<input type="hidden" id="id" name="id"/>

						<div class="form-group">
							<label for="edit_linkMan" class="col-sm-2 control-label">联系人</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_linkMan" placeholder="联系人" name="cust_linkman">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_phone" class="col-sm-2 control-label">固定电话</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_phone" placeholder="固定电话" name="cust_phone">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_mobile" class="col-sm-2 control-label">移动电话</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_mobile" placeholder="移动电话" name="cust_mobile">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_zipcode" class="col-sm-2 control-label">邮政编码</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_zipcode" placeholder="邮政编码" name="cust_zipcode">
							</div>
						</div>
						<div class="form-group">
							<%--<label for="edit_address" class="col-sm-2 control-label">联系地址</label>--%>
							<%--<div class="col-sm-10">--%>
								<%--<input type="text" class="form-control" id="edit_address" placeholder="联系地址" name="cust_address">--%>
							<%--</div>--%>
						</div>
					</form>
				</div>
				<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary" onclick="updateCustomer()">保存修改</button>
			</div>
			</div>
		</div>
	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
	
	<script type="text/javascript">
		function editCustomer(id) {
			$.ajax({
				type:"get",
				url:"<%=basePath%>/edit.action",
				data:{"id":id},
				success:function(data) {
					$("#edit_cust_id").val(data.cust_id);
					$("#edit_customerName").val(data.cust_name);
					$("#edit_customerFrom").val(data.cust_source)
					$("#edit_custIndustry").val(data.cust_industry)
					$("#edit_custLevel").val(data.cust_level)
					$("#edit_linkMan").val(data.cust_linkman);
					$("#edit_phone").val(data.cust_phone);
					$("#edit_mobile").val(data.cust_mobile);
					$("#edit_zipcode").val(data.cust_zipcode);
					$("#edit_address").val(data.cust_address);
					
				}
			});
		}
		function updateCustomer() {
			$.post("<%=basePath%>/update.action",$("#edit_customer_form").serialize(),function(data){
				alert("客户信息更新成功！");
				window.location.reload();
			});
		}
		
		function deleteCustomer(id) {
			if(confirm('确实要删除该客户吗?')) {
				$.post("<%=basePath%>/delete.action",{"id":id},function(data){
					alert("客户删除更新成功！");
					window.location.reload();
				});
			}
		}
	</script>

</body>

</html>
