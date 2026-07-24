class Solution {
    public int getSum(int a, int b) {
        int res=0;
        int carry=-1;
        while(carry!=0){
            res=a^b;
            carry=(a&b)<<1;
            a=res;
            b=carry;
        }
        return res;
    }
}