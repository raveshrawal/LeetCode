class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        for (int num : nums) {
            List<Integer> temp = new ArrayList<>();

            while (num > 0) {
                temp.add(num % 10);
                num /= 10;
            }

            Collections.reverse(temp);
            arr.addAll(temp);
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
}