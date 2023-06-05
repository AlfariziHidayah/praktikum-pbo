package Collections;
/*
    File    :   ArrayListTest.java
    Deskripsi: Menggunakan objek ArrayList sebagai collection class
    Nama    : Alfarizi Hidayah
    NIM     : 24060121130083
*/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        strings.remove("praktikum");
        System.out.println();


        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}