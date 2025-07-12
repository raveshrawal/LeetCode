class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left =0;
        int right = m * n -1;


        while(left<=right){
            int mid = left + (right - left)/2;
            int midnum = matrix[mid/n][mid%n];

            if(midnum == target){
                return true;
            }else if(midnum<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;

        // for(int i=0;i<matrix.length;i++){
        //     if(matrix[i][matrix[0].length-1]>=target){
        //         for(int j=0;j<matrix[0].length;j++){
        //             if(matrix[i][j]==target){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
    }
}