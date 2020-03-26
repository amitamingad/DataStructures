package com.learning.hashing;

import java.util.HashMap;

public class GLongestSubarraywithSum {

	static int[] arr = new int[]{3,1,0,1,8,2, 3,6};
	// Sum - 5
	// pre_sum {3,4,4,5,13,15,18,24}
	// There are 2 subarrays with sum 5 - {3,1,0,1} and {2,3}
	
	// corner case {2,3,1}
	// sum=5
	// hmap.contains(presum-sum) doesn't work here
	public static void main(String[] args) {
		findsubarraywithSum(arr.length, 5);
	}
	
	private static void findsubarraywithSum(int n, int sum) 
	{
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int pre_sum = 0;
		int res = 0;
		for(int i=0; i<n; i++)
		{					
			if(pre_sum == sum)
			{
				res = Math.max(res, i);
			}
			
			pre_sum+=arr[i];
			
			if(hmap.containsKey(pre_sum-sum))
			{
				res = Math.max(res, i-hmap.get(pre_sum-sum));
			}
				
			
			hmap.put(pre_sum, i);
			
		}
		System.out.println("Longest subarray sun is " + res);
	}
	
}
