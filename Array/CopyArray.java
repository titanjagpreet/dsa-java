public class CopyArray {
    public static void main(String args[]) {
        int arr[] = {22, 33, 44, 55, 66, 77, 88, 99};

        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int res[] = copyArray(arr);

        for (int i =0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    static int[] copyArray(int arr[]) {
        int size = arr.length;

        int newArray[] = new int[size];

        for(int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        return newArray;
    }
}