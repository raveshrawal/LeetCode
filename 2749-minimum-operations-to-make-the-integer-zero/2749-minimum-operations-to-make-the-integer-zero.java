class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        // We check for values of t from 1 up to a reasonable limit (e.g., 60, as num1 is an int).
        for (long t = 1; t <= 60; t++) {
            // Calculate the remaining value after subtracting t * num2 from num1.
            long remainingValue = num1 - t * num2;
            
            // The remainingValue must be positive and large enough to be formed by summing 't' powers of 2.
            // The smallest sum of 't' powers of 2 is 't' (by using 2^0 = 1, 't' times).
            // Also, the number of set bits in remainingValue gives the minimum number of powers of 2 needed.
            // This minimum number must be less than or equal to 't'.
            if (remainingValue > 0 && Long.bitCount(remainingValue) <= t && t <= remainingValue) {
                return (int) t;
            }
        }
        
        // If the loop completes without finding a solution, it's not possible.
        return -1;
    }
}