package jobSheet5.src.modif;

import java.util.Scanner;
public class PemilihanPrecobaan1061 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        System.out.println("Masukkan Nilai : ");
        double angka = input06.nextDouble();

        String hasil;
        hasil = (angka>0.0) ? "Bilangan positif" : "Bilangan negatif";
        System.out.println(angka+" adalah "+hasil);
            input06.close();
    }
    
}
