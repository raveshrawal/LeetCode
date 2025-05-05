class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
            int rev =0;
            while(nums[i]!=0){
                rev = rev*10 + nums[i]%10;
                nums[i] /= 10; 
            }
            hs.add(rev);
        }
        return hs.size();
    }
}