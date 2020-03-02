<%--
  Created by IntelliJ IDEA.
  User: FrederikDahl
  Date: 01/03/2020
  Time: 22.31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1> Velkommen du er nu på min side</h1>

<p> Du er logget ind med navnet : ${requestScope.minAtribut}</p>

<br>
<p> Her kommer en liste af de hårde drenge</p>
<br>
<c:forEach var="element" items="${requestScope.rockerListe}">
    ${element}
    <br>

</c:forEach>
<br>

<p> Her kommer en bestillingsliste</p>
<br>
<c:forEach var="element" items="${requestScope.map}">
    <p>${element.key} skal have pizza nummer: ${element.value}</p>
    <br>

</c:forEach>
<br>

<p> Her kommer et eksempel på et set</p>
<br>
<c:forEach var="element" items="${requestScope.set}">
    <p>${element}</p>
    <br>

</c:forEach>

</body>
</html>
