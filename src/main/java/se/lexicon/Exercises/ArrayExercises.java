package se.lexicon.Exercises;

import java.util.*;

/// Array exercises from a pdf the teacher gave out.
public class ArrayExercises {
    public static void main(String[] args) {
        System.out.println("Exercise one: ");
        ex1();
        System.out.println("--------------------------");
        System.out.println("Exercise two: ");
        ex2();
        System.out.println("--------------------------");
        System.out.println("Exercise three: ");
        ex3();
        System.out.println("--------------------------");
        System.out.println("Exercise four: ");
        ex4();
        System.out.println("--------------------------");
        System.out.println("Exercise four: ");
        ex4();
        System.out.println("--------------------------");
        System.out.println("Exercise five: ");
        ex5();
        System.out.println("--------------------------");
        System.out.println("Exercise six: ");
        ex6();
        System.out.println("--------------------------");
        System.out.println("Exercise seven: ");
        ex7();
        System.out.println("--------------------------");
        System.out.println("Exercise eight: ");
        ex8();
        System.out.println("--------------------------");
        System.out.println("Exercise nine: ");
        ex9(9);
        System.out.println("--------------------------");
        System.out.println("Exercise ten: ");
        ex10();
        System.out.println("--------------------------");
//        System.out.println("Exercise eleven: ");
//        ex11();
//        System.out.println("--------------------------");
        System.out.println("Exercise twelve: ");
        ex12();
        System.out.println("--------------------------");
        System.out.println("Exercise thirteen: ");
        ex13();
        System.out.println("--------------------------");
    }

    public static void ex1() {
        int[] arr = {11, 23, 39};
        int[] arr2 = new int[3];

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ex2() {
        System.out.println("Index position of number 7 is: " + indexOf(7));  // 6
        System.out.println("Index position of number 20 is: " + indexOf(20));  // 6
    }

    public static int indexOf(int element) {
        int[] arr = {10, 4, 5, 11, 2, 8, 7, 9, 3, 6, 12, 1};
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void ex3() {
        String[] cityArray = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("Unsorted array: " + Arrays.toString(cityArray));

        //Object[] sortedArray = Arrays.stream(unsortedArray).sorted().toArray();
        Arrays.sort(cityArray, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted array: " + Arrays.toString(cityArray));
    }

    public static void ex4() {
        int[] originalArr = {1, 5, 10, 15, 20, 25, 30};
        int[] manualCopyArr = new int[originalArr.length];

        for (int i = 0; i < originalArr.length; i++) {
            manualCopyArr[i] = originalArr[i];
        }

        int[] utilArr = Arrays.copyOf(originalArr, originalArr.length);


        System.out.println("original array: " + Arrays.toString(originalArr));
        System.out.println("Manual copy array: " + Arrays.toString(manualCopyArr));
        System.out.println("Util copy array: " + Arrays.toString(utilArr));
    }

    public static void ex5() {
        String[][] strArr = new String[2][2];
        strArr[0][0] = "France";
        strArr[0][1] = "Paris";
        strArr[1][0] = "Sweden";
        strArr[1][1] = "Stockholm";

        System.out.println(strArr.length);

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[0].length; j++) {
                System.out.print(strArr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void ex6() {
        int[] numbers = {43, 5, 23, 17, 2, 14};
        double total = 0;
        for (int i : numbers) {
            total += i;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Average of those numbers are: " + total / numbers.length);
    }

    public static void ex7() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Loop print of uneven numbers: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println("\nLambda print of uneven numbers: ");
        Arrays.stream(numbers).forEach(n -> {
            if (n % 2 != 0) System.out.print(n + " ");
        });
        System.out.println();
    }


    public static void ex8() {
        System.out.println("Basic array only: ");
        ex8ArrayOnly();
        System.out.println("-------");
        System.out.println("Set collector used: ");
        ex8UtilAllowed();

    }

    public static void ex8ArrayOnly() {
        int[] originalArr = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int[] sortedArr = Arrays.stream(originalArr).sorted().toArray();

        int[] noDuplicatesArr = new int[sortedArr.length];
        int noDuplicatesArrCount = 1;
        noDuplicatesArr[0] = sortedArr[0];
        int currentValue = sortedArr[0];
        for (int i = 1; i < sortedArr.length; i++) {
            if (sortedArr[i] != currentValue) {
                noDuplicatesArr[noDuplicatesArrCount] = sortedArr[i];
                noDuplicatesArrCount++;
                currentValue = sortedArr[i];
            }
        }

        System.out.println("Original array: " + Arrays.toString(originalArr));
        System.out.println("New array: " + Arrays.toString(noDuplicatesArr));
    }

    public static void ex8UtilAllowed() {
        int[] originalArr = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        Set<Integer> newArr = new HashSet<Integer>(); //Doesn't allow duplicates
        for (int i : originalArr) {
            newArr.add(i); //Add won't work if the value already exists, return false in that case.
        }

        System.out.println("Original array: " + Arrays.toString(originalArr));
        System.out.println("New array: " + Arrays.toString(newArr.toArray()));
    }

    public static void ex9(int nr) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int[] newNumbers = Arrays.copyOf(numbers, numbers.length + 1);
        newNumbers[newNumbers.length - 1] = nr;

        // Array only example:
        int[] newNumbers2 = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newNumbers2[i] = numbers[i];
        }

        System.out.println("Old array: " + Arrays.toString(numbers));
        System.out.println("New Array: " + Arrays.toString(newNumbers));
        System.out.println("New Array2: " + Arrays.toString(newNumbers2));
    }

    public static void ex10() {
        int[][] multiplicationTable = new int[10][10];

        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[0].length; j++) {
                int newValue = (j + 1) * (i + 1);
                multiplicationTable[i][j] = newValue;
                System.out.print(newValue);

                //To align the output to look better.
                int spaces = newValue < 10 ? 5 : 4; // expression ? true : false
                for (int k = 0; k < spaces; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void ex11() {
        Scanner scanner = new Scanner(System.in);
        int exitValue = 10;
        int currentValue = 0;
        int[] numbers = new int[0];

        System.out.println("To exit the program type: " + exitValue);
        do {
            System.out.println("Input a value: ");
            currentValue = scanner.nextInt();

            int[] tmpArr = Arrays.copyOf(numbers, numbers.length + 1);
            numbers = Arrays.copyOf(tmpArr, tmpArr.length);

            numbers[numbers.length - 1] = currentValue;

        } while (currentValue != exitValue);

        System.out.println("Array: " + Arrays.toString(numbers));

        int[] reversedArr = new int[numbers.length];
        int numbersCount = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedArr[i] = numbers[numbersCount];
            numbersCount++;
        }

        System.out.println("Array reversed: " + Arrays.toString(reversedArr));


        scanner.close();
    }

    // May need refactoring
    public static void ex12() {
        int[][] twoDArray = new int[4][4];
        int value = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[0].length; j++) {
                twoDArray[i][j] = ++value;
            }
        }
        System.out.println(Arrays.toString(twoDArray[0]));
        System.out.println(Arrays.toString(twoDArray[1]));
        System.out.println(Arrays.toString(twoDArray[2]));
        System.out.println(Arrays.toString(twoDArray[3]));

        //Only works if both dimensions of the array are equal in size.
        for (int i = 0; i < twoDArray.length; i++) {
            System.out.print(twoDArray[i][i] + " ");
        }
        System.out.println();
    }

    public static void ex13() {
        int[] randomArr = {12, 9, 13, 1, 8, 4, 11, 7, 2, 14, 5, 3, 6, 10};
        int[] sortedArr = new int[randomArr.length];

        System.out.println("Original array: " + Arrays.toString(randomArr));

        int endOfArr = randomArr.length - 1;
        int startOfArr = 0;
        for (int j : randomArr) {
            if (j % 2 != 0) {
                sortedArr[startOfArr] = j;
                startOfArr++;
            } else {
                sortedArr[endOfArr] = j;
                endOfArr--;
            }
        }

        System.out.println("New array:" + Arrays.toString(sortedArr));
    }
}
