package programmers.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/**
 */
@Slf4j
public class Test03 {

    public int[] solution(int[] healths, int[][] items) {
        List<Integer> answer = new ArrayList<>();
        List<CharacterInfo> charInfolist = new ArrayList<>();
        Map<Integer, ItemInfo> itemInfoMap = new HashMap<>();

        for(int health: healths) {
            charInfolist.add(new CharacterInfo(health));
        }

        log.info("{}", charInfolist);

        for(int i = 0; i < items.length; i++) {
            itemInfoMap.put(i + 1, new ItemInfo(items[i][0], items[i][1]));
        }

        for(CharacterInfo charInfo: charInfolist) {
            for(Integer itemKey: itemInfoMap.keySet()) {
                ItemInfo item = itemInfoMap.get(itemKey);
                if (charInfo.getHealth() - item.getMinusHealth() >= 100) {
                    answer.add(itemKey);
                    charInfo.setHealth(charInfo.getHealth() - item.getMinusHealth());
                    charInfo.setAttackValue(item.getPlusAttack());
                }
            }
        }

        log.info("charInfolist {}", charInfolist);
        log.info("answer {}", answer);

        return answer.stream().mapToInt(Integer::intValue).distinct().toArray();
    }
}

class ItemInfo {
    private int plusAttack;
    private int minusHealth;

    public ItemInfo(int plusAttack, int minusHealth) {
        this.plusAttack = plusAttack;
        this.minusHealth = minusHealth;
    }

    public int getPlusAttack() {
        return plusAttack;
    }

    public int getMinusHealth() {
        return minusHealth;
    }
}

class CharacterInfo {
    private int health;
    private int attackValue;

    public CharacterInfo(int health) {
        this.health = health;
        this.attackValue = 0;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    @Override
    public String toString() {
        return "CharacterInfo{" +
            "health=" + health +
            ", attackValue=" + attackValue +
            '}';
    }
}