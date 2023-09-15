import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz: ");
        double taban = scanner.nextDouble();

        System.out.print("Üs sayıyı giriniz: ");
        int us = scanner.nextInt();

        double sonuc = 1.0; // Sonucu 1.0 ile başlatın

        for (int i = 0; i < us; i++) {
            sonuc *= taban; // Tabanı üs kadar çarp
        }

        System.out.println(taban + "^" + us + " = " + sonuc);
    }
}
