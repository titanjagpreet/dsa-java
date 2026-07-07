// accept an expression from user containing parentheses only
// write a program to determine whether the partentheses are balanced or not
// eg [{()}] output - true, eg- [({}] output - false

import java.util.Stack;
import java.util.Scanner;

class BalancedParentheses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a expression: ");
        String s = sc.next();
        sc.close();

        boolean result = checkBalance(s);

        System.out.println("The give expression is: " + (result ? "Balanced" : "Not balanced"));
    }

    static boolean checkBalance(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {

                st.push(ch);

            } else if (ch == ']' || ch == '}' || ch == ')') {

                if(st.isEmpty()) {
                    return false;
                }
                char top = st.peek();

                if ((ch == ']' && top == '[') || (ch == '}' && top == '{') || (ch == ')' && top == '(') ) {
                    st.pop();
                } else {
                    return false;
                }

            }
        }

        return st.isEmpty();
    }
}