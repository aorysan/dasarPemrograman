package jobSheet9.modif;

import java.util.*;
public class LinearSearch106 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int key, hasil = 0, p;

        System.out.printf("Masukkan jumlah elemen array : ");
        p = sc.nextInt();

        int arrayInt[] = new int[p];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.printf("Masukkan elemen array ke-%d : ", i);
            arrayInt[i] = sc.nextInt();
        }

        System.out.println("Masukkan key yang ingin anda cari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i]==key) {
                hasil = i;
                break;
            }
        }
        System.out.printf("Key ada dalam array pada posisi indeks ke-%d", hasil);

        sc.close();
    }
}
