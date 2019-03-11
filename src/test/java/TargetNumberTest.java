import org.junit.Before;
import org.junit.Test;
import programmers.TargetNumber;

import static org.junit.Assert.assertEquals;

public class TargetNumberTest {

    private TargetNumber work;

    @Before
    public void init() {
        work = new TargetNumber();
    }

    @Test
    public void testCase01() {
        int[] number = {1, 1, 1, 1, 1};
        assertEquals(5, work.solution(number, 3));
    }
}
