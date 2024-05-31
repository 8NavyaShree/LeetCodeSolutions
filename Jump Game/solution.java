class Solution {
    public boolean canJump(int[] nums) {

        // initially the final position is the last index
        int finalPosition = nums.length-1;

        //start with second last index
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i] >= finalPosition){
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }
}
