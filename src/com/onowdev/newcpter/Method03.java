package com.onowdev.newcpter;

public class Method03 {
    public static void salam3(String nama, int jumlah){
        for (int i =0; i < jumlah; i++) {
            System.out.println("Assalamualaikum " + nama + " , ");
        }
    }

    public static void main(String[] args) {
        salam3("Andra", 3);
    }
}
