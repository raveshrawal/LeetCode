class Solution {
    public int[] buildArray(int[] nums) {
        int[] prm = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            prm[i] = nums[nums[i]];
        }
        return prm;
    }
}