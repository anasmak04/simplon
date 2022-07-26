package model;


import org.hibernate.Session;

import dao.AdminDaoImp;
import dao.EmployDaoImp;
import util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
      System.out.println("Project started ...");
      
      Session session = HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      
      
       EmployDaoImp em = new EmployDaoImp();
       AdminDaoImp ad = new AdminDaoImp();
      
      // -----------------------------Add employe work---------------------------------------
      
  
//       em.addEmploye(new Employe("km44","anas","souad","anas@google.com","agadir web","2123904873"));
//       em.addEmploye(new Employe("km45","anas","souad","anas@google.com","agadir web","2123904873"));

       // ------------------------------update employe  work ----------------------------------
       
//        
//       Employe e = em.getEmploye("km45");
//       e.setEmail("anas@meta.cebook");
//       em.updateEmploye(e);
       
      // ------------------------------delete employe work------------------------------------
       
//      em.deleteEmploye("km45"); 
      //---------------------------------Add Admin  work --------------------------------------------
       
     //  ad.addAdmin(new Admin("MED",123));
      
      //--------------------------------Admin update------------------------------------------
       
       
       
       
       
      
      HibernateUtil.getSessionFactory().close();
   
	}
}
