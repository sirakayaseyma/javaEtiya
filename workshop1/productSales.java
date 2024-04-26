package workshop1;

/*kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını
alarak toplam alışveriş tutarını hesaplayan bir algoritma yazınız.
(Input için Scanner ve döngü için for döngüsü kullanınız)*/

import java.util.Scanner;

public class  productSales {
    public static void main(String[] args) {

        double totalPrice = 0.0;
        double productPrice;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane ürün almak istiyorsunuz? ");
        int productNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < productNumber; i++) {
            int j = i + 1;
            System.out.print("Almak istediğiniz " + j + ". ürünün adını giriniz: ");
            String productName = scanner.nextLine();

            System.out.print("Almak istediğiniz " + productName + " ürününün fiyatını giriniz: ");
            productPrice = scanner.nextDouble();
            scanner.nextLine();

            totalPrice += productPrice;
        }

        System.out.println("Toplam Alışveriş tutarı: " + totalPrice);
        scanner.close();
    }
}
