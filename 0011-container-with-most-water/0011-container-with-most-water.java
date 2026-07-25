class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int res=0;
        int r=h.length-1;
        while(l<=r){
            int wc=Math.min(h[l],h[r])*(r-l);
            res=Math.max(res,wc);
            if(h[l]<h[r]){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}