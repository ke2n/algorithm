package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

enum UserActCode {
    ENTER("Enter", "들어왔습니다."),
    LEAVE("Leave", "나갔습니다."),
    CHANGE("Change", ""),

    UNKNOWN("Unknown", "");

    String value;
    String korText;

    UserActCode(String value, String korText) {
        this.value = value;
        this.korText = korText;
    }

    public String getKorText() {
        return korText;
    }

    static UserActCode enumOf(String value) {
        return Arrays.stream(UserActCode.values())
            .filter(type -> type.value.equals(value)).findAny()
            .orElse(UNKNOWN);
    }
}

class UserAct {

    private String uid;
    private UserActCode act;

    public String getUid() {
        return uid;
    }

    public UserActCode getAct() {
        return act;
    }

    UserAct(UserActCode act, String uid) {
        this.uid = uid;
        this.act = act;
    }
}

@Slf4j
public class Blind01 {

    private Map<String, String> nickName;

    public String[] solution(String[] record) {
        String[] answer = {};
        nickName = new HashMap<>();
        List<UserAct> chatHistory = chatRoomHistory(record);
        List<String> result = convertTextList(chatHistory);
        return result.toArray(new String[0]);
    }

    private List<String> convertTextList(List<UserAct> list) {
        return list.stream()
            .map(e -> String.format("%s님이 %s", nickName.get(e.getUid()), e.getAct().getKorText()))
            .collect(Collectors.toList());
    }

    private List<UserAct> chatRoomHistory(String[] arrText) {
        List<UserAct> resultList = new LinkedList<>();
        for (String text : arrText) {
            String[] textObj = text.split(" ");
            UserActCode action = UserActCode.enumOf(textObj[0]);
            String uid = textObj[1];

            switch (action) {
                case CHANGE:
                case ENTER:
                    nickName.put(uid, textObj[2]);
            }

            switch (action) {
                case ENTER:
                case LEAVE:
                    resultList.add(new UserAct(action, uid));
            }
        }
        return resultList;
    }
}