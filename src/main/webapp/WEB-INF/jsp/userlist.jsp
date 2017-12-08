<%--
  Created by IntelliJ IDEA.
  User: cuibinbin
  Date: 2017/11/3
  Time: 上午11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="delete.action">
    <table border="1">
        <tr>
            <td><input type="checkbox" name="ids" value=""> </td>
            <td>编号</td>
            <td>姓名</td>
            <td>钱</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="user" varStatus="users">
            <tr>
                <td><input type="checkbox" name="ids" value="${user.id}"> </td>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <%--<td>${user.money}</td>--%>
                <td> <input type="text" value="${user.money}"></td>
                <td><a href="${pageContext.request.contextPath}/detail.action?id=${user.id}">修改</a> </td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="删除">
</form>
</body>
</html>
