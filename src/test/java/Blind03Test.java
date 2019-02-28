import org.junit.Before;
import org.junit.Test;

import programmers.Blind03;

import static org.junit.Assert.assertEquals;

public class Blind03Test {

    private Blind03 work;

    @Before
    public void init() {
        work = new Blind03();
    }

    @Test
    public void BasicTests() {
        String[][] relation = {
            {"100", "ryan", "music", "2"},
            {"200", "apeach", "math", "2"},
            {"300", "tube", "computer", "3"},
            {"400", "con", "computer", "4"},
            {"500", "muzi", "music", "3"},
            {"600", "apeach", "music", "2"}
        };
        assertEquals(2, work.solution(relation));
    }
}
