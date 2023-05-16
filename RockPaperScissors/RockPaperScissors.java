package com.aminenurgynk.lesson012.RockPaperScissors;


import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	static EOptions[] options = EOptions.values();
	
	
	public static EOptions pcChoise() {
		Random random = new Random();
		int index = random.nextInt(options.length);
		return options[index];
	}
	
	public static EOptions choose() {
		
		for (EOptions option : options) {
			System.out.println((option.ordinal()+1) + "-)" + option);
		}
		
		int index = yourChoise();
		return options[index-1];
		
	}
	
	public static int yourChoise() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pls, Choose one of them!!");
			
		int index = -1;
		while ((index = scanner.nextInt()) < 1 || index >5) {
			System.out.println("That's not correct, try again. Press one of them '1, 2, 3'!!!");
		}
		
		return index;
	}
	
	public static void gameResult() {
		EOptions yourChoise = choose();
		EOptions myChoise = pcChoise();
		if (yourChoise == myChoise) {
			System.out.print("You choose; " + yourChoise
					+ "\n"
					+ "I'm choosing: " + myChoise
					+ "\n"
					+ "Upss..");
		}else {
			switch (yourChoise) {
			case ROCK:
				if (myChoise == EOptions.PAPER) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Paper covers rock, hahaha :D");
				}else if (myChoise == EOptions.LIZARD) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Rock cruhses lizard..");
				}else if (myChoise == EOptions.SPOCK) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Spock vaporisez rock, hahaha :D");
				}else {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Rock cruhses scissors..");
				}
				break;
			case PAPER:
				if (myChoise == EOptions.SCISSORS) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Scissors cut paper, hahaha :D");
				}else if (myChoise == EOptions.LIZARD) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Lizard eat paper, hahaha :D");
				}else if (myChoise == EOptions.SPOCK) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Paper disproves spock..");
				}else {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Paper covers rock..");
				}
				
				break;
			case SCISSORS:
				if (myChoise == EOptions.ROCK) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Rock cruhses scissors, hahaha :D");
				}else if (myChoise == EOptions.LIZARD) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Scissors discapitates lizard..");
				}else if (myChoise == EOptions.SPOCK) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Spock smashes scissors, hahaha :D");
				}else {//PAPER
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Scissors cut paper..");
				}
				
				break;
			case LIZARD:
				if (myChoise == EOptions.ROCK) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Rock cruhses lizard, hahaha :D");
				}else if (myChoise == EOptions.PAPER) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Lizard eat paper..");
				}else if (myChoise == EOptions.SPOCK) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Lizard poisons spock..");
				}else {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Scissors discapitates lizard, hahaha :D");
				}
				
				break;
			case SPOCK:
				if (myChoise == EOptions.ROCK) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Spock vaporisez rock..");
				}else if (myChoise == EOptions.PAPER) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Paper disproves spock, hahaha :D");
				}else if (myChoise == EOptions.LIZARD) {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Lizard poisons spock, hahaha :D");
				}else {
					System.out.print("I'm choosing: " + myChoise
							+ "\n"
							+ "Spock smashes scissors..");
				}
				
				break;

			default:
				break;
			}
		}
	}

	
	
}
