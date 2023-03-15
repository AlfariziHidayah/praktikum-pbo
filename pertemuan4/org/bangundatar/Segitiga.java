package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double PanjangSisi;
    private double Tinggi;

    public Segitiga(double PanjangSisi, double Tinggi){
        this.PanjangSisi = PanjangSisi;
        this.Tinggi = Tinggi;
        this.jumlahSisi = 0;
    }

    public double hitungluas(){
        return PanjangSisi * Tinggi / 2;
    }

    public double getpanjangsisi(){
        return this.PanjangSisi;
    }

    public double getTinggi(){
        return this.Tinggi;
    }

}
