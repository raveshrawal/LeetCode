class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n];

        for(int i=0;i<queries.length;i++){
            diff[queries[i][0]]++;

            if(queries[i][1]+1 <n){
                diff[queries[i][1]+1]--;
            }
        }

        int csum = 0;
        int[] res = new int[n];

        for(int i=0;i<diff.length;i++){
            csum += diff[i];
            res[i] = csum;
            if(res[i]<nums[i]){
                return false;
            }
        }

        return true;
    }
}