package OOP.tecnology;

import java.util.List;

public class TechnologyMain {
    
    public static void main(String[] args) {
        TechnologyManager tecnologyManager = new TechnologyManager();

        List<Technology> tecnologies= tecnologyManager.getAll();
        for(Technology tecnology1:tecnologies){
            System.out.println(tecnology1.getName());
        }

        Technology tecnology = new Technology(); 
        tecnology.setId(0);
        tecnology.setName("React");
        tecnology.setProgrammingLanguageName("Javascript");

        System.out.println("-------Add---------");

        tecnologyManager.add(tecnology);

        for(Technology tecnology2:tecnologies){
            System.out.println(tecnology2.getProgrammingLanguageName());
        }


        System.out.println("-------GetById---------");


        Technology responseTecnology = tecnologyManager.getById(1);

        System.out.println(responseTecnology.getId() + " -- " + responseTecnology.getName()+ " " + responseTecnology.getProgrammingLanguageName());
        

        System.out.println("-----Update-----------");

        Technology updatedTecnology = new Technology();
        updatedTecnology.setId(1);
        updatedTecnology.setName("React");
        updatedTecnology.setProgrammingLanguageName("Redux");
        tecnologyManager.update(updatedTecnology);
        System.out.println(updatedTecnology.getName() + " " + updatedTecnology.getProgrammingLanguageName());

        for(Technology tecnology2:tecnologies){
            System.out.println(tecnology2.getProgrammingLanguageName());
        }


         System.out.println("-----Delete-----------");
        
         tecnologyManager.delete(1);
         for(Technology tecnology1:tecnologies){
            System.out.println(tecnology1.getName() + " "+ tecnology1.getProgrammingLanguageName());
         }

        
    }
    
}
