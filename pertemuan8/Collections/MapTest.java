package Collections;
/*
    File    :   MapTest.java
    Deskripsi: menggunakan Generic untuk pasangan Kunci-Nilai
    Nama    : Alfarizi Hidayah
    NIM     : 24060121130083
*/

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        //kunci-> integer, nilai->string
        Map<Integer,String> map = new HashMap<Integer,String>();

        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");

        //mengambil elemen pertama
        System.out.println(map.get(1));

        //mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();

        //bagaimana iterasi untuk mengambil keseluruhan
        //kita dapat menggunakan iterator
        for(Integer i : key){
            System.out.println("Kunci : " + key + "Nilai : " + map.get(key));
        }
    }
}