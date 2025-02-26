class Solution {
    public int[] productExceptSelf(int[] nums) {

        //initialise result array and fill the values with 1
        int[] result = new int[nums.length];
        Arrays.fill(result,1);

        //initialise pre and post value as one 
        int prefix  = 1;
        int postfix = 1;

        //iterate the array left to right to calculate the pre values 
        for(int i=0; i<nums.length; i++)
        {
            result[i] = prefix;//set result value to calculated pre
            prefix = nums[i] * prefix; //product of nums[i] and previous pre
        }

        //iterate the array right to left to calculate the post values
        for(int i=nums.length-1; i >=0; i--)
        {
            // multiplying each result[i] by the product of
            // all elements after index i.
            result[i] = result[i] * postfix; 
            postfix = postfix * nums[i]; // updating the post 
        }

        return result;
        
    }
}