<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Sign Up</title>
</head>
<body>

		 <div class="container right-panel-active">
	 
	<!-- Sign Up -->
	<div class="container__form container--signup">
	
		<form action="SingUp" method="get" class="form" id="form1">
			<h2 class="form__title">Sign Up</h2>
			<input type="text" placeholder="User" class="input" name="User" required="" />
			<input type="email" placeholder="Email" class="input" name="Email" required=""/>
			<input type="password" placeholder="Password" class="input" name="Password" required=""/>
			<button class="btn">Sign Up</button>
		</form>
		
	</div>

	
	<!-- Overlay -->
	<div class="container__overlay">
		<div class="overlay">
			<div class="overlay__panel overlay--left">
				<a class="btn" id="signIn" href="SgnIn.jsp">Sign In</a>
			</div>
		</div>
	</div>
</div>
</body>
</html>