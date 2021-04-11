import java.util.Scanner;

class Rooms {
  
  

private static int roomNum = 1;
private Scanner scanner1;
private String inputRooms; 
boolean running = true;
private static boolean hasLooked = false;
boolean boardsConnected = false;

  //read the action inputs
  public void Input(){

    scanner1 = new Scanner(System.in);
    inputRooms = scanner1.nextLine();
    //turns the input to lower case. Makes it easier for the user.
    inputRooms = inputRooms.toLowerCase(); 

     
    
    if(inputRooms.contains("look")){
      Look();
    }else if(inputRooms.contains("observe")){
      Observe();
    }else if(inputRooms.contains("interact")){
      Interact();
    }else if(inputRooms.contains("clue")){
      Clue();
    }else if(inputRooms.contains("inventory")){
      Inventory.PrintInventory();
    } else if(inputRooms.contains("quit")){
      Main.quit();
    }else if(inputRooms.contains("teleport")){
      teleport();
    }else {
      Help();
    }
     
  }
  public void teleport(){
    if(inputRooms.contains("teleport")){

    int intScan = scanner1.nextInt();
    switch(intScan){
      case 1:
        roomNum = 1;
        break;
      case 2:
        roomNum = 2;
        break;
      case 3:
        roomNum = 3;
        break;
      case 4:
        roomNum = 4;
        break;
      case 5:
        roomNum = 5;
        break;
      case 6:
        roomNum = 6;
        break;
       
      }
    } 


    // String teleportString = inputRooms;
    // roomNum = Integer.parseInt(teleportString[teleportString.length - 1]);

  }

  public void Help(){
    System.out.println("Please type a valid command, you can type \" LOOK \", \" OBSERVE \", \" INTERACT \" or \" CLUE \". \" LOOK \" lists all the objects that you see. You can \" OBSERVE \" all the items that you see. You can \" INTERACT \" with any item that you find with other items that you see in the room. Type \" clue \" if you are having a hard time finishing the puzzle. Good luck!");

  }
  //possible messages for look
  public void Look(){
    if(roomNum == 1){
      System.out.println("You’re stuck in a room, all that’s around you is a" + ConsoleColors.YELLOW_BOLD + " bed, a toilet, a door, " + ConsoleColors.RESET +  "and your own thoughts.");
      hasLooked = true;
    }

    if(roomNum == 2){
      System.out.println("You’re in the guards' chambers, there’s a" + ConsoleColors.YELLOW_BOLD + " guard " + ConsoleColors.RESET +  "right ahead of you.");
      hasLooked = true;
    }

    if(roomNum == 3){
      System.out.println("You see a room with" + ConsoleColors.YELLOW_BOLD+ " 2 Pressure Activated Plates" + ConsoleColors.RESET + " , it seems that you would need to be on both plates, but alas, you are too small for that to work. You still have access to the contents on the previous room.");
      hasLooked = true;
    }
    
    if(roomNum == 4){
      System.out.println("There’s nothing but a " + ConsoleColors.YELLOW_BOLD + "Keypad" + ConsoleColors.RESET + " and a " + ConsoleColors.YELLOW_BOLD + "Door." + ConsoleColors.RESET);
      hasLooked = true;
    }
    
    if(roomNum == 5){
      System.out.println("You see some " + ConsoleColors.YELLOW_BOLD + "spikes " + ConsoleColors.RESET + "blocking your path, a suspicious " + ConsoleColors.YELLOW_BOLD + "lever" + ConsoleColors.RESET + " to your left, and a " + ConsoleColors.YELLOW_BOLD + "computer." +  ConsoleColors.RESET);
      hasLooked = true;
    }

    if(roomNum == 6){
      System.out.println(" All that’s in this room is a " + ConsoleColors.YELLOW_BOLD + "chasm" + ", a pile of " + ConsoleColors.YELLOW_BOLD + "boards" + ConsoleColors.RESET + ", and some " + ConsoleColors.YELLOW_BOLD + "duct tape." + ConsoleColors.RESET);
      hasLooked = true;
    }

    
  }

  public void Observe(){

    //Scanner scanner1 = new Scanner(System.in);
    //String inputRooms = scanner1.nextLine();

    


    if(roomNum == 1 && hasLooked){
        if(inputRooms.toLowerCase().contains("bed")){
          System.out.println("You take a closer look at the bed, it’s red sheets and white pillow are all the more perplexing. After looking under the bed, you find a small" + ConsoleColors.YELLOW_BOLD + " key, " + ConsoleColors.RESET + "and take it.");

          Inventory.InventoryList("Key");
            
        }else if(inputRooms.contains("toilet")){
          System.out.println(" It’s a toilet, white and shiny, it looks like it hasn’t been used so far.");
          
        }else if(inputRooms.contains("door")){
          System.out.println("it’s a solid grey concrete door, though there is an open keyhole.");
        }else{
           System.out.println("This cannot be observed.");
        }

    }
    
    else if(roomNum == 4 && hasLooked){
      if(inputRooms.toLowerCase().contains("door")){
        System.out.println("It’s a grey concrete door like the one in your cell. Except this one doesn’t have a convenient key hole.");
      }
      else if(inputRooms.toLowerCase().contains("keypad")){
        System.out.println("There’s a small keypad next to the door, and there are fingerprints you can see on the 0, 2, and 4 keys.");
      }
      else{
        System.out.println("This cannot be observed");
      }
    }
  

    else if(roomNum == 5 && hasLooked){
      if(inputRooms.toLowerCase().contains("spikes")){
        System.out.println("Shiny and sharp, these things look like they would kill you if you tried to go to the next room.");
      }else if(inputRooms.contains("lever")){
        System.out.println("an old, rusted lever, it seems like it might do something.");
      }else if(inputRooms.contains("computer")){
        System.out.println("The computer seems to be connected to the spikes. You see a sticky note on the computer with a strange word written on it: \"qbttxpse\"."); //password is password
      }
    }
      
    else if(roomNum == 6 && hasLooked ){
      if(inputRooms.contains("boards")){
        System.out.println("They’re just some wooden boards, but they’re " + ConsoleColors.YELLOW_BOLD + "not long enough " + ConsoleColors.RESET + "to get across the chasm.");
      }else if(inputRooms.contains("tape")){
        System.out.println("It’s a roll of duct tape, it’s easily enough to connect all of the boards together.");
      }
    } 

    else if(roomNum == 2 && hasLooked){
      if(inputRooms.contains("guard")){
        System.out.println("He is currently standing alone but will be suspicious if you take too long.");
      }
    }

    else{
      System.out.println("You cannot observe an object before you look.");
    }

    
    
  }
  public void Interact(){

    if(hasLooked == false){
      System.out.println("You may not interact without looking around first.");
    }
    
    if(roomNum == 1 && hasLooked){
      if(inputRooms.contains("key") && inputRooms.contains("door")){
        if(Inventory.addObjects.contains("Key")){
          System.out.println("Congrats! You made it out of the Jail Cell.");
          System.out.println(" You exit the cell using the key, and are thrust into the next room by an unknown source.");
          hasLooked = false;
          roomNum = 2;
        }else{
        System.out.println("You can't do that!");
        }
      }
    }
    
    else if(roomNum == 2 && hasLooked){
      if(inputRooms.contains("guard")){
          roomNum = 3;
          hasLooked = false;
          System.out.println("Congrats! You made it out of the Guard Room. ");
          System.out.println(" You bonk the guard on the head with your fist, knocking him out. You continue into the next room.");
      }
    }
    else if(roomNum == 3 && hasLooked){
      if(inputRooms.contains("guard") && inputRooms.contains("plate")){
        roomNum = 4;
        hasLooked = false;
        System.out.println("You go back and grab the guard from the last room, and place him on the pressure activated plate. You stand on the other plate yourself, and proceed to the next room.");
        System.out.println("Congrats You made it out of the Plate Room");
      }
      else{
        System.out.println("You can't do that!");
      }
    }
    else if(roomNum == 4 && hasLooked){
      if(inputRooms.contains("keypad")){
        System.out.println("What code do you input? (number)");
        Scanner scan1 = new Scanner(System.in);
        String code = scan1.nextLine();

        int newcode = 0;

        try {
          newcode = Integer.parseInt(code);
        } catch (Exception e) {}
       
        if(newcode == 402){
          roomNum = 5;
          hasLooked = false;
          System.out.println("The door slides open, and you continue into the next room.");
          System.out.println("Congrats You made it out of the Numpad Room");
        }
        else{
          System.out.println(" Incorrect code. Try again.");
        }
      }
      else{
        System.out.println("You can't do that!");
      }
    }
    
    else if(roomNum == 5 && hasLooked){
      if(inputRooms.contains("lever")){
        System.out.println("The room starts shaking to a certain beat: \".- / .. ... / -...\"");
      }
      
      else if (inputRooms.contains("spikes")){
        System.out.println("You get stabbed. Game O V E R");
        roomNum = 1;
        hasLooked = false;
        Inventory.addObjects.clear();
        
      }

      if(inputRooms.contains("computer") && inputRooms.contains("password")){ 
        System.out.println("With a hearty CLUNK spikes retract. You carefully walk past the spikes, silently hoping you don’t get stabbed. You escape, and continue to the next room."); 
        roomNum = 6;
        hasLooked = false;
      }
    }

    
    else if(roomNum == 6 && hasLooked){
      


      if(inputRooms.contains("board") && inputRooms.contains("chasm") && boardsConnected == true){
        Main.win();
      }
      if(inputRooms.contains("chasm") && inputRooms.contains("board") && boardsConnected == false){
        System.out.println( "You place a board into the chasm, and it falls in. You no longer have enough boards to get across. G A M E  O V E R");
        roomNum = 1;
        hasLooked = false;
        Inventory.addObjects.clear();
      }
      if(inputRooms.contains("board") && inputRooms.contains("tape")){
        System.out.println("You connect all of the boards together, and now it’s enough to go across the chasm.");
        boardsConnected = true;
      }
      
      
    }


  }


  public void Clue(){
    if(roomNum == 1){
      System.out.println("Maybe there’s a" + ConsoleColors.YELLOW_BOLD + "key" + ConsoleColors.RESET + "somewhere, try to OBSERVE the BED");
    }

    if(roomNum == 2){
      System.out.println("If you were to INTERACT with GUARD, you just might slip past.");
    }

    if(roomNum == 3){
      System.out.println("That guard would be a good weight for that second plate, try to INTERACT with the GUARD.");
    }

    if(roomNum == 4){
      System.out.println("Try all the combinations of 0, 2, and 4.");
    }
  
    if(roomNum == 5){
      System.out.println("The beat sounds like morse code... The sticky note is a caesar cipher...");
    }

    if(roomNum == 6){
      System.out.println("One board is not enough to cross the chasm but how about multiple?");
    }
  }
  
  



}
