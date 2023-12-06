package BTVN_2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_1 {
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

        arrangeDesc(arr);
    }
    public static void arrangeDesc (int [] arr) {
        for (int i = 0; i< arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] < arr[j]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Day so sau khi sap xep giam dan la: " + Arrays.toString(arr));
    }
}
