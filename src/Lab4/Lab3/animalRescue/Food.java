package Lab4.Lab3.animalRescue;

public class Food {
    private String name ;
    private float price ;
    private String quantity;
    private boolean inStock;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        return price;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }
    public String getQuantity(){
        return quantity;
    }
    public void setInStock(boolean inStock){
        this.inStock = inStock;
    }
    public boolean getInStock(){
        return inStock;
    }


}

