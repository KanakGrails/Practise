package delete;

import java.util.Arrays;

public class StringExample {
	
	public static void main(String args[])
	{
		String str1= "gajarhalwa";
		String str2 ="gajarmitai";
		int comp1=0,comp2=0;
		
		System.out.println(str1.compareTo(str2));
		
		int temp1[] = new int[26];
		int temp2[] = new int[26];
		
		for(char c : str1.toCharArray())
		{
			temp1[c-'a']++;
		}
		for(char c : str2.toCharArray())
		{
			temp2[c-'a']++;
		}
		System.out.println(Arrays.toString(temp1));
		System.out.println(Arrays.toString(temp2));
		for(int i=0;i<temp1.length;i++)
		{
			comp1+=temp1[i];
			comp2+=temp2[i];
		}
		System.out.println(comp1);
		System.out.println(comp2);
	}
}