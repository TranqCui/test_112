<%--
  Created by IntelliJ IDEA.
  User: cuibinbin
  Date: 2017/11/2
  Time: 下午4:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" >
    <table border="1">
        <tr>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>收入</td>
            <td>入职时间</td>
        </tr>
        <c:forEach items="${itemList}" var="item">
            <tr>
                <td>${item.username}</td>
                <td>${item.sex}</td>
                <td>${item.age}</td>
                <td>${item.salary}</td>
                    <%--<td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate> </td>--%>
                <td>${item.createTime}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
