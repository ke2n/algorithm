package programmers;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;


// https://programmers.co.kr/learn/courses/30/lessons/42584
@Slf4j
public class Stock {

    public int[] solution(int[] prices) {
        if (prices == null || prices.length == 0) return new int[0];
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            int cnt = 0;
            for (int j = i + 1; j < prices.length; j++) {
                cnt++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer.add(cnt);
        }

        log.info("{}", answer);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
