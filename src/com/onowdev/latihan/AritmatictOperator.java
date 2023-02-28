package com.onowdev.latihan;

import java.util.Scanner;

public class AritmatictOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========Masukan ke Dua Nilai nya==========");

        int a = sc.nextInt();
        int b = sc.nextInt();

        // Penjumlahan
        System.out.println("Addiction\t :" + (a+b));

        // Pengurangan
        System.out.println("Subtraction\t :" +(a-b));

        // Perkalian
        System.out.println("Multiplication\t :"+(a*b));

        // Pembagian
        System.out.println("Division\t :"+(a/b));

        // Sisa Hasil Bagi
        System.out.println("Modulus\t :"+(a%b));
    }
}
