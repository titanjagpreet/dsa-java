public class MaximumDIfference {
    public static void main(String args[]) {
        int arr[] = {12, 5, 9, 3, 11, 2, 8, 1, 10, 6};

        int maxDiff = maximumDifference(arr);

        System.out.println("Maximum difference is: " + maxDiff);
    }

    static int maximumDifference(int arr[]) {
        int maxDiff = -1;
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                int diff = arr[i] - min;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }

        return maxDiff;
    }
}