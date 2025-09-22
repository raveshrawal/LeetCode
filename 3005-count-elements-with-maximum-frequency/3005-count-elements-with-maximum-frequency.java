class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] frq = new int[101];
        int maxf = -1;
        for(int i=0;i<nums.length;i++){
            frq[nums[i]]++;
            maxf = Math.max(maxf,frq[nums[i]]);
        }
        int ttl =0;
        for(int i=0;i<101;i++){
            if(frq[i]==maxf){
                ttl += frq[i];
            }
        }
        return ttl;
    }
}