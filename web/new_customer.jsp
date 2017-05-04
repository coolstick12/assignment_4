<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
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

                <h3>Contact Us</h3>
                
                <h4 class="error">${error}</h4>

                <form action="NewCustomer" method="post">

                    <label for="myFName">First Name:</label>
                    <input id="myFName" type="text" name="firstname">

                    <label for="myLName">Last Name:</label>
                    <input id="myLName" type="text" name="lastname">

                    <label for="myPhone">Phone:</label>
                    <input id="myPhone" type="text" name="phone">

                    <label for="myAddress">Address:</label>
                    <input id="myAddress"type="text" name="address">

                    <label for="myCity">City:</label>
                    <input id="myCity"type="text" name="city">

                    <label for="myState">State:</label>
                    <input id="myState" type="text" name="state">

                    <label for="myZipcode">Zipcode:</label>
                    <input id="myZipcode" type="text" name="zipcode">

                    <label for="myEmail">Email:</label>
                    <input id="myEmail" type="text" name="email">

                    <input id="mySubmit" type="submit" value="Submit">
                </form>
                <c:import url="/footer.jsp"/>  
            </div>
        </div>
    </body>
</html>