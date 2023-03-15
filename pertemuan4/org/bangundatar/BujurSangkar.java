package org.bangundatar;
import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4;
    }

    public hitungLuas(){
        return this.panjangSisi * this.panjangSisi;
    }

    public getPanjangSisi(){
        return this.panjangSisi;
    }
    
}
