class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<nums.size();i++){

            int start = nums.get(i).get(0);
            int end = nums.get(i).get(1);

            while(start<=end){
                hs.add(start++);
            }

        }
        return hs.size();
    }
}


 //           3   4   5   6
 //   1   2   3   4   5
 //               4   5   6   7