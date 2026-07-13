public class ThreeSmallest {
    public static void main(String args[]) {
        int arr[]  = {1, 5, 3, 66, 33, -7, 55};

        int result[] = threeSmallest(arr);
        
        System.out.println("The smallest no is:" + result[0]);
        System.out.println("The second smallest no is:" + result[1]);
        System.out.println("The third smallest no is:" + result[2]);
    }

    static int[] threeSmallest(int arr[]) {
        int min1, min2, min3;
        min1 = min2 = min3 = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(min1 > arr[i]) {
                min3 = min2;
                min2 = min1;
                min1 = arr[i];
            } else if(min2 > arr[i]) {
                min3 = min2;
                min2 = arr[i];
            } else if(min3 > arr[i]) {
                min3 = arr[i];
            }
        }

        int result[] = new int[3];
        result[0] = min1;
        result[1] = min2;
        result[2] = min3;
        
        return result;
    }
}
