
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title> Welcome Page </title>
	</head>
	<body>
			<h1>
				Your Todos page ${name}<!-- ${name} !! --> !!
			</h1>
			<div>
			  Your todos are : 	${todos }
			</div>
			<table>
				<thead>
				<tr>
					<th>id</th>
					<th>description</th>
					<th>Target date</th>
					<th>Status</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach item="${todos}" var=todo>
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description} </td>
						<td> ${todo.targetDate}</td>
						<td> ${todo.Done1}</td>
					</tr>				
				</c:forEach>
				</tbody>
	
			</table>
	</body>
</html>