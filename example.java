//Değişken isimleri küçük harfle başlar. 

// Ürün ismini tutan bir liste olsun. Bu liste üzerinden ürün ekleme , ürün silme , ürün listeleme 
// işlemini yapan medotları yazalım.
import java.util.ArrayList;
import java.util.List;

public class example {
    private static List<String> urunler = new ArrayList<>();
    public static void main(String[] args) {
        urunEkle("product1");
        urunEkle("product2");
        urunEkle("product3");
        urunListele();
        urunSil("product1");
        urunListele();
    }
    public static void urunEkle(String product){
        urunler.add(product);
    }
    public static void urunListele(){
        for (String urun : urunler){
            System.out.println(urun);
        }System.out.println("-----------------------");
    }
    public static void urunSil(String product){
        urunler.remove(product);
        System.out.println(product + " silindi" + "\n" + "------------------------");
}
}
