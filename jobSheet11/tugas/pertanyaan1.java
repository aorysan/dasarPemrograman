package jobSheet11.tugas;

import java.util.*;
public class pertanyaan1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int N = 0;

        System.out.print("Masukkan nilai untuk N : ");
        N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            for(int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}
