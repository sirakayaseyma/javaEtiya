package workshop2;

import java.util.ArrayList;


//Öğrenci adlarının ve notlarının olduğu bir Arraylist kullanarak belirli
//not aralığı altında kalan öğrenciyi listeden silme algoritması yazınız.
public class deleteStudent {
    public static void main(String[] args) {

        ArrayList<String>students=new ArrayList<>();
        ArrayList<Integer>exams=new ArrayList<>();

        students.add("Açelya");
        exams.add(100);

        students.add("Ali");
        exams.add(85);

        students.add("Ayşe");
        exams.add(60);

        students.add("Arda");
        exams.add(50);

        int minExam=60;
        int index=0;

        for(String student:students){
            System.out.println(student);
        }


        for(int i=0; i<exams.size();i++){
            if (exams.get(i)<minExam){
                students.remove(i);
                exams.remove(i);
                i--;
            }
        }
        System.out.println("Notu 60 ın altında olan öğrenciler silindi.");
        System.out.println("\nYeni öğrenci listesi\n");
        for(int i=0;i<exams.size();i++){
            System.out.println("Öğrenci adı: "+students.get(i)+" öğrenci notu: "+exams.get(i));
        }


    }
}