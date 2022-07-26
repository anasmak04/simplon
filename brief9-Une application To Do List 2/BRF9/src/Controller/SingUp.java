package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Models.User;

/**
 * Servlet implementation class SingUp
 */
public class SingUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter print = response.getWriter();
//		String user = request.getParameter("User");
//		String email = request.getParameter("Email");
//		String pwd = request.getParameter("Password");
//		
//		print.println(user + email + pwd);
//		response.getWriter();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	Dao da = new Dao();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("User");
        String email = request.getParameter("Email");
        String password = request.getParameter("Password");
        
        User us = new User();
        us.setNamee(name);
        us.setEmail(email);
        us.setPasswordd(password);
        
        try {
            da.insertUser(us);
            response.sendRedirect("SgnIn.jsp");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		doGet(request, response);
	}

}
