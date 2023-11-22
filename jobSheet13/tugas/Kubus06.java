import java.util.*;
public class Kubus06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi : ");
        int s = sc.nextInt();

        System.out.println("Luas permukaan kubus adalah : " + luas(s));
        System.out.println("Volume kubus adalah : " + vol(s));
        
        sc.close();
    }
    static int luas(int s) {
        int luas = 6*(s*s);
        return luas;
    }
    static int vol (int s) {
        int vol = s*s*s;
        return vol;
    }
}
