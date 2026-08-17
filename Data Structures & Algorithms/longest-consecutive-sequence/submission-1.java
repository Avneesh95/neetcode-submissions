class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest = 1;
        int count = 1;

        if(nums.length ==0)
        {
            return 0;
        }
        
        for(int i = 1;i<nums.length ; i++)
        {
            if(nums[i] == nums[i-1])
            {
                continue;
            }

            if (nums[i] - 1 == nums[i - 1])
            {
                count ++;

                longest = Math.max(count,longest);
            }
            else
            {
                count=1;
            }
        }
        return longest;
    }
}
