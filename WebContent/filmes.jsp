<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Filmes</title>
</head>
<body>

<table>
	<c:forEach var="filme" items="${filmes}">
		<tr>
			<td>${filme}</td>
			<td>
				<c:choose>
					<c:when test="${filme == 'Titanic'}">
						O navio vai afundar
					</c:when>
					
					<c:when test="${filme == 'Homens de preto'}">
						MIB vai botar pra quebrar
					</c:when>
					
					<c:when test="${filme == 'Em busca da felicidade'}">
						Filme inspirador
					</c:when>
				</c:choose>
			</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>