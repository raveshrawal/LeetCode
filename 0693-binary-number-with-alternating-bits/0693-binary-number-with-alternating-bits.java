class Solution {
    public boolean hasAlternatingBits(int n) {
        char[] str=Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<str.length-1;i++){
            if(str[i]==str[i+1]){
                return false;
            }
        }
        return true;

    }
}