package org.main;
import org.bangundatar.Segitiga;
import org.bangunruang.LimasSegitiga;

public class MPoligon {
    public static void main(String[] args){
        Segitiga segitiga = new Segitiga(10, 5);
        LimasSegitiga limasSegitiga = new LimasSegitiga(segitiga);
        System.out.println("Luas Limas Segitiga: " + limasSegitiga.hitungVolume());
        System.out.println("Luas Alas Limas Segitiga: " + limasSegitiga.hitungLuasAlas());
    }
}
