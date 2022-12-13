package CC;
public class CC28Machine {
   private CC28Item[][] items;

   // Constructor
   CC28Machine(CC28Item[][] items){
      this.items = new CC28Item[items.length][items[0].length];
      for (int i = 0; i < items.length; i++) {
         for (int j = 0; j < items[i].length; j++) {
            this.items[i][j] = new CC28Item(items[i][j]);
         }
      }
   }
   
   // Getters and Setters
   public CC28Item getItems(int row, int col) { return items[row][col]; }
   public void setItems(CC28Item item, int row, int col) { this.items[row][col] = item; }

   //Despense
   public boolean dispense(int row, int col) {
      if (items[row][col].getQuantity() == 0){ return false; }
      items[row][col].setQuantity( items[row][col].getQuantity()-1 );
      return true;
   }
   
   // ToString
   public String toString() {
      String template = "";
      for (int i = 0; i < items.length; i++) {
         for (int j = 0; j < items[i].length; j++) {
            template += items[i][j].getName() +": $"+ items[i][j].getPrice() + " ("+items[i][j].getQuantity() +") ";
         }
         template += "\n\n";
      }
      return template;
   }
   
}