package com.rplbo.math;

public class Pangkat extends Binary{
    public Pangkat(int angka1, int angka2) {
        super(angka1, angka2);
        double hasil = Math.pow(getAngka1(),getAngka1());
        System.out.println("Hasil Pangkat Adalah = "+ hasil);
    }
}
