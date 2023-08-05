/*
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
class Solution {

    public int arrayContains(int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
        
    }




    

    public int[] twoSumOtherApproach(int[] nums, int target){

        
        int[] ans  = {-1,-1};

        for(int i=0; i<nums.length; i++){
            int targetIndex = arrayContains(nums, target - nums[i]);
            if(targetIndex != -1){
                ans[0] = i;
                ans[1] = targetIndex;
                break;

            }
        }
        return ans;

    }
    public int[] twoSumBruteForce(int[] nums, int target) {
        int[] ans  = {-1,-1};
        for(int i=0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){


                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
                
            }
            if(ans[0] != -1){
                break;
            }

        }
        
        return ans;
    }
}