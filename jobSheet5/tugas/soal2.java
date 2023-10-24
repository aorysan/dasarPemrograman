package jobSheet5.tugas;

import java.util.*;
public class soal2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String user, userA="admin", pass, passA="admin";

    System.out.print("Masukkan username : ");
    user = sc.nextLine();
    System.out.print("Masukkan password : ");
    pass = sc.nextLine();

    if (user.equals(userA) && pass.equals(passA)) {
        System.out.println("Login berhasil");
    } else {
        System.out.println("Username atau pasword yang anda masukkan salah");
    }

    sc.close();
    }
}
