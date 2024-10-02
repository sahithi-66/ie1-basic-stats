public class MinMaxCalculation {
    
    public static void main(String[] args) {
        // Example set of numbers
        int[] numbers = {23, 5, 67, 2, 90, 10, 45};
        
        // Call the methods to compute min and max
        int min = findMin(numbers);
        int max = findMax(numbers);
        
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
    
    // Method to find minimum
    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    // Method to find maximum
    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
