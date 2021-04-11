import java.util.ArrayList; 
import java.util.Scanner;

public class Inventory {
  public static ArrayList <String> addObjects;
  
  public static void InventoryList(String objectName){
    addObjects = new ArrayList<String>(); 
    addObjects.add(objectName);
  }

  public static void PrintInventory() {
    
      System.out.println("You have the following objects in your inventory: ");
      System.out.println(" ");  

      if(addObjects.size() >= 1){
        for(String a : addObjects){
        System.out.println(ConsoleColors.GREEN_BOLD + a + ConsoleColors.RESET);
        }

      } else {
        System.out.println("Your inventory is empty!");
      }
      
  }
  
}