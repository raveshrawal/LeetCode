class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Math.abs(x));
        sb.reverse();

        long n = Long.parseLong(sb.toString());

        return n==x;
    }
}