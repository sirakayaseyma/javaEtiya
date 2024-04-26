package OOP.inheritance;

import java.time.LocalDateTime;
import java.util.List;


public class AcademicianMain {
    public static void main(String[] args) {
        AcademicianManager academicianManager = new AcademicianManager();
        List<Academician> responses = academicianManager.getAll();
       
        Academician academician1 = new Academician();
        academician1.setId(2);
        academician1.setFirstName("Osman");
        academician1.setLastName("Sirakaya");
        academician1.setEmail("osman@hotmail.com");
        academician1.setSection("Yazilim");
        academician1.setCreatedDate(LocalDateTime.now());
        

        System.out.println("-----Create-------");

        academicianManager.add(academician1);

        for(Academician academician2: responses){
            System.out.println("Kayit olan akademisyenin Adi ve Soyadi: " +  academician2.getFirstName() + " " + academician2.getLastName());
            System.out.println("Email bilgisi: " + academician2.getEmail());
            System.out.println("Bölüm: " + academician2.getSection());
            System.out.println("Sisteme kayit tarihi: " + academician2.getCreatedDate());
        }

       
         System.out.println("-----Update-------");

        Academician updatedAcademician = new Academician();
        updatedAcademician.setId(1);
        updatedAcademician.setFirstName("Seymanur");
        updatedAcademician.setLastName("Sirakaya");
        updatedAcademician.setUpdatedDate(LocalDateTime.now());

        AcademicianManager.update(updatedAcademician);

        for (Academician academician4:responses){
            System.out.println(academician4.getFirstName() + " " + academician4.getLastName() + " " + academician4.getCreatedDate());
        }

        System.out.println("-------Delete-------------");

        academicianManager.delete(1);
        for(Academician academician3:responses){
            System.out.println(academician3.getFirstName() + " "+ academician3.getLastName());
        }
    }
    
    
}



