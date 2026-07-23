public class MoveZeroesToEnd {
    public static void main(String args[]) {
        int arr[] = {4,0,1,0,3,12};

        moveZeroesToEnd(arr);

        System.out.println("Array after moving zeros to end: ");
        
        for(int i = 0 ; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static void moveZeroesToEnd(int arr[]) {
        int i = 0;
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                i++;
            }
        }
    }
}