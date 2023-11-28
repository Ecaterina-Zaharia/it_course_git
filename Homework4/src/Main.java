import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Main {

    // 1. Write a Java program to find the index of an array element.
    public static int findIndex(int arr[], int user_number) {

        int index = Arrays.binarySearch(arr, user_number);
        return (index < 0) ? -1 : index;

    }

    public static void printArray(int[] array) {
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

        // 4. Write a Java program to find the maximum and minimum value of an array.
        //// hint: initialize the minimum with a very big number, and the maximum
        // with a very small value.

        int[] arr = {5, 3, 9, 1, 7, 2};
        int min = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minim value: " + min);
        System.out.println("Maxim value: " + max);

        //5. Write a Java program to reverse an array of integer values.

        int[] my_array1 = {1688, 1924, 1788, 1345, 1902,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        System.out.println("Original array: " + Arrays.toString(my_array1));

        for (int i = 0; i < my_array1.length / 2; i++) {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : " + Arrays.toString(my_array1));

        // 6. Write a Java program to find common elements between two integer arrays.

        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == (array2[j])) {
                    System.out.println("Common element is : " + (array1[i]));
                }
            }
        }

        // 7. Write a Java program which stores in another array the even numbers from a given array.

        int n = 8;
        int array[] = {23, 55, 54, 9, 76, 66, 2, 91};

        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];

        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
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

        int ar[] = {7, 8, 3, 1, 5, 9, 2, 4};
        int x;

        for (int i : ar) {

            // accessing each element of array
            x = i;
            System.out.print(x + " ");
        }

        // 9. Print the elements from the main diagonal in a matrix.

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("The element from the main diagonal: ");
        for (int i = 0; i < matrix.length; i++){
            for(int j1 = 0; j1 < matrix[i].length; j1++){
                if(i == j1){
                    System.out.println(matrix[i][j1] + " ");
                }
            }
        }

        // 10. Print the elements from the secondary diagonal in a matrix.

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Elements from the secondary diagonal: ");
        for(int i1 = 0; i1 < matrix1.length; i1++){
            for(int j2 = 0; j2 < matrix1.length; j2++){
                if(i1 + j2 == matrix1.length - 1){
                    System.out.println(matrix1[i1][j2] + " 2");
                }
            }
        }

        // 11. Print the sum of the elements above the main diagonal
        // (all of them, not only the first 'semi-diagonal').

        int sum = 0;

        for(int i3 = 0; i3 < matrix.length; i3++){
            for(int j3 = i3 + 1; j3 < matrix[i3].length; j3++){
                sum += matrix[i3][j3];
            }
        }

        System.out.println("Sum of elements above the main diagonal: " + sum);

        // 12. Write a Java program to move all 0's to the end of an array.
        // Maintain the relative order of the other (non-zero) array elements.

        int[] arr1 = {0, 1, 0, 3, 12};
        int index = 0;
        for (int i4 = 0; i4 < arr1.length; i4++){
            if(arr1[i4] != 0){
                arr1[index++] = arr1[i4];
            }
        }
        while(index < arr1.length){
            arr1[index++] = 0;
        }

        System.out.println(Arrays.toString(arr1));

    }
}