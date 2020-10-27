<%--
  Created by IntelliJ IDEA.
  User: minjunpark
  Date: 2020-10-27
  Time: 오전 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
Login Page
<form action="login" method="post">
    <input type="text" name="id" placeholder="아이디">
    <input type="password" name="pw" placeholder="비밀번호">
    <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
    <button type="submit">로그인</button>
    <a href="register">회원 가입</a>
</form>
</body>
</html>
