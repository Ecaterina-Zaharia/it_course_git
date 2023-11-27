import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ArrayList

        //1. Write a Java program to create a new array list,
        // add some colors (string) and print out the collection.

        ArrayList<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Red");
        list.add("Yellow");
        list.add("Orange");
        list.add("Black");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("--------");
// 2. Write a Java program to insert an element into the array list at the first position.

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Blue");
        list1.add("Red");
        list1.add("Yellow");
        list1.add("Orange");
        list1.add("Black");

        list1.addFirst("Green");

        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
        System.out.println("--------");

// 3. Write a Java program to retrieve an element (at a specified index) from a given array list.

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Blue");
        list2.add("Red");
        list2.add("Yellow");
        list2.add("Orange");
        list2.add("Black");

        System.out.println(list2.get(4));

        System.out.println("--------");

// 4. Write a Java program to update specific array element by given element.

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Blue");
        list3.add("Red");
        list3.add("Yellow");
        list3.add("Orange");
        list3.add("Black");

        list3.set(4,"Pink");
        System.out.println(list3);

        System.out.println("--------");

// 5. Write a Java program to remove the third element from a array list.

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Blue");
        list4.add("Red");
        list4.add("Yellow");
        list4.add("Orange");
        list4.add("Black");

        list4.remove(3);
        System.out.println(list4);

        System.out.println("--------");

// 6. Write a Java program to search an element in a array list.

        ArrayList<String> list5 = new ArrayList<>();
        list5.add("Blue");
        list5.add("Red");
        list5.add("Yellow");
        list5.add("Orange");
        list5.add("Black");

        if(list5.contains("Pink")){
            System.out.println("The element is found");
        } else System.out.println("The element is not found");

        System.out.println("--------");

// // LinkedList
//7. Write a Java program to insert the specified element at the front of a linked list.

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        linkedList.addFirst(0);
        linkedList.offerFirst(11);

        System.out.println(linkedList);

        System.out.println("--------");

// 8. Write a Java program to insert the specified element at the end of a linked list.

        LinkedList<Integer> linkedList1 = new LinkedList<>();

        linkedList1.add(1);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);
        linkedList1.add(6);

        linkedList1.addLast(7);
        System.out.println(linkedList1);

        System.out.println("--------");

// 9. Write a Java program to get the first and last occurrence
// of the specified elements in a linked list.

        LinkedList<Integer> linkedList2 = new LinkedList<>();

        linkedList2.add(1);
        linkedList2.add(3);
        linkedList2.add(4);
        linkedList2.add(5);
        linkedList2.add(6);

        System.out.println("The first element is " + linkedList2.getFirst()
                + " and the last element is " + linkedList2.getLast());

        System.out.println("--------");

// HashSet
//10. Write a Java program to append the specified element to the end of a hash set.

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");

        System.out.println("--------");

// 11. Write a Java program to get the number of elements in a hash set.

        HashSet<String> hashSet1 = new HashSet<>();

        hashSet1.add("One");
        hashSet1.add("Two");
        hashSet1.add("Three");
        hashSet1.add("Four");
        hashSet1.add("Five");

        System.out.println("The number of elements in hashset is: " + hashSet1.size());

        System.out.println("--------");

// 12. Write a Java program to empty a hash set.

        HashSet<String> hashSet2 = new HashSet<>();

        hashSet2.add("One");
        hashSet2.add("Two");
        hashSet2.add("Three");
        hashSet2.add("Four");
        hashSet2.add("Five");

        hashSet.removeAll(hashSet2);

        System.out.println(hashSet2.size());

        System.out.println("--------");

// 13. Write a Java program to convert a hash set to a List/ArrayList.

        HashSet<String> hashSet3 = new HashSet<>();

        hashSet3.add("One");
        hashSet3.add("Two");
        hashSet3.add("Three");
        hashSet3.add("Four");
        hashSet3.add("Five");

        List<String> listarraylist = new ArrayList<>(hashSet3);

        System.out.println(listarraylist);

        System.out.println("--------");

// 14. Write a Java program to clone a hash set to another hash set.

        HashSet<String> hashSet4 = new HashSet<>();

        hashSet4.add("One");
        hashSet4.add("Two");
        hashSet4.add("Three");
        hashSet4.add("Four");
        hashSet4.add("Five");

        HashSet<String> newHushset = new HashSet<>();

        System.out.println(newHushset);
        newHushset = (HashSet) hashSet4.clone();
        System.out.println(newHushset);

    }
}