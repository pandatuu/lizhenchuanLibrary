<%--
  Created by IntelliJ IDEA.
  User: 39538
  Date: 2018/11/6
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>邮寄</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/ismail">
    <input type="hidden" name="bid" value="${reader.bid}">
    <input type="hidden" name="rid" value="${reader.rid}">
    <input type="submit" value="邮寄">
</form>
<form action="${pageContext.request.contextPath}/lend">
    <input type="hidden" name="bid" value="${reader.bid}">
    <input type="hidden" name="rid" value="${reader.rid}">
    <input type="submit" value="直接借书">
</form>
</body>
</html>
