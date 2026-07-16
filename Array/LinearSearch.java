import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of target element: ");
        int target = sc.nextInt();

        sc.close();

        System.out.println((linearSearch(arr, target) ? "Target element found" : "Target element not found"));
    }

    static boolean linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }

        return false;
    }
}