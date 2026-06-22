// give an array of integers say {4, 2, 0, 1, 6, 5} determine whether the sum of any 2 distinct elements is equal to target value
// example if target value = 8, true
// if target value = 12, false
// also display the pair of elements whose sum is equal to target
// constrain:1<= n <= 10^6
// approach 1: brute force algorithm

// class TwoSum {
//     public static void main(String args[]) {
//         int arr[] = {4, 2, 0, 1, 6, 5};
//         int targetValue = 8;

//         twoSum(arr, targetValue);
//     }

//     static boolean twoSum(int arr[], int targetValue) {
        
//         for(int i = 0; i < arr.length-1; i++) {

//             for(int j= i+1; j < arr.length-1; j++) {
//                 if (arr[i] + arr[j] == targetValue) {
//                     System.out.println("Values are = " + arr[i] + " and " + arr[j]);
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

// note that this solution is not accepted by leetcode because in above program Time Complexity is O(n^2) 
//  why? if the number of elements in an array are 10^6, no of operations will be (10^6)^2 i.e 10^12
// it is better to optimize this program than applying this brute force algo
// in competitive coding, generally a computer is said to perform 10^8 operations in 1 second

// SECOND SOLUTION
// second solution is to sort the array first using an inbuilt function which give TC of nlogn, later then use Two pointer approach, start i pointer at first val and j pointer at last value of array
// use the TimSort function to sort the array first
// then run the check of addition matching the sum with target value, if its less or high then move the i pointer by one point i++
// this way you will find the solution, if not then move the j pointer one point away from the end value j--
// this way we get the TC of n
// so the final time complexity of the program of will be n

// THIRD SOLUTION

// import java.util.Arrays;

// class TwoSum {
//     public static void main(String args[]) {
//         int arr[] = {4, 2, 0, 1, 6, 5};
//         int targetValue = 8;

//         twoSum(arr, targetValue);
//     }

//     static boolean twoSum(int arr[], int targetValue) {
        
//         Arrays.sort(arr);
//         int i = 0, j = arr.length - 1;

//         while (i < j) {
//             int sum = arr[i] + arr[j];
//             if (sum == targetValue) {
//                 System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
//                 return true;
//             } else if (sum < targetValue) {
//                 i++;
//             } else {
//                 j--;
//             }
//         }

//         return false;
//     }
// }

// Time complexity of this program is equal to O(n + nlogn), O(n log n) for sorting (worst case), O(n) for traversing n elements
// so overall time complexity should be T() = O(n log n)
// but leetcode expects O(n)
// still it is not completely optimized


// FOURTH SOLUTION
// Using HashSet

import java.util.HashSet;

class TwoSum {
    public static void main(String args[]) {
        int arr[] = {4, 2, 0, 1, 6, 5};
        int targetValue = 8;

        twoSum(arr, targetValue);
    }

    static boolean twoSum(int arr[], int targetValue) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        // Hashset is a class in collections framework
        // set collection basically eliminates duplicates
        // collections contains classes which supports "generics"
        // generics is the feature in Java which allows the developers to write a single class which works on different data types
        // the only thing is that generic feature works with Object types only and not primitive data types
        // <> is known as diamond operator
        

        for (int i = 0; i < arr.length; i++) {
            int complement = targetValue - arr[i];
            if (hs.contains(complement)) {
                System.out.println("Pair found: " + complement + ", " + arr[i]);
                return true;
            }
            hs.add(arr[i]);  // add the current number in HashSet
        }

        return false;
    }
}