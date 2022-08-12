package com.sparta.dr;

import com.sparta.dr.exceptions.SorterLoaderException;
import com.sparta.dr.sorters.GenericSorter;
import com.sparta.dr.start.ArrayGenerator;
import com.sparta.dr.start.SortFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortTester {
    static GenericSorter chosenSorter;
    private static int[] randArray;

    @BeforeAll
    public static void getSorter() throws SorterLoaderException {
        /* Key for testers
        * 1 = Binary Sort
        * 2 = Bubble Sort
        * 3 = Insertion Sort
        * 4 = Merge Sort
        * 5 = Quick SOrt
        * */
        chosenSorter = SortFactory.getSorter(1);
    }

    @Test
    @DisplayName("Given an array of even length to the chosen sorter return sorted array")
    void givenAnArrayOfEvenLengthToTheChosenSorterReturnSortedArray() {
        int[] array = {12, 15, 2, 5, 125, 16, 26, 38};

        Assertions.assertEquals("[2, 5, 12, 15, 16, 26, 38, 125]", Arrays.toString(chosenSorter.sortArray(array)));

    }

    @Test
    @DisplayName("Given an array of odd length to the chosen sorter return sorted array")
    void givenAnArrayOfOddLengthToTheChosenSorterReturnSortedArray() {
        int[] array = {26, 85, 33, 67, 168, 138, 1};
        Assertions.assertEquals("[1, 26, 33, 67, 85, 138, 168]", Arrays.toString(chosenSorter.sortArray(array)));
    }

    @Test
    @DisplayName("Given an array of only negative values return sorted array")
    void givenAnArrayOfOnlyNegativeValuesReturnSortedArray() {
        int[] array = {-12, -15, -2, -5, -125, -16, -26, -38};

        Assertions.assertEquals("[-125, -38, -26, -16, -15, -12, -5, -2]", Arrays.toString(chosenSorter.sortArray(array)));

    }

    @Test
    @DisplayName("Given an input create array of size input")
    void givenAnInputCreateArrayOfSizeInput() {
        int input = 25;
        randArray = ArrayGenerator.randomArrayGenerator(input);
        Assertions.assertEquals(input, randArray.length);

    }

    @Test
    @DisplayName("Given an array has duplicates return sorted Array")
    void givenAnArrayHasDuplicatesReturnSortedArray() {
        int[] array = {18, 18, 3, 6, 3, 200, -12, -18};

        Assertions.assertEquals("[-18, -12, 3, 3, 6, 18, 18, 200]", Arrays.toString(chosenSorter.sortArray(array)));
        // doesn't work with Binary Sort but that's intended.

    }

    @Test
    @DisplayName("given an already sorted array, return sorted array")
    void givenAnAlreadySortedArrayReturnSortedArray() {
        int[] array = {-18, -12, 3, 3, 6, 18, 200};
        Assertions.assertEquals("[-18, -12, 3, 6, 18, 200]", Arrays.toString(chosenSorter.sortArray(array)));
    }


}



