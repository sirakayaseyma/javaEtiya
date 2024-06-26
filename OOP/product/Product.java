package OOP.product;

public class Product {
    //Alan tanımlarken camelCase yazıyoruz.
    
    private int id;
    
    private String name;

    private double unitPrice;

    private int unitInStock;

    //encapsulation 

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

    public double getUnitPrice(){
        return this.unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }


    public int getUnitInStock(){
        return this.unitInStock;
    }
    public void setUnitInStock(int unitInStock){
        this.unitInStock = unitInStock;
    }
    public Product(int id,String name ,double unitPrice , int unitInStock){
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
    }

    public Product(){

    }
}
