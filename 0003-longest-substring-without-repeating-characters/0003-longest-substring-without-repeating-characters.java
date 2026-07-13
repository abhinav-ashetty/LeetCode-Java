class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hash = new HashMap<>();
        int n = s.length();
        int maxLen=0;
        int l=0,r=0;
        while(r<n){
            char ch = s.charAt(r);
            if(hash.containsKey(ch) && hash.get(ch)>=l){
                l=hash.get(ch)+1;
            }
            hash.put(ch,r);
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}