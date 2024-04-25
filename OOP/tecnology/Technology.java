package OOP.tecnology;

public class Technology {
       // Tecnology diye bir sınıf oluşturun. İd ,name 
    // programingLanguage diye bir alan olsun bunlarla ilgili list
    // update, delete ,add , getbyıd metodlarımızı yazalım.

    private int id;
    
    private String name;

    private String programmingLanguageName;


    public int getId(){ // burada id değerimi get edebilirim
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getProgrammingLanguageName(){
        return this.programmingLanguageName;
    }

    public void setProgrammingLanguageName(String programmingLanguageName){
        this.programmingLanguageName = programmingLanguageName;
    }


    public Technology(int id,String name ,String programmingLanguageName){
        this.id = id;
        this.name = name;
        this.programmingLanguageName = programmingLanguageName;
    }

    public Technology(){
    }

    
}
