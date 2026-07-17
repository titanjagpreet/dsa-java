public class RightRotateArray {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void rightRotate(int[] arr, int k) {
        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        rightRotate(arr,2);

        printArray(arr);
    }
}