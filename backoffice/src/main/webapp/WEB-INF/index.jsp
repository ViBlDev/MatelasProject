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
        
        <a href="Panier">afficher mon panier [ ${ quantite} ]</a> 
        
        <c:if test="${stock.size() == 0}">
            <p> Le stock de matelas est vide ! </p>
        </c:if>
        
        
        <ul>
        <c:forEach items="${ stock}" var="matelas">
            <li>Nom du Matelas: ${matelas.getNom()} Prix : ${matelas.prix} 
                <form method="post" action="panier">
                    <input type="hidden" name="matelasId" value="${matelas.id}"/>
                    <input type="submit" value="Ajouter au panier"/>
                </form> </li>
        </c:forEach>
        </ul>
            
            
            <form method="post" action="index" >
                <label for="nom">Nom</label>
                <input type="text" id="nom" name="nom">
                 <label for="prix">Prix</label>
                <input type="number" id="prix" name="prix">
                <input type="submit">
            </form>
            
            
            <c:choose>
                <c:when test="${ stock.size() == 0 }">C'est vide</c:when>
                <c:when test="${ stock.size() == 1 }">Il y a un matelas</c:when>
                <c:when test="${ stock.size() == 2 }">Il y a 2 matelas</c:when>
                <c:otherwise>Il y a beaucoup de matelas</c:otherwise>
            </c:choose>

    </body>
</html>
