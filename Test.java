package com.practice.deleteit.later;

/*
 * Add the sum of two numbers. The input format is like this:

The first line of input consists of a single integer p. This is the number of test cases. 
The next p lines contains two space separated integers a and b.

There will be p lines of output. For each test case, the output would the result a + b.

Sample Input

2
2 3
3 4
Sample Output

5
7
 * 
 * 
 * **/


import java.util.Arrays;
import java.util.Scanner;

class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int numLength =0;
        int arr[];
        System.out.println("Enter the limit");
        numLength=sc.nextInt();
        arr = new int[numLength*2];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int arl = arr.length;
        addSum(arr,arl);
    }
    public static void addSum(int arr[], int n)
    {
    	int result[] = new int[n];
    	int i=0,j=0;
    	while(i < n && j<n)
    	{
    		result[j]=arr[i]+arr[i+1];
    		i=i+2;
    		j++;
    	}
    	for(int k=0;k<result.length/2;k++)
    	{
    			System.out.print(result[k]+" ");
    	}
    	
    }
}