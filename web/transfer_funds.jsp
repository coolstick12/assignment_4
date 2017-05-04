<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html lang="en">
    <head>
        <title>TOBA</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="toba.css">
    </head>
    <body>
        <%@ page import="JavaBeans.Account" %>
        <%      
            Account checkingAccount =(Account)session.getAttribute("checking");
            Account savingsAccount =(Account)session.getAttribute("savings");
        %>
        
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

                <h3>Transfer Funds</h3>
                
                <span>Savings Account Balance <%= savingsAccount.getBalance() %></span> 
                <br><br>
                <span>Checking Account Balance <%= checkingAccount.getBalance() %></span>  

                <form action="TransferFunds" method="post">

                    <label for="transferAmount">Transfer Amount</label><br>
                    <input id="transferAmount" type="text" name="transferAmount">

                    <input id="mySubmit" type="submit" value="Submit">
                </form>
                <c:import url="/footer.jsp"/>  
            </div>
        </div>
    </body>
</html>