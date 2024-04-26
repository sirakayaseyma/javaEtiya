package workshop1;

import java.util.Scanner;
import java.util.Random;

public class numberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Rastgele bir sayı oluşturulur (1 ile 10 arasında)
        int rastgeleSayi = random.nextInt(10) + 1;

        int tahmin = 0;
        int tahminSayisi = 0;

        // Kullanıcı doğru sayıyı tahmin edene kadar döngü devam eder
        while (tahmin != rastgeleSayi) {
            System.out.print("Bir sayı tahmin edin (1 ile 10 arasında): ");
            tahmin = scanner.nextInt();
            tahminSayisi++;

            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! Doğru sayıyı buldunuz.");
                System.out.println("Tahmin sayınız: " + tahminSayisi);
            }
        }

        scanner.close();
    }
}
