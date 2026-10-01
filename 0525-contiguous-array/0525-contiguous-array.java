class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> ps = new HashMap<>();
        ps.put(0,-1);
        int sum = 0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) sum -= 1;
            else sum+=1;

            if(ps.containsKey(sum)) maxLen= Math.max(maxLen,i- ps.get(sum));
            else ps.put(sum,i);
        }
        

        // int l =0,r=0;
        // int sum =0;
        // int maxLen = -1;
        // while(r<n){
        //     sum += newNums[r];
            
        //     if(r == n-1 && sum != 0){
        //         while(l<r && sum!=0){
        //             sum-= newNums[l];
        //             l++;
        //         }
        //     }
        //     if(sum == 0){
        //         maxLen = Math.max(maxLen, r-l+1);
        //         l++;
        //         r=l;
        //     }
        //     r++;
        // }
        return maxLen;
    }
}