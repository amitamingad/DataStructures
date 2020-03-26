package com.learning.hashing;

import java.util.HashMap;
import java.util.Map;

public class ILongestSubArraySumWithequalZeoandOnes {

	
	public static void main(String[] args) {
		int[] arr = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1};
		// {1, 1, 1, 0, 1, 0, 1, 1, 1}
		System.out.println(findSum(arr, arr.length));
		//System.out.println(largestZeroSubarray(arr, arr.length));

	}
	
	
	
	// ***************************
	// The longest subarray with zero sum is same as 
	// equal no of 0's and 1's
	static int findSum(int[] arr, int n) {				
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] == 0)
				arr[i] = -1;
		}
		
		HashMap<Integer, Integer> hMap = new HashMap<>();
		int res=0, pre_sum = 0;
		
		for(int i=0; i<n; i++)
		{
			pre_sum+=arr[i];
			// [0,0,1,1,1,1,0,0]
			//{-1,-1,1,1,1,1,-1,-1}
	        //{-1,-2,-1,0,1,2,1,0}
			
			// {1,1,1,0,1,0,1,1,1}
			// {1,1,1,-1,1,-1,1,1,1}
			// {1,2,3,2,3,2,3,4,5}
			if(pre_sum == 0)
			{
				//if(i+1 == n)
					res = Math.max(res, i+1);
				//else
					
			}
				
			
			if(hMap.containsKey(pre_sum))
				res = Math.max(res, i - hMap.get(pre_sum));
			else	
			hMap.put(pre_sum, i);	
			
		}
		return res;
	}


}
