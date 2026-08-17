class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0;
        int gl = 0;
        for (int i = 0; i < k; i++) {
            gl += arr[i];
        }
        if (gl/k >= threshold) {
            res++;
        }
        int cur=gl;
        for (int i = k; i < arr.length; i++) {
            cur += arr[i] - arr[i - k];
            if (cur/k>=threshold) {
                res++;
            }
        }
        return res;
    }
}