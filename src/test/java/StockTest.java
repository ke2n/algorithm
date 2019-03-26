import org.junit.Before;
import org.junit.Test;

import programmers.Stock;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class StockTest {

    private Stock work;

    @Before
    public void init() {
        work = new Stock();
    }

    @Test
    public void testCase01() {
        int[] prices = {1, 2, 3, 2, 3};
        int[] result = {4, 3, 1, 1, 0};
        assertArrayEquals(result, work.solution(prices));
    }

    @Test
    public void parameter가_Null일때() {
        int[] prices = null;

        assertNotNull(work.solution(prices));
    }

    @Test
    public void parameter가_EmptyArray일때() {
        int[] prices = null;

        assertNotNull(work.solution(new int[0]));
    }
}
