package workshop2;
//Günlük görevlerimizi içeren ve bu görevlerin tamamlanma bilgisini
//tutan bir Arraylist oluşturunuz.ArrayList içinde bulunan görevleri
//güncelleyen,tamamlanan görevleri ise silen algoritmayı yazınız.

import java.util.ArrayList;

public class dailyTasks {
    public static void main(String[] args) {

        ArrayList<String>tasks=new ArrayList<>();
        ArrayList<Boolean>status=new ArrayList<>();

        tasks.add("Spor yap");
        status.add(true);

        tasks.add("Mailleri kontrol et");
        status.add(true);

        tasks.add("Kitap oku");
        status.add(false);

        tasks.add("yemek yap");
        status.add(false);

        System.out.println("Görev listesi");
        for (int i=0;i<status.size();i++){
            System.out.println("Görev "+(i+1)+": "+tasks.get(i));
        }

        for (int i=0;i<status.size();i++){
            if (status.get(i)==true){
                tasks.remove(i);
                status.remove(i);
                i--;
            }

        }

        System.out.println("        ---\nGüncel görev listesi");
        for (int i=0;i<status.size();i++){
            System.out.println("Görev "+(i+1)+": "+tasks.get(i));
        }

    }
}
    

