/*
	Lingkaran.java  28/03/2023
	Nama      : Alfarizi Hidayah
	NIM       : 24060121130083
	Deskripsi : file class Lingkaran implementasi IArea
*/

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
    
}
