package com.practice.deleteit.later;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(checkAnagram(a,b));
	}
	
	public static int checkAnagram(String str1, String str2)
	{
		int result=0;
		int temp[] = new int[26];
		for(char a: str1.toCharArray())
		{
			temp[a-'a']++;
		}
		for(char a : str2.toCharArray())
		{
			temp[a-'a']--;
		}
		
		System.out.println(Arrays.toString(temp));
		for(int i : temp){
			result=Math.abs(i);
		}
		return result;
		
		
	}

}
