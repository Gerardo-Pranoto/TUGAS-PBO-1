import java.util.Scanner;

public class Hitungluaskeliling {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // persegi
        System.out.println("Masukan panjang sisi persegi");
        float sisi = input.nextFloat();
        float luaspersegi = sisi * sisi;
        float kelilingpersegi = 4 * sisi;
        System.out.println("Luas persegi:" + luaspersegi);
        System.out.println("Keliling persegi:" + kelilingpersegi);
        // segitiga
        System.out.println("\nMasukan alas segitiga");
        float alas = input.nextFloat();
        System.out.print("Masukan tinggi segitiga: ");
        float tinggi = input.nextFloat();
        float luassegitiga = 0.5f * alas * tinggi;
        System.out.println("luas segitiga :" + luassegitiga);
        // lingkaran
        float phi = 3.14f; // Menggunakan nilai phi 3.14
        System.out.print("\nMasukan jari-jari lingkaran: ");
        float r = input.nextFloat();
        float luaslingkaran = phi * (r * r);
        float kelilinglingkaran = 2 * phi * r;
        System.out.println("luas lingkaran:" + luaslingkaran);
        System.out.println("keliling lingkaran" + kelilinglingkaran);
        // kubus(Volume)
        System.out.println("\nMasukkan panjang sisi kubus");
        float sisikubus = input.nextFloat();
        float volumekubus = sisikubus * sisikubus * sisikubus;
        System.out.println("volume kubus:" + volumekubus);
        input.close();
    }
}
