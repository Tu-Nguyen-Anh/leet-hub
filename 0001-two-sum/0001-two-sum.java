class Solution {
    public int[] twoSum(int[] nums, int target) {
                // Create a HashMap to store the indices of numbers we have seen
        HashMap<Integer, Integer> numIndices = new HashMap<>();

        // Iterate through the array of numbers
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];

            // Check if the complement is already in the HashMap
            if (numIndices.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[]{numIndices.get(complement), i};
            }

            // Otherwise, add the current number and its index to the HashMap
            numIndices.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[]{};
    }
}