import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NQueenTest {

    CalculateNqueen nq;

    @BeforeEach
    public void initObj() {
        nq = new CalculateNqueen();
    }

    @Test
    public void nQueenTest() {
        assertArrayEquals(new int[][] { { 0, 1, 0, 0 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 }, { 0, 0, 1, 0 } },
                nq.nQueens(4));
        assertArrayEquals(
                new int[][] { { 1, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0 },
                        { 0, 0, 0, 1, 0 } },
                nq.nQueens(5));
        assertArrayEquals(new int[][] { { 1 } },
                nq.nQueens(1));
        assertArrayEquals(new int[][] { { -1 } },
                nq.nQueens(2));
        assertArrayEquals(new int[][] { { -1 } },
                nq.nQueens(3));
    }
}
