<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>TOBA</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="toba.css">
    </head>
    <body>
        <div id="wrapper">
            <c:import url="/header.html"/>  
            <div id="nav">
                <ul> 
                    <li><a href="login.jsp">Login</a></li>
                    <li><a href="new_customer.jsp">New customer</a></li>
                    <li><a href="success.jsp">Success</a></li>
                    <li><a href="account_activity.jsp">Account</a></li>
                    <li><a href="transaction.jsp">Transaction</a></li>
                </ul> 
            </div>

            <div id="content">
                <h2>TOBA</h2>
                <h3>Transaction</h3>


                <div class="clear"> 
                    <br>
                    TOBA
                    <br>
                    888-555-5555
                    <br>
                </div>

                <c:import url="/footer.jsp"/>  
            </div>
        </div>
    </body>
</html>
