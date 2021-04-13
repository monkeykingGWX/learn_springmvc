<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<form method="post" action="user/m2.do" >
    <input name="name" value="" placeholder="姓名" />
    <input name="age" value="" placeholder="年龄" />
    <input type="submit" value="sub" />
</form>
<p><img src="${pageContext.request.contextPath}/static/1.png" /></p>
<button id="ajax" type="button">发送ajax请求</button>
<script src="${pageContext.request.contextPath}/static/jquery.js"></script>
<script>
    $("#ajax").click(function ()
    {
        $.ajax({
            type:"post",
            url:"${pageContext.request.contextPath}/user/m8.do",
            dataType:"json",
            data:{},
            success:function (res) {
                console.log(res)
            }
        })
    });
</script>
</body>
</html>
