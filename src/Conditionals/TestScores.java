package Conditionals;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a score between 0 and 100");
        int num = input.nextInt();
        
        
        if(num >= 90){
            System.out.println("You have an A! Yay!");
        }else if(num>= 80){
            System.out.println("OMG, it's a B!");
        } else if(num >= 70){
            System.out.println("C's don't get degrees!");
        } else if(num>=60){
            System.out.println("A D is dissapointing");
        } else if(num<=59){
            System.out.println("F. This is sad. Please study.");
        }
    }
}
