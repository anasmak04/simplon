package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Models.Task;
import Models.User;

/**
 * Servlet implementation class TodoServlet
 */
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	Dao da = new Dao();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String task = request.getParameter("task");
        String description = request.getParameter("description");
        String deadline = request.getParameter("deadline");
       String status = request.getParameter("status");
       String nom_categorie = request.getParameter("nom_categorie");
       
       Task tsk = new Task();
        tsk.setTask(task);
        tsk.setDescription(description);
        tsk.setDeadline(deadline);
        tsk.setStatus(status);
        tsk.setNom_categorie(nom_categorie);
        
        try {
            da.AddTache(tsk);
            response.sendRedirect("Success.jsp");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("catch");

        }
		
		
		doGet(request, response);
	}

}
