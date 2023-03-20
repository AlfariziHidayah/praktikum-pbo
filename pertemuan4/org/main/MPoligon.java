/**
 * File      : BujurSangkar.java		15/03/23
 * Penulis   : Alfarizi Hidayah / 24060121130083
 * Deskripsi : driver class untuk poligon dan kubus
 */
package org.main;
import org.bangundatar.Segitiga;
import org.bangunruang.LimasSegitiga;
import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MPoligon {
    public static void main(String[] args){
        Segitiga segitiga = new Segitiga(10, 5);
        LimasSegitiga limasSegitiga = new LimasSegitiga(segitiga);
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);

        System.out.println("Luas permukaan Kubus dengan panjang sisi 4 satuan : "+bujurSangkar.hitungLuas());
        System.out.println("Volume Kubus dengan panjang sisi 4 satuan: "+kubus.hitungVolume());
        System.out.println("Luas Limas Segitiga: " + limasSegitiga.hitungVolume());
        System.out.println("Luas Alas Limas Segitiga: " + limasSegitiga.hitungLuasAlas());
    }
}
