<%-- 
    Document   : agecalculator
    Created on : 29-Jan-2023, 9:21:36 PM
    Author     : Cyber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 3 Lab Angelo Hernandez Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="number" name="ageInput" value="${number}"><br>
            <input type="submit" value="Age next birthday"><br>
        </form>
        <p>
            ${message}
        </p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
