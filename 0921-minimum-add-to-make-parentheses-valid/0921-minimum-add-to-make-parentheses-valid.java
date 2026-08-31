class Solution {
    public int minAddToMakeValid(String s) {
        int balance=0;
        int addition =0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') balance++;
            else if(s.charAt(i)==')'){
                if(balance>0) balance--;
                else addition++;
            }
        }
        addition += balance;
        return addition;
    }
}