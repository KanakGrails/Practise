package com.practice.deleteit.later;

import java.util.HashMap;

public class temp {
	public static void main(String[] args) {
		int count=0;
		int arr[] = {1,2,2,3,1,1,1,2,3,78,23,4,56,7,77,1,2,3,78,23,12,12,12,4,56,78,3,56,78,64,456,12,11,1,2,1,3};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			
		 if(map.containsKey(arr[i]))
		 {
			 count=map.get(arr[i]);
			 if(count!=0){
			 map.put(arr[i],++count);
		 }
		 }
		 else 
		 {
			 map.put(arr[i], 1);
		 }
		}
		System.out.println(map);
	}
}

