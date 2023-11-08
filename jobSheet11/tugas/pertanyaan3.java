package jobSheet11.tugas;

import java.util.*;
public class pertanyaan3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int N = 0;

        System.out.print("Masukkan nilai untuk N(minimal 3) : ");
        N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if(i==1||i==N||j==1||j==N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                    }
                }
                System.out.println();
            }
            sc.close();
        }
    }
