<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: CZY
  Date: 2021/5/3
  Time: 0:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
    <title>跳转界面</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>创建时间</th>
        <th>更新时间</th>
        <th>是否删除</th>
        <th>真实姓名</th>
        <th>账号</th>
        <th>密码</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.user_id}</td>
            <td>${user.create_time}</td>
            <td>${user.update_time}</td>
            <td>${user.is_deleted}</td>
            <td>${user.real_name}</td>
            <td>${user.account}</td>
            <td>${user.pass_word}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
