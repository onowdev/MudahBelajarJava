package com.onowdev.dasar.tipedatavararray;

public class DemoArray1D {
    public static void main(String[] args) {
        // Mendeklarasikan Variabel bertipe array dengan tipe int

        int [] jumlahHari;

        // Menentukan Panjang array

        jumlahHari = new  int[12];

        // mengisikan nilai dari setiap element array yang ada

        jumlahHari [0] = 31;
        jumlahHari [1] = 29;
        jumlahHari [2] = 31;
        jumlahHari [3] = 30;
        jumlahHari [4] = 31;
        jumlahHari [5] = 30;
        jumlahHari [6] = 31;
        jumlahHari [7] = 30;
        jumlahHari [8] = 31;
        jumlahHari [9] = 30;
        jumlahHari [10] = 31;
        jumlahHari [11] = 31;

        System.out.println("Bulan Maret Memiliki Jumlah Hari : " + jumlahHari[2] + " Hari");

    }
}
