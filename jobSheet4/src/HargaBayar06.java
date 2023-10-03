package jobSheet4.src;

import java.util.Scanner;
public class HargaBayar06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jmlHal;
        char merkBuku;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan Merk Buku yang Anda Beli : ");
        merkBuku = input.next().charAt(0);
        System.out.println("Masukkan jumlah halaman buku yang Anda beli : ");
        jmlHal = input.nextInt();
        System.out.println("Masukkan harga barang yang anda beli : ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang anda beli : ");
        jumlah = input.nextInt();
        System.out.println("Masukkan jumlah diskon yang anda dapat : ");
        dis = input.nextDouble();

        total = harga*jumlah;
        jmlDis = dis*total;
        bayar = total-jmlDis;
        
        System.out.println("Merk Buku yang anda beli "+merkBuku+" dengan jumlah halaman " + jmlHal);
        System.out.println("Diskon yang Anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus Anda bayar adalah " +bayar);

        input.close();
    }
}
