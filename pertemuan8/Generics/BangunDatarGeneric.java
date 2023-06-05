package Generics;
/*
    File    :   BangunDatarGeneric.java
    Deskripsi: kelas konstruksi generic BangunDatar
    Nama    : Alfarizi Hidayah
    NIM     : 240601211300383
*/

public class BangunDatarGeneric<T06 extends BangunDatar>{
    private T06 bangunDatar;

    public void set(T06 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T06 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

}

//: Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti 
// dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !
// Jawab:
// Penggantian 'T' menjadi karakter lain tersebut dilakukan untuk mempermudah dalam
// menamakan atribut agar lebih detail. penggantian nama atribut tersebut juga untuk memudahkan dalam membedakan atribut
