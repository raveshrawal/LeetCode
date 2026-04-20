class Solution {
    public int maxDistance(int[] colors) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<colors.length-1;i++){
            if(colors[i]!= colors[colors.length-1]){
                max = Math.max(colors.length-1-i , max);
                break;
            }
        }

        for(int j = colors.length-1;j>0;j--){
            if(colors[0] != colors[j]){
                max = Math.max(max, j);
                break;
            }
        }
        return max;
    }
}