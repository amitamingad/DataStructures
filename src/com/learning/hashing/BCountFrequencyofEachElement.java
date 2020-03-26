package com.learning.hashing;

public class BCountFrequencyofEachElement {
	
	static int[] arr = new int[]{10,12,10,15,10,20,12,12};
	// If we run outer loop from i=0 and inner loop
	// j=i+1 times, the duplicate items will be counted twice
	// ex: 10 - 3, 10-2
	public static void main(String[] args) {
		countFreq(arr.length);
	}
	private static void countFreq(int n) {
		
		int count=0;
		boolean flag;
		for(int i=0; i<n; i++)
		{
			flag = false;
			for(int j=i-1; j>=0; j--)
			{
				if(arr[i] == arr[j])
				{
					flag=true;
					break;
				}
				
			}
			if(flag == true)
				continue;
			
			count=1;
			for(int k=i+1; k<n; k++)
			{
				if(arr[i] == arr[k])
				{
					count++;
				}
			}
			System.out.println("The frequency of element " + arr[i] + " is" + count);
		}
	}

}
