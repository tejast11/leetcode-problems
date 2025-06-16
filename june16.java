// Problem 2016. LeetCode.com

import java.util.Arrays;
public class june16{
    public static void main(String[] args){
        int[] nums = {1,5,2,10};
        System.out.println(maximumDifference(nums));
    }
    public static int maximumDifference(int[] nums) {
        // Brute Force
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if(nums[j]-nums[i]>max && nums[j]-nums[i]>0 ){
        //             max = nums[j]-nums[i];
        //         }
        //     }
        // }
        // if(max == Integer.MIN_VALUE) return -1;
        // return max;
        int minSoFar = nums[0];
        int maxDiff = -1;
        int n = nums.length;
        for(int i = 1 ; i<n ;i++){
            if(nums[i]>minSoFar){
                maxDiff=Math.max(maxDiff,nums[i]-minSoFar);
            }else{
                minSoFar=nums[i];
            }
        }
        return maxDiff;
    }
}