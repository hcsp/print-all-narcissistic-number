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
    public static void printNarcissisticNumber() {
        int sum, a, b, c;
        int m = 100;
        while (m < 1000) {
            a = m / 100;
            b = m % 100 / 10;
            c = m % 10;
            sum = a * a * a + b * b * b + c * c * c;
            if (sum == m) {
                System.out.println(m);
            }
            m += 1;
        }
    }
}
