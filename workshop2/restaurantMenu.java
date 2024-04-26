package workshop2;

//Restoranın menüsündeki yemekleri, fiyatlarını ve popülerlik
//derecelendirmelerini bir dizi ile tutan algoritma yazınız.
public class restaurantMenu {
    public static void main(String[] args) {

        String[]meals={"Kebab","Soup","Pasta"};
        double[]prices={430,150,240};
        int[]popularity={90,55,78};

        for(int i=0;i<meals.length;i++){

            System.out.println(meals[i]+" yemeğinin fiyatı: "+prices[i]+" tl ve popülerliği: %"+popularity[i]);
        }

    }
}
