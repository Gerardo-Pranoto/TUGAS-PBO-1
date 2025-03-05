import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String Nim, Nama, Alamat, Kota, Telp, Hp, Email;
        int Kodepos;
        System.out.println("Masukan Data Anda");
        System.out.print("Nim : ");
        Nim = input.nextLine();
        System.out.print("Nama : ");
        Nama = input.nextLine();
        System.out.print("Alamat : ");
        Alamat = input.nextLine();
        System.out.print("Kota : ");
        Kota = input.nextLine();
        System.out.print("Kodepos : ");
        Kodepos = input.nextInt();
        input.nextLine();
        System.out.print("Telp : ");
        Telp = input.nextLine();
        System.out.print("Hp : ");
        Hp = input.nextLine();
        System.out.print("Email : ");
        Email = input.nextLine();
        System.out.println("\nBerikut detail data anda :");
        System.out.println("Nim : " + Nim);
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Kota : " + Kota);
        System.out.println("Kodepos : " + Kodepos);
        System.out.println("Telp : " + Telp);
        System.out.println("Hp : " + Hp);
        System.out.println("Email : " + Email);
        input.close();
    }
}