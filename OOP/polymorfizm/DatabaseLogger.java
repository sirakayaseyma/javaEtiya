package OOP.polymorfizm;

public class DatabaseLogger extends Logger {


    public void log(Object object) {
        //konfigurasyon koldarı
        System.out.println("Veritabanina loglandi" + " " +object);
    }
}
