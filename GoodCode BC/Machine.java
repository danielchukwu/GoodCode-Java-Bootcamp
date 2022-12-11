public class Machine {
   private Item[][] items;

   // Constructor
   Machine(Item[][] items){
      this.items = new Item[items.length][items[0].length];
      for (int i = 0; i < items.length; i++) {
         for (int j = 0; j < items[i].length; j++) {
            this.items[i][j] = new Item(items[i][j]);
         }
      }
   }
   
   // Getters and Setters
   public Item getItems(int row, int col) { return items[row][col]; }
   public void setItems(Item item, int row, int col) { this.items[row][col] = item; }

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