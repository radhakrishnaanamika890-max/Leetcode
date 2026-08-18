class Solution {
    public String clearDigits(String s) {
        Stack<Character> res=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                res.push(ch);
            }else{
                res.pop();
            }
        }
        String st="";
        for(char ch:res){
            st+=ch;
        }
        return st;
    }
}