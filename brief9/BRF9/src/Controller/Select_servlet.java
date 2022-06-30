package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
//		String task = request.getParameter("task");
//        String description = request.getParameter("description");
//        String deadline = request.getParameter("deadline");
//       String status = request.getParameter("status");
//       String nom_categorie = request.getParameter("nom_categorie");
//       
//       Task tsk = new Task();
//        tsk.setTask(task);
//        tsk.setDescription(description);
//        tsk.setDeadline(deadline);
//        tsk.setStatus(status);
//        tsk.setNom_categorie(nom_categorie);
//        
//        try {
//           da.select();
//            System.out.println("select success");
//            
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("catch");
//        }
		
		
		
		
		PrintWriter out=response.getWriter();  
        out.println("<a href='index.html'>ADD NEW TASK</a>");  
        out.println("<h1>LIST OF TASKS </h1>");  
         
        List<Task> list=da.getAll();  
         
        out.print("<div class=container-fluid>"
        + "<table border='1'width='100%'");  
        out.print("<tr>"
        + "<th>task</th>"
        + "<th>description</th>"
        + "<th>deadline</th>"
        + "<th>status</th>"
        + "<th>nom categorie</th>");
//        + "<th>Update</th>"
//        + "<th>Delete</th></tr>");  
        for(Task u:list){  
         out.print("<tr>"
          + "<td>"+u.getTask()+"</td>"
          + "<td>"+u.getDescription()+"</td>"
          + "<td>"+u.getDeadline()+"</td>"
          + "<td>"+u.getStatus()+"</td>"  
           + "<td>"+u.getNom_categorie()+"</td>"); 

               
//                + "<td><a href='UpdateServlet?id="+u.getTask()+"'>Update</a></td>"
//                + "<td><a href='DeleteServlet?id="+u.getTask()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>"
        + " </div>");  
         
        out.close();  
    }  
			
//		doGet(request, response);
	}
