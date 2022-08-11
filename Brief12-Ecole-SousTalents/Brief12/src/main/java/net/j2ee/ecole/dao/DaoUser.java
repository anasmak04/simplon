package net.j2ee.ecole.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.j2ee.ecole.models.Admin;
import net.j2ee.ecole.util.HibernateUtil;

public class DaoUser implements DaoInter<Admin> {

	@Override
	public void save(Admin admin) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the employee object
            session.save(admin);
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
	public void update(Admin type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin get(int type) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
