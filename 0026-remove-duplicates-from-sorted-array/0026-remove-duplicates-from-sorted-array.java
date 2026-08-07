class Solution {
    public int removeDuplicates(int[] nums) {
        // Set<Integer> res=new TreeSet<>();
        // for(int x: nums){
        //     res.add(x);
        // }
        // int j=0;
        // for(int y: res){
        //     nums[j]=y;
        //     j++;
        // }
        // return res.size();
        if(nums.length==0){
            return 0;
        }
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[k]){
                k++;
                nums[k]=nums[i];
            }
        }return k+1;
    }
}