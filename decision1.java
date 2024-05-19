import java.util.*;

class decision1{
    public static void main(String[] a){

        // Working with Conditional Statements
        int i;

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        i = scn.nextInt();
        
        // Using Flow Control Statements
        // 1. First Type of using Control Flow statements
        if(i%2 == 0){                                                    // for first condition
            System.out.println("The given number is even number !");
        }
        else{                                                                   // for otherwise condition
            System.out.println("The given number is odd number !");
        }

        // 2. Second Type of using control flow statements
        // checking Two conditions by nested if condition
        int age;

        System.out.print("Enter your age here : ");
        age = scn.nextInt();
        if(age < 25){
            if(age <= 18){
                System.out.println("You are a teenager !");
            }
            else{
                System.out.println("You are a Youth Now !");
            }
        }
        else{
            System.out.println("You are not a Teenager !");
        }

        // Using else if for multiple conditional statement
        int number;
        
        // taking input
        System.out.print("Enter a number here : ");
        number = scn.nextInt();

        // Applying the conditions here
        if(number > 0){
            System.out.println("The number you entered a positive number !");
        }
        else if(number < 0){
            System.out.println("You have entered a negative number !");
        }
        else{
            System.out.println("Wrong Choice !");
        }

        // Note : We can also apply multiple else if condition on the place of using multiple if statement

        // Using Switch statement and its cases
        switch(number){
            case 0:
                System.out.println("You are at the center of postive and negative number !");
                break;
            
            case 5:
                System.out.println("You have entered an estimate limit number !");
                break;

            default:
                System.out.println("This is a default statement !");
        }

    scn.close();
    }
}