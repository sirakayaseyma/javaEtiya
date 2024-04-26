package OOP.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ProductManager {
    
    private List<Product> products;

    public ProductManager(){
        products = new ArrayList<Product>();
        products.add(new Product(1,"Laptop", 25000, 2));
        products.add(new Product(2,"Tablet",1200, 5));

    }

    public  List<Product> getAll(){

        return products;

    }

    public  void addBasketProduct(Product product){
        System.out.println("Basariyla sepete eklendi " + product.getName());
    }

    public void add(Product product) {
         products.add(product);
    }
    
    public Product getById(int id){
        for(Product product: products){
            if(product.getId()==id){
                return product;
            }
        }
        return null;
    }

    public Product getByName(String productName){
        for(Product product: products){
            if(product.getName()==productName){
                return product;
            }
    }
    return null; 
}

    public void update(Product product){
        for(Product updateProduct: products){
            if(updateProduct.getId()==product.getId()){
                updateProduct.setName(product.getName());
                updateProduct.setUnitPrice(product.getUnitPrice());
            }
        }
    }

   
   
    public void delete(int id){
        
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if(product.getId() == id){
                iterator.remove();
            }
        }
        
    
    }

}
