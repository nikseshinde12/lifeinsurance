package service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import entity.Registration;

public class Register_service {
	            //1
				Configuration configuration = new Configuration().configure("database.cfg.xml");
				// 2
				SessionFactory sessionfactory = configuration.buildSessionFactory();
				// 3
				Session session = sessionfactory.openSession();
	//           -----------------------------------insert method-----------------------------------------------

	public void insert(String name, String address, String email) {

		try {
			
			// 4.starting transaction
			Transaction transaction = session.beginTransaction();
			Registration user = new Registration();
			user.setName(name);
			user.setAddress(address);
			user.setEmail(email);
			System.out.println("set names");
			// this method for save the data
			session.save(user);
           
			transaction.commit();
			session.close();

			System.out.println("details inserted");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}
	}
	//--------------------- method delete-----------------------------------
	
	public void delete(int id) {

		try {
			
			
			Transaction transaction = session.beginTransaction();
			
			Registration user = new Registration();
			
			user.setId(id);
			session.delete(user);
            transaction.commit();
			session.close();

			System.out.println("delete details");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
		//----------------------method updated---------------------------

    public void update (int id,String name,String address,String email) {
		try {
			
			Transaction transaction =session.beginTransaction();
			
			Registration user=new Registration ();
			user.setId(id);
			user.setName(name);
			user.setAddress(address);
			user.setEmail(email);
			
			session.update(user);
			transaction.commit();
			System.out.println("Employ detail update");
			session.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
        //-----------------------method view details--------------------------
	 public void view(int id)	{
		 try {
			 
			 Transaction transaction=session.beginTransaction();
			 
			 Registration re=(Registration)session.get(Registration.class, new Integer(id));
			 System.out.println(re.getId());
			 System.out.println(re.getName());
			 System.out.println(re.getAddress());
			 System.out.println(re.getEmail());
		
			 System.out.println("user viewdetails");
			 transaction.commit();
			 session.close();
			 
		 }catch(Exception e) {
			 System.out.println(e);
			 System.out.println("error");
		 }
	 }
	 public void viewhql(String address) {
		 Transaction transaction=session.beginTransaction();
		 
		// Query obj=session.createQuery(" from Registration");
		//Query obj=session.createSQLQuery("select * from Hiber_mapping where address=:address");
		//obj.setParameter("address", address);
		String sql =( "select * from Hiber_mapping");
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Registration.class);
		List <Registration>list = query.list();
		 
		// List<Registration>list=obj.query.list();
		 
		 for(Registration reg:list)
		 {
			 System.out.println(reg.getId());
			 System.out.println(reg.getName());
			 System.out.println(reg.getAddress());
			 System.out.println(reg.getEmail());
		 }
			 transaction.commit();
			 session.close();
		 }
	 
	 public void view_address(String address) {
		 
		 Transaction transaction=session.beginTransaction();
		 
		 Query obj=session.createQuery("from Registration rf where rf.address=:address");
		 
		 obj.setParameter("address",address);
		 
		 List<Registration>list=obj.list();
		 
		 for(Registration reg:list) {
			 System.out.println(reg.getId());
			 System.out.println(reg.getName());
			 System.out.println(reg.getAddress());
			 System.out.println(reg.getEmail());
		 } 
			 transaction.commit();
			 session.close();
	 
		 
	 }
}


