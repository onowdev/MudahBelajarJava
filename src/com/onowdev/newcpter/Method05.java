package com.onowdev.newcpter;

public class Method05 {
    public static void cetak(String nama, boolean status) {
        System.out.println(nama +" ");
        if (status){
            System.out.println("(Menikah)");
        } else {
            System.out.println("(Belum Menikah");
        }
    }

    public static void main(String[] args) {
        cetak("Agus", true);
    }
}
