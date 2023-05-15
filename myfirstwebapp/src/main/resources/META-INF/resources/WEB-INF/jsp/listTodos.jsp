
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title> Welcome Page </title>
		<link href="/webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
	<div class="container">
			<h1>
				Todo list of ${name}<!-- ${name} !! --> !!
			</h1>
			<hr>
			<div>
			  Details: <!-- ${todos } -->	
			</div>
			<table class="table">
				<thead>
				<tr>
					<th>Id</th>
					<th>Description</th>
					<th>Target date</th>
					<th>Status</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description} </td>
						<td> ${todo.targetDate}</td>
						<td> ${todo.done}</td>
					</tr>				
				</c:forEach>
				</tbody>
	
			</table>
		<a href="add-todo" class="btn btn-success" >Add Todo</a>	
	</div>
	<script src="/webjars/jquery/3.6.3/src/jquery.js"></script>
	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	</body>
</html>