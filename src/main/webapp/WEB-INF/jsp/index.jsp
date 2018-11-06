<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>Reader</title>
</head>
<body>
<h2>Hello World!</h2>
${bo}
<form action="${pageContext.request.contextPath}/readeredit" method="post">
<table style="width: 1200px; border: 1px solid red;" >
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
    <tbody style="align-content: center">
    <tr>
        <input type="hidden" name="rid" value="${selectrid.rid}">
        <td>${selectrid.rid}</td>
        <input type="hidden" name="username" value="${selectrid.username}">
        <td>${selectrid.username}</td>
        <input type="hidden" name="sex" value="${selectrid.sex}">
        <td>${selectrid.sex}</td>
        <input type="hidden" name="phone" value="${selectrid.phone}">
        <td>${selectrid.phone}</td>
        <input type="hidden" name="email" value="${selectrid.email}">
        <td>${selectrid.email}</td>
        <input type="hidden" name="address" value="${selectrid.address}">
        <td>${selectrid.address}</td>
        <input type="hidden" name="idcard" value="${selectrid.idcard}">
        <td>${selectrid.idcard}</td>
        <input type="hidden" name="credit" value="${selectrid.credit}">
        <td>${selectrid.credit}</td>
        <input type="hidden" name="money" value="${selectrid.money}">
        <td>${selectrid.money}</td>
        <td>
            <input type="submit" value="修改">
        </td>
    </tr>
    </tbody>
</table>
</form>

<form action="${pageContext.request.contextPath}/lendbook" method="post">
    <input type="text" name="bid" />
    <input type="hidden" name="rid" value="${selectrid.rid}" />
    <input type="submit" value="点击借书">
</form>
<form action="${pageContext.request.contextPath}/repaybook" method="post">
    <input type="text" name="bid" />
    <input type="hidden" name="rid" value="${selectrid.rid}" />
    <input type="submit" value="点击还书">
</form>
</body>
</html>
