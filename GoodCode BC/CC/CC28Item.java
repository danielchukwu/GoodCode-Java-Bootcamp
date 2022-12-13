package CC;
public class CC28Item {
   private String name;
   private double price;
   private int quantity;

   // Constructor
   CC28Item(String name, double price, int quantity) {
      this.name = name;
      this.price = price;
      this.quantity = quantity;
   }
   
   // Copy Constructor
   CC28Item(CC28Item source){
      name = source.name;
      price = source.price;
      quantity = source.quantity;
   }
   
   // Setter and getter methods
   public String getName() { return this.name; }
   public void setName(String name) { this.name = name; }

   public double getPrice() { return price; }
   public void setPrice(double price) { this.price = price; }

   public int getQuantity() { return quantity; }
   public void setQuantity(int quantity) { this.quantity = quantity; }

   // toString()
   public String toString() {
      return "Item [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
   }
}
