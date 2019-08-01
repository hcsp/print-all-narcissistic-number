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
        for (int i = 100; i < 1000; i++) {
           int number = getCub(i);
           if (number == i){
               System.out.println(i);
           }
        }
    }
    public static int getCub(int digital) {
        int result = 0;
        for (int i = 1; i < 4; i ++) {
            int a = digital % 10;
            digital = (digital - a) / 10;
            result += Math.pow(a, 3);
        }
        return result;
    }
}
