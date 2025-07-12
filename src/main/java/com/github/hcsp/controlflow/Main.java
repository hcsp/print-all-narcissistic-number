package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        int number;
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
        for (int number = 100; number <=999;number ++){ //因为题目说了水仙花数是三位数,所以可以循环100-999的所有数字
            int TheFirstDigit = number / 100;
            int TheSecondDigit = (number / 10)%10;
            int TheThirdDigit = number % 10;

            if (TheFirstDigit*TheFirstDigit*TheFirstDigit + TheSecondDigit*TheSecondDigit*TheSecondDigit + TheThirdDigit*TheThirdDigit*TheThirdDigit == number){
                System.out.println(number);
            }
        }
        }
}
