class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> res=new TreeSet<>();
        for(int x: nums){
            res.add(x);
        }
        int j=0;
        for(int y: res){
            nums[j]=y;
            j++;
        }
        return res.size();
    }
}