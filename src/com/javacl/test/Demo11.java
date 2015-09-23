package com.javacl.test;

/**
 * ��ֵ�������η�
 * Created by caoliang on 2015/9/23.
 */
public class Demo11 {

    static boolean invalidInput = false;

    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(power(2, -1));
        System.out.println(power(0, 0));
    }

    public static double power(double base, double exeponent) {
        invalidInput = false;
        if (equal(base,0.0) && exeponent<0) {
            invalidInput = true;
            return 0.0;
        }
        double absExepont = Math.abs(exeponent);
        double result = powerUnsignedExeponent(base, absExepont);
        if (exeponent < 0) {
            result = 1.0 / result;
        }

        return result;

    }

    //��ֵ�������η�����
    public static double powerUnsignedExeponent (double base, double exeponent) {
        double result = 1.0;
        for (int i=0; i<exeponent; i++) {
            result *= base;
        }
        return result;
    }

    public static boolean equal(double number1, double number2) {
        return ((number1 - number2) > -0.0000001) && ((number1 - number2) < 0.0000001);
    }
}
