<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- WebContent/register.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
    <form action="RegisterServlet" method="post">
        Email: <input type="text" name="email"><br>
        Password: <input type="password" name="password"><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
    