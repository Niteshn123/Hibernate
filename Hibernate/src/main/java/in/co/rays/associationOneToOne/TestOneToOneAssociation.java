package in.co.rays.associationOneToOne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOneAssociation {
	
	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setFirstName("ram");
		emp1.setLastName("vishwakarma");
		Address adr1 = new Address();
		adr1.setStreet("ramnagar");
		adr1.setState("madhaypradesh");
		adr1.setCity("indore");

		emp1.setAddress(adr1);
		// adr1.setEmployee(emp1);

		Employee emp2 = new Employee();
		emp2.setFirstName("ram");
		emp2.setLastName("vishwakarma");
		Address adr2 = new Address();
		adr2.setStreet("tilaknagar");
		adr2.setState("madhaypradesh");
		adr2.setCity("indore");

		emp2.setAddress(adr2);
		// adr2.setEmployee(emp2);

		Employee emp3 = new Employee();
		emp3.setFirstName("ram");
		emp3.setLastName("vishwakarma");
		Address adr3 = new Address();
		adr3.setStreet("tejajinagar");
		adr3.setState("madhaypradesh");
		adr3.setCity("indore");

		emp3.setAddress(adr3);
		// adr3.setEmployee(emp3);

		List<Employee> list = new ArrayList<Employee>();

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();

		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee employee = (Employee) it.next();
			Transaction tx = s.beginTransaction();
			s.save(employee);
			tx.commit();

		}

		s.close();
		System.out.println("added");
	}
}



