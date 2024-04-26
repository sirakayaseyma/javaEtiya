package workshop2;

//Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını bir dizi
//olarak tutan ve toplam satış gelirini hesaplayan bir algoritma yazınız.

public class shoppingCenterSales {
    public static void main(String[] args) {

        String[] products={"book","pencil","eraser"};
        double[] price={45,20,25};
        int[] salesQuantity={100,30,150};

        double unitSales=0.0;
        double totalSales=0.0;
        for(int i=0;i<products.length;i++){
            unitSales=price[i]*salesQuantity[i];
            System.out.println(products[i]+" ürününün günlük satış miktarı: "+salesQuantity[i] +" adet\nGünlük satış geliri: " + unitSales);
            totalSales+=unitSales;
        }
        System.out.println("Mağazanın günlük toplam satış geliri= "+totalSales);




    }
}
