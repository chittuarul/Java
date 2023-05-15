
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title> Welcome Page </title>
		<link href="/webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
	<div class="container">
			<h1>
				Add you todo ${name}<!-- ${name} !! --> !!
			</h1>
			<hr>
			<div>
			  Enter here : <!-- ${todos } -->	
			</div>
			</br>
			<form method="post">
			Description : <input type="text" name="description">
			<input type="submit" class="btn btn-success" >
			</form>
		<a href="list-todos" class="btn btn-success" >cancel</a>	
	</div>
	<script src="/webjars/jquery/3.6.3/src/jquery.js"></script>
	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	</body>
</html>