Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}


Take name as input and print a greeting message for that particular name.

class Greeting
{
	public static void main(String arg[])	
	{
	    char c='"';
            Scanner sc=new Scanner(System.in);	
	    System.out.println("Enter the string");
	    String name = sc.nextLine(); 
	    System.out.println("Greetings("+c+name+c+") --> "+c+"Hello "+name+"!"+c);
	}
}


Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class Main.
{
public static void main (String args[])
{ float p, r, t, si; // principal amount, rate, time and simple interest respectively.
p = 13000; r = 12; t = 2;
si = (p*r*t)/100;
System.out.println("Simple Interest is: " +si);
}}


Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}



Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int numberOne, numberTwo, largest;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the First Number: ");
      numberOne = scan.nextInt();
      System.out.print("Enter the Second Number: ");
      numberTwo = scan.nextInt();
      
      if(numberOne>numberTwo)
         largest = numberOne;
      else
         largest = numberTwo;
      
      System.out.println("\nLargest = " +largest);
   }
}


Input currency in rupees and output in USD.
import java.util.Scanner;

public class MathUnitConversions17 {

	public static void main(String[] args) {

		float rupees;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter rupees:");

		rupees = in.nextLong();

		float dollars = rupees / 64;

		System.out.println(dollars + " Dollars");
	}
}


To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int sum = 0, n;
int a = 0;
int b = 1;
System.out.println("Enter the nth value: ");
n = sc.nextInt();
System.out.println("Fibonacci series: ");
while(sum <= n)
{
System.out.print(sum + " ");
a = b;  // swap elements
b = sum;
sum = a + b;  // next term is the sum of the last two terms 
}
}
}



To find out whether the given String is Palindrome or not.
public class Palindrome  
{  
    public static void main(String[] args) {  
        String string = "Kayak";  
        boolean flag = true;  
          
        //Converts the given string into lowercase  
        string = string.toLowerCase();  
          
        //Iterate the string forward and backward, compare one character at a time   
        //till middle of the string is reached  
        for(int i = 0; i < string.length()/2; i++){  
            if(string.charAt(i) != string.charAt(string.length()-i-1)){  
                flag = false;  
                break;  
            }  
        }  
        if(flag)  
            System.out.println("Given string is palindrome");  
        else  
            System.out.println("Given string is not a palindrome");  
    }  
}  



To find Armstrong Number between two given number.

import java.io.*;
import java.math.*;
 
class GFG {
     
    // Prints Armstrong Numbers in given range
    static void findArmstrong(int low, int high)
    {
        for (int i = low + 1; i < high; ++i) {
      
            // number of digits calculation
            int x = i;
            int n = 0;
            while (x != 0) {
                x /= 10;
                ++n;
            }
      
            // compute sum of nth power of
            // its digits
            int pow_sum = 0;
            x = i;
            while (x != 0) {
                int digit = x % 10;
                pow_sum += Math.pow(digit, n);
                x /= 10;
            }
      
            // checks if number i is equal
            // to the sum of nth power of
            // its digits
            if (pow_sum == i)
                System.out.print(i + " ");    
        }
    }
      
    // Driver code
    public static void main(String args[])
    {
        int num1 = 100;
        int num2 = 400;
        findArmstrong(num1, num2);
        System.out.println();
    }
}
 
