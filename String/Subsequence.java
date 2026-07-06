// accept two string from the user and check whether one string is a subsequence of another string
// subsequence of a stirng is part of given string with one or more missing characters but with relative order between the character maintained

class Subsequence {
    public static void main(String args[]) {
        String s = "abcdef", t = "ace";
        System.out.println("s contains " + s + " and t contains " + t);
        System.out.println("Is String t a subsequence fo String s ? " + isSubSequece(s , t));
    }

    static boolean isSubSequece(String s, String t) {
        int i = 0; int j = 0;

        while ( i != s.length() && j != t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                j++;  // if matching char is found in string s, advance j
            }
            i++;
        }
        // if all characters of string t exist in same sequence in String s, j reaches end of string t
        if(j == t.length()) {
            return true;
        }

        return false;
    }
}
// substring of a string is a continuous part of given string subsequence of string is a part of given string with one or more missing char but with relative order between the char maintained