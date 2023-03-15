/**
 * FIle : Polion.java 08/03/2023
 * Penulis : Alfarizi Hidayah
 * Deskripsi : representasi dasar dari objek segitiga, turunan kelas poligon
 */
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
