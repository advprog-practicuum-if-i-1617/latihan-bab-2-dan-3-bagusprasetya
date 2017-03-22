public class konversi {
 
    public static void konversi(int angka, String val) {
        String satuan[] = {
            " ",
            " Satu",
            " Dua",
            " Tiga",
            " Empat",
            " lima",
            " enam",
            " tujuh",
            " Delapan",
            " Sembilan",
            " Sepuluh",
            " Sebelas",
            " Dua Belas",
            " Tiga Belas",
            " Empat Belas",
            " Lima Belas",
            " Enam Belas",
            " Tujuh Belas",
            " Delapan Belas",
            " Sembilan Belas"
        };
        String Puluhan[] = {
            " ",
            " ",
            " Dua Puluh",
            " Tiga Puluh",
            " Empat Puluh",
            " Lima Puluh",
            " Enam Puluh",
            " Tujuh Puluh",
            " Delapan Puluh",
            " Sembilan Puluh"
        };
        if (angka > 19) {
            System.out.print(Puluhan[angka/10] + " " + satuan[angka % 10]);
        } else {
            System.out.print(satuan[angka]);
        }
        if (angka > 0) {
            System.out.print(val);
        }
    }
}

