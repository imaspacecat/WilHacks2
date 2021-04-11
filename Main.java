import java.util.Scanner;
import java.time.*;

class Main {
public static long time1;
public static long time2;
public static long time3;
 //we can add more rooms later if there is a need.
  public static boolean mainMenuOver;
  static boolean running;
  public static void main(String[] args){
    
    MainMenu();
    Intro();
    time1 =  System.currentTimeMillis();
    Run();
  }

  public static void MainMenu(){
      MainMenu menu = new MainMenu();
      menu.startGame();
      

  }
  
  public static void Intro(){
    if(mainMenuOver == true){
      Introduction intro = new Introduction();
      intro.Intructions();
      intro.characterCreator();
    }

  }
  public static void Run(){
    Rooms StartGame = new Rooms();
    running = true;
    
    while(running){
      StartGame.Input();
    }
  }

  public static void quit(){
    running = false;
    
  }

  public static void win(){
    
    quit();
    time2 = System.currentTimeMillis();
    time3 = time2-time1;
    System.out.println("Your time is: " + time3/1000 + " Seconds!");
    System.out.println("YOU ARE FREE!");

    System.out.println("__________________");
    System.out.println("|     WANTED     |");
    System.out.println("|     " + Introduction.name + "     |");
    System.out.println("__________________");

  }
}