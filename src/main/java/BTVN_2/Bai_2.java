package BTVN_2;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        System.out.println("\nNhập mảng: ");

        for(int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        divide(arr);
    }
    public static void divide (int [] arr) {
        for (int i = 0; i< arr.length - 1; i++) {
            if (arr[i] % (2 * 3) == 0) {
                System.out.println("Điều kiện thoát xảy ra!" + " Số chia hết cho cả 2 và 3 là: " + arr[i]);
                return;
            }
        }
        System.out.println("Không có phần tử nào chia hết cho 2 và 3!");
    }
}
