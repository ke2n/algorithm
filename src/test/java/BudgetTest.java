import org.junit.Before;
import org.junit.Test;

import programmers.Budget;

import static org.junit.Assert.assertEquals;

public class BudgetTest {

    private Budget work;

    @Before
    public void init() {
        work = new Budget();
    }

    @Test
    public void testCase01() {
        int[] d = {1, 3, 2, 5, 4};
        assertEquals(3, work.solution(d, 9));
    }

    @Test
    public void testCase02() {
        int[] d = {2, 2, 3, 3};
        assertEquals(4, work.solution(d, 10));
    }

    @Test
    public void testCase03() {
        int[] d = {1, 3, 2, 5, 4};
        assertEquals(4, work.solution(d, 13));
    }
}
