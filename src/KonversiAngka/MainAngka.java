package KonversiAngka;

import static KonversiAngka.konversi.konversi;
import java.util.Scanner;

public class MainAngka {

    public static void main(String[] args) {
       
            int num = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan Angka (1-1000) : ");
            num = scanner.nextInt();
            while (num != -1) {
                if (num >= 0 && num <= 999) {
                    if (num == 0) {
                        System.out.print("Hasil: Nol");
                    } else {
                        System.out.print("Hasil: ");
                        konversi((num / 100) % 1, " Seratus");
                        konversi(((num / 100) % 10), " Ratus");
                        konversi((num % 100), " ");
                    }

                } else {
                    System.out.print("Angka Terlalu Banyak");
                }
                System.out.print("\nMasukkan Angka (1-1000) : ");
                num = scanner.nextInt();
            }
        }
    }
