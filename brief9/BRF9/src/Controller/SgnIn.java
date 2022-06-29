package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import Models.User;

/**
 * Servlet implementation class SgnIn
 */
public class SgnIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Dao da = new Dao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SgnIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter print = response.getWriter();
//		String user = request.getParameter("Namee");
//		String email = request.getParameter("Email");
//		String pwd = request.getParameter("Passwordd");
//		
//		print.println(user + email + pwd);
//		response.getWriter();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String email = request.getParameter("Email");
        String password = request.getParameter("Password");
        User us = new User();
	        us.setEmail(email);
	        us.setPasswordd(password);
	        
	    
	        try {
	            if(da.validate(us)) {
	            	System.out.println("heree");
	                response.sendRedirect("Todolist.jsp");

	            } else {
	                response.sendRedirect("Fake_Infos.jsp");

	                HttpSession session = request.getSession();

	            }

	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
			

	} 

}
