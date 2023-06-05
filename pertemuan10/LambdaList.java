import java.util.ArrayList;
/**
 * FIle: LambdaList.java
 * Deskripsi: Implementasi lambda pada list, digunakan sebagai parameter pada method
 */

public class LambdaList{
    public static void main(String[] args) {
        ArrayList<String> mahasiswalist = new ArrayList<>();
        mahasiswalist.add("Alfarizi Hidayah");
        mahasiswalist.add("Adi");
        mahasiswalist.add("Bambang");
        mahasiswalist.add("Cici");
        mahasiswalist.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswalist.forEach((nama) -> System.out.println(nama));
    }
}