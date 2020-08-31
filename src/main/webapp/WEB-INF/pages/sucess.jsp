<%--
  Created by IntelliJ IDEA.
  User: 石禹钦
  Date: 2019/7/19
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>sucess</title>
</head>
<body>
<h3>sucess</h3>
<h1>${requestScope.msg}</h1>
<h1>${sessionScope.msg}</h1>
<%System.out.println("JSP执行了");%>
</body>
</html>
