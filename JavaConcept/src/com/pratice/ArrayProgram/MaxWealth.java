package com.pratice.ArrayProgram;

public class MaxWealth {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{3,2,1,7}};
		int output = maxWealth(a);
		System.out.println(output);
	}
	public static int maxWealth(int[][] accounts) {
		int ans =Integer.MIN_VALUE;
		for (int person = 0; person < accounts.length; person++) {
			int sum=0;
			for (int account = 0; account < accounts[person].length; account++) {
				sum+=accounts[person][account];
				
			}
			if(sum>ans) {
				ans = sum;
			}
		}
		return ans;
	}
}