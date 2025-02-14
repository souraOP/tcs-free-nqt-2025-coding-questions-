public class ArrayDivision {
    public static boolean canDivideArray(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false;
        }

        // Calculate total sum
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Check if array can be divided into equal parts
        // If total sum is odd, we can't divide it equally
        if (totalSum % 2 != 0) {
            return false;
        }

        // Target sum for each subarray
        int targetSum = totalSum / 2;

        // Use recursive function to find if we can form subarrays with target sum
        return canPartition(arr, 0, 0, targetSum, new boolean[arr.length]);
    }

    private static boolean canPartition(int[] arr, int index, int currentSum, 
                                      int targetSum, boolean[] used) {
        // Base case: if current sum equals target sum, we found a valid subarray
        if (currentSum == targetSum) {
            // Check if all elements are used
            boolean allUsed = true;
            for (boolean u : used) {
                if (!u) {
                    allUsed = false;
                    break;
                }
            }
            if (allUsed) {
                return true;
            }
            // Try to find another subarray with target sum
            return findNextSubarray(arr, 0, 0, targetSum, used);
        }

        // If current sum exceeds target or we've reached end of array, backtrack
        if (currentSum > targetSum || index >= arr.length) {
            return false;
        }

        // Try including current element if not already used
        for (int i = index; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                if (canPartition(arr, i + 1, currentSum + arr[i], targetSum, used)) {
                    return true;
                }
                used[i] = false;
            }
        }

        return false;
    }

    private static boolean findNextSubarray(int[] arr, int index, int currentSum, 
                                          int targetSum, boolean[] used) {
        if (currentSum == targetSum) {
            return true;
        }

        if (currentSum > targetSum || index >= arr.length) {
            return false;
        }

        for (int i = index; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                if (findNextSubarray(arr, i + 1, currentSum + arr[i], targetSum, used)) {
                    return true;
                }
                used[i] = false;
            }
        }

        return false;
    }

    // Test the solution
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        boolean result = canDivideArray(arr);
        System.out.println("Can divide array: " + result);  // Should print true
        
        int[] arr2 = {2, 4, 6, 7};
        result = canDivideArray(arr2);
        System.out.println("Can divide array: " + result);  // Should print false
    }
}