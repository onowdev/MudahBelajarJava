package com.onowdev.dasar.pemilihan;

public class ForIterasi {
    public static void main(String[] args) {

        int x = 90;
        String Pesan = "Selamat Pagi";

        System.out.println("X Bernilai = " + x);
        System.out.println("Pesan :" + Pesan);

        if (x > 70){
            String hasil = "X lebih besar dari 70";
            System.out.println(hasil);
        }

        for (int i =0; i < 5; i++){
            String pesanLoop = "Iterasi / Perputaran " + i;
            System.out.println(pesanLoop);
        }

        var nama = "Agus Sugiono";
        System.out.println("Nama : " +nama);
    }
}
