package programmers.test;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 */

@Slf4j
public class Test01 {

    public int solution(int n) {
        if (n > 1000) return 0;
        int answer = 0;
        List<Integer> primeList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (isPrimeNumber(i)) primeList.add(i);
        }

        for(Integer number1: primeList) {
            for(Integer number2: primeList) {
                if (number1.equals(number2)) break;
                for(Integer number3: primeList) {
                    if (number2.equals(number3)) break;
                    if (number1 + number2 + number3 == n) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }

        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}