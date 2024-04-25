package OOP;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    
    private List<Product> products = new ArrayList<>();

    public  List<Product> getAll(){


        Product product1 = new Product(1,"Laptop", 25000, 2);
        
        Product product2 = new Product(2,"Tablet",1200, 5);
        
        Product product3 = new Product(); 
       
        products.add(product1);
        products.add(product2);
    
        return products;

    }

    public  void addBasketProduct(Product product){
        System.out.println("Basariyla sepete eklendi " + product.name);
    }

    public void add(Product product) {
         products.add(product);
    }
    
}
