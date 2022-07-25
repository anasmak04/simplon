package dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Admin;

public class AdminDaoImp implements AdminDao {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	@Override
	public void addAdmin(Admin a) {
		
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void updateAdmin(Admin a) {
		
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		session.close();
		
	}

}
