import org.junit.Before;
import org.junit.Test;

import programmers.Scoville;

import static org.junit.Assert.assertEquals;

public class ScovilleTest {

    private Scoville work;

    @Before
    public void init() {
        work = new Scoville();
    }

    @Test
    public void testCase01() {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        assertEquals(2, work.solution(scoville, 7));
    }

    @Test
    public void testCase02() {
        int[] scoville = {11, 2, 3, 9, 10, 12};
        assertEquals(-1, work.solution(scoville, 200));
    }

    @Test
    public void testCase03() {
        int[] scoville = {1, 2};
        assertEquals(1, work.solution(scoville, 3));
    }
}
