class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0, rsum=0;
        int maxPoints = 0;
        int n = cardPoints.length;
        for(int i = 0;i<k;i++){
            lsum += cardPoints[i];
        }
        maxPoints = lsum;

        for(int i=k-1, j=n-1;i>=0;i--,j--){
            lsum -= cardPoints[i];
            rsum += cardPoints[j];
            maxPoints = Math.max(maxPoints,lsum+rsum);
        }
        return maxPoints;
    }
}