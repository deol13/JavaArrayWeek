package se.lexicon.Lecture;

import java.util.Arrays;

public class UtilArrayDemo {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    public static void ex1() {
        String[] names = {"Simon", "erik", "Ulf", "Fredrick", "Jonas", "Kent", "Markus", "Martina"};
        System.out.println("Original array: " + Arrays.toString(names));
        // A 65 < Z 90 < a 97 < z 122   unicode numbers
        Arrays.sort(names);
        System.out.println("Sorted array case sensitive: " + Arrays.toString(names));
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted array insensitive to case: " + Arrays.toString(names));
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER.reversed());
        System.out.println("Reversed Sorted array insensitive to case: " + Arrays.toString(names));
    }

    public static void ex2() {
        int[] numbers = {700, 900, 200, 4555, 34500, 445000, 6000000};
        Arrays.sort(numbers);   // sorted array: {200, 700, 900, 4555, 34500, 445000, 6000000};
        int index = Arrays.binarySearch(numbers, 100); // returns the index if found, else returns a negative number.
        if (index < 0) {
            System.out.println("Index not found");
        } else {
            System.out.println("Value found: [" + index + "]: " + numbers[index]);
        }
        // It splits the array in half.
        // It checks if the key is smaller than the last index in the first half, if it is then it searches the first half.
        // Otherwise, it searches the second half.
        // This is why the array must be sorted.
    }

    public static void ex3(){
        int[] numbers = {10, 20, 30, 40};

        int[] newArray = Arrays.copyOf(numbers, numbers.length + 1); // {10, 20, 30, 40, 0}
        newArray[newArray.length - 1] = 50; // {10, 20, 30, 40, 50}
    }
}
