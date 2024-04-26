package workshop1;

public class stringMethods {
    public static void main(String[] args) {

        String str = "Merhaba";
        int uzunluk = str.length();
        System.out.println("Uzunluk: " + uzunluk); // Çıktı: Uzunluk: 7

        char karakter = str.charAt(2);
        System.out.println("3. karakter: " + karakter); // Çıktı: 3. karakter: r

        String altString = str.substring(2, 5);
        System.out.println("Alt String: " + altString); // Çıktı: Alt String: rha

        String str1 = "pair1";
        String buyukHarf = str1.toUpperCase();
        System.out.println("Büyük harf: " + buyukHarf); // Çıktı: Büyük harf: PAIR1

        String str2 = "GALAXY";
        String kucukHarf = str2.toLowerCase();
        System.out.println("Küçük harf: " + kucukHarf); // Çıktı: Küçük harf: galaxy

        String str3 = "Merhaba dünya";
        int indeks = str3.indexOf("dünya");
        System.out.println("İndeks: " + indeks); // Çıktı: İndeks: 8

        String str4 = "deneme";
        String str5 = " deneme";
        boolean isEqual = str4.equals(str5);
        System.out.println("Dizgeler eşit mi?: " + isEqual);



    }
}
