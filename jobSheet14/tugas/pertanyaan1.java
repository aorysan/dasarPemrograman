package jobSheet14.tugas;

import java.util.*;
public class pertanyaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mauskkan angka pertama : ");
        int num1 = sc.nextInt();

        deretRekursif(num1);
        System.out.println();
        deretIteratif(num1);
    }
    static int deretRekursif (int n) {
        if (n == 0) {
            System.out.print(n);
            return (n);
        } else {
            System.out.print(n + " ");
            deretRekursif(n-1);
        }
        return n;
    }
    static int deretIteratif (int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(n + " ");
            n -= 1;
        }
        return n;
    }
}
