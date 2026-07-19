class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r =n-1;
        while(l <= r){

    int mid = l + (r - l)/2;

    if(nums[mid] == target)
        return mid;

    if(nums[l] <= nums[mid]){

        // Left half sorted

        if(nums[l] <= target && target < nums[mid])
            r = mid - 1;
        else
            l = mid + 1;

    }else{

        // Right half sorted

        if(nums[mid] < target && target <= nums[r])
            l = mid + 1;
        else
            r = mid - 1;

    }
}
        // int r = n-1;
        // for(int l =0;l<=(n/2);l++){
        //     if(nums[l]==target){
        //         return l;
        //     }
        //     else if(nums[r]==target){
        //         return r;
        //     }
        //     r--;
        // }
        return -1;
    }
}