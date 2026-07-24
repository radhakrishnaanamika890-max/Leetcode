class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i:nums) li.add(i);
        for(int i:nums) li.add(i);
        int[] res=new int[li.size()];
        for(int i=0;i<res.length;i++){
            res[i]=li.get(i);
        }
        return res;
        /*int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;*/

    }
}