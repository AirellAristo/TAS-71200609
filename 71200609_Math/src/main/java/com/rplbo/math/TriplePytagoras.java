package com.rplbo.math;

public class TriplePytagoras extends Ternary {

    public TriplePytagoras(int angka1, int angka2, int angka3) {
        super(angka1, angka2, angka3);
        double hasil ;
        hasil = Math.pow(getAngka1(),2) + Math.pow(getAngka2(),2);
        double cekHasil;
        cekHasil = Math.pow(getAngka3(),2);
        if(hasil == cekHasil){
            System.out.println(1);;
        }
        else{
            System.out.println(-1);;
        }
    }

}
