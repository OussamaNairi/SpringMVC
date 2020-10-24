<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:url value="/resources/files/bootstrap" var="bt" />
<link rel="stylesheet" href="${bt}/css/bootstrap.min.css">

<div class="container">
<div class="panel panel-danger">
<div class="panel-heading">Gestion des Projets</div>
<div class="panel-body">
<h1>Liste des départements</h1>

<table class="table table-hover">
<thead>
<tr>
<th>ID</th><th>NOM</th><th></th><th></th>
</thead>
<c:forEach items="${liste }" var="d">
<tr>
<td>${d.id }</td><td>${d.nom}</td>
<td><a class="btn btn-info" href="projets/${d.id }">Liste des projets</a></td>
<td><a class="btn btn-info" href="employes/${d.id }">Liste des employes</a></td>


</tr>

</c:forEach>
</tr>
</table>
<p> <a href="ajoutProjet">Ajouter un Projet</a></p>
<p> <a href="ajoutEmploye">Ajouter un Employe</a></p>
</div>
</div>
</div>

</body>
</html>