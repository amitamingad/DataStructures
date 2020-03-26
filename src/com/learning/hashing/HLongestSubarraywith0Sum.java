package com.learning.hashing;

import java.util.HashMap;
import java.util.Map;

public class HLongestSubarraywith0Sum {

	static int[] arr = new int[]{1,0,2,-3,-10,5,-5};
	// presum {1,12,14,11,1,-4}
	// if two elements with same value then 
	// there exists sunarray with zero sum
	// {1,-1,3,-2, -1}
	// {1,0, 3,1,0}
	
	// {1, 0, 0, 0, 0, -1, 6}
	public static void main(String[] args) {
		System.out.println(findsubarraywithZeroSum(arr, arr.length));
	}
	
	// [-1, 0, -1, 0, 0, 1, 0]
	 static int findsubarraywithZeroSum(int[] arr, int n) {
		
		Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		int pre_sum = 0, res=0;
		
		for(int i=0; i<n; i++)
		{
			pre_sum+=arr[i];
			
			if(pre_sum == 0)
				res = Math.max(res, i+1);
			
			if(hMap.containsKey(pre_sum))
			{
				res = Math.max(res, i-hMap.get(pre_sum));
			}
			else
				hMap.put(pre_sum, i);
				
		}
		return res;
		
	}
}
