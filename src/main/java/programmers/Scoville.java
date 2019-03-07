package programmers;

import java.util.PriorityQueue;
import java.util.Queue;

import lombok.extern.slf4j.Slf4j;

// https://programmers.co.kr/learn/courses/30/lessons/42626?language=java
@Slf4j
public class Scoville {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();

        for (int a : scoville) {
            queue.add(a);
        }

        while (queue.size() > 0) {
            if (queue.size() == 1 || queue.peek() > K) {
                if (queue.peek() < K) {
                    answer = -1;
                }
                break;
            }

            answer++;
            queue.add(queue.poll() + queue.poll() * 2);

            log.info("test - {}", queue);
        }
        return answer;
    }
}
