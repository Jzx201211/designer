<%--
  Created by IntelliJ IDEA.
  User: 蒋子旭
  Date: 2022/4/22
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参与抽签</title>
    <style type="text/css">
        *{
            padding: 0;
            margin: 0;
            border: 0;
        }
        .body{
            width: 400px;
            height: 400px;
            margin-top: 50px;
            margin-left: 100px;
            float: left;
            border: black 2px solid;
            border-radius: 15px;
        }
        .body_goodName{
            width: 100%;
            height: 100px;
            float: left;
            font-size: 25px;
            line-height: 100px;
            text-align: center;
        }
        .body_name{
            width: 100%;
            height: 50px;
            line-height: 50px;
            float: left;
            font-size: 20px;
        }
        .body_name input{
            border: black 2px solid;
        }
        .body_submit{
            width: 50px;
            height: 30px;
            font-size: 20px;
            border: black 2px solid;
            margin-top: 20px;
            margin-left: 100px;
            float: left;
        }
        .body_submit:hover{
            color: red;
        }
    </style>
</head>
<body>
    <%
        String goodName = request.getParameter("goodName");
    %>
    <form action="AttendChouQianServlet?goodName=<%=goodName%>" method="post">
        <div class="body">
            <div class="body_goodName"><%=goodName%></div>
            <div class="body_name">收件人名：<input type="text" name="cqName"></div>
            <div class="body_name">收件地址：<input type="text" name="cqDiZhi"></div>
            <div class="body_name">收件电话：<input type="text" name="cqTel"></div>
            <input type="submit" value="提交" class="body_submit">
        </div>
    </form>
</body>
</html>
