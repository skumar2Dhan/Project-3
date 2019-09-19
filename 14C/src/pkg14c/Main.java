/* Saahil Kumar
    Lab 14-C
    printSort1()--Selection Sort
    printSort2()--Bubble Sort
    Small driver to test both the sorts
 */
package pkg14c;

import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1};
        int[] array1 = {4, 2, 7, 1};
        Scanner console = new Scanner(System.in);

        printSort1(array);
        System.out.println(Arrays.toString(array));

        System.out.println();

        printSort2(array1);
        System.out.println(Arrays.toString(array1));
    }

    /* This is the Selection Sort for Integer Array, Saahil Kumar, December 7th 2017 */
    public static void printSort1(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(Arrays.toString(array));
            int index = i;
            for (int z = i + 1; z < array.length; z++) {
                if (array[z] < array[index]) {
                    index = z;
                }
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
    }

    /* This is the Bubble Sort for Integer Array, Saahil Kumar, December 7th 2017 */
    public static void printSort2(int[] array1) {
        int temp;
        int size = array1.length;
        for (int i = 0; i < size ; i++) {
            System.out.println(Arrays.toString(array1));
            for (int j =1; j < size; j++) {
                if (array1[j] < array1[j - 1]) {
                    temp = array1[j];
                    array1[j] = array1[j - 1];
                    array1[j - 1] = temp;
                    System.out.println(Arrays.toString(array1));
                }
            }
        }
    }
}
