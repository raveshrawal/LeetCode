class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 =0;
        long z1 =0;
        long sum2 =0; 
        long z2 =0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0){
                nums1[i]++;
                z1++;
            }
            sum1 += nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            if(nums2[j]==0){
                nums2[j]++;
                z2++;
            }
            sum2 += nums2[j];
        }

        if((sum1<sum2 && z1==0)|| (sum1>sum2 && z2==0) ){
            return -1;
        }
        return Math.max(sum1,sum2);

        // if(sum1<sum2 && z1>0){
        //     return sum2;
        // }else if(sum1>sum2 && z2>0){
        //     return sum1;
        // }else{
        //     return -1;
        // }
    }
}