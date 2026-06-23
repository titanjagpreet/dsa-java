import java.util.Scanner;

public class CountOccurences {
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

        System.out.println("The no of occurences of " + target + " element are: " + getOccurences(arr, target));
    }

    static int getOccurences(int arr[], int target) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}