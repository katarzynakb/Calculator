package com.kalkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int number1;
        int number2;
        char character;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        number2 = input.nextInt();
        
        System.out.println("Adding two numbers - press + ");
        System.out.println("Subtract the two numbers - press - ");
        System.out.println("Multiply the two numbers - press * ");
        System.out.println("Dividing two numbers - press / ");
        System.out.println("Modulo operation - press % ");
        
        character = input.next().charAt(0);
        switch(character)
        {
            case '+':
            {
                System.out.println(number1 + number2);
                break;
            }
            
            case '-':
            {
                System.out.println(number1 - number2);
                break;
            }
            
            case '*':
            {
                System.out.println(number1 * number2);
                break;
            }
            
            case '/':
            {
                if(number2 !=0) 
                {
                    System.out.println(number1 / number2 + "and rest" + number1 % number2);
                    break;
                }
                else
                {
                    System.out.println("Not divide by zero!");
                }
                break;
            }
            
            case '%':
            {
                if(number2 !=0) 
                {
                    System.out.println(number1 % number2 );
                    break;
                }
                else
                {
                    System.out.println("Not divide by zeo!");
                }
                break;
            }
            
            default:
                System.out.println("Incorrect character");
        }
        

    }

}
