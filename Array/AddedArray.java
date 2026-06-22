// given an array of single =ve digits, write a menthod which returns the added array when 1 is added to last element
// {9,9} = {1,0,0}
// {1,2,0,9} = {1,2,1,0}

import java.util.Arrays;

class AddedArray {
    public static void main(String args[]) {
        int nos[] = {1, 2, 0, 9};

        int result[] = getAddedArray(nos);

        System.out.println("nos[] = " + Arrays.toString(result));
    }

    static int[] getAddedArray(int nos[]) {
        
        for ( int i = nos.length-1; i >= 0; i--){
            if (nos[i] != 9){
                nos[i]++;

                return nos;
            }
            nos[i] = 0;
        }

        int result[] = new int[nos.length + 1];
        result[0] = 1;

        return result;
    }
}