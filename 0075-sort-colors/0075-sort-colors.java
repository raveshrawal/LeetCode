class Solution {
    public void sortColors(int[] nums) {
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0;i<nums.length;i++ ){
            if(nums[i]==0){
                a++;
            }else if(nums[i]==1){
                b++;
            }else{
                c++;
            }
        }
        int idx = 0;
        while(a>0 || b>0 || c>0){
            if(a>0){
                nums[idx] = 0;
                a--;
            }else if(b>0){
                nums[idx] = 1;
                b--;
            }else{
                nums[idx] = 2;
                c--;
            }
            idx++;
        }
        
    }
}