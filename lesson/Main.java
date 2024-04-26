package lesson;
public class Main {  //Main classı
    public static void main(String[] args) // Console çıktısı almamızı sağlayan ana metod
    {
        System.out.println("Hello world!"); // Console'a çıktı veren kod
        //Metinsel ifadeyi tutmak içi String veri tipini kullanılır.

        String product1 = "Dell Laptop";
        byte price1 = 127;

        String product2 = "Samsung Galaxy";
        short price2 = 32767;

        String product3 = "Asus Laptop ";
        int price3 = 255555555;

        String product4 = "Samsung Galaxy A5";
        long price4 = 32767;

        System.out.println(" Ürün: " + product1 + " " + "Fiyati: " + price1);
        System.out.println(product2);
        System.out.println(price2);
        System.out.println(product3);
        System.out.println(price3);
        System.out.println(product4);
        System.out.println(price4);

        double price5 = 199.99d; // double değeri için 'd' veya 'D' eklenmeli
        float price6 = 199.99f; // float değeri için 'f' veya 'F' eklenmeli
        System.out.println(price5);

        boolean isActive = false;

        char gender = 'K';
    }
}
