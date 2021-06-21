package org.incorp.i;

public class Main {

    public static void main(String[] args) {


        boolean unsStep1 = step1HomeWork02(10, 4);
        System.out.println(unsStep1);
        System.out.println();
        step2HomeWork02(-50);
        System.out.println();
        boolean unsStep3 = step3HomeWork02(-60);
        System.out.println(unsStep3);
        step4HomeWork02("СВАБОДУ ПАПУГАЯМ", 6);
        System.out.println();
        boolean unsStep5 = step5HomeWork02(800);
        System.out.println(unsStep5);
    }

    public static boolean step1HomeWork02(int a, int b) {
        boolean unsverStep1;
        if (a >= 10 && a <= 20) {
            if (b >= 10 && b <= 20) {
                unsverStep1 = true;
            } else {
                unsverStep1 = false;
            }
        } else {
            unsverStep1 = false;
        }

        return unsverStep1;
    }

    public static void step2HomeWork02(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }

    }

    public static boolean step3HomeWork02(int b) {
        boolean unsverStep3;
        if (b >= 0) {
            unsverStep3 = false;
        } else {
            unsverStep3 = true;
        }
        return unsverStep3;
    }

    public static void step4HomeWork02(String str, int step) {
        for (int st = 0; st < step; st++) {
            System.out.println(str);
        }
    }

    public static boolean step5HomeWork02(int a) {
        boolean unsverStep5;
        if (a % 100 == 0 && a % 400 == 0) {
            unsverStep5 = true;
        } else {
            if (a % 4 == 0 && a % 100 > 0) {
                unsverStep5 = true;
            } else {
                if (a % 100 == 0) {
                    unsverStep5 = false;
                } else {
                    unsverStep5 = false;
                }
            }
        }
        return unsverStep5;

    }
}
