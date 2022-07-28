package com.takehome.Mankatha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Mankath Game.....!!");
		System.out.println("Want to play the GAME...? Say yes or No ");
		String response = sc.nextLine();
		
		boolean playGame = true;
		if(response.equals("yes")) {
			playGame = true;
		}
		else
			playGame = false; 
		
		while(playGame) {
		System.out.println("The game consists of three players ");
		System.out.println("enter players name");
		
		List<String> playerList = new ArrayList<String>();
		System.out.println("enter first player name: ");
		String firstPlayer = sc.nextLine();
		playerList.add(firstPlayer);
		
		System.out.println("enter second player name: ");
		String secondPlayer = sc.nextLine();
		playerList.add(secondPlayer);
		
		System.out.println("enter third player name: ");
		String thirdPlayer = sc.nextLine();
		playerList.add(thirdPlayer);
		
		
		
		
		
		Collections.shuffle(playerList);
		
		List<String> host = new ArrayList<String>();
		List<String> playersQueue = new ArrayList<String>();
		
		for(int i=0; i<2; i++) {
			playersQueue.add(playerList.get(i));
		}
		host.add(playerList.get(2));
		
		System.out.println("Host of the game is : " + host.get(0));
		System.out.println("First player is : " + playersQueue.get(0));
		System.out.println("Second Player is : " + playersQueue.get(1));
		
		
		
		
			System.out.println("First player turns");
			System.out.println("Choose card : 1 for Ace ,rest numbers from 2 to 10 ,11 for Jack ,12 for King , 13 for queen");
			
			int firstPlayerRank = sc.nextInt();
			System.out.println("choose suit: Spades : 1, Hearts :2 , Daimonds:3,Clubs:4");
			int firstPlayerSuit = sc.nextInt();
			
			System.out.println("enter your bet coind");
			int firstBet = sc.nextInt();
			
			Card firstPlayerCard = new Card(firstPlayerRank,firstPlayerSuit);
			
			System.out.println("Choose orientation : in or out");
			String firstchosenOrientation = sc.next();
			
			Player player1 = new Player(firstPlayer,firstPlayerCard,firstchosenOrientation,firstBet);
			

			System.out.println("Second player turns");
			System.out.println("Choose card : 1 for Ace ,rest numbers from 2 to 10 ,11 for Jack ,12 for King , 13 for queen");
			
			int secondPlayerRank = sc.nextInt();
			System.out.println("choose suit: Spades : 1, Hearts :2 , Daimonds:3,Clubs:4");
			int secondPlayerSuit = sc.nextInt();
			
			System.out.println("enter your bet coind");
			int secondPlayerBet = sc.nextInt();
			
			Card secondPlayerCard = new Card(secondPlayerRank,secondPlayerSuit);
			
			System.out.println("Choose orientation : in or out");
			String secondChosenOrientation = sc.next();
			
			Player player2 = new Player(firstPlayer,secondPlayerCard,secondChosenOrientation,secondPlayerBet);
		
			List<String> inOrientation = new ArrayList<String>();
			List<String> outOrientation = new ArrayList<String>();
			
			
			Deck d = new Deck();
			int counter=0;
			int x = 26;
			
			for(int i = 0; i < x; i++){
				inOrientation.add(d.dealCard());
			    outOrientation.add(d.dealCard());
			}	    
			
			    for(int j=0; j< inOrientation.size();j++)
			    {			    	
			    	if(firstPlayerCard.toString().equals(inOrientation.get(j)) && player1.getChosenOrientation().equals("in"))
			    	{
			    		System.out.println(playersQueue.get(0) +" wins " + (player1.getBet()+player2.getBet()));
			    		counter=1;
			    		break;
			    	}
			    	
			    	else if(firstPlayerCard.toString().equals(outOrientation.get(j)) && player2.getChosenOrientation().equals("out"))
			    	{
			    		System.out.println(playersQueue.get(0) +" wins " + (player1.getBet()+player2.getBet()));
			    		counter=1;
			    		break;
			    	}
			    	
			    	else if(secondPlayerCard.toString().equals(inOrientation.get(j)) && player2.getChosenOrientation().equals("in"))
			    	{
			    		System.out.println(playersQueue.get(0) +" wins " + (player1.getBet()+player2.getBet()));
			    		counter=1;
			    		break;
			    	}
			    	
			    	else if(secondPlayerCard.toString().equals(outOrientation.get(j)) && player2.getChosenOrientation().equals("out"))
			    	{
			    		System.out.println(playersQueue.get(1) +" wins " + (player1.getBet()+player2.getBet()));
			    		counter=1;
			    		break;
			    	}
			    }			
				
			if(counter == 0)
		    	System.out.println(host.get(0)+" wins "+(player1.getBet()+player2.getBet()));
		    
		    System.out.println("do you want to play the game, enter y for yes or n for no: ");
			String response2 = sc.nextLine();
			if(response2.equals("y")) {
				playGame = true;
			}
				else
					playGame = false;
			}
		
		
		

	}

}
