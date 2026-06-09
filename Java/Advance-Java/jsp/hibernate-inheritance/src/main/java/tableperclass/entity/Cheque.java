package tableperclass.entity;

import jakarta.persistence.Entity;


@Entity
public class Cheque extends Payment {

	private int cheque_no;
	private String cheque_type;

	public Cheque() {
		// TODO Auto-generated constructor stub
	}
	public Cheque(int cheque_no, String cheque_type) {
		this.cheque_no = cheque_no;
		this.cheque_type = cheque_type;
	}
	public void setCheque_no(int cheque_no) {
		this.cheque_no = cheque_no;
	}
	public int getCheque_no() {
		return cheque_no;
	}
	public void setCheque_type(String cheque_type) {
		this.cheque_type = cheque_type;
	}
	public String getCheque_type() {
		return cheque_type;
	}
}
