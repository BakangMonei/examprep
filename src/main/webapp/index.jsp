<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello Neiza!" %></h1>
<br/>

<form action="hello-servlet" method="post">
    <h2>Username</h2>
    <input type="text" name="userid" placeholder="Enter username here "  data-validate = "Username is required">

    <h2>Password</h2>
    <input type="password" name="password" placeholder="Password"  data-validate = "Password is required">
    <button type="submit" name="Submitting">Sign In</button>
</form>
</body>
</html>