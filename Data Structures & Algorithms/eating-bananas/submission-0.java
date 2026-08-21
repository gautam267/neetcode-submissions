class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max) max=piles[i];
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int k=Calculated_TotalHours(piles,mid);
            if(k<=h) high=mid-1;
            else low=mid+1;
        }
        return low;
    }

    private int Calculated_TotalHours(int piles[],int k){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=Math.ceil((double)piles[i]/k);
        }
        return hours;
    }
}
