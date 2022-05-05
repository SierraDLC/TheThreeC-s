package Conditionals;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word!");
        String w1= scanner.nextLine();
        
         System.out.println("Nice, enter another word NOW!");
        
        String w2 = scanner.nextLine();

        
        
        if (w1.equals(w2)) {
            System.out.println("Um, why'd you enter the same word?");
        }
        else {
            System.out.println("WOW, a different word!");
        }
        
    }    
}