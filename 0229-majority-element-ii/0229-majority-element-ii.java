class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int num:map.keySet()) {
            if (map.get(num)>nums.length/3) {
                result.add(num);
            }
        }
        return result;   
    }
}