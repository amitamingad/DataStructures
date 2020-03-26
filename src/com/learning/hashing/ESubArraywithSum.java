package com.learning.hashing;

import java.util.HashSet;

public class ESubArraywithSum {
	
	static int[] arr = new int[]{5,8,6,13,3,9};
	
	// sum = 22
	// subarray {6,13,3} forms sum 22
	public static void main(String[] args) {
		System.out.println(findsubarraySum(arr.length, 9));
	}
	private static boolean findsubarraySum(int n, int sum) {
		
		int pre_sum=0;
		HashSet<Integer> h = new HashSet<>();
		for(int i=0; i<n; i++)
		{
			
			if(pre_sum == sum)
				return true;
			
			pre_sum+=arr[i];
			
			if(h.contains(pre_sum-sum))
				return true;
			h.add(pre_sum);
		}
		return false;
		
	}

}
