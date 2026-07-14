class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxLen = 0;
        HashMap<Integer,Integer> Basket = new HashMap<>();
        int l=0,r=0;
        while(r<n){
            
            Basket.put(fruits[r],(Basket.getOrDefault(fruits[r],0))+1);
            while(Basket.size()>2){
                Basket.replace(fruits[l],(Basket.get(fruits[l]))-1);
                if(Basket.get(fruits[l]) == 0)
                    Basket.remove(fruits[l]);
                l++;
            }
            maxLen= Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}