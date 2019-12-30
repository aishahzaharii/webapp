
package java.models;

public class CartItem 
{
    String product;
    String amount;

    public CartItem(String product, String amount) {
        this.product = product;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    
}
