package sqlController;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateSessionFactory;
import connection.sql_tables;

public class add {
	public void add(String name ,String password, String publickey,String privatekey  ){
		try{
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		sql_tables bim = new sql_tables();
		bim.setName(name);
		bim.setPassword(password);
		bim.setPublickey(publickey);
		bim.setPrivatekey(privatekey);
		session.save(bim);
		session.getTransaction().commit();
		session.close();
	}catch(Exception e){
		e.printStackTrace();	
	}
		}
}
