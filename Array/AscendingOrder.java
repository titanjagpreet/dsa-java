public class AscendingOrder {
    public static void main(String args[]) {
        int arr[] = { 24, 22, 54, 76, 45, 99, 12 };

        System.out.println("Array before sorting:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sortAscendingOrder(arr);

        System.out.println("Array after sorting:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //  Selection Sort

    static void sortAscendingOrder(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}