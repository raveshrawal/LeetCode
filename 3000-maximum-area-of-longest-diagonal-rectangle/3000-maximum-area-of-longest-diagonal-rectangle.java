class Solution {
    public int areaOfMaxDiagonal(int[][] nums) {
        int maxa =0;
        double maxd =0;


        for(int i=0;i<nums.length;i++){
            double d = Math.sqrt(nums[i][0]*nums[i][0] + nums[i][1]*nums[i][1]);
            int area = nums[i][0]*nums[i][1];
            if(d>maxd || (d==maxd && area>maxa )){
                maxd = d;
                maxa= area;
            }
        }
        return maxa;
    }
}