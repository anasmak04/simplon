<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/Register.css">
<title>Sign Up</title>

</head>
<body>
<form>
        <div class="container">
          <h1>Sign Up</h1>
          <p>Please fill in this form to create an account.</p>
      
              <label for="email"><b>firstName</b></label>
            <input type="text" name="firstName" placeholder="Enter Username" required>

            <label for="email"><b>lastName</b></label>
            <input type="text" name="lastName" placeholder="Enter Username" required>
         
            <label for="id_Employe "><b>id_Employe </b></label>
            <input type="number" placeholder="id_Employe" name=" id_Employe" required>  
           
          
           


           <label for="email"><b>Email</b></label>
           <input type="text" placeholder="Enter Email" name="email" required>
           
           <label for="psw"><b>Password</b></label>
           <input type="password" placeholder="Enter Password" name="psw" required>

           <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>
      
          <div class="clearfix">
      
            <button type="submit" class="btn">Sign Up</button>
          </div>
        </div>
      </form>
</body>
</html>