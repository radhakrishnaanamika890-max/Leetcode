class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double globalSum=0;
		for(int i=0;i<k;i++) {
			globalSum+=nums[i];
			
		}
		double currentSum=globalSum;
		for(int i=k;i<nums.length;i++) {
			currentSum+=nums[i]-nums[i-k];
			globalSum=Math.max(globalSum, currentSum);
		}
        return globalSum/k;
        }
    
}