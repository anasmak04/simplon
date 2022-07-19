<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="css/Login.css">
<title>Sign In</title>
</head>
<body>
 <form>
        <div class="container">
          <h1>Sign In</h1>
          <p>Please fill in this form to sign in in your  account.</p>
      
       
         
            <label for="id_Employe"><b>id_Employe</b></label>
            <input type="number" placeholder="id_Employe" name="id_Employe" required>  
           
           
           <label for="psw"><b>Password</b></label>
           <input type="password" placeholder="Enter Password" name="psw" required>

           <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>
      
          <div class="clearfix">
      
            <button type="submit" class="btn">Sign In</button>
          </div>
        </div>
      </form>
</body>
</html>