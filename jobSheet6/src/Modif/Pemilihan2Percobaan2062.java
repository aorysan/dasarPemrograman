package Modif;

import java.util.*;
public class Pemilihan2Percobaan2062 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        float sudut1, sudut2, sudut3;
        
        System.out.println("Masukkan sudut pertama : ");
        sudut1 = input06.nextFloat();
        System.out.println("Masukkan sudut kedua : ");
        sudut2 = input06.nextFloat();
        System.out.println("Masukkan sudut ketiga : ");
        sudut3 = input06.nextFloat();
        input06.close();
        
        float totalSudut=sudut1+sudut2+sudut3;

        /**if (totalSudut == 180) {
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else {
                System.out.println("Segitiga tersebut bukan segitiga siku-siku");
            } 
        } else {
                System.out.println("Bukan Segitiga");
            }*/

        //Segitiga sama sisi
        if (totalSudut == 180) {
            if((sudut1 == sudut2) && (sudut2 == sudut3)) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else {
                System.out.println("Segitiga tersebut bukan segitiga sama sisi");
            } 
        } else {
                System.out.println("Bukan Segitiga");
            }
    }
}
