package OOP.inheritance;

public class Academician extends User{

    private String section;

    public Academician(){
        
    }

    public Academician(String secton) {
        this.section = secton;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }    
    
}
