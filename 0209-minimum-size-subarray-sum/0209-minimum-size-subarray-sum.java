class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int j = 0; j< nums.length; j++) {
            currentSum += nums[j];
            while (currentSum >= target) {
                minLength = Math.min(minLength, j - i + 1);
                currentSum -= nums[i];
                i++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}