package net.j2ee.ecole.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.j2ee.ecole.dao.Dao;
import net.j2ee.ecole.dao.DaoCours;
import net.j2ee.ecole.dao.DaoEtu;
import net.j2ee.ecole.models.Admin;
import net.j2ee.ecole.models.Cours;
import net.j2ee.ecole.models.Etudiant;
import net.j2ee.ecole.models.Professeurs;

import java.io.IOException;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	DaoCours dao = new DaoCours();
	DaoEtu  daoe = new DaoEtu();
	Dao dap = new Dao();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		
//		String id = request.getParameter("id");
//        String name = request.getParameter("description");
//        String idEtudi = request.getParameter("idEtudiant");
//        String idProf = request.getParameter("idProf");
////        Professeurs professeurs = dao.get(1);
//		Etudiant etudiant = daoe.get(1); 
//       Cours cours = new Cours(name, etudiant, professeurs);

        
//        try {
//            dao.save(cours);
//            response.sendRedirect("Success.jsp");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("catch");
//        }
		String id = request.getParameter("id_Admin");
		String username = request.getParameter("Email");
        String password = request.getParameter("Password");

        if(id.equals(1) && username.equals("anas@meta.com") && password.equals("123")) {

             response.sendRedirect("Home.html");

        } else {

            response.sendRedirect("login.html");

        }
		
		
	}

}
