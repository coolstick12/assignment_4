<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>Reset Password</h1>

        <form action="Password" method="post">
            <label for="password">New Password:</label>
            <input id="newpassword" type="password" name="newpassword">
            <label for="confirmpassword">Confirm Password:</label>
            <input id="confimpassword" type="password" name="confirmpassword">
            <input id="mySubmit" type="submit" value="Submit">
        </form>
    </body>
</html>
