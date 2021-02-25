<%--
  Created by IntelliJ IDEA.
  User: wind
  Date: 2021/1/8
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.min.js"></script>
    <script>
        //页面加载，绑定单击事件
        $(function () {
            $("#btn").click(function () {
                alert("hello btn")
                //发送ajax请求
                $.ajax({
                    //编写json格式，设置属性和值
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"jack","password":"123","age":20}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        //data服务器端响应的json数据，进行解析
                    }
                })
            })
        })
    </script>
</head>
<body>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>

    <a href="user/testString">testString</a>
</body>
</html>
