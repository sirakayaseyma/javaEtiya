package OOP.inheritance;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        List<Student> responses = studentManager.getAll();
       
        Student student1 = new Student();
        student1.setId(2);
        student1.setFirstName("Kubilay");
        student1.setLastName("Özer");
        student1.setEmail("kubilay@hotmail.com");
        student1.setAbout("Qa Tester");

        studentManager.add(student1);

        for(Student student2: responses){
            System.out.println("Kayit olan ögrencinin Adi ve Soyadi: " +  student2.getFirstName() + " " + student2.getLastName());
            System.out.println("Email bilgisi: " + student2.getEmail());
            System.out.println("Hakkinda: " + student2.getAbout());
            System.out.println("Sisteme kayit tarihi: " + student2.getCreatedDate());
        }
    }
    
}
