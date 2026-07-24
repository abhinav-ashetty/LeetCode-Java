class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l=0,r= n-1;
        int res=0;
        int area =0;
        while(l<r){
            area = (r-l) * Math.min(height[l],height[r]);
            res= Math.max(res,area);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return res;
    }
}