package se.lexicon.Lecture;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // datatype[] arrayName;
        int[] numbers; // = new int[3];
        numbers = new int[3]; // [ 0, 0, 0 ]
        // int[] numbers = new int[0];  // is ok.

        String[] names; // = new String[3];
        names = new String[3]; // [ null, null, null ]
        char[] letters = {1, 2, 3, 4, 5,}; // same as = new char[5] {1, 2, 3, 4, 5};

        ex1();
        ex2();
        ex3();
    }

    public static void ex1() {
        String[] names = new String[3]; // [ Fredrick, Markus, Dennis ]
        System.out.println(names.length); // 3
        System.out.println("-------------------");
        names[0] = "Fredrick";
        names[1] = "Markus";
        names[names.length - 1] = "Dennis";

        System.out.println(names[1]);
        System.out.println(names[0]);
        System.out.println(names[2]);
        //System.out.println(names[20]); // ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 3
        System.out.println("-------------------");
    }

    public static void ex2() {
        int[] numbers = {5, 2, 3, 4, 7};
        for (int i = 0; i < numbers.length; i++) {
            if (i == 2) {
                numbers[i] = 200;
            } // {5, 2, 200, 4, 7}
            System.out.println("index[" + i + "] = " + numbers[i]);
        }

        System.out.println("-------------------");
        for (int nr : numbers) { // read only
            if (nr == 200){
                nr = 5000; // {5, 2, 5000, 4, 7}
            }
            System.out.println(nr);
        } // {5, 2, 200, 4, 7}

        System.out.println("-------------------");
        System.out.println(Arrays.toString(numbers));
        System.out.println("-------------------");
    }

    public static void ex3(){
        int[] originalArray = {2, 5, 8, 1, 9}; // {2, 5, 8, 1, 9};
        System.out.println("Original array: ");
        System.out.println(Arrays.toString(originalArray));

        int[] newArray = new int[originalArray.length + 1]; // {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        } // {2, 5, 8, 1, 9, 0};
        newArray[newArray.length - 1] = 100; // {2, 5, 8, 1, 9, 100};

        System.out.println("expanded array: ");
        System.out.println(Arrays.toString(newArray));

        System.out.println("-------------------");
    }
}
