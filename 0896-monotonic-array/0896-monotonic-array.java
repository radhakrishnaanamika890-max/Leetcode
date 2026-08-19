class Solution {
    public boolean isMonotonic(int[] arr) {
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<arr.length -1;i++){
            if(arr[i]>arr[i+1]){
                dec=false;
            }
            else if(arr[i]<arr[i+1]){
                inc=false;
            }
        }return inc || dec;
    }
}