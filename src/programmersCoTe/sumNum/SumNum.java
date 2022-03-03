package programmersCoTe.sumNum;

import java.util.Arrays;

public class SumNum {

    public static int solution(int[] numbers) {

        int res = 0;
        for (int i=0; i<10; i++) {
            res += i;
        }
        for (int num : numbers) {
            res -= num;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,8,0};
        System.out.println(solution(nums));

    }
}
