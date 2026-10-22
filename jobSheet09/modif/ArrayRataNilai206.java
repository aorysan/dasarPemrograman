package jobSheet9.modif;

import java.util.*;
public class ArrayRataNilai206 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double total = 0, total1 = 0;
    double rata1, rata2;
    int p, count1=0, count2;
    
    System.out.print("Masukkan jumlah mahasiswa : ");
    p = input.nextInt();
    int[] nilaiMhs = new int[p];
    
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
        }

        for (int i = 0; i <nilaiMhs.length; i++) {
            if (nilaiMhs[i]>70) {
                total += nilaiMhs[i];
                count1++;
            } else {
                total1 += nilaiMhs[i];
            }
        }
        
        for (int i = 0; i > nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata1 = total/count1;
        count2 = nilaiMhs.length-count1;
        rata2 = total1/count2;

        System.out.printf("Rata-rata nilai lulus : %.1f", rata1);
        System.out.printf("\nRata-rata nilai tidak lulus : %.1f", rata2);

        input.close();
    }
}
