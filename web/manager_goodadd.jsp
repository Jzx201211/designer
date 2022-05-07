<%--
  Created by IntelliJ IDEA.
  User: 蒋子旭
  Date: 2022/4/21
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品</title>
    <style type="text/css">
        *{
            padding: 0;
            margin: 0;
            border: 0;
        }
        .body{
            margin-top: 50px;
            margin-left: 50px;
            width: 300px;
            height: 400px;
            border: black 2px solid;
            border-radius: 25px;
        }
        .body_box{
            width: 100%;
            height: 50px;
            float: left;
            line-height: 50px;
        }
        .body_box input{
            border: black 2px solid;
        }
    </style>
</head>
<body>
<div class="body">
    <form  method="post" action="GoodInsertServlet" target="maintext">
        <div class="body_box"></div>
        <div class="body_box">
            <p>商品品牌：<input type="text" name="brandName"></p>
        </div>
        <div class="body_box">
            <p>商品名称：<input name="goodName" type="text"></p>
        </div>
        <div class="body_box">
            <p>商品简介：<input name="goodDesc" type="text"></p>
        </div>
        <div class="body_box">
            <p>商品价格：<input name="goodPrice" type="text"></p>
        </div>
        <div class="body_box">
            <p>商品图片链接：<input name="goodImg" type="text"></p>
        </div>
        <div class="body_box">
            <p>商品库存：<input name="goodStock" type="text"></p>
        </div>
        <div class="body_box" style="text-align: center">
            <input type="submit" value="提交" >
        </div>
    </form>
</div>
</body>
</html>
