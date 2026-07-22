public class MissingNumber {
    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 5};

        int result = missingNumber(arr);

        System.out.println("The missing number is: " + result);
    }

    static int missingNumber(int arr[]) {
        int n = arr.length+1;

        int expectedOutput = n * (n + 1) / 2;

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int missingInt = expectedOutput - sum;

        return missingInt;
    }
}