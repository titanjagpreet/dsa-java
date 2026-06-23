import java.util.Scanner;

public class AvgOfElements {
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

        System.out.println("Avg of elements is: " + avgOfAll(arr));
    }

    static int avgOfAll(int arr[]) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int avg = sum / arr.length;

        return avg;
    }
    
}
