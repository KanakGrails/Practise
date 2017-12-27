package com.practice.deleteit.later;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		int count=0;
		int counta,counte,counti,countu,counto=0;
		System.out.println("Enter any string to sinf vowels");
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		char[] letters = input.toCharArray();
		for(char c : letters)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o': 
			case 'u':
			count++;
			}
			
		}
		System.out.println("In the input String "+input+" Vowel has come "+count+" many times");

	}

	// Now the requirement is to count how many vowels how many times
	/*int counta=0,counte=0,counti=0,countu=0,counto=0;
	System.out.println("Enter any string to find vowels in it");
	Scanner sc = new Scanner(System.in);
	String input=sc.nextLine();
	char[] letters = input.toCharArray();
	for(char c : letters)
	{
		switch(c)
		{
		case 'a':counta++;
		case 'e':counte++;
		case 'i':counti++;
		case 'o':counto++; 
		case 'u':countu++;
		default:
			break;
		}
		
	}
	
	System.out.println("In the input String "+input+" Vowel a has come "+counta+" many times"+ " Vowel e has come "+counte+" many times"+
			" Vowel o has come "+counto+" many times"+" Vowel i has come "+counti+" many times"
			);
		
		
}*/
}
