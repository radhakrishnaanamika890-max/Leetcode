class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] arr = String.valueOf(n).toCharArray();//[3,3,2]
        int len = arr.length;
        int mark = len; 
        for (int i = len - 1; i > 0; i--) {
            if (arr[i - 1] > arr[i]) {
                arr[i - 1]--;
                mark = i;
            }
        }      
        for (int i = mark; i < len; i++) {
            arr[i] = '9';
        }
        return Integer.parseInt(String.valueOf(arr));
    }
}