package jobSheet10.modif;

import java.util.*;
public class BioskopWithScanner061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String penonton[][] = new String[4][2];
        String menu;

        System.out.println("Pilih menu Anda : ");
        System.out.print("1. Input\n2. List \n3. Exit\n");
        menu = sc.nextLine();
        switch(menu) {
            case "1" :
                do {
                    System.out.print("Masukkan nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan baris : ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom : ");
                    int nomor = sc.nextInt();

                if (baris > 0 && baris <= 4 && nomor > 0 && nomor <= 2) {
                    if (penonton[baris-1][nomor-1] == null) {
                    penonton[baris-1][nomor-1] = nama;
                    } else {
                    System.out.printf("Kursi di baris %s kolom %s telah ditempati. Silahkan pilih kursi yang lain.", baris, nomor);
                    }    
                } else {
                    System.out.println("Baris atau kolom tidak tersedia");
                }
                
                System.out.println("Apakah anda ingin memasukkan nama lain? (y/n)");
                nama = sc.nextLine();
                } while (!sc.nextLine().equalsIgnoreCase("n"));
                break;
                
            case "2" :
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String tampilan = penonton[i][j] != null ? penonton[i][j] : "***";
                        System.out.printf("Penonton baris %s kolom %s adalah %s", i+1, j+1, tampilan);
                    }
                } break;

            case "3" :
                System.out.println("Anda telah keluar.");
                break;

            default :
            System.out.println("Pilihan Anda tidak valid.");
            break;
        }
        sc.close();
    }
}
