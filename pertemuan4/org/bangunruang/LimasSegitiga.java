package org.bangunruang;
import org.bangundatar.Segitiga;

public class LimasSegitiga {
    private Segitiga permukaan;

    public LimasSegitiga(Segitiga permukaan){
        this.permukaan = permukaan;
    }

    public double hitungVolume(){
        double panjangSisi = permukaan.getpanjangsisi();
        double tinggi = permukaan.getTinggi();
        return (permukaan.hitungluas() * permukaan.getTinggi()) / 3;
    }

    public double hitungLuasAlas(){
        double panjangSisi = permukaan.getpanjangsisi();
        double tinggi = permukaan.getTinggi();
        return (panjangSisi * tinggi) / 2;
    }
}
