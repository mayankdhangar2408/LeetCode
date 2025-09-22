class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Answer array
        int answer[] = new int[nums.length];
        answer[0] = 1;

        //Step 1- Calculate PREFIX => Answer array
        for(int i=1; i<=nums.length-1; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }

        //Step 2- Calculate SUFFIX => Answer array
        int suffix = 1;
        for(int i=nums.length-2; i>=0; i--){
            suffix *= nums[i+1];
            answer[i] *= suffix;
        }
        return answer;
    }
}