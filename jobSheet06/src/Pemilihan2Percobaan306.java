import java.util.*;
public class Pemilihan2Percobaan306 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        int penghasilan, gajiBersih;
        String kategori;
        double pajak = 0;

        System.out.println("Masukkan kategori : ");
        kategori = input06.nextLine();
        System.out.println("Masukkan besarnya penghasilan : ");
        penghasilan = input06.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih=(int) (penghasilan-(pajak*penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("Pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (pajak*penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        } else {
            System.out.println("Kategori yang anda masukkan salah");
        }

        input06.close();
    }
}
