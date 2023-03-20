/**
 * File      : BujurSangkar.java		15/03/23
 * Penulis   : Alfarizi Hidayah / 24060121130083
 * Deskripsi : representasi dasar dari objek kubus, turunan kelas poligon
 */
package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan) {
        this.permukaan = permukaan;
    }

    public double hitungLuasAlas(){
        return this.permukaan.hitungLuas();
    }

    public double hitungVolume(){
        return this.permukaan.hitungLuas() * this.permukaan.getPanjangSisi();
    }
}