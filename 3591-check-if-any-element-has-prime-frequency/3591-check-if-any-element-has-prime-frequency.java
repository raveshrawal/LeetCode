class Solution {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        int[] frq = new int[101];

        for(int i=0;i<nums.length;i++){
            frq[nums[i]]++;
        }

        for(int i=0;i<101;i++){
                if(isPrime(frq[i])){
                    return true;
                }
        }
        return false;
    }
}