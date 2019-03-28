import org.junit.Before;
import org.junit.Test;

import programmers.Printer;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer work;

    @Before
    public void init() {
        work = new Printer();
    }

    @Test
    public void testCase01() {
        int[] priorities = {2, 1, 3, 2};
        assertEquals(1, work.solution(priorities, 2));
    }

    @Test
    public void testCase02() {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        assertEquals(5, work.solution(priorities, 0));
    }
}
