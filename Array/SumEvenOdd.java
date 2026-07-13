public class SumEvenOdd {
    public static void main(String args[]) {
        int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sumOfEven += arr[i];
            } else {
                sumOfOdd += arr[i];
            }
        }

        System.out.println("Sum of all even no is:" + sumOfEven);
        System.out.println("Sum of all odd no is:" + sumOfOdd);
    }
}