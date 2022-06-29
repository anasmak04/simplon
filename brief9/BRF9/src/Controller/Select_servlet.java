package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Models.Task;

/**
 * Servlet implementation class Select_servlet
 */
public class Select_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Dao da = new Dao();
    public Select_servlet() {
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
           da.select();
            System.out.println("select success");
            
    		PrintWriter print = response.getWriter();
    		String task1 = request.getParameter("task");
    		String description2 = request.getParameter("description");
    		String status3 = request.getParameter("status");
    		String deadline4 = request.getParameter("deadline");
    		String nom_categorie5 = request.getParameter("nom_categorie");
    		print.println(task1 + description2 + status3 + deadline4 + nom_categorie5);
    		response.getWriter();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch");
        }
		doGet(request, response);
	}

}
