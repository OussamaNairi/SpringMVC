<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Liste des projets</h1>
<h3>Le departement : ${dept.nom }</h3>
<table border="1">
<tr>
<th>ID</th><th>Titre</th><th>Etat</th><th></th>
<c:forEach items="${liste }" var="p">
<tr>
<td>${p.id }</td><td>${p.titre}</td>
<td>${p.etat} </td>
<td></td>

</tr>

</c:forEach>
</tr>
</table>
</body>
</html>