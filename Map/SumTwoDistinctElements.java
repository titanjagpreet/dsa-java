// given an array of int values and a target values. If the sum of any two distinct elements is equal to target
// display the index of these elements
// example {1, 0, 3, 6, 7, 5, 2} target = 11, o/p = {3,5} if target = 25, o/p = {-1,-1}

import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

class SumTwoDistinctElements {
    public static void main(String args[]) {
        int nos[] = {1, 0, 3, 6, 7, 5, 2};

        System.out.println("Given array nos is: " + Arrays.toString(nos));
        System.out.println("Enter the target value: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        sc.close();
        int result[];

        result = getIndex(target, nos);
        System.out.println(("{" + result[0] + "," + result[1] + "}"));
    }

    static int[] getIndex(int target, int nos[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int result[] = new int[2];

        for (int i = 0; i < nos.length; i++) {
            int complement = target - nos[i];

            if (hm.containsKey(complement)) {

                System.out.println("Pair found");
                int i1 = hm.get(complement);
                result[0] = i1;
                result[1] = i;

                return result;
            }

            hm.put(nos[i], i);
        }

        System.out.println("Pair not found");
        result[0] = -1;
        result[1] = -1;

        return result;
    }
}