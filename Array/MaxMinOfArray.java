import java.util.Scanner;

public class MaxMinOfArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Maximum element is: " + getMaxElement(arr));
        System.out.println("Minimum element is: " + getMinElement(arr));
    }

    static int getMaxElement(int arr[]) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int getMinElement(int arr[]) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
