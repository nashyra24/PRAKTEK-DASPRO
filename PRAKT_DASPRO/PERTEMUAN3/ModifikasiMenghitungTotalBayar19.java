package PERTEMUAN3;

import java.util.Scanner;

public class ModifikasiMenghitungTotalBayar19 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double harga;
      double potongan;
      double jml_bayar;
      double diskon=0.15;
      System.out.println("Masukkan harga barang: ");
      harga = sc.nextDouble();
      potongan = diskon * harga;
      jml_bayar = harga - potongan;
      System.out.println("Jumlah potongan yang harus anda bayar adalah Rp. " + jml_bayar);
    
      sc.close();

    }
}
