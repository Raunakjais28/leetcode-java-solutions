// 2 ms | 46.7 MB

class Solution {
    public int maxProduct(int[] nums) {

        int maxProduct = nums[0];
        int minProduct = nums[0];

        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int curr = nums[i];

            if (curr < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(curr, maxProduct * curr);

            minProduct = Math.min(curr, minProduct * curr);

            ans = Math.max(ans, maxProduct);
        }

        return ans;
    }
}
