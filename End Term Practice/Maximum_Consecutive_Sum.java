public class Maximum_Consecutive_Sum {
    static int kadane(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (currSum < 0) {
                currSum = 0;
            }
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 8, -8, 9, -9, 10, -11, 12 };

        int sum = kadane(arr);
        System.out.println("Maximum Consecutive Sum is: " + sum);
    }
}
