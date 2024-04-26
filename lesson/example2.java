package lesson;
public class example2 {
    public static void main(String[] args) {
        //1-)Çalışanların maaş bilgilerini bir dizi olarak tutan ve 
        //maaşlarına göre vergi kesintisi yapan bir algoritma yazalım.
        //Çalışanların isim soyisim, maaş bilgilerini, vergi
        String[] employeeName = {"Berfin Elbir", "Mustafa Ince","Emel Yenier"};
        double[] salaries = {30000, 20000,50000};
        double taxRate = 0.20;

        System.out.println("Calısan maasları ve vergi kesintileri:");
        for(int i = 0 ; i<employeeName.length;  i++){
            double taxdeduction = salaries[i] *taxRate;
            //salaries[i] -= taxdeduction;
            double newSalary = salaries[i] - taxdeduction;
            System.out.println(employeeName[i] + " adli calisanin maasi " + salaries[i] + "TL , Vergi Kesintisi "  + taxdeduction + "TL" + "Vergi kesintisinden sonraki güncel maas " + newSalary);
        }



        //2-) Öğrencilerin sınav not ortalamsını hesaplayan bir algoritma.

        double[] notes = {65,75,60,89,75};
        double totalNotes = 0;
        for(double note: notes){
            totalNotes += note;
        }

        double average = totalNotes / notes.length; 
        System.out.println("Not ortalaması: " + average);
        
    
    }
}
