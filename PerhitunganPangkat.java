import java.util.Scanner;

/**
 * Program sederhana untuk perhitungan pangkat.
 */
public class PerhitunganPangkat {

    /**
     * Fungsi utama program. Meminta pengguna untuk memasukkan angka dan pangkat,
     * kemudian mencetak hasil perhitungan pangkat.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();

        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();

        double hasil = hitungPangkat(angka, pangkat);

        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);

        scanner.close();
    }

    /**
     * Menghitung pangkat dari suatu angka.
     *
     * @param angka   Angka yang akan dipangkatkan.
     * @param pangkat Pangkat yang diinginkan.
     * @return Hasil pangkat angka.
     */
    static double hitungPangkat(double angka, int pangkat) {
        double hasil = 1;

        for (int i = 0; i < pangkat; i++) {
            hasil *= angka;
        }

        return hasil;
    }
}
