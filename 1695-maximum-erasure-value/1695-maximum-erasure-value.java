class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i = 0, j = 0, sum = 0, maxSum = 0;
        HashSet<Integer> set = new HashSet<>();

        while (j < nums.length) {
            if (set.add(nums[j])) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
                j++;
            } else {
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }

        return maxSum;
    }
}
