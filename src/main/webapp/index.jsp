<%@ page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Java</title>
</head>
<body>
<div class="page-container" onsubmit="return confirm(this)">
    <form name="myForm" action="${pageContext.request.contextPath}/accountController/selectAll" method="get">
        <table border="1" align="center" >
            <tr>
                <td>Java</td>
            </tr>
            <br/>
            <tr>
                <td>用户名:</td>
                <td>
                    <input type="text" name="username" class="username" placeholder="请输入你的用户名"/>
                </td>
            </tr>
            <br/>
            <tr>
                <td>密码:</td>
                <td>
                    <input type="password" name="password" class="password-field" placeholder="请输入你的密码"/>
                </td>
            </tr>
            <br/>
            <tr>
                <td >
                    <button type="submit" onclick="confirm()">登录</button>
                </td>
            </tr>
        </table>
    </form>
</div>
<script type="text/javascript">
    function confirm() {
        var username = myForm.username.value;
        var password = myForm.password.value;
        if (username == null) {
            alert("用户名不能为空");
            return false;
        }else if(username !== "java"){
            alert("用户名错误");
            return false;
        }else {
            return true;
        }

        if (password == null) {
            alert("密码不能为空");
            return false;
        }else if(password !== "123"){
            alert("密码错误");
            return false;
        }else {
            return true;
        }
    }
</script>
</body>
</html>
