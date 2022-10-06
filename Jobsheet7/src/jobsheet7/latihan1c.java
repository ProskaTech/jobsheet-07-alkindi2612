package jobsheet7;

import java.util.Scanner;

/**
 * Created by 21343003_Alkindi Syamsi
 * @author KINN
 */
public class latihan1c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah = 0;
        do {
            System.out.println(nama);
            jumlah++;
        } while (jumlah < 10);
    }
}