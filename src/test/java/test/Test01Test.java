package test;

import org.junit.Before;
import org.junit.Test;

import programmers.test.Test01;

import static org.junit.Assert.assertEquals;

public class Test01Test {

    private Test01 test;

    @Before
    public void init(){
        test = new Test01();
    }


    @Test
    public void testCase01() {
        int n = 33;
        assertEquals(4, test.solution(n));
    }

    @Test
    public void testCase02() {
        int n = 9;
        assertEquals(0, test.solution(n));
    }
}
