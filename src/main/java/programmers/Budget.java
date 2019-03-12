package programmers;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Budget {

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int dept : d) {
            budget -= dept;
            if (budget < 0) break;
            answer++;
        }

        return answer;
    }
}
