package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        printNarcissisticNumber();
    }

    /**
     * 打印所有的水仙花数。水仙花数是指一个三位数，其各位数字立方和等于该数本身。
     *
     * <p>例如，153是一个水仙花数，因为1的立方+5的立方+3的立方 = 153
     *
     * <p>提示：可用除法和求余运算得到一个数字的个、十、百位上的数字。
     */
    public static double p(double a) {
        return Math.pow(a, 3);
    }

    public static void printNarcissisticNumber() {
        int MIN_THREE_DIGITS = 100;
        int MAX_THREE_DIGITS = 999;
        String s = "";
        for (int i = MIN_THREE_DIGITS; i < MAX_THREE_DIGITS; i++) {
            // current i
            // 因为位数是确定的 所以执行三次就行了
            int current = i;

            int digits = current % 10;
            current /= 10;
            int tens = current % 10;
            current /= 10;
            int hundredDigits = current;

            if ((int) (p(digits) + p(tens) + p(hundredDigits)) == i) {
                s += (i + ",");
            }
        }
        System.out.println("s = " + s);
    }
}
