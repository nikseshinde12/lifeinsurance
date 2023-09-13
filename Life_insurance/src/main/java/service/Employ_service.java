package service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Emp_entity;
import entity.Registration;

public class Employ_service {
	
	Configuration conf=new Configuration().configure("database.cfg.xml");
	
	SessionFactory sessfac=conf.buildSessionFactory();
	
	Session session=sessfac.openSession();
	
	 Transaction tr=session.beginTransaction();
	 
	 /*public void insertData(String name,String address) {
		 Registration ed = new Registration();
		 ed.setName(name);
		 ed.setAddress(address);
		 
		 session.save(ed);
		 tr.commit();
		 session.close();
		 
		 System.out.println("data inserted succesfully");
	 }*/
	 
		 
	 public void insertHR(String empname,float totalExperience,String skills,float pac_kage) {
		 Emp_entity ee=new  Emp_entity();
		 
		    ee.setEmpname(empname);
		    ee.setTotalExperince(totalExperience);
		    ee.setSkills(skills);
		    ee.setPac_kage(pac_kage);
		 	
	 
		 	session.save(ee);
		 	tr.commit();
		 	session.close();
		 	
		 	System.out.println("insertHR query done");
		 	
	 }
	 
	 public void viewHR(float exp,float expr) {
		 
		 Emp_entity ev=new  Emp_entity();
		 
		 ev.setTotalExperince(exp);
		 
		 Query obj=session.createQuery("select i from Emp_entity i where i.totalExperience between  totalExperience and totalExperience");
		 obj.setParameter("totalExperience", obj);
		 obj.setParameter("totalExperience", obj);
		 
		 List<Emp_entity>list=obj.list();
		 
		 for(Emp_entity empentity :list) {
			 
			 System.out.println(empentity.getId());
			 System.out.println(empentity.getEmpname());
			 System.out.println(empentity.getSkills());
			 System.out.println(empentity.getTotalExperince());
			 
		 }
		 
		 tr.commit();
		 session.close();
		 
		 System.out.println("viewhr inserted succesfully");
		 
	 }
	
	
	
	

}
