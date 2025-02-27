class Solution {
    public int maxProduct(int[] nums) {

        //if there is no elements return 0
        if(nums.length == 0)
        {
            return 0;
        }

        int min = nums[0];
        int max = nums[0];
        int result = max;

        for(int i = 1; i<nums.length; i++)
        {
            int current = nums[i];//set current as current index value
            //temp is used, so the max value calculated does not effect the min cal
            int temp = Math.max(current, Math.max(min * current, max * current));
            min = Math.min(current, Math.min(min * current, max * current));
            max = temp;

            //comparing the result and max to get the result max value 
            result = Math.max(result, max);
        }
        return result;
    }
}