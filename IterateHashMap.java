package com.practice.deleteit.later;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Iterate HashMap in all possible ways

public class IterateHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int i=0;
		for(char ch='a';ch<='p';ch++)
		{
			map.put(ch+"", i);  // I have decalred hashmap as String, Integer, but storing character so concatenated with ""(it will covnert char to String) 
			i++;
		}
		System.out.println(map);
		//Iterate over key
		Set s = map.keySet();
		//Iterate over key and value
		Set s1 = map.entrySet();
		//Iterate over key seprately
		Set s2 = map.entrySet();
		
		Iterator iter = s.iterator();
		Iterator iter1 = s1.iterator();
		Iterator iter2 = s2.iterator();
		
		while(iter.hasNext())
		{System.out.print(iter.next()+",");}
		
		while(iter1.hasNext())
		{System.out.println(iter1.next());}
		
		while(iter2.hasNext())
		{
		Map.Entry entry = (Map.Entry)iter2.next();
		System.out.println("Keys are "+entry.getKey()+" Values are "+entry.getValue());
		}
		
		//other way to iterate over values
		
		Collection c = map.values();
	    Iterator iter3 = c.iterator();
	    
	    while(iter3.hasNext())
		{System.out.println(iter3.next());}
		
	}
	

}
