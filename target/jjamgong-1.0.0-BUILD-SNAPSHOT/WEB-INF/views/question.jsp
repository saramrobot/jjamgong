<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제</title>
</head>
<body>

<c:choose>
	<c:when test="${empty question}" >
		<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
	</c:when> 
	<c:when test="${!empty question}">
		문제) ${question.question.q_question}<br><br>
		<c:forEach var="list" items="${question.answers}" varStatus="status">
			${status.index+1}. <c:out value="${list.a_answer}"/><br>
		</c:forEach>
	</c:when>
</c:choose>

</body>
</html>
