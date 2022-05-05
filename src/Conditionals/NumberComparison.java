
package Conditionals;
import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int numz1 = input.nextInt();
        
        System.out.println("Enter another number: ");
        
        int numz2 = input.nextInt();
       
       
        if(numz1 > numz2){
            System.out.println("The first number was larger than the second");
        } else if(numz1 < numz2){
            System.out.println("The second number was larger than the first");
        } else {
            System.out.println("Both numbers are the same");
        }
    }
}