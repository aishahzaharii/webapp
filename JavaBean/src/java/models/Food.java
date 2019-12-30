package java.models;

public class Food {
    public int foodId;
    public String name;
    public String category;
    public int price;
    public String description;
    
    public Food(int foodId,String name,String category,int price,String description){
        this.foodId = foodId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
    }
}
