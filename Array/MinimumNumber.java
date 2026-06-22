// determine the minimum element from the given array of integers

class MinimumNumber {
    public static void main(String args[]){
        int nos[] = {10, 0, 17, -6, 4, 12};

        System.out.println("Given array nos contains");
        for (int i = 0; i<nos.length; i++)
            System.out.print(nos[i] + " ");

        // nested method call
        System.out.print("\nMin element from given array nos is " + getMinNo(nos));
    }

    static int getMinNo(int nos[]) {
        // stop writing
        int min = Integer.MAX_VALUE; // base value with which elements of nos[] need to be compared
        for (int i = 0; i<nos.length; i++){
            // greedy approach
            if (min > nos[i])
                min = nos[i];

        }
        return min;
    }
}