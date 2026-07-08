//  a simple ticketing appplication using Queue

import java.util.Queue;    // only controls the principles like I/P and O/P operations
import java.util.LinkedList;   // witll store the data

class Ticketing {
    public static void main(String args[]) {
        // Queue<String> tq = new Queue<>();  // will give error, can't be instantiated

        Queue<String> tq = new LinkedList<>();    // Not arraylist also becoz delteion operation is costly

        tq.offer("Haris");    // can also use add()
        tq.offer("Vansh");
        tq.offer("Geeta");
        tq.offer("Mitali");
        tq.offer("Paresh");

        System.out.println("Queue contains " + tq);
        // servicing

        while (!tq.isEmpty()) {
            System.out.println("Student " + tq.poll() + " is issued a ticket");
            System.out.println("Students remaining in queue are " + tq);
        }

        System.out.println("All students issued ticket. Remiaing students re  " + tq);
    }
}