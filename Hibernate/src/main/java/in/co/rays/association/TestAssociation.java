package in.co.rays.association;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAssociation {     // ONE TO MANY

	

	public static void main(String[] args) {

		ActionItem item = new ActionItem();
		item.setDescription("Mahendra");

		Bid bid1 = new Bid();
		bid1.setAmount(60000);

		Set<Bid> set = new HashSet<Bid>();
		set.add(bid1);

		item.setBid(set);

		SessionFactory sf = new Configuration().configure().buildSessionFactory(); // Load factory

		Session s = sf.openSession(); // create session
		Transaction tx = s.beginTransaction();

		s.save(item); // save pojo
		tx.commit();

		s.close();
		
		System.out.println("insert");

	}

}

