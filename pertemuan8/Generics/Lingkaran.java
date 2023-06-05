package Generics;
/*
    File    :   Lingkaran.java
    Deskripsi: Implementasi Lingkaran sebagai BangunDatar
    Nama    : Alfarizi Hidayah
    NIM     : 24060121130083
*/

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}