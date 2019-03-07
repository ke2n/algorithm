package test;

import org.junit.Before;
import org.junit.Test;

import programmers.test.Test02;

import static org.junit.Assert.assertEquals;

public class Test02Test {

    private Test02 test;

    @Before
    public void init(){
        test = new Test02();
    }

    @Test
    public void testCase01() {
        int[] people = {2, 3};
        int[] tShirts = {1, 2, 3};
        assertEquals(2, test.solution(people, tShirts));
    }

    @Test
    public void testCase02() {
        int[] people = {1, 2, 3};
        int[] tShirts = {1, 1};
        assertEquals(1, test.solution(people, tShirts));
    }

    @Test
    public void testCase03() {
        int[] people = {1, 2, 3};
        int[] tShirts = {4, 4, 4};
        assertEquals(3, test.solution(people, tShirts));
    }

    @Test
    public void testCase04() {
        int[] people = {1, 2, 3, 4};
        int[] tShirts = {4, 4, 4, 5};
        assertEquals(3, test.solution(people, tShirts));
    }
}
