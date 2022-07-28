package com.takehome.Mankatha;

public class Player {
	
	private String name;
	private int coins;
	private Card chosenCard;
	private String chosenOrientation;
	private int bet;
	
	public Player() {
		
	}
	
	
	public Player(String name,Card chosenCard,String chosenOrientation,int bet) {
		this.name = name;
	//	this.coins =coins;
		this.chosenCard = chosenCard;
		this.chosenOrientation = chosenOrientation;
		this.bet = bet;
		
	}


	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}

/*
	protected int getCoins() {
		return coins;
	}


	protected void setCoins(int coins) {
		this.coins = coins;
	}  */


	protected Card getChosenCard() {
		return chosenCard;
	}


	protected void setChosenCard(Card chosenCard) {
		this.chosenCard = chosenCard;
	}


	protected String getChosenOrientation() {
		return chosenOrientation;
	}


	protected void setChosenOrientation(String chosenOrientation) {
		this.chosenOrientation = chosenOrientation;
	}


	protected int getBet() {
		return bet;
	}


	protected void setBet(int bet) {
		this.bet = bet;
	}
	

	
	public int addWinnings(int coins) {
		
		coins += bet;
		
		return coins;
		
		
	}

}
