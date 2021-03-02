package sqlController;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateSessionFactory;
import connection.sql_tables;

public class query {
	public String query(String name1){
		try{	
			int i = 0;
			String password;
			SessionFactory factory = HibernateSessionFactory.getSessionFactory();
			Session session = factory.openSession();
			Query query = session.createQuery("from sql_tables");
			List<?> list = query.list();
			while(i<=list.size()){	
				sql_tables bim = (sql_tables)list.get(i); 
				if(bim.getName().equals(name1)){
					password=bim.getPassword();
					session.close();
					return password;
				}	
				i++;
		}
	}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	public String querypk(String name1){
		try{	
			int i = 0;
			String publickey;
			SessionFactory factory = HibernateSessionFactory.getSessionFactory();
			Session session = factory.openSession();
			Query query = session.createQuery("from sql_tables");
			List<?> list = query.list();
			while(i<=list.size()){	
				sql_tables bim = (sql_tables)list.get(i); 
				if(bim.getName().equals(name1)){
					publickey=bim.getPublickey();
					session.close();
	System.out.println(publickey);
					return publickey;
				}	
				i++;
		}
	}catch(Exception e){
		System.out.println("³ö´íÁË");
			e.printStackTrace();
		}
		
		return null;
	}
}
