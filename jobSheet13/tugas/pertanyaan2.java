import java.util.*;
public class pertanyaan2 {
    static void inputNilai (int nilai[][], String nama[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nama : ");
            nama[i] = sc.next();
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.printf("Masukkan nilai ke %s : ", (j+1));
                nilai[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    static void view (int nilai[][], String nama[]) {
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama : " + nama[i]);
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Nilai week " + (j+1) + " : " + nilai[i][j]);
            }
        }
    }
    static void topWeek (int nilai[][], String nama[]) {
        int top = 0;
        int topWeek = 1;
        for (int i = 0; i < nilai[0].length; i++) {
            for (int j = 0; j < nilai.length; j++) {
                if (nilai[j][i] > top) {
                    top = nilai[j][i];
                    topWeek = i + 1;
                }
            }
        }
        System.out.println("Pada minggu ke " + topWeek + " nilai tertingginya adalah " + top);
    }
    static void highest (int nilai[][], String nama[]) {
        int top = 0;
        int topWeek = 1;
        String name = nama[0];
        for (int i = 0; i < nilai[0].length; i++) {
            for (int j = 0; j < nilai.length; j++) {
                if (nilai[j][i] > top) {
                    top = nilai[j][i];
                    topWeek = i + 1;
                    name = nama[j];
                }
            }
        }
        System.out.println("Pada minggu ke " + topWeek + " nilai tertingginya adalah " + top + " yang dimiliki oleh " + name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum0, sum1;
        System.out.print("Masukkan jumlah mahasiswa : ");
        sum0 = sc.nextInt();
        System.out.print("Masukkan jumlah tugas : ");
        sum1 = sc.nextInt();
        int nilai[][] = new int[sum0][sum1];
        String nama[] = new String[sum0];


        inputNilai(nilai, nama);
        view(nilai, nama);
        topWeek(nilai, nama);
        highest(nilai, nama);
    }
}
