class Solution {
    public int trap(int[] height) {
        int h = height.length;
        int[] lm = new int[h]; 
        int[] rm = new int[h]; 
        lm[0] = height[0];
        rm[h-1] = height[h-1];
        for(int i=1;i<h;i++){
            lm[i] = Math.max(lm[i-1],height[i]);
            rm[h-i-1] = Math.max(height[h-i-1],rm[h-i]);
        }
        int water = 0;
        int width =1;
        for(int i=1;i<h-1;i++){
            water += width*(Math.min(rm[i],lm[i])-height[i]);
        }
        return water;
    }
}