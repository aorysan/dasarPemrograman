package jobSheet9.tugas;

public class soal1 {
    public static void main(String[] args) {
        
        int bil[] = {20, 40, 30, 10, 50};
        int average,total=0, temp = 0;

        for (int i = 0; i < bil.length; i++) {
            for (int j = 1; j < bil.length - i; j++) {
                if (bil[j-1] > bil[j]) {
                    temp = bil[j];
                    bil[j] = bil[j-1];
                    bil[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < bil.length; i++) {
            System.out.println(bil[i]);
            total += bil[i];
        }

        System.out.println("Nilai terkecilnya adalah : " + (bil[bil.length-1]));
        System.out.printf("Nilai terbesarnya adalah : %d", bil[0]);
        
        average = total/bil.length;
        System.out.printf("\nRata-rata dari nilai-nilai tersebut adalah : %d", average);
    }
}
