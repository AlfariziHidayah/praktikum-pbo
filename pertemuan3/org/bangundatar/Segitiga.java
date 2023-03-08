package org.bangundatar;

import org.poligon.Poligon;
public class Segitiga extends Poligon {
    private double alas,tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungluas(){
        return alas * tinggi / 2;
    }
    public void printInfo(){
        System.out.println("Banyak Sisi : " + jumlahSisi);
    }
}
