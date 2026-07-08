class Solution {
    public int removeDuplicates(int[] nums) {
        
        // Two pointers

        int random = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[random] != nums[i])
            {
                random++;
                nums[random] = nums[i];
            }
        }

        return random + 1;
    }
}