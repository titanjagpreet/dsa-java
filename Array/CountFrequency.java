import java.util.HashMap;

// use HashMap, with key value pair, if a value exists already then increase its value(freq count) by one

public class CountFrequency {
    public static void main(String args[]) {
        int arr[] = {1, 3, 1, 5, 2, 4, 2, 3, 2, 3, 4, 1, 1, 4, 3, 5, 6, 3};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr) {
            if(freq.containsKey(num)) {
                freq.put(num, freq.get(num)+1);
            } else {
                freq.put(num, 1);
            }
        }

        System.out.println(freq);

    }
}