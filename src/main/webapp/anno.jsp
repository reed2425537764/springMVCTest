<%--
  Created by IntelliJ IDEA.
  User: 石禹钦
  Date: 2019/7/19
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>anno</title>
</head>
<body>
<a href="anno/test1?username=json">RequestParam</a><br>
<form action="anno/test2" method="post">
    姓名：<input type="text" name="username">
    密码：<input type="password" name="password">
    <input type="submit" value="RequestBody">
</form>
<a href="anno/test3/121234">PathVariable</a><br>
<a href="anno/test4">RequestHeader</a><br>
<a href="anno/test5">CookieValue</a><br>
<form action="anno/test6" method="get">
    姓名：<input type="text" name="username">
    <input type="submit" value="ModelAttribute">
</form>
<a href="anno/test7">model</a><br>
<a href="anno/test8">modelMap</a><br>
</body>
</html>
