package jobSheet5.src;

import java.util.Scanner;
public class PemilihanPercobaan306 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukkan angka pertama : ");
        angka1 = input06.nextDouble();
        System.out.println("Masukkan angka kedua : ");
        angka2 = input06.nextDouble();
        System.out.println("Masukkan operator (+ - * /) : ");
        operator = input06.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1+angka2;
                System.out.println(angka1+ " + " + +angka2+" = "+hasil);
                break;
            case '-':
                hasil = angka1-angka2;
                System.out.println(angka1+ " - "+angka2+" = "+hasil);
                break;
            case '*':
                hasil = angka1*angka2;
                System.out.println(angka1+ " * "+angka2+" = "+hasil);
                break;
            case '/':
                hasil = angka1/angka2;
                System.out.println(angka1+ " / "+angka2+" = "+hasil);
                break;
        }

        input06.close();
    }
}
