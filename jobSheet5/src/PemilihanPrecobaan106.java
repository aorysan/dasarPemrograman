package src;

import java.util.Scanner;
public class PemilihanPrecobaan106 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        System.out.println("Masukkan Nilai : ");
        int angka = input06.nextInt();

        if (angka % 2 == 0)
            System.out.println("Angka "+angka+" bilangan genap");
            else
            System.out.println("Angka "+angka+" bilangan ganjil");

            input06.close();
    }
    
}
