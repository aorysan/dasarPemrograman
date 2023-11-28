import java.util.*;
public class Percobaan21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Bilangan yang dihitung : ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        int pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));

        sc.close();
    }
    static int hitungPangkat (int x, int y) {
        int num = 1;
        if (y == 0) {
            return (1);
        } else {
            for (int i = 0; i < x; i++) {
                num *= x;
                if (i < y - 1) {
                    System.out.print(x + " x ");
                } else {
                    System.out.print(x + " x " + 1 + " = ");
                }
            }
            return num;
        }
    }
}
