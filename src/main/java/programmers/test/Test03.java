package programmers.test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 *
 */
@Slf4j
public class Test03 {

    public int[] solution(int[] healths, int[][] items) {
        List<Integer> answer = new ArrayList<>();
        List<CharacterInfo> charInfoList = new ArrayList<>();
        Queue<ItemInfo> itemQueue = new PriorityQueue<>();

        for (int health : healths) {
            charInfoList.add(new CharacterInfo(health));
        }

        log.info("{}", charInfoList);

        for (int i = 0; i < items.length; i++) {
            itemQueue.add(new ItemInfo(i + 1, items[i][0], items[i][1]));
        }
        log.info("itemQueue {}", itemQueue);

        while (itemQueue.size() > 0) {
            ItemInfo item = itemQueue.poll();
            log.info("itemQueue.poll {}", item);
            for (CharacterInfo charInfo : charInfoList) {
                if (!charInfo.isApply() && charInfo.getHealth() - item.getMinusHealth() >= 100) {
                    answer.add(item.getIdx());
                    charInfo.setApply(true);
                    break;
                }
            }
        }

        log.info("charInfoList {}", charInfoList);
        log.info("answer {}", answer);

        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}

@Getter
@ToString
@AllArgsConstructor
class ItemInfo implements Comparable<ItemInfo> {

    private int idx;
    private int plusAttack;
    private int minusHealth;

    @Override
    public int compareTo(ItemInfo o) {
        if (this.minusHealth > o.minusHealth) {
            return -1;
        } else if (this.minusHealth < o.minusHealth) {
            return 1;
        }
        // 기본적으로 minusHealth 역순으로 minusHealth가 같다면, plusAttack의 역순으로 정렬
        return Integer.compare(o.plusAttack, this.plusAttack);
    }
}

@Getter
@Setter
@ToString
class CharacterInfo {

    private int health;
    private int attackValue;
    private boolean isApply;

    public CharacterInfo(int health) {
        this.health = health;
        this.attackValue = 0;
        this.isApply = false;
    }
}