class Solution {
    public boolean isGood(int[] nums) {
        int[] frq = new int[201];
        for(int num : nums){
            frq[num]++;
        }
        for(int i=1;i<nums.length-1;i++){
            if(frq[i]!=1){
                return false;
            }
        }
        return frq[nums.length-1]==2?true:false;
    }
}