package jobSheet11.src;

import java.util.*;
public class NestedLoop_2341720084 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        double temps[][] = new double[5][7];
        double rata[] = new double[7];
    
        for(int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            double total = 0;
            for(int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j+1) + " : ");
                temps[i][j] = sc.nextDouble();
                total += temps[i][j];
            }
            rata[i] = (double) total / temps[i].length;
            System.out.println();
        }
        int kota = 1;
        for(double temp[] : temps) {
            System.out.println("Kota ke-" + kota + " ");
            for(double hari : temp) {
                System.out.print(hari + " ");
            }
            System.out.println();
            System.out.println("Rata-rata suhu di kota ke-" + kota + " adalah " + rata[kota-1]);
            kota++;
        }
        System.out.println();
        sc.close();
    }
}
