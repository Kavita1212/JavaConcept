package binarySearch;

import java.util.Arrays;

//leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPosition {

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 }; //Output: [3,4]
		int target = 8;
		int[] op =searchRange(nums, target);
		System.out.println(Arrays.toString(op));

	}

	public static int[] searchRange(int[] nums, int target) {
		int[] ans = {-1,-1};
		ans[0]=search(nums, target, true);
		if(ans[0]!=-1) {
			ans[1]=search(nums, target, false);
		}
		return ans;
		}
		

	
	public static int search(int[] nums, int target,boolean firstIndex) {
		int ans=-1;
		int s=0;
		
		int e=nums.length-1;
		
		
		while(s<=e) {
			//find middle index
			int mid = s+(e-s)/2;
			
			//if target is greater
			if(target>nums[mid]) {
				s=mid+1;
			}
			//target is small
			else if(target<nums[mid]) {
				e=mid-1;
			}
			//match is found
			else {
				ans=mid;
				if(firstIndex) {
					e=mid-1;
				}
				else {
					s=mid+1;
				}
			}
		
	}
		return ans;
	}
}
