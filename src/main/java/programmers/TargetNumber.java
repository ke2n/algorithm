package programmers;

public class TargetNumber {
    public int solution(int[] numbers, int target) {
        return dfs(target, numbers, 0, 0);
    }

    private int dfs(int target, int[] numbers, int index, int num) {
        if (index == numbers.length) {
            return num == target ? 1 : 0;
        }
        return dfs(target, numbers, index + 1, num + numbers[index])
                + dfs(target, numbers, index + 1,  num - numbers[index]);
    }
}
