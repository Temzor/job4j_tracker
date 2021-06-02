package ru.leetcode.array;

import java.util.Arrays;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int result  = 0;
        Arrays.sort(nums);
        for (int index = 0; index < nums.length - 1; index++) {
            if (nums[index] == nums[index + 1]) {
                result = nums[index];
                break;
            }
        }
        return result;
    }

}
