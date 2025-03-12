import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ArraySearchTest {
    @Test
    public void arraySearchTest() {
        ArrSearch as = new ArrSearch();

        assertEquals(-1, as.linearSearch(new int[] { 4, 1, 6, 82, 6, 0 }, 0, 9));
        assertEquals(4, as.linearSearch(new int[] { 9, 2, 0, 56, 12, 26, 3 }, 0, 12));
        assertEquals(7, as.linearSearch(new int[] { 9, 14, 73, 85, 12, 8, 3, 0, 23, 67, 98 }, 0, 0));

        assertEquals(-1, as.binarySearch(new int[] { 1, 5, 6, 8, 24, 78, 345, 900, 1442 }, 0, 8, 25));
        assertEquals(0, as.binarySearch(new int[] { 1, 5, 6, 8, 24, 78, 345, 900, 1442 }, 0, 8, 1));
        assertEquals(8, as.binarySearch(new int[] { 1, 5, 6, 8, 24, 78, 345, 900, 1442 }, 0, 8, 1442));
    }
}
