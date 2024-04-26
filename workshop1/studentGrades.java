package workshop1;

import java.util.Scanner;

public class studentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Öğrenci sayısını kullanıcıdan alınır
        System.out.print("Öğrenci sayısını girin: ");
        int ogrenciSayisi = scanner.nextInt();
        scanner.nextLine();

        // Her öğrenci için sınav notlarını ve ortalamayı tutmak için değişkenler oluşturulur
        double toplamOrtalama = 0.0;

        // Her öğrenci için döngü oluşturulur
        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.println("Öğrenci " + i + " bilgilerini girin:");

            // Öğrenci adı, soyadı ve sınav notları kullanıcıdan alınır
            System.out.print("Adı: ");
            String ad = scanner.nextLine();

            System.out.print("Soyadı: ");
            String soyad = scanner.next();

            System.out.print("1. Sınav Notu: ");
            double not1 = scanner.nextDouble();

            System.out.print("2. Sınav Notu: ");
            double not2 = scanner.nextDouble();

            System.out.print("3. Sınav Notu: ");
            double not3 = scanner.nextDouble();

            // Notların ortalaması hesaplanır
            double ortalama = (not1 + not2 + not3) / 3;
            toplamOrtalama += ortalama; // Toplam ortalamaya eklenir

            // Öğrenci bilgileri ve ortalaması ekrana yazdırılır
            System.out.println("Öğrenci: " + ad + " " + soyad);
            System.out.println("Ortalama: " + ortalama);
        }

        // Sınıfın genel ortalaması hesaplanır ve ekrana yazdırılır
        double sinifOrtalamasi = toplamOrtalama / ogrenciSayisi;
        System.out.println("Sınıf Ortalaması: " + sinifOrtalamasi);

        scanner.close();
    }
}