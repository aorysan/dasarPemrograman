package Modif;

import java.util.*;
public class Pemilihan2Percobaan1062 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        int tahun;
        
        System.out.println("Masukkan Tahun : ");
        tahun = input06.nextInt();
        
        if ((tahun % 4) == 0) {
            if((tahun % 100) == 0) {
                if((tahun % 400) == 0) {
                }
            } System.out.println("Merupakan tahun kabisat");
            } else {
            System.out.println("Bukan tahun kabisat");
        } 

        input06.close();
    }
}