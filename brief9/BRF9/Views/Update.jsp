<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>todolist</title>
<link rel="stylesheet" href="css/todo.css">
<style>
:root {
	/* COLORS */
	--white: #e9e9e9;
	--gray: #333;
	--blue: #0367a6;
	--lightblue: #008997;

	/* RADII */
	--button-radius: 0.7rem;

	/* SIZES */
	--max-width: 758px;
	--max-height: 420px;

	font-size: 16px;
	font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
		Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
}

</style>
	
</head>
<body>
			<div class="container">
				<div class="container--2">
			<form class="form" action="UpdateServlet" method="post">
			<h2 class="form__title">Todolist</h2>
			<input type="text" placeholder="task" class="input" name="task"  /> <br />
			<input type="text" placeholder="description" class="input" name="description" /><br />
			<input type="date" placeholder="deadline" class="input" name="deadline" /><br />
			
		<select name="status" id=""><br />
	  	    <option value="" disabled selected>status</option>
    	<option value="pas encore">pas encore</option>
    	<option value="en cours">en cours</option>
    	<option value="terminée">terminée</option>
  		</select>
  		
  		<select name="nom_categorie" id="">
  	    <option value="" disabled selected>nom_categorie</option>
    	<option value="pésentation">pésentation</option>
    	<option value="veille">veille</option>
    	<option value="recherche">recherche</option>
	</select><br />

		<div class="btns">
			<button class="btn">ADD</button>
			<button class="btn">UPDATE</button>
			<button class="btn">DELETE</button>
			<button class="btn">SELECT</button>
		</div>
		<a href="SgnIn.jsp" style="	background-color: var(--blue);
	background-image: linear-gradient(90deg, var(--blue) 0%, var(--lightblue) 74%);
	border-radius: 20px;
	border: 1px solid var(--blue);
	color: var(--white);
	cursor: pointer;
	font-size: 0.8rem;
	font-weight: bold;
	letter-spacing: 0.1rem;
	padding: 0.9rem 4rem;
	text-transform: uppercase;
	transition: transform 80ms ease-in; margin-bottom:40px; margin-top:10px; text-decoration:none;">LOG OUT</a>
		</form>
		</div>
		</div>
</body>
</html>