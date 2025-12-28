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
        for (int number = 100 ; number <=999 ; number++ ){
            int firstDigit = number/100; //百位数 = number ➗ 100
            int secondDigit = (number - (100 * firstDigit)) / 10; // 十位数 = number ➗ 10
            int thirdDigit = number % 10; // 个位数 = number % 10

            if (number == firstDigit*firstDigit*firstDigit+secondDigit*secondDigit*secondDigit+thirdDigit*thirdDigit*thirdDigit)
                System.out.println(number);
        }

    }
}
