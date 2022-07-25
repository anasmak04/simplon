package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
    public LoginServlett() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.getWriter().println("Hello World !");

	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 request.getRequestDispatcher("login.html").forward(request, response);
//		    
//		    String username = request.getParameter("username");
//		    String password = request.getParameter("password");
//		    
//		   
//		   
//		    
//		    if(username.equals("anas") && password.equals("anas")) {
//		    					
//		    	 response.sendRedirect("EmployeList.html");
//			} else {
//				
//				response.sendRedirect("login.html");
//			}
		    
	}
}

