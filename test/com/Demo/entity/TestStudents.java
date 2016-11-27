package com.Demo.entity;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class TestStudents {
       
	   @Test
	   public void init()
	   {
		   Configuration config = new Configuration().configure();
		   
		   ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		   
		   
		   SessionFactory sessionfactory = config.buildSessionFactory(serviceRegistry);
		   
		   
		   SchemaExport export = new SchemaExport(config);
		   export.create(true,true);
	   }
	   
	   @Test
	   public void addStudents()
	   {
           Configuration config = new Configuration().configure();
		   
		   ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		   
		   SessionFactory sessionfactory = config.buildSessionFactory(serviceRegistry);
		   
		   Session session = sessionfactory.openSession();
		   
		   Transaction transaction = session.beginTransaction();
		   
		   Address add = new Address("430000","冷风农场","18666666666");
		   StudentsPrimaryKey pk = new StudentsPrimaryKey("1000001","429006199803025115");
		   Students stu = new Students(pk,"三蹦子","男",new Date(),"电气化",add);
		   
		   session.save(stu);
		   transaction.commit();
	   }
}
