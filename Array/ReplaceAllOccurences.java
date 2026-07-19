import java.util.Scanner;

public class ReplaceAllOccurences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Enter the value to be replaced: ");
        int value = sc.nextInt();

        System.out.println("Enter the new value: ");
        int target = sc.nextInt();

        sc.close();

        replaceAllOccurences(arr, value, target);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void replaceAllOccurences(int arr[], int value, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                arr[i] = target;
            }
        }
    }
}