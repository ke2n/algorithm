package programmers;

import java.util.LinkedList;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Printer {

    public int solution(int[] priorities, int location) {
        @ToString
        class Docu {
            private int index;
            private int priority;

            private Docu(int index, int priority) {
                this.index = index;
                this.priority = priority;
            }
        }

        int answer = 0;
        LinkedList<Docu> list = new LinkedList<>();
        for (int i =  0; i < priorities.length; i++) {
            list.add(new Docu(i, priorities[i]));
        }

        Docu firstDc = null;

        while(list.size()>1) {
            firstDc = list.getFirst();
            for (int i = 1; i < list.size(); i++) {
                if (firstDc.priority < list.get(i).priority) {
                    list.addLast(firstDc);
                    list.removeFirst();
                    break;
                }
                if (i == list.size()-1) {
                    if(firstDc.index == location) return answer;
                    list.removeFirst();
                    answer++;
                }
            }
        }
        return answer + 1;
    }
}
