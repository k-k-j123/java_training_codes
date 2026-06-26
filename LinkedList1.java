import java.util.*;

public class LinkedList1 {

    public static void display(LinkedList<String> list) {
        for (String f : list) {
            System.out.print(f + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango");
        list.addLast("Orange");
        list.add("Mango");
        list.add(3, "Pomogranate");

        // System.out.println("Fruits: "+list);
        display(list);
        // Reverse a linked list
        System.out.println("\nReversed linked list: ");
        Collections.reverse(list);
        display(list);

        //Find middle element of list
        int mid = list.size()/2;
        System.out.println("\nMiddle element : "+list.get(mid));

        //Remove duplicates
        //A set does not allow duplicates 
        //LinkedHashSet is a type of set that maintains the insertion order
        System.out.println("\nAfter removing duplicates:");
        LinkedHashSet<String> h = new LinkedHashSet<>(list);
        list.clear(); // remove all elements
        list.addAll(h);
        display(list);

        //convert LinkedList to Array
        System.out.println("\nAfter converting the Linkedlist to array:");
        String[] listarr = list.toArray(new String[0]);
        for(String x : listarr){
            System.out.print(x+", ");
        }
    }
}
