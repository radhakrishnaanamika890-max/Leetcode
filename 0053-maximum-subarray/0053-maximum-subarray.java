class Solution {
    public int maxSubArray(int[] nums) {
        int gs=nums[0],cs=nums[0];
        for(int i=1;i<nums.length;i++){
            cs=Math.max(cs+nums[i],nums[i]);
            gs=Math.max(gs,cs);
        }
        return gs;
    }
}