package net.j2ee.ecole.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.j2ee.ecole.models.Cours;
import net.j2ee.ecole.models.Professeurs;
import net.j2ee.ecole.util.HibernateUtil;

public class DaoCours implements DaoInter<Cours> {

	@Override
	public void save(Cours cours) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the employee object
            session.save(cours);
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
	public void update(Cours cours) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the employee object
            session.update(cours);
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
	public void delete(int id_Cours) {
		 Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	            // Delete a user object
	            Cours cours = session.get(Cours.class, id_Cours);
	            if (cours != null) {
	                session.delete(cours);
	                System.out.println("cours is deleted");
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
	public Cours get(int id_Cours) {
		Transaction transaction = null;
        Cours cours = null;
       try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           // start a transaction
           transaction = session.beginTransaction();
           // get an user object
           cours = session.get(Cours.class, id_Cours);
           // commit transaction
           transaction.commit();
       } catch (Exception e) {
           if (transaction != null) {
               transaction.rollback();
           }
           e.printStackTrace();
       }
       return cours;
	}

}
