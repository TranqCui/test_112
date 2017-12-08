<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: cuibinbin
  Date: 2017/11/4
  Time: 上午11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <meta charset="utf-8" content="text/html" http-equiv="content-type">
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
//            alert(1111);
            var params = '{"id":1,"username":"测试","money":12000 }';
            $.ajax({
                url:"${pageContext.request.contextPath}/json.action",
                data: params,
                contentType: "application/json;charset=utf-8",
                type:"post",
                dataType:"json",
                success: function(data){
                    alert(${user.username});

                }
            })
        })
    </script>
</head>
<body>

<form action="${pageContext.request.contextPath}/update.action" method="post">
    <input type="hidden" name="id" value="${user.id}">
    <table border="1">
        <tr>
            <td>姓名</td>
            <td>
                <input type="text" name="username" value="${user.username}">
            </td>
        </tr>

        <tr>
            <td>收入</td>
            <td><input type="text" name="money" value="${user.money}"> </td>
        </tr>
        <%--<tr>--%>
            <%--<td>商品价格</td>--%>
            <%--<td><input type="text" name="items.price" value="${item.price }" /></td>--%>
        <%--</tr>--%>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="提交">
            </td>
        </tr>

    </table>

</form>
</body>
</html>
