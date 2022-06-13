package com.leetcode.easy;

public class TwoSum {

	public static void main(String[] args) {
		int num[] = new int[] { 1, 2, 3, 4 };

		int[] twoSum = TwoSum.twoSum(num, 4);
		System.out.println(twoSum[0] + "," + twoSum[1]);// June Commit

	}

	public static int[] twoSum(int[] num, int target) {

		int[] returnArr = new int[2];

		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] + num[j] == target) {
					returnArr[0] = i;
					returnArr[1] = j;

				}
			}
		}
		return returnArr;
	}

}