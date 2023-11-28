package jobSheet14.tugas;

import java.util.*;
public class pertanyaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angkaAwal = 1;
        int hasil = 0;

        System.out.print("Masukkan batas penjumlahan : ");
        int angka = sc.nextInt();

        penjumlahanRekursif(angkaAwal, angka, hasil);
    }
    static int penjumlahanRekursif (int angkaAwal, int x, int hasil) {
        if (angkaAwal == x) {
            System.out.print(angkaAwal + " = " + (angkaAwal + hasil));
            return (angkaAwal);
        } else {
            System.out.print(angkaAwal + " + ");
            hasil += angkaAwal;
            angkaAwal++;
            penjumlahanRekursif(angkaAwal, x, hasil);
        }
        return x;
    }
}
