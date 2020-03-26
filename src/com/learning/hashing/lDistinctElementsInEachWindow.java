package com.learning.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lDistinctElementsInEachWindow {
	
	static int[] arr = {10,20,10,10,30,40,10};
	public static void main(String[] args) {
		// window k=4
		int k=4;
		distinctElemntsinWindow(arr,arr.length, k);
	}
	private static void distinctElemntsinWindow(int[] arr, int n, int k) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<k; i++)
		{
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else
				map.put(arr[i], map.get(arr[i])+1);
		}
		System.out.println(map.size());
		for(int i=k; i<n; i++)
		{
			// decrease freq of stored key, if arr[i]
			int j = map.get(arr[i-k]);
			map.put(arr[i-k], --j);
			
			// remove the elemnt from map
			// if the freq of arr[i-k] becomes 0
			// beacause it's already printed in previous window
			
			if( j == 0)
				map.remove(arr[i-k]);
			
			// if map does not contain arr[i]
			// add it else increment the count of that key value
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else
				map.put(arr[i], map.get(arr[i])+1);
			
			// print size of the map
			System.out.println(map.size());
		}
	}

}
