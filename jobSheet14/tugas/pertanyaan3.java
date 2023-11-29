package jobSheet14.tugas;
import java.util.*;
public class pertanyaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cekAngka;

        System.out.print("Silahkan masukkan bilangan yang ingin Anda cek : ");
        cekAngka = sc.nextInt();
        
        if (cekPrimaRekursif(cekAngka, 2) == 1) {
            System.out.print("Merupakan bilangan prima.");
        } else {
            System.out.print("Bukan bilangan prima.");
        }
    }
    static int cekPrimaRekursif (int x, int y) {
        if (y == x) {
            return 1;
        } else if (x % y == 0) {
            return 0;
        } else {
            return cekPrimaRekursif(x, y+1);
        }
    }
}
