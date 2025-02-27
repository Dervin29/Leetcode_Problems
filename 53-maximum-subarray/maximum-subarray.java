class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;//keeps track of the current sum
        int maximumSum = nums[0];//initialize the max sum to the first element 

        //iterate through the nums array 
        for(int i = 0; i<nums.length; i++)
        {
            //if the current sum is a negative number reset the current sum
            if(currentSum < 0)
            {
                currentSum = 0;
            }
            //Add the current element (nums[i]) to currentSum.
            currentSum = currentSum + nums[i];
            //Update maximumSum with the maximum of the currentSum and maximumSum
            maximumSum = Math.max(currentSum, maximumSum);
        }
        return maximumSum;
    }
}