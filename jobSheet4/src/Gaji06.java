package src;

import java.util.Scanner;
public class Gaji06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, totGaji, gaji, potGaji;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
        jmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Gaji : ");
        gaji = input.nextInt();
        System.out.println("Masukkan Jumlah Potongan Gaji : ");
        potGaji = input.nextInt();
        totGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang Anda Terima adalah " +totGaji);

        input.close();
    }
}
