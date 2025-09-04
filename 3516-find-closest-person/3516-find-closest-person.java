class Solution {
    public int findClosest(int x, int y, int z) {
        int one = Math.abs(x-z);
        int two = Math.abs(y-z);

        if(one==two){
            return 0;
        }

        return one>two?2:1;
    }
}