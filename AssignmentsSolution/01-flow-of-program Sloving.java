[Video Link](https://youtu.be/lhELGQAV4gg)

## Create flowchart and pseudocode for the following:

1. Input a year and find whether it is a leap year or not.
Let Y be any year in the period covered by the current (Gregorian) calendar. Then Y is a leap year if and only if

(a) Y is a multiple of 4 but not a multiple of 100.

or

(b) Y is a multiple of 400.

From this it follows that Y is not a leap year if and only if

(a) Y is not a multiple of 4

or

(b) Y is a multiple of 100 but not a multiple of 400.

For instance:

The years 1976, 1988, 2020 and 2024 are leap years, because those numbers are multiples of 4 but not multiples of 100.

The years 2000 and 2400 are leap years, because those numbers are multiples of 400.

The years 1982 and 2021 are not leap years, because those numbers are not divisible by 4.


2. Take two numbers and print the sum of both.
public class Exercise2 {
 
 public static void main(String[] args) {
  System.out.println(24+26);
 }
 
}

3. Take a number as input and print the multiplication table for it.
import java.util.Scanner;
 
public class Exercise7 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input a number: ");
  int num1 = in.nextInt();
   
  for (int i=0; i< 10; i++){
   System.out.println(num1 + " x " + (i+1) + " = " + 
     (num1 * (i+1)));
  }
 }
}


4. Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class JavaExample{
   public static void main(String args[]){
      int temp1, temp2, num1, num2, temp, hcf, lcm;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter First Number: ");
      num1 = scanner.nextInt();
      System.out.print("Enter Second Number: ");
      num2 = scanner.nextInt();
      scanner.close();

      temp1 = num1;
      temp2 = num2;

      while(temp2 != 0){
         temp = temp2;
         temp2 = temp1%temp2;
         temp1 = temp;
      }

      hcf = temp1;
      lcm = (num1*num2)/hcf;

      System.out.println("HCF of input numbers: "+hcf);
      System.out.println("LCM of input numbers: "+lcm);
   }
}


5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;
public class Exercise12 {

    
  public static void main(String[] args)

{       
    int i,n=0,s=0;
	double avg;
	{
	   
        System.out.println("Input the 5 numbers : ");  
         
	}
		for (i=0;i<5;i++)
		{
		    Scanner in = new Scanner(System.in);
		    n = in.nextInt();
		    
  		s +=n;
	}
	avg=s/5;
	System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
 
}
}
