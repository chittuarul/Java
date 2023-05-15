<html>
<head>
<title> Login Page </title>
<link href="/webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<h1>
	Welcome to Login Page <!-- ${name} !! --> !!
</h1>
<hr>
<pre>${errorMessage}</pre>
<form method="post">
	Name: <input type="text" name="name">
	Password: <input type="password" name="password">
	<input type="submit">
	
</form>
<script src="/webjars/jquery/3.6.3/src/jquery.js"></script>
<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
</body>
</html>