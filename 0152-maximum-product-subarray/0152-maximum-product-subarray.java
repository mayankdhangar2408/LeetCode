class Solution {
    public int maxProduct(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int prefix = 1; int suffix = 1;

        // logic of prefix and suffix dur to odd negatives and 0 values
        for(int i =0; i<nums.length; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }
            prefix *= nums[i];
            suffix *= nums[nums.length-i-1];
            maxValue = Math.max(maxValue, Math.max(prefix, suffix));
        }
        return maxValue;
    }
}