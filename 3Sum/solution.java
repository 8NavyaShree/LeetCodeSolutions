class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length<3)
            return new ArrayList<>();
        
        // sort the elements
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();

        //now fix the 1st element and find the other 2 elements
        for(int i=0; i<nums.length-2;i++){

        // find other 2 elements using 2 sum approach
        int left = i+1;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[i]+nums[left]+nums[right];
        if(sum==0){

        // add the set & move to find the other triplets
        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
        left++;
        right--;
        }else if(sum<0)
        left++;
        else
        right--;
        }
        }
        return new ArrayList<>(result);
    }
}
