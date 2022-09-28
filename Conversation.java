
import java.util.Scanner;



class Conversation {


  String[] responsewords = {"I", "me", "am", "you", "my", "your" };
  
  public static void main(String[] arguments) {
    // You will start the conversation here.
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many rounds? ");
    int rounds = scanner.nextInt();
    scanner.nextLine();
    System.out.println();
    System.out.println("Hi there! Whats on your mind?");

    String[] responses = { };
    for (int i =0; i < rounds; i++) {
      String response = scanner.nextLine();
      System.out.println(response + "?");
    }

    System.out.println("See you later!");
    System.out.println();
    System.out.println();
    System.out.println("Transcript:");
    System.out.println("Hi there! Whats on your mind?");
    System.out.println(responses);
    System.out.println("See you later!");
    scanner.close();
    }
    
    }
   
  




  