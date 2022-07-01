package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Models.Task;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
Dao da = new Dao();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
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
        	da.UpdateTache(tsk);
        	System.out.println(da.UpdateTache(tsk));
            response.sendRedirect("Success.jsp");
            System.out.println("hhh");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("catch");
        }
		
		doGet(request, response);
	}

}
