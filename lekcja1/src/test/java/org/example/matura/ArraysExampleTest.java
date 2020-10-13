package org.example.matura;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysExampleTest {

    private final int[] TEST_ARRAY = {1, 3, 25, 6, 9, 13};

    @Test
    public void generateRandomArray_shouldReturn_arrayOfGivenSizeWithIntegersBetweenFromAndTo() {
        // Given
        int size = 10;
        int from = 5;
        int to = 15;

        // When
        int[] result = ArraysExample.generateRandomArray(size, from, to);

        // Then
        for (int i : result) {
            assertThat(i).isBetween(from, to);
        }
        assertThat(result.length).isEqualTo(size);

    }

    @Test
    public void maxNumberFromArray_shouldReturn_maxNumberInArray() {
        //When
        int result = ArraysExample.maxNumberFromArray(TEST_ARRAY);

        //Then
        assertThat(result).isEqualTo(25);
    }

    @Test
    public void averageNumberFromArray_shouldReturn_averageNumberFromArray() {
        //When
        double result = ArraysExample.averageNumberFromArray(TEST_ARRAY);

        //Then
        assertThat(result).isEqualTo(9.5);
    }

    @Test
    public void medianFromArray_shouldReturn_median() {
        double result = ArraysExample.medianFromArray(TEST_ARRAY);

        assertThat(result).isEqualTo(7.5);
    }

    @Test
    public void bubbleSort_shouldReturn_sortedArray() {
        int[] result = ArraysExample.bubbleSortOfNumbersFromArray(TEST_ARRAY);

        int[] testArraySortedDesc = {25, 13, 9, 6, 3, 1};
        assertThat(result).isEqualTo(testArraySortedDesc);
    }

    @Test
    public void shouldFail() {
        assertThat(true).isFalse();
    }
}