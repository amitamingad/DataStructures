package com.learning.hashing;

public class CArrayIntersection {
	
	static int[] arr1 = new int[]{10,15,20,15,30,30,5};
	static int[] arr2 = new int[]{30,5,30,80};
	
	// duplicates in the second array are ignored
	// common elements, 30, 5
	// output 2
	public static void main(String[] args) {
		countCommonElements(arr1.length, arr2.length);
	}


	private static void countCommonElements(int n1, int n2) {
		
		boolean flag;
		int res=0;
		for(int i=0; i<n1; i++)
		{
			flag = false;
			for(int j=i-1; j>=0; j--)
			{
				if(arr1[i] == arr1[j])
				{
					flag = true;
					break;
				}
			}
			if(flag)
			continue;
			
			for(int j=0; j<n2; j++)
			{
				if(arr1[i] == arr2[j])
				{
					res++;
					break;
				}
			}
		}
		System.out.println("Intersection of 2 arrays is "+ res);
				
	}
	
	
	// union of 2 arrays
	// arr1 = {15, 20, 5, 15}
	// arr2 = {15, 15, 20 , 10}
	// add eleemts to new array with size arr1.size + arr2.size
	// find the distinct elements in them

}
