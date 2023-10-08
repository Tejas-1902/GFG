public class MaximumNegativeInSubarrays {
    public static long[] maxNegativeInSubarrays(int[] A, int N, int K) {
        int i = 0;
        int j = 0;
        Queue<Long> q = new LinkedList<>();
        long[] result = new long[N - K + 1];
        int index = 0;

        while (j < N) {
            if (A[j] < 0) {
                q.add((long) A[j]); // Adding negative numbers to the queue
            }
            if (j - i + 1 == K) { // If the window size equals K
                if (q.size() == 0) {
                    result[index++] = 0; // No negative numbers in the window
                } else {
                    result[index++] = q.peek(); // Maximum negative number in the window
                    if (A[i] == q.peek()) {
                        q.poll(); // Remove the element that's going out of the window
                    }
                }
                i++; // Move the window
            }
            j++; // Expand the window
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] A = {-8, 2, 3, -6, 10};
        int K = 2;

        long[] result = maxNegativeInSubarrays(A, N, K);
        for (long value : result) {
            System.out.print(value + " ");
        }
    }
}
