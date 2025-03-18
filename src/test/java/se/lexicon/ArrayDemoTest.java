package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.lexicon.Lecture.ArrayDemo;

public class ArrayDemoTest {

    // Scenarios to test
    // findMaxNumber
    // 1. An array with positive numbers
    // 2. An array with negative numbers
    // 3. An array with a mix of positive and negative numbers
    // 4. Empty array
    // 5. An array with duplicate numbers
    // ...

    @Test
    @DisplayName("Find the maximum number in an array of positive numbers.")
    public void findMaxNumberWithPositiveNumbers() {
        // Test logic here
        // Scenario: A standard array with positive numbers
        int[] numbers = {1, 4, 3, 9, 2};

        // Expected maximum value is 9
        int expected = 9;

        // Actual maximum value should generate bbu the implemented logic
        int actual = ArrayDemo.findMaxNumber(numbers);

        // Verify the result
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Find the maximum number in an array of negative numbers.")
    public void findMaxNumberWithNegativeNumbers() {
        // Test logic here
        // Scenario: A standard array with positive numbers
        int[] numbers = {-1, -4, -3, -9, -2};

        // Expected maximum value is -1
        int expected = -1;

        // Actual maximum value should generate bbu the implemented logic
        int actual = ArrayDemo.findMaxNumber(numbers);

        // Verify the result
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Find the maximum number in an array of both positive and negative numbers.")
    public void findMaxNumberWithBothPositiveAndNegativeNumbers() {
        // Test logic here
        // Scenario: A standard array with positive numbers
        int[] numbers = {-1, 4, -3, 5, -9, -2};

        // Expected maximum value is 5
        int expected = 5;

        // Actual maximum value should generate bbu the implemented logic
        int actual = ArrayDemo.findMaxNumber(numbers);

        // Verify the result
        Assertions.assertEquals(expected, actual);
    }
}