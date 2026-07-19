class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int r = n-1;
        for(int l =0;l<=(n/2);l++){
            if(nums[l]==target){
                return l;
            }
            else if(nums[r]==target){
                return r;
            }
            r--;
        }
        return -1;
    }
}