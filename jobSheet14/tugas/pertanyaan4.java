package jobSheet14.tugas;

import java.util.*;
public class pertanyaan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan : ");
        int bulan = sc.nextInt();
        int marmut = fibonansi(bulan);

        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " : " + marmut);

        sc.close();
    }

    static int fibonansi(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonansi(n - 1) + fibonansi(n - 2);
        }
    }
}
