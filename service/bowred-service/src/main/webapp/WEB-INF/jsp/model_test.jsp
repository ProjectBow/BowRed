<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>model_test</title>
</head>
<body>
	<p>set : ${alcdo_set }</p>
	<c:forEach items="${alcdo_set }" var="dao" varStatus="stat">
		<p>
			<c:out value="${stat.count}" />
			:
			<c:out value="${dao.name }" />
			, ${dao.value }
		</p>
	</c:forEach>
</body>
</html>