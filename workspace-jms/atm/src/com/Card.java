package com;

import java.io.Serializable;

public class Card implements Serializable{
	private static final long serialVersionUID = 5700252850949595111L;
	private String cardNo;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Card(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
