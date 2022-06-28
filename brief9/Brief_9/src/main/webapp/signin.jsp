<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In
 </title>   
    <link rel="stylesheet" href="css/style.css">

</head>
<body>
<div class="container right-panel-active">
	

	<!-- Sign In -->
	<div class="container__form container--signin">
		<form action="#" class="form" id="form2">
			<h2 class="form__title">Sign In</h2>
			<input type="email" placeholder="Email" class="input" name="Email" required=""/>
			<input type="password" placeholder="Password" class="input" name="Password" required=""/>
			<a href="#" class="link">Forgot your password?</a>
			<button class="btn">Sign In</button>
		</form>
	</div>

		<!-- Overlay -->
	<div class="container__overlay">
		<div class="overlay">
			<div class="overlay__panel overlay--left">
				<a class="btn" id="signIn" href="index.jsp">Sign Up</a>
			</div>
		
		</div>
	</div>
</div>
</body>
</html>