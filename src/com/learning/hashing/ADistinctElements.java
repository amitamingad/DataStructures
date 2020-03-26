package com.learning.hashing;

import java.util.HashSet;

public class ADistinctElements {
	
	static int[] arr = new int[]{2,2,5,4,6,2,5};
	
	public static void main(String[] args) {
	
		System.out.println("Count of disticnt elements is "+ naiveCountDistinctelements(arr.length));
		System.out.println("Count of disticnt elements is "+ CountDistinctelements(arr.length));
	}
	
	
	private static int CountDistinctelements(int length) {
		
		HashSet<Integer> h = new HashSet<>();
		for(int i=0; i<length; i++)
		{
			if(!h.contains(arr[i]))
			{
				h.add(arr[i]);
			}
		}
		return h.size();
	}


	// Traverse each element on the left side and increment the
	// count 
	private static int naiveCountDistinctelements(int n) {
		
		int count=1;boolean flag = true;
		for(int i=1; i<n; i++)
		{
			flag = true;
			for(int j=0; j<i; j++)
			{
				if(arr[i] == arr[j])
				{
					flag=false;
					break;
				}
			}
			if(flag)
				count++;
		}
		return count;
	}

}
