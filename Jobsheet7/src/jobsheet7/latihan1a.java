package jobsheet7;

import java.util.Scanner;

/**
 * Created by 21343003_Alkindi Syamsi
 * @author KINN
 */
public class latihan1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah;
        for (jumlah = 0; jumlah < 10; jumlah += 1)
            System.out.println(nama);
    }
}