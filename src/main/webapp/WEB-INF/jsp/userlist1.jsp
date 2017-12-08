<%--
  Created by IntelliJ IDEA.
  User: cuibinbin
  Date: 2017/11/6
  Time: 下午2:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="user">
        用户名：　<form:input path="username"></form:input><br>
        金钱：<form:input path="money"></form:input><br>
        <input type="submit" value="注册" name="submitUser">
    </form:form>
</body>
</html>
