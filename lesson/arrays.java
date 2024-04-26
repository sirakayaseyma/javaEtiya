package lesson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class arrays {
    public static void main(String[] args){
        int[] arrays = new int[5];
        // Diziler classlar referens tiptirç burada new keywordü kullanıyoruz.
        arrays[0]=10;
        arrays[1]=20;
        arrays[2]=30;
        arrays[3]=40;
        arrays[4]=50;
        System.out.println(arrays[0]);

        for(int i = 0 ; i<arrays.length;i++){
            System.out.println("Dizi[ " + i + "] = " + arrays[i]);
        }

        int[] arrays1 = {1,5,8,4};
        int total = 0 ;
        for(int i = 0 ; i<arrays1.length; i++){
            total+=arrays[i];
        }
        System.out.println("Dizi elemanları toplamı: " + total);
        //{İstanbul,Kocaeli,Sakarya},{İstanbul,Kocaeli,Sakarya},{İstanbul,Kocaeli,Sakarya}
        String[][] cities = new String[3][3];

        cities[0][0] = "Istanbul";
        cities[0][1] = "Kocaeli";
        cities[0][2] = "Sakarya";

        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Kırşehir";

        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Gaziantep";
        cities[2][2] = "Mardin";

        for(int i = 0 ; i<cities.length;i++){
            System.out.println("-----------------------");
            for(int j=0;j<cities.length;j++){
                System.out.println(cities[i][j]);
            }
        }

      String[] books = {"Java'ya giris", "c# programlama", "Microservices mimarisi"};
      String[] writers = {"Berk Mamikoglu", "Ayşegül Kadiroğlu", "Büra Aydin"};
      double[] prices = {55.99, 79.99,85 };

      System.out.println("Kitaplar:");
      for(int i = 0; i<books.length; i++){
        System.out.println("Kitap adi : " + books[i] + " " + "Yazar :" + writers[i] + " " + "Fiyati :" + prices[i]);
      }

    

    //   String[] products = {"Bilgisayar", "Telefon","Tablet"};
    //   int[] stocks = {50000, 20000, 10000};

    //   // var tip dönüşümlerinde kullanılabilir. 
    //   for(var product: products){
    //     if(stocks[product.length()]>0){
    //         System.out.println(product + "ürününden" + stocks[product.length()] + "adet stok bulunmaktadır.");
    //     }
    //   }

    //   String[] products = {"Bilgisayar", "Telefon","Tablet"};
    //   int[] stocks = {5, 2, 10 };

    //   int index = 0;
    //   // var tip dönüşümlerinde kullanılabilir. 
    //   for(int products: stocks){
    //     if(stock>0){
    //         System.out.println(products[index] +" " + "ürününden" +" "+ stock + " " +"adet stok bulunmaktadır.");
    //     }
    //     else{
    //         System.out.println(products[index] + "ürünü stakta bulunmamaktadır.");
    //     }
    //     index ++;
    //   } 

    // 

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("C#");
        programmingLanguages.add("C++");
        programmingLanguages.add("Python");

        System.out.println(programmingLanguages);

        for(var language:programmingLanguages){
            System.out.println(language);
    }

    
    List<HashMap<String, Object>> products1 = new ArrayList<>();

    HashMap<String, Object> product1 = new HashMap<>();
    product1.put("Ad " , "Laptop");
    product1.put("Aciklama", "Hizli ve güclü bir bilgisayar");
    product1.put("Fiyat", 30000);
    product1.put("Kategori " , "Elektronik");
    products1.add(product1);

    HashMap<String, Object> product2 = new HashMap<>();
    product2.put("Ad " , "Telefon");
    product2.put("Aciklama", "Hizli ve güclü bir bilgisayar");
    product2.put("Fiyat", 30000);
    product2.put("Kategori " , "Elektronik");
    products1.add(product2);


    for(var product: products1){
        System.out.println("Ad " + product.get("Ad"));
        System.out.println("Aciklama " + product.get("Aciklama"));
        System.out.println("Fiyat " + product.get("Fiyat"));
        System.out.println("Kategori " + product.get("Kategori"));
        System.out.println("--------------------");
    }

    List<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    int first = numbers.get(0);
    int last =numbers.get(numbers.size() -1);

    

    System.out.println(first);
    System.out.println(last);

    List<String> colors = new ArrayList<>();
    colors.add("Mavi");
    colors.add("Kirmizi");
    colors.add("Yesil");
    colors.add("Sari");

    for(String color:colors){
        System.out.println(color);
    }
    System.out.println("-----------------");
    colors.remove("Kirmizi");

    for(String color:colors){
        System.out.println(color); }

        System.out.println("-----------------");

        int index1 = colors.indexOf("Yeşil");
        if(index1 != -1){
            colors.set(index1,"Gri");
        }

        for(String color:colors){
            System.out.println(color);
        }

        List<String[]> users = new ArrayList<>();
        users.add(new String[]{"muhammed", "inan"});

        for(String[] user:users){
            System.out.println(user[0] + " " + user[1]);
        }
  
    }

    }
