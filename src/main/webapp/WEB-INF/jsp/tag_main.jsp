<%--
  Created by IntelliJ IDEA.
  User: cuibinbin
  Date: 2017/11/12
  Time: 下午4:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
your referer header is ${header.referer}
<tags:doBodyDemo>
    ${header.referer}
</tags:doBodyDemo>
<a href="tag_viewReferer.jsp">View</a>
</body>
</html>
