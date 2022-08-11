package net.j2ee.ecole.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.j2ee.ecole.models.Etudiant;
import net.j2ee.ecole.util.HibernateUtil;

public class DaoEtu implements DaoInter<Etudiant>{

	@Override
	public void save(Etudiant etudiant) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the employee object
            session.save(etudiant);
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
	public void update(Etudiant etudiant) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the employee object
            session.update(etudiant);
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
	public void delete(int id_Etudi) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // Delete a user object
            Etudiant etudiant = session.get(Etudiant.class, id_Etudi);
            if (etudiant != null) {
                session.delete(etudiant);
                System.out.println("Etudaint is deleted");
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
	public Etudiant get(int id_Etudi) {
		Transaction transaction = null;
        Etudiant etudiant = null;
       try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           // start a transaction
           transaction = session.beginTransaction();
           // get an user object
           etudiant = session.get(Etudiant.class, id_Etudi);
           // commit transaction
           transaction.commit();
       } catch (Exception e) {
           if (transaction != null) {
               transaction.rollback();
           }
           e.printStackTrace();
       }
       return etudiant;
	}

}
