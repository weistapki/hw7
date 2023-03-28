package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {5, 6, 7, 3, 2, 4};
        int target = 10;
        System.out.println(Arrays.toString(solution.twoSum(numbers,target)));
    }
}
