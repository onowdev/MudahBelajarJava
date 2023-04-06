package com.onowdev.dasar.tipedatavararray;

public class TipeBoolean {
    public static void main(String[] args) {
        boolean b;

        b = true;
        System.out.println("Nilai b = " + b);

        if (b){
            System.out.println("Statement ke-1 di eksekusi");
        }
        b = false;
        System.out.println("Nilai b = " + b);

        if (b) {
            System.out.println("Statement ke-2 tidak di eksekusi");
        }
        if (!b) {
            System.out.println("Statement ke-3 dieksekusi");
        }

        System.out.println("5 <= 10 mengembalikan nilai " + (5 <= 10));

        System.out.println("4 > 6 Mengembalikan nilai " + ( 4 > 6 ));
    }
}
