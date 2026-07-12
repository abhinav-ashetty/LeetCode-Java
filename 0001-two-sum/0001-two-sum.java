class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    indices.add(i);
                    indices.add(j);
                }
            }
        }
        int[] sol = new int[indices.size()];
        for(int i =0;i< indices.size() ; i++){
            sol[i]= indices.get(i);
        }
        return sol;
    }
}