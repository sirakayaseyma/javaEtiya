package workshop1;

import java.util.Scanner;

public class perfectNumber  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Sayının bölenlerini toplamak için bir değişken oluşturulur
        int toplam = 0;

        // 1'den sayıya kadar olan tüm bölenler kontrol edilir


        if (sayi <= 1) {
            System.out.println("Birden büyük bir sayı giriniz");
        } else {

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i; // Sayının bölenleri toplanır
            }
        }

        // Toplam, girilen sayıya eşitse, sayı mükemmel sayıdır
        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel bir sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel bir sayı değildir.");
        }
    }

        scanner.close();
    }
}
