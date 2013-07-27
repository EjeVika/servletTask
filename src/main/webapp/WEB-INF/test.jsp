<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>test</title>
</head>
<body>
<h2>Hi! hi hi</h2>

<p> Current date: <%= new java.util.Date()%>
<br>
<p> Value of parameter "param": ${param["param"]}
<c:forEach var="p" items="${list}">
<li>${p}</li>
</c:forEach>
</body>
</html>