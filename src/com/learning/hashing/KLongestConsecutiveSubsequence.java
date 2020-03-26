package com.learning.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KLongestConsecutiveSubsequence {
	
	static int[] arr = {3,8,4,5,7,2,1};
	public static void main(String[] args) {
		System.out.println(LongestConsecutiveSubsequence(arr, arr.length));
	}
	private static int LongestConsecutiveSubsequence(int[] arr, int n) {
		
		Set<Integer> map = new HashSet<Integer>();
		int count, res=0;;
		for(int i=0; i<n; i++)
		{
			map.add(arr[i]);
		}
		
		for(int i=0; i<n; i++)
		{
			count =1;
			if(!map.contains(arr[i]-1))
			{
				while(map.contains(arr[i]+count))
					count++;
			}
			res = Math.max(res, count);
		}
		return res;
	}

}
