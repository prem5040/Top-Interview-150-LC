//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int removeDuplicates(int[] nums) {
        // int index=0;
        int j=1;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
