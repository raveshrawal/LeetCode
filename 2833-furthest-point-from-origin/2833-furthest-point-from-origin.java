class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                l--;
                r--;
            }else if(moves.charAt(i)=='R'){
                l++;
                r++;
            }else{
                l--;
                r++;
            }
        }
        return (int)Math.max(Math.abs(l),Math.abs(r));
    }
}