package com.onowdev.newcpter;

public class Method06 {
    public static void cetak(char x, int y){
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println(x);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        cetak('*', 5);
    }
}
