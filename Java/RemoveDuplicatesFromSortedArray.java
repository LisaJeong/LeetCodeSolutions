//Source: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
/**************************************************************************
* Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
* Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
*
* Example 1:
*
* Given nums = [1,1,2],
*
* Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
* It doesn't matter what you leave beyond the returned length.
*
* Example 2:
*
* Given nums = [0,0,1,1,1,2,2,3,3,4],
*
* Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
* It doesn't matter what values are set beyond the returned length.
**************************************************************************/
//Solution
//Time O(n), space O(1)

class Solution{
    public int removeDuplicates(int[] nums)
    {
        //edgeCase checking 
        if(nums.length == 0 || nums == null)
        {
            return 0;
        }
        
        int i = 1;
        int pointer = nums[0];
        
        for(int j = 1; j < nums.length; j++)
        {
            if(nums[j] != pointer)
            {
                pointer = nums[j]; //resetting pointer to newly found number
                nums[i++] = nums[j]; //replacing duplicated number with found non-duplicate number
            }
        }
        return i;
    }

}
