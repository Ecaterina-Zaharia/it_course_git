import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Main {

    // 1. Write a Java program to find the index of an array element.
    public static int findIndex(int arr[], int user_number) {

        int index = Arrays.binarySearch(arr, user_number);
        return (index < 0) ? -1 : index;

    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please, type the number from 1 to 7: ");
        int user_number = Integer.valueOf(reader.nextLine());

        int[] my_array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Index position of " + user_number + " is " + findIndex(my_array, user_number));

        //2. Write a Java program to copy an array by iterating the array.

        int[] old_array = {23, 12, 45, 56, 87, 34, 87, 21, 19, 10};
        int[] new_array = new int[10];
        System.out.println("Old array: " + Arrays.toString(old_array));

        for (int i = 0; i < old_array.length; i++) {
            new_array[i] = old_array[i];
        }
        System.out.println("New array: " + Arrays.toString(new_array));

        //3. Write a Java program to insert an element (specific position) into an array.


        int a[] = {1, 42, 65, 46, 34, 23, 13, 153, 4};
        Arrays.sort(a);
        System.out.println("min " + a[0] + " max " + a[a.length - 1]);

        //5. Write a Java program to reverse an array of integer values.

        int[] my_array1 = {1688, 1924,1788, 1345, 1902,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456 };
        System.out.println("Original array: " + Arrays.toString(my_array1));

        for(int i =0; i < my_array1.length / 2; i++){
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array1));

        // 6. Write a Java program to find common elements between two integer arrays.

        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if(array1[i] == (array2[j])){
                    System.out.println("Common element is : "+(array1[i]));
                }
            }
        }

        // 7. Write a Java program which stores in another array the even numbers from a given array.

        int n = 8;
        int array[] = { 23, 55, 54, 9, 76, 66, 2, 91 };

        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < n; i++){
            if (array[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];

        int j = 0, k = 0;
        for (int i = 0; i < n; i++){
            if (array[i] % 2 == 0)
                even[j++] = array[i];
            else
                odd[k++] = array[i];
        }
        System.out.print("Even Array contains: ");
        printArray(even);
        System.out.print("Odd Array contains: ");
        printArray(odd);

        // 8. Iterate and print each element from a matrix.

        int ar[] = { 7, 8, 3, 1, 5, 9, 2, 4 };
        int x;

        for (int i : ar) {

            // accessing each element of array
            x = i;
            System.out.print(x + " ");
        }

        // 9. Print the elements from the main diagonal in a matrix.