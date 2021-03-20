import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // Immediately below is mine, which doesn't finish fast enough for leetCode
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                System.out.println("nums[i]: " + nums[i] + ", nums[j]: " + nums[j]);
//                if(nums[i] == nums[j]) return true;
//            }
//        }
//        return false;


        // Immediately below is a modified (by me) version of one of the published fastest that sorts first then only
        // compares a number to the next number. This one times out on my machine with one of the leetCode test sets
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                System.out.println("nums[i]: " + nums[i] + ", nums[i+1]: " + nums[i+1]);
                return true;
            }
        }
        return false;
    }

/* From LeetCode https://leetcode.com/problems/contains-duplicate/
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:

1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9

*/
}
