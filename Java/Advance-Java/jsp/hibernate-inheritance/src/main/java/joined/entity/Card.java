package joined.entity;

import jakarta.persistence.Entity;


@Entity
public class Card  extends Payment{
	private int card_no;
	private String card_type;
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card(int card_no, String card_type) {
		this.card_no = card_no;
		this.card_type = card_type;
	}
	public int getCard_no() {
		return card_no;
	}
	public void setCard_no(int card_no) {
		this.card_no = card_no;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

}
