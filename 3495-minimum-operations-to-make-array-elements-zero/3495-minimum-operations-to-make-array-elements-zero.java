class Solution {
    private long countStep(int l, int r){

        long L =1;
        long S =1;
        long steps =0;

        while(L<=r){
            long R = 4*L-1;

            long start = Math.max(L,(long)l);
            long end = Math.min(R,(long)r);

            if(start<=end){
                steps += (end-start+1)*S;
            }
            S++;
            L = L*4;
        }
        return steps;


    }
    public long minOperations(int[][] queries) {
        long result =0;

        for(int i=0;i<queries.length;i++){
            long step = countStep(queries[i][0],queries[i][1]);
            result += (step+1)/2;
        }
        return result;
    }
}