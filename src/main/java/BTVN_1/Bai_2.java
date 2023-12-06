package BTVN_1;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int number1 = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int number2 = sc.nextInt();

        compareTwoNumber(number1, number2);
    }

    public static void compareTwoNumber(int a, int b) {
        int greaterNumber = Math.max(b, a);
        System.out.println("Số lớn hơn là: " + greaterNumber);
    }
}
