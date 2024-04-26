package workshop1;

 //Do-While ve While döngüleri,tekrar eden işlemleri
// gerçekleştirmek için kullanılan kontrol yapılardır.

import java.util.Scanner;

public class doWhileLoops {
    public static void main(String[] args) {

        // while döngüsü
        // WHILE: Belirli bir koşul doğru olduğu sürece tekrarlanır. Koşul sağladığı sürece tekrar eder.
        // while(kosul) { kodlar }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayac = scanner.nextInt();
        scanner.nextLine();

        while (sayac <= 40) {
            System.out.println("Sayac: " + sayac);
            sayac++; // sayac'ı 1 artır
        }

        // do-while döngüsü
        //DO_WHILE:Koşul kontrolü yapılmadan önce döngü bloğu en az bir kez çalıştırılır.Koşul sağlandığı sürece tekrarlanır.
        // do { En az bir kez çalıştırılacak olan kodlar} while (koşul);

        int sayac1 = 30;
        do {
            System.out.println("Sayac1: " + sayac1);
            sayac1--; // sayac'ı 1 artır
        } while (sayac1 >= 6);

    }
    }
