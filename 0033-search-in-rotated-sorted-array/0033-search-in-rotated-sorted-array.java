class Solution {
    public int search(int[] nums, int target) {
        // declaring start & end
        int start = 0, end = nums.length-1;
        //binary search
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[start] <= nums[mid]) { //left sorted
                if(nums[start] <= target && target <= nums[mid]) { // found at left
                    end = mid-1;
                }
                else{ // found at right
                    start = mid+1;
                }
            } else { // right sorted
                if(nums[mid] <= target  && target <= nums[end]) { // found at right
                    start = mid+1;
                }
                else{ // found at left
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}