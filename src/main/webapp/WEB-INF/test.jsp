<html>
<head>
<title>test</title>
</head>
<body>
<h2>Hi!</h2>

<p> Current date: <%= new java.util.Date()%>
<br>
<p> Value of parameter "param": <%= request.getParameter("param")%>

</body>
</html>