package programmers;

import java.util.Map;
import java.util.Map.Entry;

import lombok.extern.slf4j.Slf4j;

// https://www.codewars.com/kata/mylanguages/java
@Slf4j
public class MyLanguages {

    public String[] result(Map<String, Integer> map) {
        log.info("map - {}", map);
        String[] result = map.entrySet().stream()
            .filter(e -> 60 <= e.getValue())
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
            .map(Entry::getKey).toArray(String[]::new);
        log.info("result - {}", result);
        return result;
    }

}
