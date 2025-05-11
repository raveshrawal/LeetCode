class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        // [[3,6],[1,5],[4,7]]
        //  ✅  ✅ ✅ ✅  ✅  ✅  => Count of number included in interval = 7
        //           3   4   5   6
        //   1   2   3   4   5
        //               4   5   6   7

        // [[1,3],[5,8]]
        //  ✅  ✅ ✅ ❌ ✅  ✅ ✅ ✅ => Count of number included in interval = 7
        //           
        //   1   2   3   
        //                  5   6   7   8 

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
