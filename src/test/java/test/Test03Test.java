package test;

import org.junit.Before;
import org.junit.Test;

import programmers.test.Test03;

import static org.junit.Assert.assertArrayEquals;

public class Test03Test {

    private Test03 test;

    @Before
    public void init(){
        test = new Test03();
    }

    @Test
    public void testCase01() {
        int[] healths = {200, 120, 150};
        int[][] items = {{30,100}, {500,30}, {100,400}};
        int[] result = {1, 2};
        assertArrayEquals(result, test.solution(healths, items));
    }

    @Test
    public void testCase02() {
        int[] healths = {300,200,500};
        int[][] items = {{1000, 600}, {400, 500}, {300, 100}};
        int[] result = {3};
        assertArrayEquals(result, test.solution(healths, items));
    }
}
