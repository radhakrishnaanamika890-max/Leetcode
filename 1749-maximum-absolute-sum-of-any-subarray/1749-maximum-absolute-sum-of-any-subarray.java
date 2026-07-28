class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currentMax = 0;
        int globalMax = 0;
        int currentMin = 0;
        int globalMin = 0;
        for (int i = 0; i < nums.length; i++) {
            currentMax = Math.max(0, currentMax + nums[i]);
            globalMax = Math.max(globalMax, currentMax);
            currentMin = Math.min(0, currentMin + nums[i]);
            globalMin = Math.min(globalMin, currentMin);
        }
        return Math.max( Math.abs(globalMax), Math.abs(globalMin));
    }
}