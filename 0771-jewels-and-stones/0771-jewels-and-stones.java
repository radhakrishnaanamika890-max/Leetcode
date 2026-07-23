class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                char jChar = jewels.charAt(i);
                char sChar = stones.charAt(j);
                if(jChar==sChar){
                    count++;
                }
            }
        }return count;
    }
}