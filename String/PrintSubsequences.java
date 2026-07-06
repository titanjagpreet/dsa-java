// print all subsequences of a given string example if string is abc then the subseqences are a b c ab bc ac abc " " (total 8 answers)
// use include and exclude algorithm
// we are going to solve this problem using recursion method and using include(take) - exclude(don't take) algorithm

class PrintSubsequences {

    public static void main(String args[]) {
        String s = "abc";
        System.out.println("given string s is: " + s);
        printAllSubsequence(s, 0, ""); // arguments are given string, starting index and empty subsequence
    }

    static void printAllSubsequence(String s, int index, String subseq){
        // base condition i.e condition to stop recursion
        if (index == s.length()) {
            System.out.println(subseq + "\t"); // print the subseq
            return; //  teminate the recursion
        }

        // exclude the char at current position and form subsequence
        printAllSubsequence(s, index+1, subseq); // refer to char at next index but keep subseq same

        // include the char at current position and form subseq
        printAllSubsequence(s, index+1, subseq + s.charAt(index));  // concatenate the char at current index to the subseq
    }

}