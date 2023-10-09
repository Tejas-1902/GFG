import java.util.Arrays;

public class SmallestSubsetWithGreaterSum {
    public static int smallestSubsetWithGreaterSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int totalSum = 0;
        int remSum = 0;          //remaning sum

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            selectedSum += arr[i];
            totalSum -= arr[i];

            if (selectedSum > totalSum) {
                return n - i; // Number of elements in the selected subset
            }
        }

        return n; // If no subset meets the condition, return the total number of elements
    }

    public static void main(String[] args) {
        int[] arr = {2, 17, 7, 3};
        int result = smallestSubsetWithGreaterSum(arr);
        System.out.println("Smallest subset size with a greater sum: " + result);
    }
}
