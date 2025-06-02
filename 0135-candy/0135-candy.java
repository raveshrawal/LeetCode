class Solution {
    public int candy(int[] ratings) {
        int r = ratings.length;

        // int[] l2r = new int[r];
        // int[] r2l = new int[r];

        int[] count = new int[r];

        // Arrays.fill(l2r,1);
        // Arrays.fill(r2l,1);
        Arrays.fill(count,1);

        for(int i=1;i<r;i++){
            if(ratings[i]>ratings[i-1]){
                count[i] = Math.max(count[i],count[i-1]+1);
            }
        }
        for(int i = r-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                count[i] = Math.max(count[i],count[i+1]+1); 
            }
        }
        int result = 0;
        for(int i=0;i<r;i++){
            result += count[i];
        }
        return result;
    }
}