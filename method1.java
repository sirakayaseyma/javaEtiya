import java.util.ArrayList;
import java.util.List;

public class method1{
    private static List<String> kitaplar = new ArrayList<>();
    public static void main(String[] args) {
        
        sayHello();
        cikar();
        topla(5, 10);
        topla(100, 2000, 30);

        int[] sayilar = {1,2,3,4,5,6};
        diziYazdir(sayilar);

        kitapEkle("Java Programlama");
        kitapEkle("Spring Boot Egitim Kitabı");
        kitapListele();
    }

    public static  void sayHello(){
        System.out.println("Hello World");
    }

    public static void cikar(){
        int sonuc = 10 - 8 ;
        System.out.println(sonuc);
    }

    public static void topla(int sayi1,int sayi2) {
        int toplam = sayi1 + sayi2;
        System.out.println("Toplam: " + toplam);
    }

    public static void topla(int sayi1,int sayi2, int sayi3) {
        
        System.out.println("Toplam: " + (sayi1+ sayi2 + sayi3));
    }

    public static void diziYazdir(int[] dizi){
        //int[] sayilar = {1,2,3,4,5,6}; bu ynalış bir seçim olur.
        for(int eleman : dizi){
            System.out.println(eleman);
        }
        
    }

    //Kitapların olduğu bir liste olsun.

    public static void kitapEkle(String kitapAdi){
        kitaplar.add(kitapAdi);
    }

    public static void kitapListele(){
        for(String kitap: kitaplar){
            System.out.println(kitap);
        }

    }

}