class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0) return 0;
        if(nums.length == 1 && nums[0] == k ) return 1;
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            
            int sum =0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
                
            }
        }
        return count;
    }
}