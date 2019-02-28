import org.junit.Before;
import org.junit.Test;

import programmers.Blind01;

import static org.junit.Assert.assertArrayEquals;

public class Blind01Test {

    private Blind01 work;

    @Before
    public void init() {
        work = new Blind01();
    }

    @Test
    public void BasicTests() {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
            "Change uid4567 Ryan"};
        String[] result = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        assertArrayEquals(result, work.solution(record));
    }
}
