class Solution {
    public int longestSubarray(int[] nums) {
        int zero = 0;
        int left = 0;
        int right = 0;
        int max =0;

        while(right<nums.length && left<=right){

            if(nums[right]==1){
                right++;
            }else{
                right++;
                zero++;
            }
            if(zero>1){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            max = Math.max(max,right-left-1);
        }
        return max;
    }
}