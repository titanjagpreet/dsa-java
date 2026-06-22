// determine the first three largest elements from the given array of elements

import java.util.Arrays;

class ThreeLargest {
    public static void main(String args[]) {
        int nos[] = {10, 12, 5, 18, 6, 20, 9};

        // to display the array contents without using a loop

        System.out.println("nos[] = " + Arrays.toString(nos));

        // methods in hava can return a single value/result only. Hence to return multiple values we require an array
        
        int result[] = getThreeMax(nos);
        System.out.println("1st largest values is " + result[0]);
        System.out.println("2nd largest values is " + result[1]);
        System.out.println("3rd largest values is " + result[2]);
    }

    static int[] getThreeMax(int nos[]){
        int max1, max2, max3;
        max1 = max2 = max3 = Integer.MIN_VALUE;

        for ( int i = 0; i < nos.length; i++) {
            if (max1 < nos[i]) {
                max3 = max2;
                max2 = max1;
                max1 = nos[i];
            } else if (max2 < nos[i]) {
                max3 = max2;
                max2 = nos[i];
            } else if (max3 < nos[i]) {
                max3 = nos[i];
            }
        }

        int result[] = new int[3];
        result[0] = max1;
        result[1] = max2;
        result[2] = max3;

        return result;
    }
}

// if (price == 0) {
//                 continue;
//             }

//             if (price < minPrice) {
//                 minPrice = price;
//             }

//             int profit = price - minPrice;

//             if (profit > maxProfit) {
//                 maxProfit = profit;
//             }