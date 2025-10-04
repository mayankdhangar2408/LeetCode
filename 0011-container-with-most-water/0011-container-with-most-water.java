class Solution {
    public int maxArea(int[] height) {
        int ans = Integer.MIN_VALUE;
        int lp = 0; int rp = height.length - 1;

        //traversing left and right pointer acc to conditions
        while (lp < rp) {
            int ht = Math.min(height[lp], height[rp]);
            int w = rp - lp;
            int area = ht*w;
            ans = Math.max(area, ans);

            //conditions for lp and rp for ++ or --
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        
        return ans;
    }
}