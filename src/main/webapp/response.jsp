<%--
  Created by IntelliJ IDEA.
  User: 石禹钦
  Date: 2019/7/20
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>response</title>
    <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
<a href="response/test1">点我</a><br>
<a href="response/test2">ModelAndView</a><br>
<a href="response/test3">使用关键字进行请求转发</a><br>
<button id="btn1">ajax请求POST</button>
<button id="btn2">ajax请求GET</button><br>
<form action="response/test6" method="post" enctype="multipart/form-data">
    传统：<input type="file" name="file">
    <input type="submit" value="上传">
</form>
<form action="response/test7" method="post" enctype="multipart/form-data">
    springMVC: <input type="file" name="file">
    <input type="submit" value="上传">
</form>
<a href="response/test8">异常处理</a><br>
<a href="response/test9">拦截器</a><br>
</body>
<script>
    $("#btn1").click(function () {
        $.post("response/test4",{"username":"jason","password":"12"},function (data) {
            alert(data.username)
        }, "json")
    });
    $("#btn2").click(function () {
        $.get("response/test5",{"username":"jason","password":"12"},function (data) {
            alert(data.username)
        }, "json")
    })
</script>
</html>
