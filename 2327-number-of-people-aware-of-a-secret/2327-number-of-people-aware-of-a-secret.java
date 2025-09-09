class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int M = 1000000007;
        int[] dp = new int[n+1];

        dp[1] =1;

        int count =0;
        for(int i=2;i<=n;i++){
            if((i-delay)>0){

            count = (count + dp[i-delay])% M;
            }
            if((i-forget)>0){

            count = (count - dp[i-forget]+M)% M;
            }
            dp[i] = count;
        }
        int result =0;
        for(int i=n-forget+1;i<=n;i++){
            result = (result +dp[i])%M;
        }
        return result;
    }
}

// class Solution {
//     public int peopleAwareOfSecret(int n, int delay, int forget) {

//         int M = 1000000007;
//         int[] dp = new int[n+1];

//         dp[1] =1;

//         for(int i=2;i<=n;i++){
//             int count =0;

//             for(int j=i-forget+1;j<=i-delay;j++){
//                 if(j>=1){
//                 count  = (count+ dp[j])%M;
//                 }
//             }
//             dp[i] = count;
//         }
//         int result =0;
//         for(int i=n-forget+1;i<=n;i++){
//             result = (result +dp[i])%M;
//         }
//         return result;

//     }
// }


// class Solution {
//     int M = 1000000007;
//     int[] dp;

//     private int solve(int day, int delay, int forget) {
//         if (day == 1) {
//             return 1;
//         }
//         if (dp[day] != -1) {
//             return dp[day];
//         }
//         int result = 0;
//         for (int d = day - forget + 1; d <= day - delay; d++) {
//             if (d >= 1) {
//                 result = (result + solve(d, delay, forget)) % M;
//             }
//         }
//         dp[day] = result;
//         return dp[day];
//     }

//     public int peopleAwareOfSecret(int n, int delay, int forget) {
//         dp = new int[n + 1];
//         Arrays.fill(dp, -1);
//         int total = 0;
//         for (int i = n - forget + 1; i <= n; i++) {
//             if (i >= 1) {

//                 total = (total + solve(i, delay, forget)) % M;
//             }
//         }
//         return total;
//     }
// }