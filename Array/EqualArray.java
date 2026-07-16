public class EqualArray {
    public static void main(String args[]) {
        int arr1[] = {10, 20, 30, 40 , 50};
        int arr2[] = {10, 20, 30, 40 , 50};

        System.out.println("The given arrays are equal or not: " + checkEqual(arr1, arr2));
    }

    static boolean checkEqual(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    
}
