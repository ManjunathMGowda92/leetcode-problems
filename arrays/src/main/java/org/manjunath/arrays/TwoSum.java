package org.manjunath.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/**
	 * Method getTwoSumIndices() is used to find the indices of the pair of integers
	 * from the array, which forms the target sum
	 * 
	 * @param nums   Array of Integers
	 * @param target Target Sum
	 * @return Array with indices of pair of integers
	 */
	public int[] getTwoSumIndices(int[] nums, int target) {
		/*
		 * iterate through the array and try to find sum with current number and next
		 * numbers in the array
		 */
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; i < nums.length; j++) {
				if (nums[i] + nums[j] == target)
					return new int[] { i, j };
			}
		}

		// if the pair is not available then throw an exception
		throw new RuntimeException("No two numbers are matched for the given Target");
	}

	/**
	 * Method fetchTwoSumIndices() is used to find the indices of the pair of
	 * integers from the array, which forms the target sum
	 * 
	 * @param nums   Array of Integers
	 * @param target Target Sum
	 * @return Array with indices of pair of integers
	 */
	public int[] fetchTwoSumIndices(int[] nums, int target) {
		// Create a Map to store integers with their respective index
		Map<Integer, Integer> map = new HashMap<>();

		// iterate through the array
		for (int i = 0; i < nums.length; i++) {
			// find complement of the current number (target - current num)
			int complement = target - nums[i];

			/*
			 * if the complement number is already exists in key of map, then the pair
			 * number is available. So return both indices of complement and current number
			 */
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}

			// if complement not found add number as key and index as value into the map
			map.put(nums[i], i);
		}

		// if the pair is not available then throw an exception
		throw new RuntimeException("No two numbers are matched for the given Target");
	}
}
