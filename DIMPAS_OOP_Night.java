package dimpas_oop_night;
import java.util.Scanner;

public class DIMPAS_OOP_Night {
    public static void main(String[] args) {
  
        Scanner inp = new Scanner (System.in);
        
        System.out.print("Enter the message: ");
        String chatMessage = inp.nextLine();
        
        if (misplacedCap(chatMessage)) {
                System.out.println("JEJE!");
            } else {
                System.out.println("uWu");
        }
    }
    
    public static boolean misplacedCap(String chatMessage) {
        
            for (int i = 1; i < chatMessage.length(); i++) {
                char character1 = chatMessage.charAt(i);
                char character2 = chatMessage.charAt(i-1);
            
                if (Character.isUpperCase(character1) && !Character.isWhitespace(character2)) {
                    return true;
                    }
                }
            return false;
        }
    } 
   
