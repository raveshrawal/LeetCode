class Solution {
    public int[] buildArray(int[] nums) {
        swap(nums,0);
        return nums;
    }
    public void swap(int[] nums,int i){
        if(i<nums.length){
            int t = nums[i];
            int s = nums[t];
            swap(nums,i+1);
            nums[i] = s;
        }
    }
}