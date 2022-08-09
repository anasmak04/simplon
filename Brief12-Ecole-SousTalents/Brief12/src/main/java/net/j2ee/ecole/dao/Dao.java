package net.j2ee.ecole.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.j2ee.ecole.models.Etudiant;
import net.j2ee.ecole.models.Professeurs;
import net.j2ee.ecole.util.HibernateUtil;

public class Dao implements DaoInter {

	@Override
	public void saveProfesseurs(Professeurs professeurs) {
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
	public void updateProfesseurs(Professeurs professeurs) {
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
	public void deleteProfesseurs(int id_Prof) {
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
	public Professeurs getProfesseurs(int id_Prof) {
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
	
	
	@Override
	public void saveEtudiant(Etudiant etudiant) {
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
	public void deleteEtudiant(int id_Etudi) {
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
	public Etudiant getEtudiant(int id_Etudi) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
