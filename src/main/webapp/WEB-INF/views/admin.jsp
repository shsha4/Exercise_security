<%--
  Created by IntelliJ IDEA.
  User: minjunpark
  Date: 2020-10-27
  Time: 오전 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>ADMIN</title>
</head>
<body>
Admin Page
<sec:authorize access="isAuthenticated()">
    <a href="#" onclick="document.getElementById('logout').submit();">로그아웃</a>
</sec:authorize>


<form id="logout" action="logout" method="POST">
    <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
</form>
</body>
</html>
