class Solution {
    public int trap(int[] h) {
        //  int l=0;
        // int res=0;
        // int r=h.length-1;
        // while(l<=r){
        //     int wc=Math.min(h[l],h[r])*(r-l);
        //     res=Math.max(res,wc);
        //     if(h[l]<h[r]){
        //         l++;
        //     }else{
        //         r--;
        //     }
        // }return res;
        int l=0;
		int r=h.length-1;
        int tcap=0;
		int lmax=h[0],rmax=h[h.length-1];
		while(l<r) {
			if(lmax<rmax) {
				l++;
				lmax=Math.max(lmax,h[l]);
				tcap+=(lmax-h[l]);
			}else {
				r--;
				rmax=Math.max(rmax, h[r]);
				tcap+=(rmax-h[r]);
			}
		}return tcap;
    }
}