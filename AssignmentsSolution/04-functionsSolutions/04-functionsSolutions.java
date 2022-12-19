

1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.]



In java it is :-

int min = Math.min(num1,num2,num3);









2. [Define a program to find out whether a given number is even or odd.]


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




3. [A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.]

import java.util.Scanner;
 
public class Voting {
 public static void main(String[] args) 
 {
    // Declaring variables
    int age, diff;
    // taking user input
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your age: ");
    age = scan.nextInt();
    
    // Checking condition for voting..
    if(age>=18)
    {
        System.out.println("You are eligible for voting.");
    }
    else
    {
    diff = (18 - age);
    System.out.println("Sorry,You can vote after: "+ diff + " years");
    }
 }
}






4. [Write a program to print the sum of two numbers entered by user by defining your own method.]




public class SumOfNumbers4.
{
public static void main(String args[])
{
int x = Integer.parseInt(args[0]); //first arguments.
int y = Integer.parseInt(args[1]); //second arguments.
int sum = x + y;
System.out.println("The sum of x and y is: " +sum);



5. [Define a method that returns the product of two numbers entered by user.]

import java.util.Scanner;
public class MultiplicationOfTwoNumbers {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of the first number ::");
      int a = sc.nextInt();
      System.out.println("Enter the value of the first number ::");
      int b = sc.nextInt();
      int result = a*b;
      System.out.println("Product of the given two numbers is ::"+result);
   }
}




6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.]



class JavaExample
{
  public static void main(String args[])
  {
    int radius = 3;
    //formula to calculate area of circle
    double area = Math.PI * (radius * radius);
    System.out.printf("Area is: %.2f", area);

    //formula to calculate circumference of circle
    double circumference= Math.PI * 2*radius;
    System.out.printf( "\nCircumference is: %.2f",circumference) ;
  }
}



7. [Define a method to find out if a number is prime or not.]

The isPrime(int n) method is used to check whether the parameter passed to it is a prime number or not. If the parameter passed is prime, then it returns True otherwise it returns False. If the number is less than 1, if(inputNumber<= 1) it returns false.

8. [Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
<pre> 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
</pre>





import java.util.Scanner;
 
/**
 * Java Program to print grade of a student
 */
public class StudentGrade {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();
 
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
 
        /* Printing grade of a student using switch case statement */
        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : A+");
            break;
        case 8:
        case 7:
            System.out.println("Grade : A");
            break;
        case 6:
            System.out.println("Grade : B");
            break;
        case 5:
            System.out.println("Grade : C");
            break;
        default:
            System.out.println("Grade : D");
            break;
        }
    }
}





9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.](https://www.javatpoint.com/factorial-program-in-java)
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.- <br/>
<pre>
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1
</pre>


class FactorialExample{  
 public static void main(String args[]){  
  int i,fact=1;  
  int number=5;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  





10. [Write a function to find if a number is a palindrome or not. Take number as parameter.]

class PalindromeExample{
public static void main(String args[]){
int r,sum=0,temp;
int n=454;//It is the number variable to be checked for palindrome.
temp=n;
while(n>0){
r=n%10; //getting remainder.
sum=(sum*10)+r; 






11. Convert the programs in [flow of program](01-flow-of-program.md), [first java](02-first-java.md), 


12. [Write a function to check if a given triplet is a Pythagorean triplet or not.]


import java.io.*;
 
class PythagoreanTriplet {
 
    // Returns true if there is Pythagorean triplet in ar[0..n-1]
    static boolean isTriplet(int ar[], int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Calculate square of array elements
                    int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];
 
                    if (x == y + z || y == x + z || z == x + y)
                        return true;
                }
            }
        }
 
        // If we reach here, no triplet found
        return false;
    }
 
    // Driver program to test above function
    public static void main(String[] args)
    {
        int ar[] = { 3, 1, 4, 6, 5 };
        int ar_size = ar.length;
        if (isTriplet(ar, ar_size) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}




13. [Write a function that returns all prime numbers between two given numbers.]


public class Prime {

    public static void main(String[] args) {

        int low = 20, high = 50;

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}



14. [Write a function that returns the sum of first n natural numbers.]





public class SumOfNaturalNumber1  
{  
public static void main(String[] args)   
{  
int i, num = 10, sum = 0;  
//executes until the condition returns true  
for(i = 1; i <= num; ++i)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
}  
//prints the sum   
System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
}  
}  