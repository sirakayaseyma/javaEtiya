package workshop2;

import java.util.ArrayList;
import java.util.Scanner;

//Kullanıcının username, email, firstname, lastname ve password bilgilerini
//tutan bir ArrayList kullanarak giriş yapma algoritması yazınız.
public class loginApplicationArrayList {
    public static void main(String[] args) {

        ArrayList<String> login=new ArrayList<String>();
        login.add("acelyaoguz");
        login.add("acelya@gmail.com");
        login.add("acelya");
        login.add("oguz");
        login.add("123456");

      /*  for(String user:login){
            System.out.println(user);
        }
      */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
        String username = scanner.nextLine();
        System.out.println("Mail adresinizi giriniz: ");
        String mail = scanner.nextLine();
        System.out.println("İsminizi giriniz: ");
        String firstName = scanner.nextLine();
        System.out.println("Soyisminizi giriniz: ");
        String lastName = scanner.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        String password=scanner.nextLine();

        if(login.get(0).equals(username) && login.get(1).equals(mail) && login.get(2).equals(firstName)
        && login.get(3).equals(lastName) && login.get(4).equals(password)){
            System.out.println("\nGiriş Başarılı");
        }
        else {
            System.out.println("\nGiriş Başarısız. Eksik ya da hatalı bilgi.");
        }
    }
}
