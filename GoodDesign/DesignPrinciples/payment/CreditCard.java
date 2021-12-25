package entity.payment;

import java.sql.Timestamp;

public class CreditCard extends PaymentCard{
	protected String owner;
	protected String dateExpired;
	private String cardCode;
	private int cvvCode;


	public CreditCard(String cardCode, String owner, int cvvCode, String dateExpired) {
		this.cardCode = cardCode;
		this.owner = owner;
		this.cvvCode = cvvCode;
		this.dateExpired = dateExpired;
	}

	public String getCardCode() {
		return cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public int getCvvCode() {
		return cvvCode;
	}

	public void setCvvCode(int cvvCode) {
		this.cvvCode = cvvCode;
	}

	@Override
	public String toString() {
		return "CreditCard [cardCode=" + cardCode + ", cvvCode=" + cvvCode + ", owner=" + owner + ", dateExpired="
				+ dateExpired + "]";
	}

	
}
