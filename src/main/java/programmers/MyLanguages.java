package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

// https://www.codewars.com/kata/mylanguages/java
// 정렬 자료구조 비교 : https://blog.scottlogic.com/2010/12/22/sorted_lists_in_java.html
// toArray시 size 할당 관련 : https://stackoverflow.com/questions/4042434/converting-arrayliststring-to-string-in-java/4042464#4042464
@Slf4j
public class MyLanguages {

    public String[] result(Map<String, Integer> map) {
        Queue<Language> queue = new PriorityQueue<>();
        List<String> result = new ArrayList<>();

        for (String key : map.keySet()) {
            queue.add(new Language(key, map.get(key)));
        }

        while (queue.size() > 0) {
            Language language = queue.poll();
            if (60 <= language.getScore()) {
                result.add(language.getName());
            }
        }

        return result.toArray(new String[0]);
    }

}

@AllArgsConstructor
@ToString
@Getter
class Language implements Comparable<Language> {

    private String name;
    private int score;

    @Override
    public int compareTo(Language o) {
        if (this.score > o.score) {
            return -1;
        } else if (this.score < o.score) {
            return 1;
        }
        return 0;
    }
}