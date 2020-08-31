<%--
  Created by IntelliJ IDEA.
  User: 石禹钦
  Date: 2019/7/19
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<a href="test/hello?username=test1">入门</a>
<form action="test/saveUser" method="post">
    姓名：<input type="text" name="username">
    密码：<input type="password" name="password">
    生日：<input type="text" name="birthday">
    账户姓名：<input type="text" name="accountList[0].username">
    金额：<input type="number" name="accountList[0].money">
    账户姓名：<input type="text" name="accountMap['one'].username">
    金额：<input type="number" name="accountMap['one'].money">
    <input type="submit" value="提交">
</form>
</body>
</html>
