import java.util.Scanner;

public class Bank19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah tabungan awal dan lama menabung
        System.out.println("Masukkan jumlah tabungan awal:");
        int jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama menabung (tahun):");
        int lama_menabung = input.nextInt();

        double prosentase_bunga = 0.02;

        // Hitung bunga
        double bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;

        // Hitung jumlah tabungan akhir
        double jml_tabungan_akhir = bunga + jml_tabungan_awal;

        // Output hasil
        System.out.println("Bunga adalah: " + bunga);
        System.out.println("Jumlah tabungan akhir adalah: " + jml_tabungan_akhir);
    }
}