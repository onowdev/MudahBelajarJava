package com.onowdev.dasar.tipedatavararray;

public class Inisialisasi2D {
    public static void main(String[] args) {
        int [] [] duaD = {{10,20,30},{40,50,60}};

        for (int i =0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(duaD[i][j]);
                if (j < 2) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
