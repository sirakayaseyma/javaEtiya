import java.util.ArrayList;
import java.util.List;

public class method2 {

    private static List<String> customers = new ArrayList<>();
    private static List<String> cities = new ArrayList<>();
    public static void main(String[] args) {
        int textLength = textLength("Merhaba");
        System.out.println("Metnin Uzunlugu:" + textLength);

        int[] numbers = {45,52,68,70,85};
        int bigNumber = getBigNumber(numbers);
        System.out.println("Dizideki en büyük sayi : " + bigNumber);

        addCustomer("Seyma");
        addCustomer("Sude");

        boolean response = customerSearch("Sude");
        System.out.println("Müsteri Var mi?  " + response);
        addCity("Istanbul");
        addCity("Ankara");
        updateCity("Ankara" ,"Antalya");
        List<String> cities = getCities();
        for(String city:cities){
            System.out.println(city);
        }

        
      

    }


    public static int textLength(String text){
        return text.length(); // parametrede verdiğim textin length değerini bana dön 
    }
    
    public static int getBigNumber(int[] numbers){
        int bigNumber = numbers[0];
        for(int number:numbers){
            if(number>bigNumber){
                bigNumber = number;
            }
        }
        return bigNumber;
    }

    public static boolean addCustomer(String customerName){
        if(!customers.contains(customerName)){
            customers.add(customerName);
            return true;
        }
        return false;
    }

    public static boolean customerSearch(String customerName){
        return customers.contains(customerName);

    }

    public static boolean addCity(String cityName){
        if(!cities.contains(cityName)){
            cities.add(cityName);
            System.out.println(cityName + " sehri basariyla eklendi");
            return true;
        }
        else{
            System.out.println(cityName + " sehri zaten var");
            return false;
        }
    }

    public static List<String> getCities(){
        return cities;
    }

    public static boolean updateCity(String oldCityName,String newCityName){
        if(cities.contains(oldCityName)){
            int index = cities.indexOf(oldCityName);//indexini bul, index değer,ne ata
            cities.set(index, newCityName); // İndex değerine göre ilgili indexe ata
            System.out.println(oldCityName + " sehri " + newCityName + " ile basariyla güncellendi." );
            return true;
        }
        else {
            System.out.println(oldCityName  + "Sehri bulunamadı");
            return false;
        }
    }
}
