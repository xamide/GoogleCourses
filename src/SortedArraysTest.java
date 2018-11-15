import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArraysTest {

    @Test
    void sort() {
            int [] intArr = {3, 6, 1, 1, 8, 4, 2, 1, 2, 5};
            int [] expectedArr = {1, 2, 3, 4, 5, 6, 8};
            SortedArrays sortArr = new SortedArrays();
            assertArrayEquals(expectedArr, sortArr.sort(intArr));

        /*
        Return an array that contains the sorted values from the input array with duplicates removed.
        sort([]) → []
        sort([1]) → [1]
        sort([1, 1]) → [1]
        Solution: int[] sort(int[] a) {
          }
        */
    }
}