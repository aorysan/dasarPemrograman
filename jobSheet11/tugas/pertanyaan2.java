package jobSheet11.tugas;

import java.util.*;
public class pertanyaan2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int N = 0;

        System.out.print("Masukkan nilai untuk N : ");
        N = sc.nextInt();

        for(int i = N; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
                }
                System.out.println();
            }
            sc.close();
        }
    }
