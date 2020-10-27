<%--
  Created by IntelliJ IDEA.
  User: minjunpark
  Date: 2020-10-27
  Time: 오후 3:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register User</title>
</head>
<body>
<form action="register" method="post">
    <div> id <input type="text" name="user_id" /> </div>
    <div> pw <input type="password" name="user_pw" /> </div>
    <div> name <input type="text" name="user_name" /> </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <div> <input type="submit" value="회원가입"/> </div>
</form>
</body>
</html>
