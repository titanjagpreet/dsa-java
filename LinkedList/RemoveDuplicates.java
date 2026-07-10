import java.util.LinkedHashSet;

class RemoveDuplicates {
    public static void main(String args[]) {
        
    }

    static int[] removeDuplicates(int nos[]) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        // add one by one element from array into lhs
        // range based loop

        for (int no : nos){
            lhs.add(no);  // here java uses a feature as "auto-boxing" which auto converts int pdt to integer Object
        }

        // now create a new array and transfer the content of lhs into it

        int result[] = new int[lhs.size()];  // size() reutrn the no of elements in LInkeHashSet Object
        // now copy the uniqye elements from lhs into result[]

        int i = 0;
        for(int no : lhs) {   // here java uses a fesature "auto-unboxing" which auto converts Integer Object to int pdt
            result[i++] = no;
        }

        return result;
    }
}