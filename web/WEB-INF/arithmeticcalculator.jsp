<%-- 
    Document   : arithmeticcalculator
    Created on : 29-Jan-2023, 9:54:57 PM
    Author     : Cyber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator Angelo Hernandez Lab 3</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" name="calc" value="+">
            <input type="submit" name="calc" value="-">
            <input type="submit" name="calc" value="*">
            <input type="submit" name="calc" value="%"><br>
        </form>
        <p>
            Result: ${message}
        </p>
        <a href="age">Age Calculator</a>
    </body>
</html>
