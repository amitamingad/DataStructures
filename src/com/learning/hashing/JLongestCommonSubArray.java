package com.learning.hashing;

public class JLongestCommonSubArray {

	// Java program to find largest subarray 
	// with equal number of 0's and 1's.
	static int[] arr1 = {0, 1, 1, 1, 0, 1, 1}; 
	static int[] arr2 = {1, 0, 0, 1, 1, 0, 1};
	public static void main(String[] args) {
		
		int[] arr = new int[arr1.length];
		for(int i=0; i<arr1.length; i++)
			arr[i] = arr1[i] - arr2[i];
		
		// arr[i]
		// {-1,0,-1,0,0, 1,0}
		//****************************
		// 0 in the input array deosn't matter as long as the subarray sum is zero
		// you find the presum and find any repeating element, follow the same logic
		// {-1, -1,-2,-2,-2,-1,-1}
		System.out.println(HLongestSubarraywith0Sum.findsubarraywithZeroSum(arr, arr.length));

	}

}
