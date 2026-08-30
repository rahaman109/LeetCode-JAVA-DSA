class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length;

        for(int i : nums)
        {
            int count = map.getOrDefault(i, 0);
            count = count + 1;
            map.put(i, count);
            if(count > length / 2)
            {
                return i;
            }
        }

        return -1;
    }
}