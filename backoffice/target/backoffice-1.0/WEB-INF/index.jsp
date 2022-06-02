<%-- 
    Document   : Index
    Created on : 2 juin 2022, 11:31:30
    Author     : Administrateur
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Back Office</title>
    </head>
    <body>
        <h1>Back Office</h1>
        
        <p> ${ stock.size() } </p>
        
        <p><c:out value="Hello"/></p>
        
    </body>
</html>
