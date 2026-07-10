// accept a linked list of integers from user and a number by which the given linked list to be rotated from R to L
// for example if LL is 10->20->30->40->50 to be rotated by 2, then output should be 40->50->10->20->30
// for example if same LL is to be rotated by 5 then output is same as original LL

import java.util.LinkedList; // this class will do the gropud work of managing links
import java.util.Scanner; // used for taking input form user

class RotateLinkedList {

    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50); // add() adds a node with given calue at the end of LL

        System.out.println(("givel LL is: " + ll));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rotation: ");
        int r = sc.nextInt();
        sc.close();

        // to determine the minimum no of rotations to make the program time efficient

        r = r % ll.size(); // size() returns the no of nodes in LL

        if (r != 0) {  // if r is 0, no need to call the method
            ll = rotateLL(ll, r);
        }
        System.out.println("After rotation, LL contains " + ll);
    }

    static LinkedList<Integer> rotateLL(LinkedList<Integer> ll, int r) {
        for (int i = 0; i < r; i++) {
            ll.addFirst( ll.get( ll.size()-1 ) );  // for size() base is 1, for position base is 0

            // get() returns the value of node

            ll.removeLast();  // to delete the last node as it is now copied as first node
        }

        return ll;
    }
}