import java.util.Scanner;

public class CountOddEven {
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

        int res[] = getOddEven(arr);

        System.out.println("No of odd elements are: " + res[0] + " No of even elements are: " + res[1]);
    }

    static int[] getOddEven(int arr[]) {
        int odd = 0;
        int even = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return new int[] {odd, even};
    }
}