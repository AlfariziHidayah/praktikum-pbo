package pertemuan7.tugas;

/*
	Manajer.java  09/05/2023
	Nama      : Alfarizi Hidayah
	NIM       : 24060121130083
	Deskripsi : file subclass untuk pegawai
*/
public class Programmer extends Pegawai {
    protected int tunjangan = 450000;

    public Programmer(String nama){
        setNama(nama);
    }

    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji: " + this.gajiPokok + ", Tunjangan: " + this.tunjangan);
    }
}