package com.practice.deleteit.later;

import java.util.Scanner;

public class Concat {
	
	public static void main(String args[])
	{
	int i=4;
	double d=4.0;
	String s= "hacherrank";
		
	 Scanner scan = new Scanner(System.in);
	 int intval = scan.nextInt();
	 double doub = scan.nextDouble();
	 scan.nextLine();
	 String str = scan.nextLine();
     

     System.out.println(intval+i);
     System.out.println(doub+d);
     System.out.println(s+str);
	}
}
