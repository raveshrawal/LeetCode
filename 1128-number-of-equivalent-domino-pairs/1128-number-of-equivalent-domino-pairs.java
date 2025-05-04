class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        int[] arr = new int[100];

        for (int i = 0; i < dominoes.length; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            int key = a <= b ? a * 10 + b : b * 10 + a;

            count += arr[key]; 
            arr[key]++;
        }

        return count;
    }
}
