<%--
  Created by IntelliJ IDEA.
  User: wind
  Date: 2021/1/7
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--请求参数绑定
    <a href="param/testParam?username=hehe&password=123456">请求参数绑定</a>
    把数据封装在Account类中
    <form action="param/savaAccount" method="post">
        姓名:<input type="text" name="username">
        密码:<input type="text" name="password">
        金额:<input type="text" name="money">
        用户姓名:<input type="text" name="user.name">
        用户年龄:<input type="text" name="user.age">
        <input type="submit" value="提交">
    </form>
    --%>
    <%--
    <form action="param/savaAccount" method="post">
        姓名:<input type="text" name="username"><br>
        密码:<input type="text" name="password"><br>
        金额:<input type="text" name="money"><br>
        用户姓名:<input type="text" name="list[0].name"><br>
        用户年龄:<input type="text" name="list[0].age"><br>

        用户姓名:<input type="text" name="map['one'].name"><br>
        用户年龄:<input type="text" name="map['one'].age"><br>
        <input type="submit" value="提交">
    </form>
    --%>

    <form action="param/savaUser" method="post">
        姓名:<input type="text" name="username"><br>
        密码:<input type="text" name="password"><br>
        生日:<input type="text" name="date">
        <input type="submit" value="提交">
    </form>
</body>
</html>
