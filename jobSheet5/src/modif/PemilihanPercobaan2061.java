import java.util.Scanner;
public class PemilihanPercobaan2061 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        System.out.println("Nilai UAS   :");
        float uas = input06.nextFloat();
        System.out.println("Nilai UTS   :");
        float uts = input06.nextFloat();
        System.out.println("Nilai Kuis  :");
        float kuis = input06.nextFloat();
        System.out.println("Nilai Tugas :");
        float tugas = input06.nextFloat();

        float total = (uas*0.4F)+(uts*0.3F)+(kuis*0.1F)+(tugas*0.2F);
        String message = total < 65 ? "Remidi": "Tidak Remidi";

        if (total>80&&total<=100) {
            System.out.println("Nilai huruf = A(Sangat Baik)");
        } else if (total>73&&total<=80) {
            System.out.println("Nilai huruf = B+(Lebih dari Baik)");
        } else if (total>65&&total<=73) {
            System.out.println("Nilai huruf = B(Baik)");
        } else if (total>60&&total<=65) {
            System.out.println("Nilai huruf = C+(Lebih dari Cukup)");
        } else if (total>50&&total<=60) {
            System.out.println("Nilai huruf = C(Cukup)");
        } else if (total>39&&total<=50) {
            System.out.println("Nilai huruf = D(Kurang)");
        } else if (total<=39) {
            System.out.println("Nilai huruf = E(Gagal)");
        }

        System.out.println("Nilai Akhir "+total+" sehingga "+message);

        input06.close();

    }
}
