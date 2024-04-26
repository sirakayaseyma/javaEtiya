package OOP.inheritance;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import OOP.polymorfizm.DatabaseLogger;
import OOP.polymorfizm.FileLogger;
import OOP.polymorfizm.Logger;

public class StudentManager {
    private List<Student> students;

    private Logger logger;

    public StudentManager(){
        //logger = new DatabaseLogger();
        // İki loggerdan birini almam gerekir. İkisinin sonuç vermesi isteniyorsa bir array içine atama yapmam gerekir.
        logger = new FileLogger();
        students = new ArrayList<>();
       Student student = new Student();
       student.setId(1);
       student.setFirstName("Melodi");
       student.setLastName("Bayraktar");
       student.setEmail("melodi@hotmail.com");
       student.setAbout("Qa Tester");
       student.setCreatedDate(LocalDateTime.now());

       students.add(student);
    }

    public List<Student> getAll(){
        for(Student student:students){
            logger.log(student.getFirstName() + " " + student.getLastName());
        }
        return students;
    }

    public void add(Student student){
        logger.log(student.getFirstName() +" " + student.getLastName());
        student.setCreatedDate(LocalDateTime.now());
        students.add(student);
    }



}