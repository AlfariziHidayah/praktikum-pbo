/*
	AngkaSial.java  29/03/2023
	Nama      : Alfarizi Hidayah
	NIM       : 24060121130083
	Deskripsi : program penggunaan exception buatan sendiri
                Pengenalan klausa 'throw' dan 'throws'
*/
public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main (String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka !!!");
        }
    }

}

/*Jika eksepsi terjadi maka baris 14 pada AngkaSial.java tidak diekseskusi
karena eksepsi telah ditangkap pada baris 12 AngkaSial.java

baris 21 pada AngkaSial.java dieksekusi ,sesuai output program
*/