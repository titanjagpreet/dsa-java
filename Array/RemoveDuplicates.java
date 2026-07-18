import java.util.HashSet;

// HashSet has no indexing so we cannot use traditional loops

public class RemoveDuplicates {
    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 2, 4, 1, 2, 5, 3, 5, 3, 7, 3, 8 };
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int uniqueArr[] = new int[set.size()];

        int index = 0;

        for (int num : set) {
            uniqueArr[index++] = num;
        }

        for (int num : set) {
            System.out.println(num);
        }

    }
}