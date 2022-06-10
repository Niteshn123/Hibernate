package Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPayment {

	public static void main(String[] args) {
		CreditCardPaymentPOJO card = new CreditCardPaymentPOJO();
		card.setId(1);
		card.setAmount(20000);
		card.setCcType("visa");
		card.setPaymentType("credit");

		CashPOJO cash = new CashPOJO();
		cash.setId(2);
		cash.setAmount(150000);
		cash.setPaymentType("cash");

		ChequePOJO cheque = new ChequePOJO();
		cheque.setId(3);
		cheque.setAmount(3000);
		cheque.setPaymentType("cheque");
		cheque.setChqNumber(345678);
		cheque.setBankName("HDFC");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(card);
		s.save(cash);
		s.save(cheque);

		t.commit();
		s.close();
		System.out.println("added");

	}

}
