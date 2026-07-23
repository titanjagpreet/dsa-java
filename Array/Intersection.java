import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {

        int arr1[] = {4, 9, 5};
        int arr2[] = {9, 4, 9, 8, 4};

        int ans[] = intersectionOfTwoArrays(arr1, arr2);

        for (int x : ans)
            System.out.print(x + " ");
    }

    static int[] intersectionOfTwoArrays(int arr1[], int arr2[]) {

        int result[] = new int[arr1.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    result[k++] = arr1[i];
                    break;
                }
            }
        }

        return Arrays.copyOf(result, k);
    }
}