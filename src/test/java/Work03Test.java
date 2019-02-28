import org.junit.Before;
import org.junit.Test;

import programmers.Work03;

import static org.junit.Assert.assertEquals;

public class Work03Test {

    private Work03 work;

    @Before
    public void init() {
        work = new Work03();
    }

    @Test
    public void BasicTests() {
        String[][] case1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        assertEquals(5, work.solution(case1));

        String[][] case2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        assertEquals(3, work.solution(case2));

        String[][] case3 = {{"동그란 안경", "얼굴"}, {"검정 선글라스", "얼굴"}, {"파란색 티셔츠", "상의"}, {"청바지", "하의"}};
        assertEquals(11, work.solution(case3));

        String[][] case4 = {{"동그란 안경", "얼굴"}, {"검정 선글라스", "얼굴"}, {"파란색 티셔츠", "상의"}, {"청바지", "하의"}, {"긴 코트", "겉옷"}};
        assertEquals(23, work.solution(case4));
    }
}
