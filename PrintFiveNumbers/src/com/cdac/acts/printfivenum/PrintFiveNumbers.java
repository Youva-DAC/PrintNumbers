package com.cdac.acts.printfivenum;

import java.util.Random;

public class PrintFiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Random rand = new Random();
		        for (int i = 0; i < 5; i++) {
		            int randomNumber = rand.nextInt(9000) + 1000;
		            System.out.println(randomNumber);
		        }
		    }


	}

