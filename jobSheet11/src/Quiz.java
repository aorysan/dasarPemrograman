package jobSheet11.src;

import java.util.*;
public class Quiz {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';

        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();

                if (number < answer) {
                    System.out.println("Lebih rendah");
                } else if (number > answer) {
                    System.out.println("Lebih tinggi");
                } else {
                    success = (answer==number);
                }
            } while (!success);
            System.out.println("Apakah Anda ingin mengulang permainan (y/Y)?");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
        input.close();
    }
}
