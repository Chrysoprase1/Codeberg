// program that stores integers in an array
// program comes with a sort(array) method to sort from smallest to greatest number


import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(smallest (array));
        System.out.println(indexOfSmallest (array));
        
        System.out.println();
        
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        
        System.out.println();
        
        int[] numbers2 = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(numbers2));
        MainProgram.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));
        MainProgram.swap(numbers2, 0, 3);
        System.out.println(Arrays.toString(numbers2));
        
        System.out.println();
        MainProgram.sort(numbers2);
        System.out.println(Arrays.toString (numbers2));
    }
    
    // find smallest integer in array
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (Integer.valueOf (smallest) > Integer.valueOf (number)) {
                smallest = number;
            }
        }
        return smallest;
    }
    // find index of smallest integer in array
    public static int indexOfSmallest (int[] array) {
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (Integer.valueOf (array[smallestIndex]) > Integer.valueOf (array[i])) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    // find index of smallest integer in array from a certain point
    public static int indexOfSmallestFrom (int[] array, int startPoint) {
        int smallestIndexFrom = startPoint;
        for (int i = smallestIndexFrom; i < array.length; i++) {
            if (Integer.valueOf (array[smallestIndexFrom]) 
                    > Integer.valueOf (array[i])) {
                smallestIndexFrom = i;
            }
        }
        return smallestIndexFrom;
    }
    // swap indexes of an array
    public static void swap (int[] array, int index1, int index2) {
        int storeSwapIndex = array[index1];
        
        array [index1] = array[index2];
        array [index2] = storeSwapIndex;
    }
    // loop find index of smallest integer in array from i (0, i++)
        // swap smallest integer index into i (starting0)
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int start = indexOfSmallestFrom (array, i);
            swap (array, i, start);
        }
    }
}
