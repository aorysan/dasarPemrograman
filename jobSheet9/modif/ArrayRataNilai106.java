package jobSheet9.modif;

import java.util.*;
public class ArrayRataNilai106 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int count=0;

        for (int i = 0; i <nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
        }
        
        for (int i = 0; i <nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i]>70) {
                count++;
            }
        }
        
        System.out.println("Banyak mahasiswa yang lulus : "+count);
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);

        input.close();
    }
}
