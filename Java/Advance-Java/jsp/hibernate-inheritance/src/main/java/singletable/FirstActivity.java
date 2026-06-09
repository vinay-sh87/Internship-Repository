package singletable;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.util.HibernateUtil;

import singletable.entity.Card;
import singletable.entity.Cheque;
import singletable.entity.Payment;


public class FirstActivity {
	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.setAmount(10000);
		
		Cheque cheque = new Cheque();
		cheque.setCheque_no(1212);
		cheque.setAmount(30000);
		cheque.setCheque_type("Cheque Pay");
		
		Card card = new Card();
		card.setAmount(40000);
		card.setCard_type("VISA");
		card.setCard_no(303039);
		
		 Transaction transaction = null;
		 try (Session session = HibernateUtil.openFactory().openSession()){
			 transaction = session.beginTransaction();
			 session.persist(payment);
			 session.persist(cheque);
			 session.persist(card);
			 
			 transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
		}
	}
}
