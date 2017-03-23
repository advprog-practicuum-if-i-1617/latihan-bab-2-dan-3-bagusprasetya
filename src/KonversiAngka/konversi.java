package KonversiAngka;
public class konversi {
    private String[] huruf = {
        "", 
        "Satu", 
        "Dua", 
        "Tiga", 
        "Empat", 
        "Lima", 
        "Enam",
        "Tujuh", 
        "Delapan", 
        "Sembilan", 
        "Sepuluh", 
        "Sebelas"};
    
    public void konverter(int satuan) {
        String hasil = "";
        if (satuan == 0) {
            hasil += "Nol";
        } else if (satuan < 12) {
            hasil += huruf[satuan];
        } else if (satuan < 20) {
            hasil += huruf[satuan - 10] + " belas";
        } else if (satuan < 100) {
            hasil += huruf[satuan / 10] + " puluh " + huruf[satuan % 10];
        } else if (satuan == 100) {
            hasil += "seratus";
        } else if (satuan < 1000) {
            hasil += huruf[satuan / 100] + " ratus " + huruf[satuan % 100];
        } else if (satuan == 1000) {
            hasil += "seribu";
            
        } else {
            hasil += "\nRange Melibihi Batas Wajar\n";
        }
        System.out.print(satuan + " : " +hasil);
    }
    public void konverter(String kalimat) {
        String[] angka = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        String[] kata = kalimat.split(" ");
        String hasil = "";
        for (int i = 0; i < kata.length; i++) {
            for (int j = 0; j < angka.length; j++) {
                if (huruf[j].equalsIgnoreCase(kata[i])) {
                    hasil += angka[j];
                } else if ("belas".equalsIgnoreCase(kata[i])) {
                    hasil = "1" + hasil;
                } else if ("puluh".equalsIgnoreCase(kata[i]) && kata.length == (kata.length - 1)) {
                    hasil += "0";
                } else if ("puluh".equalsIgnoreCase(kata[i])) {
                } else if (huruf[j].equalsIgnoreCase(kata[i])) {
                    hasil += angka[j];
                } else if ("seratus".equalsIgnoreCase(kata[i])) {
                    hasil = "100";
                } else if ("seribu".equalsIgnoreCase(kata[i])) {
                    hasil = "1000";
                } else if ("nol".equalsIgnoreCase(kata[i])) {
                    hasil = "0";
                }
            }
        }
        int hsl = Integer.parseInt(hasil);
        if (hsl > 1000){
            System.out.print(kalimat+" \t: ");
            System.out.print("Range Melibihi Batas Wajar");
        } else {
            System.out.print(kalimat+" : " +hsl);
        }
    }
}
