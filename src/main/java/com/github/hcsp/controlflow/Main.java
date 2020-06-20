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
        // 第一位
        for (int i = 1; i < 10; i++) {
            // 第二位
            for (int j = 0; j < 10; j++) {
                // 第三位
                for (int k = 0; k < 10; k++) {
                    int num = i * 100 + j * 10 + k;
                    if (k * k * k + j * j * j + i * i * i == num) {
                        System.out.println(num);
                    }
                }
            }
        }
    }
}
