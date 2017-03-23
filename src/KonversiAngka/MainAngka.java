package KonversiAngka;
import java.util.Scanner;

public class MainAngka {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        konversi convert = new konversi();
        int satuan = 500;
        String huruf = "sembilan ratus sembilan puluh sembilan";
        convert.konverter(satuan);
        System.out.println("");
        convert.konverter(huruf);
    }
}
