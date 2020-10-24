<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Ajouter un Employe</h2>
<form:form method="POST"  action="saveEmploye" modelAttribute="pr">
  <p>Nom: <form:input path="nom" /></p>

  <p> Departement : 
     <form:select path="dept.id" items="${depts }" itemLabel="nom" itemValue="id" /> </p>
 <p> Projet : 
      <form:select path="proj.id" items="${projets }" itemLabel="titre" itemValue="id" /> </p>
     <p>  <input type="submit" value="Enregister" /> </p>
</form:form>
</body>
</html>