
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath();
%>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="<%=basePath%>/user/reg.do" method="post">
    <div>用户名：<input type="text" name="username" ></div>
    <div>密码： <input type="password" name="pass" ></div>
    <div>手机号：<input type="text" name="mobile" ></div>
    <div><input type="submit" value="注册" ></div>
</form>
</body>
</html>
