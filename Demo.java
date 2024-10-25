package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class Demo {

	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		
		// we do not need to write whole query it automatically fetch.
		//HQL
		String hql = "from Student";
		Query q = s.createQuery(hql);
		List<Student> studlist =  q.getResultList();
		
		for(Student st :studlist)
		{
		   	System.out.println(st.getSid());
		   	System.out.println(st.getSname());
		   	System.out.println(st.getAge());
		   	System.out.println(st.getSaddress());
		   	System.out.println();  	
		}
		
		/*
		//we need to create different object for each then it will execute
		//otherwise it will only store the last value which i will enter.
        Student s1 = new Student();
        s1.setSid(101); s1.setSname("Neha"); s1.setAge(24);s1.setSaddress("Ranchi");
        
        Student s2 = new Student();
        s2.setSid(102); s2.setSname("Riya"); s2.setAge(22);s2.setSaddress("Patna");
        
        Student s3 = new Student();
        s3.setSid(103); s3.setSname("Priya"); s3.setAge(23);s3.setSaddress("Gumla");
        
        s.save(s1);
        s.save(s2);
        s.save(s3);
        
        */
		t.commit();
		s.close();

	}

}
