package OOP.tecnology;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TechnologyManager {
   
    private final List<Technology> tecnologies;

    public TechnologyManager(){
        tecnologies = new ArrayList<Technology>();
        tecnologies.add(new Technology(1,"C#","MVC" ));
        tecnologies.add(new Technology(2,"Java","Spring" ));
        tecnologies.add(new Technology(3,"Python","Selenium" ));

    }

    public  List<Technology> getAll(){

        return tecnologies;
    }

    public void add(Technology tecnology){
        tecnologies.add(tecnology);
    }

    public Technology getById(int id){
        for(Technology tecnology: tecnologies){
            if(tecnology.getId()==id){
                return tecnology;
            }
        }
        return null;
    }

    public Technology getByName(String Name){
        for(Technology tecnology: tecnologies){
            if(tecnology.getName()==Name){
                return tecnology;
            }
    }
    return null; 
}

    public void update(Technology tecnology){
        for(Technology updateTecnology: tecnologies){
            if(updateTecnology.getId()==tecnology.getId()){
                updateTecnology.setName(tecnology.getName());
                updateTecnology.setProgrammingLanguageName(tecnology.getProgrammingLanguageName());
            }
        }
    }

   
   
    public void delete(int id){
        
        Iterator<Technology> iterator = tecnologies.iterator();
        while (iterator.hasNext()) {
            Technology tecnology = iterator.next();
            if(tecnology.getId() == id){
                iterator.remove();
            }
        }
        
    
    }

}