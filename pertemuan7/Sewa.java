package pertemuan7;

public class Sewa {
    public static void main (String[] args){
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        kendaraan.calRent(50,1000);
        mobil.calRent(50, 1000);
    }
}
