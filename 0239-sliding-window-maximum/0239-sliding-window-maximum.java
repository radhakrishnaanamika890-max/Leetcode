class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int[] result = new int[nums.length - k + 1];
        // for (int i = 0; i <= nums.length - k; i++) {
        //     int max = nums[i];
        //     for (int j = i; j < i + k; j++) {
        //         max = Math.max(max, nums[j]);
        //     }
        //     result[i] = max;
        // }
        // return result;
        Deque<Integer> dq= new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        int index=0;
        int l=0,r=0;
        while(r<nums.length){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[r]){
                dq.pollLast();
            }dq.offerLast(r);
            if(l>dq.peekFirst()){
                dq.pollFirst();
            }
            if(r+1>=k){
                res[index++]=nums[dq.peekFirst()];
                l++;
            }
            r++;
        }return res;
    }
}