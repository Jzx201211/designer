<%--
  Created by IntelliJ IDEA.
  User: 蒋子旭
  Date: 2022/4/23
  Time: 3:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>中签情况</title>
</head>
<body>
    <c:if test="${zqList!=null}">
        <c:forEach items="${zqList}" var="zq">
            ${zq.goodName}
        </c:forEach>
    </c:if>
</body>
</html>
