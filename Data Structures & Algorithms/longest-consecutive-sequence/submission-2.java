class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int longest = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] - 1 == nums[i - 1]) {
                count++;
                longest = Math.max(longest, count);
            } else {
                count = 1;
            }
        }

        return longest;
    }
}