package net.j2ee.ecole.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.j2ee.ecole.models.Etudiant;
import net.j2ee.ecole.models.Professeurs;
import net.j2ee.ecole.util.HibernateUtil;

public class Dao implements DaoInter<Professeurs> {

	@Override
	public void save(Professeurs professeurs) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the employee object
            session.save(professeurs);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
	}

	@Override
	public void update(Professeurs professeurs) {
		 Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the employee object
	            session.update(professeurs);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
		
	}

	@Override
	public void delete(int id_Prof) {
		 Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	            // Delete a user object
	            Professeurs professeurs = session.get(Professeurs.class, id_Prof);
	            if (professeurs != null) {
	                session.delete(professeurs);
	                System.out.println("Employee is deleted");
	            }

	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        
	        
	}

	@Override
	public Professeurs get(int id_Prof) {
		Transaction transaction = null;
        Professeurs professeurs = null;
       try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           // start a transaction
           transaction = session.beginTransaction();
           // get an user object
           professeurs = session.get(Professeurs.class, id_Prof);
           // commit transaction
           transaction.commit();
       } catch (Exception e) {
           if (transaction != null) {
               transaction.rollback();
           }
           e.printStackTrace();
       }
       return professeurs;
	}


}
