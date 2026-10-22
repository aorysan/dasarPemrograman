package jobSheet3.src;

/**
 * ContohVariabel06
 */
public class ContohVariabel06 {

    public static void main(String [] args) {

        String myHobi = "Futsal";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSekarang = 19;
        double $ipk  = 3.24, tinggi = 1.72;
    
        System.out.println(myHobi);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: "+ jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSekarang);
        System.out.println(String.format("IPK saya saat ini adalah %s, dengan tinggi badan saya %s", $ipk, tinggi));
    }
}