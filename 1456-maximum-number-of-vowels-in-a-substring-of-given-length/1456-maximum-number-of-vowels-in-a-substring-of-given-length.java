// class Solution {
//     public int maxVowels(String s, int k) {
//         int count=0;
//         int max=0;
//         for(int i=0;i<k;i++){
//             if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i' || s.charAt(i)=='o'||s.charAt(i)=='u'){
//                 count++;
//             }
//         }
//         max=count;
//         for(int i=k;i<s.length();i++){
//             if(s.charAt(i-k)=='a' || s.charAt(i-k)=='e'||s.charAt(i-k)=='i' || 
//                 s.charAt(i-k)=='o'||s.charAt(i-k)=='u'){
//                 count--;
//             }
//             if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i' || s.charAt(i)=='o'||s.charAt(i)=='u'){
//                 count++;
//             }
//             max=Math.max(max,count);
//         }return max;
//     }
// }

class Solution {
    public boolean isVowels(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        for(int i=0;i<k;i++){
            if(isVowels(s.charAt(i))){
                count++;
            }
        }
        max =count;
        for(int i=k;i<s.length();i++){
            if(isVowels(s.charAt(i)))count++;
            if(isVowels(s.charAt(i-k))) count--;
            max=Math.max(max,count);
        }
        return max;
    }
}