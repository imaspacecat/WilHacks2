import java.util.Scanner;
public class Introduction{
  public static String name;
  public String eyeColor;
  public String hairColor;

  public void Intructions(){
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Welcome to the " + ConsoleColors.YELLOW_BOLD + "Prison Escape Room Game! " + ConsoleColors.RESET + "Your task is to use various actions including" + ConsoleColors.YELLOW_BOLD + " 'look', 'observe', 'interact', and 'clue' " + ConsoleColors.RESET + "to help you escape the prison. ");
    System.out.println(" ");
    System.out.println("Here are some descriptions of what each action does: ");
    String look = ConsoleColors.YELLOW_BOLD + "look: " + ConsoleColors.RESET + "gives a 360 view of the entire room and the objects within it";
    String observe = ConsoleColors.YELLOW_BOLD + "observe: " + ConsoleColors.RESET + " gives a specific description of the one of the objects in the room";
    String interact = ConsoleColors.YELLOW_BOLD + "interact: " + ConsoleColors.RESET + "allows you to use a choosen object";
    String clue = ConsoleColors.YELLOW_BOLD + "clue: " + ConsoleColors.RESET + "gives a hint to help you solve the puzzle and escape one room";
    System.out.println(" ");
    System.out.println(" ");
    System.out.print(look + "\n" + observe + "\n" + interact + "\n" + clue);
  }
  
  public void characterCreator(){
    System.out.println(" ");
    System.out.println("Now that you understand the guidelines to the game. It is time to create your character!");
    System.out.println(" ");
    System.out.println("Please enter the" + ConsoleColors.YELLOW_BOLD + " name " + ConsoleColors.RESET + "you would like to give your character: ");
    Scanner input = new Scanner(System.in);
    name = input.nextLine();
    System.out.println(" ");
    System.out.println("Please enter the " + ConsoleColors.YELLOW_BOLD + "hair color " +  ConsoleColors.RESET + "for your character: ");
    hairColor = input.nextLine();
    System.out.println(" ");
    System.out.println("Please enter the " + ConsoleColors.YELLOW_BOLD + "eye color " + ConsoleColors.RESET + "for your character: ");
    eyeColor = input.nextLine();
    System.out.println(" ");
    System.out.println("Congratulations!!! You have finished creating your character!");
  }
}