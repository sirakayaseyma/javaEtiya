package lesson;
import java.util.Scanner;

public class controlStatement {
    public static void main(String[] args) // Console çıktısı almamızı sağlayan ana metod
    {
        int number1 = 40;
        int number2 = 40;

        if(number1 < number2)
        {
            System.out.println(number1 + ": küçüktür");
        }
        else if (number1 > number2) {

            System.out.println(number1 + ": büyüktür");
        }
        else
        {
            System.out.println("Sayılar eşit");
        }
        
        int assigment = 50;
        if(assigment <= 100 && assigment >= 81)
        {
            System.out.println("Not Ortalamanız: AA");
        } else if (assigment <= 80 && assigment >= 71) {
            System.out.println("Not Ortalamanız: BA");
        } else if (assigment <= 70 && assigment >= 51) {
            System.out.println("Not Ortalamanız: CC");
        }
        else {
            System.out.println("Not ortalamanız : FF");
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Hesap bakiyenizi giriniz:");
        double accountBalance = scanner1.nextDouble();

        System.out.print("Çekmek istediğiniz miktarı giriniz:");
        double amount = scanner1.nextDouble();

        if (amount <= accountBalance) {
            accountBalance -= amount ;
            System.out.println("Para çekme işlemi başarılı" +" " + "Güncel bakiye:" + accountBalance);
        }
        else {
            System.out.println("Yetersiz bakiye");
        }



    }
}
