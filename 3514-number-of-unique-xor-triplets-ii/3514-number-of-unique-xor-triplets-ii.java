class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int limit = 2048;

        boolean[] pairXor = new boolean[limit];
        boolean[] tripletXor = new boolean[limit];

        // Store every possible XOR of two elements
        for (int first : nums) {
            for (int second : nums) {
                pairXor[first ^ second] = true;
            }
        }

        // Combine every possible pair XOR with every array element
        for (int xor = 0; xor < limit; xor++) {
            if (!pairXor[xor]) {
                continue;
            }

            for (int num : nums) {
                tripletXor[xor ^ num] = true;
            }
        }

        int uniqueValues = 0;

        for (boolean exists : tripletXor) {
            if (exists) {
                uniqueValues++;
            }
        }

        return uniqueValues;
    }
}