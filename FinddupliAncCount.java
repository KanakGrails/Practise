package com.practice.deleteit.later;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class FinddupliAncCount implements Comparator {

	public static void main(String[] args) {
		int count=0;
		int arr[] = {78,23,4,56,7,77,1,2,3,78,23,12,12,12,4,56,78,3,56,78,64,456,12,11,1,2,1,3};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i])){
			count=map.get(arr[i]);
			map.put(arr[i], ++count);
			}
			else 
			{
				map.put(arr[i],1);
			}
		  
		}
		System.out.println("Occurent"+map);
		Collection c = map.values();
		Iterator iter = c.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println(map.values());
		//System.out.println(Collection.sort(map.values()));
		
		int maxValueInMap=(Collections.max(map.values()));
		System.out.println("==================================");
		System.out.println(maxValueInMap);
		
	}
	
	
	@Override
	public int compare(Object arg0, Object arg1) {
	    
		return 0;
	}

}
