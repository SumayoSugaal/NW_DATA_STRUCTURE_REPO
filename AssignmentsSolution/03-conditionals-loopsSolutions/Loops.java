22. Perfect Number In Java

import java.util.Scanner;  
public class PerfectNumberExample1  
{  
public static void main(String args[])    
{  
long n, sum=0;  
Scanner sc=new Scanner(System.in);         
System.out.print("Enter the number: ");  
n=sc.nextLong();  
int i=1;  
//executes until the condition becomes false  
while(i <= n/2)  
{  
if(n % i == 0)  
{  
//calculates the sum of factors  
Sum = sum + i;  
} //end of if  
//after each iteration, increments the value of variable i by 1  
i++;  
} //end of while  
//compares sum with the number  
if(sum==n)  
{  
//prints if sum and n are equal  
System.out.println(n+" is a perfect number.");  
} //end of if  
else  
//prints if sum and n are not equal  
System.out.println(n+" is not a perfect number.");   
}  
}  




23. Check Leap Year Or Not

public class Main {

  public static void main(String[] args) {

    // year to be checked
    int year = 1900;
    boolean leap = false;

    // if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      // if the year is not century
      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}




24. Sum Of A Digits Of Number

import java.io.*;
 
class GFG {
     
    /* Function to get sum of digits */
    static int getSum(int n)
    {   
        int sum = 0;
         
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
     
    return sum;
    }
 
    // Driver program
    public static void main(String[] args)
    {
        int n = 687;
 
        System.out.println(getSum(n));
    }
}








25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.



import java.util.Scanner;
public class Exercise7 {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}






26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.








import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = new int[0];

        int number;
        String nextLine;
        do {
            System.out.print("Enter the number : ");
            number = scanner.nextInt();
            nextLine = scanner.nextLine();

            if(number != 0) {
                numbers = add(numbers, number);
            }

        } while(number != 0);

        int negativeSum = 0; 
        int oddSum = 0; 
        int evenSum = 0;

        for(int i = 0; i < numbers.length; i++ )
        {
            if( numbers[i] < 0 )
            {
                negativeSum = negativeSum + numbers[i];
            }
            else if( numbers[i] % 2 == 0 )
            {
                evenSum = evenSum + numbers[i];
            }
            else
            {
                oddSum = oddSum + numbers[i];
            }
        }
        System.out.println( "Sum of negative numbers : " + negativeSum );
        System.out.println( "Sum of positive even numbers: " + evenSum );
        System.out.println( "Sum of positive odd numbers: " + oddSum );

    }

    private static int[] add(int[] numbers, int number) {

        int[] tempArray = new int[numbers.length + 1];

        for(int i = 0; i < numbers.length; i++) {
            tempArray[i] = numbers[i];
        }

        tempArray[tempArray.length - 1] = number;
        return tempArray;

    }

}