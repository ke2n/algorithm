package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyLanguages {

    public String[] result(Map<String, Integer> map) {
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (60 <= map.get(key)) {
                list.add(key);
            }
        }
        log.info("{}", list);
        return list.toArray(new String[0]);
    }

}
