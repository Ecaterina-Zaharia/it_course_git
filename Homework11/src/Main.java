import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1. Write a Java program to iterate through all elements in a array list.

        ArrayList<String> myArray = new ArrayList<>();

        myArray.add("Yellow");
        myArray.add("Red");
        myArray.add("Blue");
        myArray.add("Orange");
        myArray.add("Purple");

        for (int i = 0; i < myArray.size(); i++){
            System.out.println(myArray.get(i));
        }
        System.out.println("----------");

        //2. Write a Java program to insert an element into the array list at the first position.

        myArray.add(0, "Green");
        System.out.println(myArray);

        System.out.println("--------");

        // 3. Write a Java program to sort a given array list.

        Collections.sort(myArray);
        System.out.println(myArray);

        System.out.println("---------");

        // 4. Write a Java program to copy one array list into another.

        ArrayList<String> secondArray = new ArrayList<>();

        secondArray.add("One");
        secondArray.add("Two");
        secondArray.add("Three");
        secondArray.add("Four");
        secondArray.add("Five");

        Collections.copy(myArray, secondArray);
        System.out.println(myArray);

        System.out.println("-----------");

        // 5. Write a Java program of swap two elements in an array list.

        Collections.swap(myArray, 0, 4);
        System.out.println(myArray);

        System.out.println("------------");

        // 6. Write a Java program to trim the capacity of an array list the current list size.

        //myArray.trimToSize();
        //System.out.println(myArray);

        System.out.println("-----------");

        // 7. Write a Java program to empty an array list.

        System.out.println(myArray);
        myArray.removeAll(myArray);
        System.out.println(myArray);

        System.out.println("------------");
        // 8. Write a Java program to iterate through all elements in a linked list starting at the specified position.

        LinkedList<Integer> myLinked = new LinkedList<>();

        myLinked.add(1);
        myLinked.add(2);
        myLinked.add(3);
        myLinked.add(4);
        myLinked.add(5);

        Iterator p = myLinked.listIterator(1);

        while (p.hasNext()){
            System.out.println(p.next());
        }

        System.out.println("------------");

        // 9. Write a Java program to iterate a linked list in reverse order.

        Iterator it = myLinked.descendingIterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        // 10. Write a Java program to insert some elements at the specified position into a linked list.

        myLinked.add(0, 11);
        System.out.println(myLinked);

        System.out.println("------------");

        // 11. Write a Java program to get the first and last occurrence of the specified elements in a linked list.

        System.out.println("The first element is " + myLinked.getFirst()
                + " and the last element is " + myLinked.getLast());

        System.out.println("--------------");

        // 12. Write a Java program to join two linked lists.

        LinkedList<Integer> secondLinked = new LinkedList<>();
        secondLinked.add(6);
        secondLinked.add(7);
        secondLinked.add(8);
        secondLinked.add(9);
        secondLinked.add(10);

        LinkedList<Integer> joinedLists = new LinkedList<>();

        joinedLists.addAll(myLinked);
        joinedLists.addAll(secondLinked);

        System.out.println(joinedLists);

        System.out.println("------------------");

        // 13. Write a Java program to clone a linked list to another linked list.

        LinkedList<Integer> clonedList = new LinkedList<>();

        clonedList = (LinkedList<Integer>) myLinked.clone();
        System.out.println(clonedList);

        System.out.println("------------------");

        // 14. Write a Java program to remove and return the first element of a linked list.

        System.out.println("Original linked  list: " + myLinked);
        myLinked.pop();
        System.out.println("Linked list after pop operation: " + myLinked);

        System.out.println("-------------");

        // 15. Write a Java program to retrieve but does not remove, the first element of a linked list.

        System.out.println("Original linked list " + myLinked);
        int x = myLinked.peekFirst();
        System.out.println("The first element in the list is " + x);
        System.out.println("Original linked list " + myLinked);

        System.out.println("--------------");

        // Write a Java program to iterate through all elements in a hash list.

        HashSet<String > myHashList = new HashSet<>();

        myHashList.add("Ann");
        myHashList.add("Peter");
        myHashList.add("John");
        myHashList.add("Michael");
        myHashList.add("Smith");

        Iterator<String> p1 = myHashList.iterator();

        while(p1.hasNext()){
            System.out.println(p1.next());
        }

        System.out.println("-------------");

        // 17. Write a Java program to test a hash set is empty or not.

        if(myHashList.isEmpty()){
            System.out.println("The Hash set is empty");
        } else {
            System.out.println("The Hash set is NOT empty");
        }

        System.out.println("-----------");

        // 18. Write a Java program to convert a hash set to an array.

        System.out.println("Original Hash Set " + myHashList);
        String[] new_array = new String[myHashList.size()];
        myHashList.toArray(new_array);

        System.out.println("Array elements: ");
        for(String element : new_array){
            System.out.println(element);
        }

        System.out.println("------------");

        // 19. Write a Java program to convert a hash set to a List/ArrayList.

        System.out.println("Original Hash Set " + myHashList);

        List<String> listArray = new ArrayList<>(myHashList);

        System.out.println("ArrayList contains: "+ listArray);

        System.out.println("--------------");

        // 20. Write a Java program to compare two sets and retain elements which are same on both sets.

        HashSet<String> secondHashSet = new HashSet<>();
        secondHashSet.add("White");
        secondHashSet.add("One");
        secondHashSet.add("Peter");
        secondHashSet.add("Green");
        secondHashSet.add("Ann");

        System.out.println("First HashSet content: " + myHashList);
        System.out.println("Second HasSet content " + secondHashSet);

        myHashList.retainAll(secondHashSet);
        System.out.println("The elements which are same on both sets are/is: " + myHashList);

        System.out.println("------------");

        // 21. Write a Java program to remove all of the elements from a hash set.

        System.out.println("The HashSet contains before removing " + secondHashSet);
        //.removeAll(secondHashSet);

        System.out.println("The HashSet contains after removing " + secondHashSet);

        System.out.println("---------------");

        // 22. Write a Java program to add all the elements of a specified tree set to another tree set.

        TreeSet<String> treeSetOne = new TreeSet<>();
        treeSetOne.add("Car");
        treeSetOne.add("Boat");
        treeSetOne.add("Train");
        treeSetOne.add("Plain");
        treeSetOne.add("Bike");

        TreeSet<String> treeSetTwo = new TreeSet<>();
        treeSetTwo.add("One");
        treeSetTwo.add("Two");
        treeSetTwo.add("Three");
        treeSetTwo.add("Four");
        treeSetTwo.add("Five");

        treeSetOne.addAll(treeSetTwo);
        System.out.println(treeSetOne);

        System.out.println("-------------");

        // 23. Write a Java program to create a reverse order view of the elements contained in a given tree set.

        System.out.println("Original tree set: " + treeSetOne);
        Iterator it1 = treeSetOne.descendingIterator();

        System.out.println("Elements in Reverse Order:");
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        System.out.println("------------");

        // 24. Write a Java program to find the numbers less than 7 in a tree set.

        TreeSet<Integer> treeInteger = new TreeSet<>();
        TreeSet<Integer> treeIntegerTwo = new TreeSet<>();

        treeInteger.add(1);
        treeInteger.add(2);
        treeInteger.add(3);
        treeInteger.add(4);
        treeInteger.add(5);
        treeInteger.add(6);
        treeInteger.add(7);
        treeInteger.add(8);
        treeInteger.add(9);
        treeInteger.add(10);

        treeIntegerTwo = (TreeSet)treeInteger.headSet(7);

        Iterator iterator;
        iterator = treeIntegerTwo.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        System.out.println("------------");

        // 25. Write a Java program to get the element in a tree set which is less than or equal to the given element.

        TreeSet<Integer> treeIntegerOne = new TreeSet<>();
        treeIntegerOne.add(12);
        treeIntegerOne.add(1);
        treeIntegerOne.add(8);
        treeIntegerOne.add(10);
        treeIntegerOne.add(3);

        System.out.println("Less than or equal to 9:  " + treeIntegerOne.floor(9));

        System.out.println("-------------");

        // 26. Write a Java program to retrieve and remove the first element of a tree set.

        System.out.println("Original tree set: " + treeIntegerOne);
        System.out.println("Removes the first element: " + treeIntegerOne.pollFirst());
        System.out.println("Tree set after removing first element: " + treeIntegerOne);

        System.out.println("------------------------");

        // 27. Write a Java program to retrieve and remove the last element of a tree set.

        System.out.println("Original tree set: " + treeIntegerOne);
        System.out.println("Removes the last element: " + treeIntegerOne.pollLast());
        System.out.println("Tree set after removing last element: " + treeIntegerOne);

        System.out.println("-----------------------");

        // 28. Write a Java program to copy all of the mappings from the specified map to another map.

        HashMap<Integer, String> hashMap1 = new HashMap<>();
        HashMap<Integer, String> hashMap2 = new HashMap<>();

        hashMap1.put(1, "Red");
        hashMap1.put(2, "Yellow");
        hashMap1.put(3, "Orange");

        hashMap2.put(4, "Black");
        hashMap2.put(5, "White");
        hashMap2.put(6, "Grey");

        hashMap2.putAll(hashMap1);
        System.out.println("All elements in the hashMap2: " + hashMap2);

        System.out.println("--------------");

        // 29. Write a Java program to check whether a map contains key-value mappings (empty) or not.

        if(hashMap1.isEmpty()){
            System.out.println("The HashMap is empty");
        } else System.out.println("The HashMap is NOT empty");

        System.out.println("-----------------");

        // 30. Write a Java program to test if a map contains a mapping for the specified key.

        if(hashMap1.containsKey(1)){
            System.out.println("The map contains a mapping for the specified key 1");
        } else System.out.println("The map does NOT contain a mapping for the specified key 1");

        System.out.println("------------------------");

        // 31. Write a Java program to test if a map contains a mapping for the specified value.

        if(hashMap1.containsValue("Red")){
            System.out.println("The map contains a mapping for the specified value Red");
        } else System.out.println("The map does NOT contain a mapping for the specified value Red");

        System.out.println("---------------------");

        // 33. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.

        TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

        tree_map1.put("C1", "Red");
        tree_map1.put("C2", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C4", "White");

        System.out.println("Greatest key: " + tree_map1.firstEntry());
        System.out.println("Least key: " + tree_map1.lastEntry());

        System.out.println("------------------");

        // 34. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.

        System.out.println("Greatest key: " + tree_map1.firstKey());
        System.out.println("Least key: " + tree_map1.lastKey());

        System.out.println("-------------------");

        // 35. Write a Java program to get a reverse order view of the keys contained in a given map.

        System.out.println("Reverse order view of the keys: " + tree_map1.descendingKeySet());

        System.out.println("---------------------");

        // 36. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.

        TreeMap < Integer, String > tree_map2 = new TreeMap < Integer, String > ();

        tree_map2.put(10, "Red");
        tree_map2.put(20, "Green");
        tree_map2.put(50, "Black");
        tree_map2.put(70, "White");
        tree_map2.put(60, "Pink");

        System.out.println("Orginal TreeMap content: " + tree_map2);
        System.out.println("Checking the entry for 20: ");
        System.out.println("Value is: " + tree_map2.floorEntry(20));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + tree_map2.floorEntry(30));

        System.out.println("---------------");

        // 37. Write a Java program to get the portion of a map whose keys are strictly less than a given key.

        System.out.println("Orginal TreeMap content: " + tree_map2);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + tree_map2.headMap(10, true));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + tree_map2.headMap(20, true));

        System.out.println("--------------------");

        // 38. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.

        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + tree_map2.lowerKey(1));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + tree_map2.lowerKey(20));

        System.out.println("----------");

        // 39. Write a Java program to iterate through any kind of map using keySet().

        Map<String,String> myMap = new HashMap<String,String>();

        myMap.put("One", "John");
        myMap.put("Two", "Peter");
        myMap.put("Three", "Ann");
        myMap.put("For", "Michael");

        for (String name : myMap.keySet())
            System.out.println("key: " + name);

        System.out.println("-------------------");

        // 40. Write a Java program to iterate through any kind of map using entrySet().

        for (Map.Entry<String,String> entry : myMap.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        System.out.println("-----------------");

        // 41. Write a Java program to iterate through any kind of map using forEach().

        myMap.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

        // 32. Write a Java program to sort keys in Tree Map by using comparator.

        TreeMap<String,String> Mytree_map1 = new TreeMap<String,String>(new sort_key());

        Mytree_map1.put("C2", "Red");
        Mytree_map1.put("C4", "Green");
        Mytree_map1.put("C3", "Black");
        Mytree_map1.put("C1", "White");

        System.out.println(Mytree_map1);

    }
}

class sort_key implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
