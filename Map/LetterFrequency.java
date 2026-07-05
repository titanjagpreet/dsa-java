// Accept a string (set of words) from user and display frequence count of each letter
// Logic - use TreeMap, so that the letter will appear in ASC order with their frequency count

import java.util.TreeMap;
import java.util.Scanner;

class LetterFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();   /// next() accepts a String till space and ignores the rest, nextLine() reads the String with spaces
        sc.close();

        TreeMap<Character, Integer> tm;
        tm = getFreqCounts(s);

        System.out.println("Alphabets and Frequency count are: " + tm);
    }

    static TreeMap<Character, Integer> getFreqCounts(String s) {
        TreeMap<Character, Integer> tm = new TreeMap<>();

        // analyze each character form String s

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // check whether ch exists as a key in tm

            if (!tm.containsKey(ch)) {
                tm.put(ch, 1);  // 1st entry
            } else {    // subsequent entry
                // get previous count
                int count = tm.get(ch);
                count++;
                // update the frequency of char in tm
                tm.put(ch, count);
            }
        }

        return tm;
    }
}