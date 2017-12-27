package delete;

import java.util.HashSet;

public class FindDupliAndOccurence {

	
	
	public void findDupli(int arr[])
	{
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					set.add(arr[i]);
					break;
				}
			}
		
		}
		System.out.println("Total duplicate elements are "+set.size()+ " and Duplicate elements and their occurence are ");
		for(int num: set)
		{
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,3,67,12,89,90,1,2,3,67};
		FindDupliAndOccurence obj = new FindDupliAndOccurence();
		obj.findDupli(arr);

	}

}
	