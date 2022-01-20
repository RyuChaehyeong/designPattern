package basicjava.ch4;

public class WhilePrintFrom1To10Example {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10) {
            System.out.println("***" + i);
            i++;
        }

        int j = 1;
        int sum = 0;

        while (j <= 100) {
            sum += j;
            j++;
        }
        System.out.println("1부터 100까지 합: " + sum);
    }
}
