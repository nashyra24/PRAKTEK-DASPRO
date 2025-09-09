import java.util.Scanner;

public class Segitiga19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Buat variabel untuk alas dan tinggi
        int alas, tinggi;
        float luas;

        //Perintah Untuk menginput alas dan tinggi
        System.out.println("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc.nextInt();

        //Perintah untuk menghitung luas segitiga
        luas = alas * tinggi / 2;
        
        //Menampilkan isi variabel luas
        System.out.println("Luas segitiga: "+ luas);
       
    }
}
