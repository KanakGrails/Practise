package com.practice.deleteit.later;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the limit where you want to generate");
		String limit=br.readLine();
		int size=Integer.parseInt(limit);
		int result[] = new int[size];
		result[0]=0;
		result[1]=1;
		System.out.println(result[0]);
		System.out.println(result[1]);
		for(int i=2;i<result.length;i++)
		{
			result[i]=result[i-1]+result[i-2];
			System.out.println(result[i]);
			
		}
		/*for (int j=0;j<10;j++)
		{
			System.out.println(result[j]);
		}*/
		 String str="kanak";
	       String str1="vasudeva";
	       System.out.println(str+str1);
	       
	       
		int prev=1;
		int prevprev=0;
		int results=0;
		System.out.println("Enter num for till where u want to genearte, let's say 9");
		int n = 9;
		System.out.println(prevprev);
		System.out.println(prev);
		for(int i=2;i<n;i++)
		{
			
			results=prev+prevprev;
			prevprev=prev;
			prev=results;
			System.out.println(prev);
		}
		
	}

}
