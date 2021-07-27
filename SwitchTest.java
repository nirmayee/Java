import java.util.*;
import java.util.Scanner;
public class SwitchTest {
    public static void main (String [] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter num1");
       int num1 = input.nextInt();
       //No need to write "scanner input =" it is already declared
       System.out.println("Enter num2");
       int num2 = input.nextInt();
       System.out.println("Menu is as follows: \n Press 0 for Addition \n Press 1 for Subtraction \n Press 2 for Multiplication \n Press 3 for Division \n Press 4 for Square Root \n Press 5 for Square");
       System.out.println("Enter the selection");
       int selection = input.nextInt();
       int add,sub,mult,div,moddiv; // Better to declare all variables at once rather 
       String MenuOptions; // remember the string declaration used here, need to use it later 
       switch (selection) {
           case 0:
                MenuOptions = "add";// not useful just for reference
                System.out.println("You have chosen Addition "); 
                add = num1+num2;
                System.out.println("Addition " + add);
                    break;

            case 1:
                sub = num1 - num2; // works without MenuOptions but not as appealing as case 4
                System.out.printf("%d",sub);
                break;
            case 2:
                MenuOptions = "You have choosen Multiplication";
                System.out.println(MenuOptions);
                mult = num1 *  num2;
                System.out.printf("%d",mult);
                break;

            case 3:
                System.out.printf("you have chosen division:\n Select one option \n Press 1 for %d = Dividend and %d = Divisor \n Press 2 for %d = Divisor and %d = Dividend\n",num1,num2,num1,num2);
                int NewNum3 = input.nextInt();
                if (NewNum3 == 1){
                    div = num1 / num2;
                    moddiv = num1 % num2;
                    System.out.printf("Quotient is %d \n",div);
                    System.out.printf("Remainder %d",moddiv);
                }
                else if (NewNum3 == 2){
                     div = num2 / num1;
                    moddiv = num2 % num1;
                    System.out.printf("Quotient is %d \n",div);
                    System.out.printf("Remainder %d",moddiv);
                }
                else{
                    System.out.println("Invalid Input");
                }
                
                break;
            
            case 4:
                 MenuOptions = "You have choose Square Root";
                System.out.println(MenuOptions);   
                System.out.printf("Select the number you want \n 1.Press 1 for Number 1 = %d \n 2.Press 2 for Number 2 = %d \n 3.Press 3 to enter a new number\n ", num1,num2);          
                int newnum = input.nextInt();
                    
               if (newnum == 1) {
                   System.out.println("Square root =  " + Math.sqrt(num1));
               }
               else if (newnum == 2) {
                    System.out.println("Square root = " + Math.sqrt(num1));
               }
               else if (newnum == 3) {
                    System.out.println("Enter a new number ");
                    int num3  = input.nextInt();
                    System.out.println("Square root = " + Math.sqrt(num3));
               }
               else {
                   System.out.println("Invalid Input");
               } 
                break;          
            
            case 5:
                 System.out.println("You have chosen Squaring of a number: "); 
                 System.out.printf("Select the number you want \n 1.Press 1 for Number 1 = %d \n 2.Press 2 for Number 2 = %d \n 3.Press 3 to enter a new number\n ", num1,num2);          
                 int newnum1 = input.nextInt();
                 if (newnum1 == 1){
                    System.out.println("Square = " + num1 * num1);
                 }
                 else if (newnum1 == 2){
                     System.out.println("Square root = " + num2 * num2);

                 }
                 else if (newnum1 == 3){
                     System.out.println("Enter the number you wish to proceed with:");
                     int num4 = input.nextInt();
                     System.out.println("Square = "+ num4 * num4);
                     
                 }
                 break;             
       }
       }
}