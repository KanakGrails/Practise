package com.practice.deleteit.later;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {

	public static void main(String[] args) {
		//Array arr[] =  ;
		List<String> list = Arrays.asList(new String[]{"one","two","three"});
		for(String s: list)
		{System.out.println(s);}
		

		List<Integer> ilist = new ArrayList<Integer>(); 
		for(int i=0;i<3;i++)
		{ilist.add(i);}
		
		Object arrobj[] = ilist.toArray();
		for(Object a:ilist){System.out.println(a);}
		
		Integer arrint[]=ilist.toArray(new Integer[0]);
		for(Integer i:ilist)
		{System.out.println(i);}
		
		
	}

}
