// write a program to reverse the elements of array
// 2 pointer approach

import java.util.Arrays;

class ReverseArray {

    public static void main(String args[]) {
        int nos[] = {2, 7, 4, 3, 1};

        // 1 pointer will point to 1st element and another to last element
        
        int i = 0, j = nos.length - 1;
        while (i<j){
            int temp = nos[i];
            nos[i] = nos[j];
            nos[j] = temp;
            i++;
            j--;
        }

        System.out.println("nos[] = " + Arrays.toString(nos));
    }
}