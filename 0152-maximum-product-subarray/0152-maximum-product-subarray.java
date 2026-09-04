class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            int maxTemp = max;
            int curr = nums[i];

            int set1 = curr;
            int set2 = curr * maxTemp;
            int set3 = curr * min;

            //maximum
            if(set1 > set2 && set1 > set3)
            {
                max = set1;
            }
            else if(set2 > set3)
            {
                max = set2;
            }
            else
            {
                max = set3;
            }

            // minimum
            if(set1 < set2 && set1 < set3)
            {
                min = set1;
            }
            else if(set2 < set3)
            {
                min  = set2;
            }
            else 
            {
                min = set3;
            }

            if(max > res)
            {
                res = max;
            }
        }

        return res;
    }
}