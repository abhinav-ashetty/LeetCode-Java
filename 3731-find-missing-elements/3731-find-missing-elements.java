class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> miss = new ArrayList<>();
        for(int i= nums[0]; i <= nums[n-1];i++){
            miss.add(i);
        }
        for(int i=0;i<n;i++){
            miss.remove(Integer.valueOf(nums[i]));
        }
        return miss;
    }
}