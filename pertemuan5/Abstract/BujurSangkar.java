/*
	BujurSangkar.java  28/03/2023
	Nama      : Alfarizi Hidayah
	NIM       : 24060121130083
	Deskripsi : 4file subclass untuk bujursangkar
*/

public class BujurSangkar extends BangunDatar {
    public double hitungLuas(double sisi){
        luas = sisi * sisi;
        return luas;
    }
}

/*
apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi 
metode abstrak yang ada pada kelas BangunDatar ? jelaskan ! 
Jawaban:
saat program dirun akan terjadi compile error, karena class BujurSangkar harus
mengimplementasikan method abstract yang ada pada class BangunDatar yaitu hitungLUas(double sisi)
 */
