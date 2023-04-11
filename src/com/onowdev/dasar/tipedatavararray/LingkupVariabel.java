package com.onowdev.dasar.tipedatavararray;

public class LingkupVariabel {
    public static void main(String[] args) {
        int a = 10;
        // int b = 9;

        if (a > 5) { // ini awal Blok
            int b = 19;
            System.out.println("Nilai a di dalam block if: " + a);
            System.out.println("Nilai b di dalam block if: " + b);
        } // Akhir Blok

        System.out.println("Nilai a di luar block if : " + a);
        //System.out.println("Nilai b di luar block if : " + b);
    }
}
