package com.leetcode.twosum;

public class Solution {
	 public int[] twoSum(int[] nums, int target) {
		 int result []=new int[2];
		 int sumWithIndex=0;
		 for(int i=1;i<nums.length;i++) {
			 int sum=nums[sumWithIndex]+nums[i];
			 if(sum==target) {
				 result[0]=sumWithIndex;
				 result[1]=i;
				 return result;
			 }
			 System.out.println("---sumWithIndex:"+sumWithIndex+"------i::"+i);
			 if(i==(nums.length-1)&& sumWithIndex<(nums.length-1)) {
				 sumWithIndex++;
				 i=sumWithIndex;
			 }
		 }
		 
		 return result;
	        
	    }
	 public static void main(String[] args) {
		Solution s=new Solution();
		int nums[]= {2,7,11,15};
		int result []=s.twoSum(nums, 9);
		System.out.println(result[1]);
	}
}
