<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>todolist</title>
<link rel="stylesheet" href="css/todo.css">

</head>
<body>
		<div class="container">
				<div class="container--2">
		
		<form class="form">
			<h2 class="form__title">Todolist</h2>
			<input type="text" placeholder="task" class="input" name="task" required="" /> <br />
			<input type="text" placeholder="description" class="input" name="description" required=""/><br />
			
	<select name="status" id=""><br />
	  	    <option value="" disabled selected>status</option>
	
    <option value="pas encore">pas encore</option>
    <option value="en cours">en cours</option>
    <option value="terminée">terminée</option>

  </select>
  			<input type="text" placeholder="deadline" class="input" name="deadline" required=""/><br />
  	<select name=" nom_caegorie" id="">
  	    <option value="" disabled selected>nom_caegorie</option>
    <option value="pésentation">pésentation</option>
    <option value="veille">veille</option>
    <option value="recherche">recherche</option>

  </select><br />
			<button class="btn">Sign Up</button>
		</form>
		</div>
		</div>
</body>
</html>