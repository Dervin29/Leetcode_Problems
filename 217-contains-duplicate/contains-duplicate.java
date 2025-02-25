class Solution {
    public boolean containsDuplicate(int[] nums) {
        // initialise hashset visited 
        Set<Integer> visited = new HashSet<>();

        //iterate through the array 
        for(int i=0; i<nums.length; i++)
        {
            //if hashset contains duplicate return true
            if(visited.contains(nums[i]))
            {
                return true;
            }
            else
            {
                visited.add(nums[i]); //else add the value to the hashset
            }
        }
        return false; // if there are no duplicates return false
    }
}