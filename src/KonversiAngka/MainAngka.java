package KonversiAngka;
import java.util.Scanner;

public class MainAngka {

    public static void main(String[] args) {
       
           konversi convert = new konversi();
        // isi parameter integer
        int satuan = 699;
        // isi parameter String
        String huruf = "Enam Ratus Tujuh Puluh Tujuh";
        convert.konverter(satuan);
        System.out.println("");
        convert.konverter(huruf);
    }
}
