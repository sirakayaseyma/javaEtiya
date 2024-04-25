public class loops {


    private static int number;

    public static void main(String[] args) // Console çıktısı almamızı sağlayan ana metod
    {
        //for Döngüsü
        //for(int i=0;i<10;i++)
        //{
          //  System.out.println(i);
        //}
        //for(int i=10;i>0;i--)
        //{
          //  System.out.println(i);
        //}

        // for(int i = 0; i<= 100; i++)
        //{
        //    if(i%2==0)
        //   {
        //      System.out.println("Çift Sayilar: " + i);
        //  }
        //  else {
        //      {
        //          System.out.println("Tek Sayilar: " + i);
        //       }
        //   }





            boolean  isPrime = true;
            if(number ==1){
                System.out.println("Sayı asal değildir");
                return;
            }

            for(int a=2; a<number ; a++)
            {
                if(number%a==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.println("Sayı asaldır");
            }
            else{
                System.out.println("Sayı asal değildir");
            }

        }
    }

