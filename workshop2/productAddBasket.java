package workshop2;

//Kullanıcının seçtiği ürünleri, fiyatlarını ve sepete
//eklenen miktarları bir dizi ile tutan algoritma yazınız
public class productAddBasket {
    public static void main(String[] args) {

        String[]products={"laptop","TV","Telephone"};
        double[]prices={45000,35000,25000};
        int[]addBasketQuantity={2,1,3};
        double totalPrice=0.0;
        for(int i=0;i<products.length;i++){
            System.out.println(products[i]+" ürününün fiyatı: "+prices[i]+" sepete eklenen miktarı: "+addBasketQuantity[i]);
            totalPrice+=prices[i]*addBasketQuantity[i];
        }
        System.out.println("\nToplam sepet tutarı: "+totalPrice);
    }
}
