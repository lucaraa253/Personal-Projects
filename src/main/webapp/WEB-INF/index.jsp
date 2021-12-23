<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Yahtzee Board</title>

</head>
<body>
	<h1>Lets Play Yahtzee</h1>
	<c:forEach var="player" items="${players}">
		<tr>
            <td><a href="/${player.id }/yahtzee">Ready Player <c:out value="${player.id }"/></a></td>

        </tr>
        </c:forEach>
</body>
</html>