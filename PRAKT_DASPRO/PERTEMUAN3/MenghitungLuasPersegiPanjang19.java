package PERTEMUAN3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;
        
        System.out.println("Masukkan panjang: ");
        panjang = sc.nextInt();
        System.out.println("Masukkan lebar: ");
        lebar = sc.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas Persegi adalah: " + luas);
        
        sc.close();
    }
    
}
