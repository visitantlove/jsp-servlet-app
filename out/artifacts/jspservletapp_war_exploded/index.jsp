<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
<form method="get" action="login.do">
    username : <input name="name"><br>
    age : <input name="age">
    result: ${name}  ${age}
    <br>
    <input type="submit">
</form>
</body>
</html>
