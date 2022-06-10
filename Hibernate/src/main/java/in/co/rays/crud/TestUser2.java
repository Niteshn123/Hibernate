package in.co.rays.crud;


	import java.util.Iterator;
	import java.util.List;

	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class TestUser2 {

		public static void main(String[] args) {
			
			TestAdd();
			// testupdate();
			// testdelete();
		//testList();
			
			
			
		}
		
		private static void testList() {

			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session s = sf.openSession();

			Query q = s.createQuery("from User");
			// Query q=s.createSQLQuery("select * from user");
			List<User> li = q.list();
			Iterator<User> it = li.iterator();
			User u;
			while (it.hasNext()) {
				u = (User) it.next();
				System.out.println(u.getId());
				System.out.println(u.getFname());
			}

			s.close();

		}

		
		

		private static void TestAdd() {

			User pojo = new User();
			pojo.setFname("shikhar");
			pojo.setLname("Dhavan");
			pojo.setUserid("Dhavan@123");
			pojo.setPassword("12345");

			SessionFactory sf = new Configuration().configure().buildSessionFactory(); 

			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();

			s.save(pojo);

		

			tx.commit();
			s.close();
			System.out.println("inserted");

			
		}
		
	}


