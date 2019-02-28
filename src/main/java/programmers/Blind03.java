package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

class StudentInfo {

    private String id;
    private String name;
    private String major;
    private String grade;

    public StudentInfo(String id, String name, String major, String grade) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", major='" + major + '\'' +
            ", grade='" + grade + '\'' +
            '}';
    }
}

@Slf4j
public class Blind03 {

    public int solution(String[][] relation) {
        int answer = 0;
        List<StudentInfo> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (String[] info : relation) {
            for (int i = 0; i < info.length; i++) {
                map.put(info[i], map.containsKey(info[i]) ? map.get(info[i]) + 1 : 0);
            }
            list.add(new StudentInfo(info[0], info[1], info[2], info[3]));
        }
        log.info("{}", map);

        return answer;
    }
}