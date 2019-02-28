import org.junit.Before;
import org.junit.Test;

import programmers.Work04;

import static org.junit.Assert.assertArrayEquals;

public class Work04Test {

    private Work04 work;

    @Before
    public void init() {
        work = new Work04();
    }

    @Test
    public void BasicTests() {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        assertArrayEquals(new int[]{4, 1, 3, 0}, work.solution(genres, plays));
    }
}
