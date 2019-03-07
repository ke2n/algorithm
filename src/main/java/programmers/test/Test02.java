package programmers.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/**
 */

@Slf4j
public class Test02 {

    public int solution(int[] people, int[] tshirts) {
        if (people.length < 2 || people.length > 5000) return 0;
        if (tshirts.length < 2 || tshirts.length > 5000) return 0;
        int answer = 0;
        Map<Integer, Integer> tshirtsStock = new HashMap<>();
        Map<Integer, Integer> peopleInfo = new HashMap<>();

        Arrays.sort(people);
        Arrays.sort(tshirts);

        for (int person : people) {
            peopleInfo.put(person, 1);
        }

        for (int item : tshirts) {
            tshirtsStock.put(item, tshirtsStock.containsKey(item) ? tshirtsStock.get(item) + 1 : 1);
        }

        for (Integer person : peopleInfo.keySet()) {
            if (tshirtsStock.containsKey(person) && tshirtsStock.get(person) > 0) {
                tshirtsStock.put(person, tshirtsStock.get(person) - 1);
                peopleInfo.put(person, 0);
            }
        }

        for(Integer person : peopleInfo.keySet()) {
            for(Integer item : tshirtsStock.keySet()) {
                if (person <= item && tshirtsStock.get(item) > 0) {
                    tshirtsStock.put(item, tshirtsStock.get(item) - 1);
                    peopleInfo.put(person, 0);
                }
            }
        }

        log.info("peopleInfo {}", peopleInfo);
        log.info("tshirtsStock {}", tshirtsStock);

        for(Integer person : peopleInfo.keySet()) {
            if (peopleInfo.get(person) == 0) answer++;
        }

        return answer;
    }
}