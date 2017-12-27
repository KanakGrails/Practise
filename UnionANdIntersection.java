package com.practice.deleteit.later;

import java.util.Arrays;

public class UnionANdIntersection {

	public static void main(String[] args) {
		int arr1[] = {12,42,1,32,53,1,45,3,5,6};
		int arr2[] = {89,34,12,2,3,8,1,34,6,12};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		unionIntersectionoftwoArray(arr1, arr2);

	}

	
	public static void unionIntersectionoftwoArray(int arr1[],int arr2[])
	{
		String union="";
		String intersection="";
		int i=0,j=0;
		
		while(i < arr1.length && j< arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				union+=arr1[i]+" ";
				intersection+=arr1[i]+" ";
				i++;j++;
			}
			else if(arr1[i] < arr2[j])
			{
				union+= arr1[i]+" ";
				i++;
			}
			else{
				union+=arr2[j]+" ";
				j++;
			}
		}
		
		if(i<arr1.length)
		{
			union+=arr1[i]+" ";
			
		}
		if(j<arr2.length)
		{
			union+=arr2[j]+" ";
		}
		System.out.println("Union of Array items "+union);
		System.out.println("Intersection of Array items "+intersection);
	}
}
