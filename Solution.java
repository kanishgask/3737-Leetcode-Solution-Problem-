class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];

        for (int i = 0; i < n; i++) {
            sq[i] = 1L * nums[i] * nums[i];
        }

        Arrays.sort(sq);

        int positiveSlots = (n + 1) / 2;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (i < n - positiveSlots) {
                ans -= sq[i]; // smallest squares in negative positions
            } else {
                ans += sq[i]; // largest squares in positive positions
            }
        }

        return ans;
    }
}
