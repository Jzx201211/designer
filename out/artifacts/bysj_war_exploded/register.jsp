<%--
  Created by IntelliJ IDEA.
  User: 蒋子旭
  Date: 2022/4/17
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" href="login.css">
    <title>用户注册界面</title>
</head>
<body>
<%
    String tips = (String) request.getAttribute("tips");
    if(tips!=null){
%>

<script>

    alert("<%=tips%>");

</script>
<%
    }
%>
<section>

    <!-- 背景颜色 -->
    <div class="color"></div>
    <div class="color"></div>
    <div class="color"></div>
    <div class="box">
        <!-- 背景圆 -->
        <div class="circle" style="--x:0"></div>
        <div class="circle" style="--x:1"></div>
        <div class="circle" style="--x:2"></div>
        <div class="circle" style="--x:3"></div>
        <div class="circle" style="--x:4"></div>
        <!-- 登录框 -->
        <div class="container">

            <div class="form">
                <h2>注册</h2>
                <form method="post" action="RegisterServlet">
                    <div class="inputBox">
                        <input type="text" placeholder="用户名" name="userName">
                    </div>
                    <div class="inputBox">
                        <input type="password" placeholder="密码" name="userPwd">
                    </div>
                    <div class="inputBox">
                        <input type="submit" value="注册">
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
</body>
</html>
