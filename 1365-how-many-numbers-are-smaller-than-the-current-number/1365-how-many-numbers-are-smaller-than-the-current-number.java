class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        /*int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;*/
        /*ArrayList<Integer> li = new ArrayList<>();
        for (int num : nums) {
            li.add(num);
        }
        int[] res = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            int count = 0;
            for (int j = 0; j < li.size(); j++) {
                if (i != j && li.get(j) < li.get(i)) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;*/
        ArrayList<Integer> li = new ArrayList<>();
        for (int num : nums) {
            li.add(num);
        }
        Collections.sort(li);
        for(int i=0;i<nums.length;i++){
            nums[i]=li.indexOf(nums[i]);
        }return nums;
    }
}