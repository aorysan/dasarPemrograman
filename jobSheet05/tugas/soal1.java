package jobSheet5.tugas;

import java.util.*;
public class soal1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
        
    int jarak;

        System.out.println("Silahkan masukkan jarak pertarungan anda");
        jarak = sc.nextInt();
        if (jarak<=5) {
            System.out.println("Disarankan memakai senjata melee");
        } else if (jarak==5) {
            System.out.println("Bisa memakai senjata melee atau range");
        } else if (jarak>=5) {
            System.out.println("Disarankan memakai senjata range");
        }
        sc.close();
    }
}
