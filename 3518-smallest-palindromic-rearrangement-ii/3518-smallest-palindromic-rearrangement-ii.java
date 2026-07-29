class Solution {

    private long combination(int n, int r, long limit) {
        r = Math.min(r, n - r);
        long result = 1;

        for (int i = 1; i <= r; i++) {
            long numerator = n - r + i;

            if (result > Long.MAX_VALUE / numerator) {
                return limit;
            }

            result = result * numerator / i;

            if (result >= limit) {
                return limit;
            }
        }

        return result;
    }

    private long countPermutations(int[] frequency, long limit) {
        long ways = 1;
        int used = 0;

        for (int count : frequency) {
            if (count == 0) {
                continue;
            }

            long required =
                (limit + ways - 1) / ways;

            long choices = combination(
                used + count,
                count,
                required
            );

            if (choices >= required) {
                return limit;
            }

            ways *= choices;
            used += count;
        }

        return ways;
    }

    public String smallestPalindrome(String s, int k) {
        if (k <= 0) {
            return "";
        }

        int[] frequency = new int[26];

        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        char middle = 0;

        for (int i = 0; i < 26; i++) {
            if (frequency[i] % 2 == 1) {
                middle = (char) ('a' + i);
            }

            frequency[i] /= 2;
        }

        int halfLength = s.length() / 2;
        StringBuilder firstHalf = new StringBuilder();
        long rank = k;

        for (int position = 0; position < halfLength; position++) {
            boolean selected = false;

            for (int i = 0; i < 26; i++) {
                if (frequency[i] == 0) {
                    continue;
                }

                frequency[i]--;

                long permutations =
                    countPermutations(frequency, rank);

                if (permutations >= rank) {
                    firstHalf.append((char) ('a' + i));
                    selected = true;
                    break;
                }

                rank -= permutations;
                frequency[i]++;
            }

            if (!selected) {
                return "";
            }
        }

        StringBuilder answer = new StringBuilder(firstHalf);

        if (middle != 0) {
            answer.append(middle);
        }

        answer.append(
            new StringBuilder(firstHalf).reverse()
        );

        return answer.toString();
    }
}