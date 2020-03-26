package com.learning.hashing;

import java.util.HashSet;

public class FSubArraywithZeroSum {
	
	static int[] arr = new int[]{1,4,13,-3,-10,5};
	// presum {1,5,18,15,5,10}
	// if two elements with same value then 
	// there exists sunarray with zero sum
	public static void main(String[] args) {
		System.out.println(findsubarraywithZeroSum(arr, arr.length));
	}
	 static boolean findsubarraywithZeroSum(int[] arr, int n) {
		
		int pre_sum=0;
		HashSet<Integer> h = new HashSet<>();
		for(int i=0; i<n; i++)
		{
			
			if(arr[i] == 0)
				return true;
			
			pre_sum+=arr[i];
			
			// if pre-sum itself becomes 0
			// then there is a subarraywith zero sum
			if(pre_sum==0)
				return true;
			
			if(h.contains(pre_sum))
				return true;
			h.add(pre_sum);
		}
		return false;
		
	}

}
