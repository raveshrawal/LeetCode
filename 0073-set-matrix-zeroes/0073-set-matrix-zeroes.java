public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Optimal Solution

        boolean fr = false;
        boolean fc = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        fr = true;
                    }
                    if (j == 0) {
                        fc = true;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (fr) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
        if (fc) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        // Better Approach
        // boolean[] row = new boolean[m];
        // boolean[] col = new boolean[n];

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if(matrix[i][j] == 0){
        //             row[i] = true;
        //             col[j] = true;
        //         }
        //     }
        // }

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if(row[i]== true || col[j]==true){
        //             matrix[i][j] =0;
        //         }
        //     }
        // }

        // Brute Force
        // int[][] temp = new int[m][n];

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         temp[i][j] = matrix[i][j];
        //     }
        // }

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (matrix[i][j] == 0) {
        //             for (int k = 0; k < n; k++) { 
        //                 temp[i][k] = 0;
        //             }
        //             for (int k = 0; k < m; k++) { 
        //                 temp[k][j] = 0;
        //             }
        //         }
        //     }
        // }

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         matrix[i][j] = temp[i][j];
        //     }
        // }
    }
}
