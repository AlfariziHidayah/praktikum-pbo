import java.util.*;

/*
    File    :   MapTest.java
    Deskripsi: Menggunakan Generic untuk pasangan Kunci-Nilai
    Nama    : Alfarizi Hidayah
    NIM     : 24060121130083
*/

public class LambdaHashmap {
    public static void main(String[] args){
        Map<Long, String> map = new HashMap<Long, String>();  
        map.put(24060121130083L, "Alfarizi Hidayah");


        //Implementasi Ekspresi Lambda
        map.forEach((i, j) -> {
            System.out.print(i + " " + map.get(i));
            System.out.println(" ");}
            );
    }
}