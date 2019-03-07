import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import programmers.MyLanguages;

import static org.junit.Assert.assertArrayEquals;

public class MyLanguagesTest {

    private MyLanguages work;

    @Before
    public void init() {
        work = new MyLanguages();
    }

    @Test
    public void firstCase() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Hindi", 10);
        map.put("Dutch", 93);
        map.put("Greek", 60);
        String[] result = {"Dutch", "Greek"};

        assertArrayEquals(result, work.result(map));
    }

    @Test
    public void testCase01() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 10);
        map.put("Ruby", 80);
        map.put("Python", 65);
        String[] result = {"Ruby", "Python"};

        assertArrayEquals(result, work.result(map));
    }

    @Test
    public void testCase02() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Hindi", 60);
        map.put("Dutch", 93);
        map.put("Greek", 71);
        String[] result = {"Dutch", "Greek", "Hindi"};

        assertArrayEquals(result, work.result(map));
    }

    @Test
    public void testCase03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("C++", 50);
        map.put("ASM", 10);
        map.put("Haskell", 20);
        String[] result = {};

        assertArrayEquals(result, work.result(map));
    }
}
