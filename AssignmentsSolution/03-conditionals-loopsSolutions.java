
## Write Java programs for the following: 

### Basic Java Programs
1. Area Of Circle Java Program

class AreaOfCircle 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         double r= s.nextDouble();
         double  area=(22*r*r)/7 ;
         System.out.println("Area of Circle is: " + area);      
   }
}


2. Area Of Triangle

public class test.
{
public static void main (String args[])
{ float b=4,h =13,area ;
area = ( b*h) / 2 ;
System.out.println("Area of Triangle is: "+area);
}}




3. Area Of Rectangle Program 
public class rectangle{
public static void main(String args[])
{
int width=5;
int height=10;
int area=width*height;
System.out.println("Area of rectangle="+area);
}


4. Area Of Isosceles Triangle 

import java.util.Scanner;
class AreaOfIsoscelesTriangle 
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the length of same sided");
         
         double a= s.nextDouble();
         
         System.out.println("Enter the side2 of the Triangle");
         
         double b= s.nextDouble();
 
         double  area=(b/4)*Math.sqrt((4*a*a)-(b*b));
      
         System.out.println("Area of Isosceles Triangle is: " + area);
   }
}



5. Area Of Parallelogram

public class parallelogram{
public static void main(String args[])
{
int base=4;
int height=18;
int area_parallelogram=base*height;
System.out.println("Area of the parallelogram="+area_parallelogram);
}



6. Area Of Rhombus

import java.util.Scanner;
class AreaOfRhombus 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the diagonal 1:");
         double d1= s.nextDouble();
        System.out.println("Enter the diagonal 2:");
         double d2= s.nextDouble();
          
          double  area=(d1*d2)/2;
      System.out.println("Area of Rhombus is: " + area);      
   }
}



7. Area Of Equilateral Triangle

import java.util.Scanner;
class AreaOfEquilateralTriangle 
{
   public static void main(String args[]) 
    {   
       
          Scanner s= new Scanner(System.in);
          System.out.println("Enter the side of the Triangle:");
          double a= s.nextDouble();
          double  area=(Math.sqrt(3)/4)*(a*a);
          System.out.println("Area of Triangle is: " + area);      
     }
}


8. Perimeter Of Circle


// Java program to find
// the perimeter of the circle
// using radius
 
import java.io.*;
 
class GFG {
 
    static final double PI = Math.PI;
 
    // Function to calculate the
    // perimeter of the circle
    static double Perimeter(double r)
    {
      return 2 * PI * r;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        // Radius
        double r = 5;
 
        // Calling Perimeter function
        System.out.println("Perimeter of the circle is :"
                           + Perimeter(r));
    }
}



9. Perimeter Of Equilateral Triangle

import java.util.Scanner;
class PerimeterOfEquilateralTriangle 
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the side of the Triangle:");
         
	 double a= s.nextDouble();
 
         double  perimeter=3*a;
      
         System.out.println("perimeter of Triangle is: " + perimeter);      
   }
}



10. Perimeter Of Parallelogram

import java.util.Scanner;
class PerimeterOfParallelogram
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the height of the Parallelogram:");
         
         double h= s.nextDouble();
	 
	 System.out.println("Enter the breadth of the Parallelogram:");
         
	 double b= s.nextDouble();
          
         double  perimeter=2*(h+b);
     
	 System.out.println("perimeter of Parallelogram is: " + perimeter);      
   }
}


11. Perimeter Of Rectangle

public class Main  
 {  
   public static void main (String args[])  
    {      float a ,b, c, d, perimeter;  
                    a=c= 5;  
                    b=d=4;  
                    perimeter  = 2*(a+b);  
            System.out.println("Perimeter of Rectangle is: "+perimeter);  
    }}  




12. Perimeter Of Square

import java.util.Scanner;
class PerimeterOfSquare
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the side of the square:");
         
	 double a= s.nextDouble();
	 
         double  perimeter=4*a;
     
	 System.out.println("perimeter of Square is: " + perimeter);      
   }
}



13. Perimeter Of Rhombus

import java.util.Scanner;
class PerimeterOfRhombus
{
   public static void main(String args[]) 
    {   
       
      	 Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the side of the Rhombus:");
         
         double a= s.nextDouble();
	 
         double  perimeter=4*a;
      
	 System.out.println("perimeter of Rhombus is: " + perimeter);      
   }
}





14. Volume Of Cone Java Program


public class cone{  
    public static void main(String args[])  
    {  
    int height=38;  
    int radius=35;  
    double pie=3.14285714286;  
    double volume=pie*(radius*radius)*height/3;  
        System.out.println("Volume of the cone="+volume);  
     }  
}  



15. Volume Of Prism
import java.util.Scanner;
class VolumeOfPrism 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the area of base:");
         double base=s.nextDouble();
         System.out.println("Enter the height:");
         double height=s.nextDouble();
         
 
          
          double  area=base*height ;
      System.out.println("Volume Of Prism is: " + area);      
   }
}




16. Volume Of Cylinder

import java.util.Scanner;
class VolumeOfCylinder 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         double r=s.nextDouble();
         System.out.println("Enter the height:");
         double h=s.nextDouble();
 
            double  volume=((22*r*r*h)/7);
 
            System.out.println("volume of Cylinder is: " +volume);
       
 
       
          
   }
}


17. Volume Of Sphere

public class sphere{  
        public static void main(String args[])  
    {  
    int radius=48;  
    double pie=3.14285714286;  
    double volume=(4.0/3.0)*pie*(radius*radius*radius);  
    System.out.println("Volume of the sphere="+volume);  
     }  
}  


18. Volume Of Pyramid

import java.util.*;
import java.lang.*;
 
class GfG
{
     
    // Function to find the volume of
    // triangular pyramid
    public static float volumeTriangular(int a,
                                         int b,
                                         int h)
    {
        float vol = (float)(0.1666) * a * b * h;
        return vol;
    }
 
    // Function to find the volume
    // of square pyramid
    public static float volumeSquare(int b,
                                     int h)
    {
        float vol = (float)(0.33) * b * b * h;
        return vol;
    }
 
    // Function to find the volume of
    // pentagonal pyramid
    public static float volumePentagonal(int a,
                                         int b,
                                         int h)
    {
        float vol = (float)(0.83) * a * b * h;
        return vol;
    }
 
    // Function to find the volume of hexagonal
    // pyramid
    public static float volumeHexagonal(int a,
                                        int b,
                                        int h)
    {
        float vol = (float)a * b * h;
        return vol;
    }
     
    // Driver Code
    public static void main(String argc[])
    {
        int b = 4, h = 9, a = 4;
        System.out.println("Volume of triangular"+
                             " base pyramid is " +
                       volumeTriangular(a, b, h));
 
        System.out.println("Volume of square base" +
                                    " pyramid is " +
                                volumeSquare(b, h));
 
        System.out.println("Volume of pentagonal"+
                             " base pyramid is " +
                       volumePentagonal(a, b, h));
 
        System.out.println("Volume of Hexagonal"+
                              " base pyramid is " +
                         volumeHexagonal(a, b, h));
    }
}



19. Curved Surface Area Of Cylinder


import java.util.Scanner;
 
/**
 * Java Program to find volume and surface area of Cylinder
 */
public class VolumeOfCylinder {
 
    public static void main(String[] args) {
        double radius, height, volume, surfaceArea;
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take input from user
        System.out.println("Enter Base Radius of Cylinder");
        radius = scanner.nextDouble();
 
        System.out.println("Enter Height of Cylinder");
        height = scanner.nextDouble();
 
        /*
         * Total surface area of Cylinder = 2 X PI X Radius X (Radius + Height)
         */
        surfaceArea = 2 * Math.PI * radius * (radius + height);
 
        /* Volume of Cylinder = PI X Radius X Radius X Height */
        volume = Math.PI * radius * radius * height;
 
        System.out.format("Surface Area of Cylinder = %.3f\n", surfaceArea);
        System.out.format("Volume of Cylinder = %.3f\n", volume);
    }
}





20. Total Surface Area Of Cube

import java.util.Scanner;
class TotalSurfaceAreaOfCuboid 
{
      
   public static void main(String args[]) 
    {   
       
	
            	
Scanner s= new Scanner(System.in);
System.out.println("Enter the length of Cubiod:");
double l=s.nextDouble();
 
System.out.println("Enter the breadth of Cubiod:");
double b=s.nextDouble();
 
System.out.println("Enter height of Cubiod:");
double h=s.nextDouble();
   		 
	         double  area=(2*((l*b)+(b*h)+(h*l)));
 
               	  System.out.println("Total SurfaceArea Of Cuboid is:" +area);   
          
   }
}



21. Fibonacci Series In Java Programs


class FibonacciExample1{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  



22. Subtract the Product and Sum of Digits of an Integer

var subtractProductAndSum = function(n) {
    // Initialize the sum and the product with neutral values
    var sum = 0;
    var product = 1;

    while (n > 0) {
        var digit = n % 10;
        sum += digit;
        product *= digit;

        n = Math.floor(n / 10);
    }

    return product - sum;
};





23. Input a number and print all the factors of that number (use loops).
public class Main {

  public static void main(String[] args) {

    // positive number
    int number = 60;

    System.out.print("Factors of " + number + " are: ");

    // loop runs from 1 to 60
    for (int i = 1; i <= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}



24. Take integer inputs till the user enters 0 and print the sum of all numbers
(HINT: while loop)


while ((input = in.nextInt()) != 0) {

        if (counter == 0)
          small = large = input;

        if (input != 0)
            sum = input + sum;
            counter++;

        if (input > large)
            large = input;

        if (input < small)
            small = input;

        if (input % 2 == 0)
            even = even + 1;
        else
            odd = odd + 1;

        }



25. Take integer inputs till the user enters 0 and print the largest number from
all.


static int userInputSum(){
       Scanner sc = new Scanner(System.in);
       int sum = 0;
       int num;

       do{
           System.out.println("Enter the number: ");
            num = sc.nextInt();
           System.out.println("Enter 0 to end the loop");
           sum += num;
       }while (num > 0);

       System.out.println("Sum is "+ sum);
       return -1;
   }


26. Addition Of Two Numbers

Class AddTwoNumbers
{
public static void main(String[] args)
{
System.out.println(“Addition of two numbers 10 + 20 is ” + (10 + 20));
}
}




### Intermediate Java Programs
1. Factorial Program In Java
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



2. Calculate Electricity Bill

import java.util.*;
class ComputeElectricityBill 
{ 
        public static void main(String args[]) 
        {   
	int units=280;
 
	double billpay=0;
 
        	if(units<100)
	 {
	      billpay=units*1.20;
	  }
	else if(units<300)
	 {
	   billpay=100*1.20+(units-100)*2;
	 }
	else if(units>300)
	{
	    billpay=100*1.20+200*2+(units-300)*3;
	}
       
	System.out.println("Bill to pay : " + billpay); 
      } 
}


3. Calculate Average Of N Numbers

a[i]=sc. nextInt();
for(int i=0;i<n;i++) res =res+a[i];
System. out. println("average="+res/n);
}
}


4. Calculate Discount Of Product

java. util. Scanner;
public static void main(String args[]) {
double dis,amount,markedprice,s;
Scanner sc=new Scanner(System. in);
System. out. println("enter markedprice ");
markedprice=sc. nextDouble();
System. out. println("enter discount percentage ");
dis=sc. nextDouble();


5. Calculate Distance Between Two Points 

import java. lang. Math. *;
class DistanceBwPoint.
public static void main(String arg[])
{
int x1,x2,y1,y2;
double dis;
x1=1;y1=1;x2=4;y2=4;
dis=Math. sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));


6. Calculate Commission Percentage

class CalculateCommission
{
	public static void main(String arg[])	
	{
         double amount=1000,commissionPercentage=15;
	 
         double commission=(commissionPercentage/100)*amount;  	   
 
     	 System.out.println("Commission amount="+commission);
	}
}


7. Power In Java

class Main {
  public static void main(String[] args) {

    int base = 3, exponent = 4;

    long result = 1;

    while (exponent != 0) {
      result *= base;
      --exponent;
    }

    System.out.println("Answer = " + result);
  }
}



8. Calculate Depreciation of Value

import java.io.*;
 
class GFG
{
 
// Function to return the depreciation of value
static float Depreciation(float v,
                          float r, float t)
{
    float D = (float)(v * Math.pow((1 - r / 100), t));
 
    return D;
}
 
// Driver code
public static void main(String[] args)
{
    float V1 = 200, R = 10, T = 2;
     
    System.out.print(Depreciation(V1, R, T));
}
}



9. Calculate Batting Average

class BattingAverage. {
public static void main(String arg[]) {
int Matches=5,totalruns=200,innings=5,notout=1;
double avg;
avg=totalruns/(innings-notout);
System. out. println("batting average="+avg);
} }




10. Calculate CGPA Java Program

for(int i=0;i<n;i++)
{ sum+=g[i];
}
cgpa=sum/n;
System. out. println("cgpa="+cgpa);
System. out. println("percantage from cgpa="+cgpa*9.5);
} }


11. Compound Interest Java Program

import java.io.*;
  
class Sum1
{
    public static void main(String args[])
    {
        double principal = 10000, rate = 10.25, time = 5;
  
        /* Calculate compound interest */
        double CI = principal *
                    (Math.pow((1 + rate / 100), time));
          
        System.out.println("Compound Interest is "+ CI);
    }
}




12. Calculate Average Marks

for(i=0;i<n-1;i++) {
System. out. print(args[i]+","); }
System. out. println(args[i]+") ="+avg/n); }



13. Sum Of N Numbers

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



14. Armstrong Number In Java

import java.util.Scanner;  
import java.lang.Math;  
public class ArmstsrongNumberExample  
{  
//function to check if the number is Armstrong or not  
static boolean isArmstrong(int n)   
{   
int temp, digits=0, last=0, sum=0;   
//assigning n into a temp variable  
temp=n;   
//loop execute until the condition becomes false  
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{   
//determines the last digit from the number      
last = temp % 10;   
//calculates the power of a number up to digit times and add the resultant to the sum variable  
sum +=  (Math.pow(last, digits));   
//removes the last digit   
temp = temp/10;   
}  
//compares the sum with n  
if(n==sum)   
//returns if sum and n are equal  
return true;      
//returns false if sum and n are not equal  
else return false;   
}   
//driver code  
public static void main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the limit: ");  
//reads the limit from the user  
num=sc.nextInt();  
System.out.println("Armstrong Number up to "+ num + " are: ");  
for(int i=0; i<=num; i++)  
//function calling  
if(isArmstrong(i))  
//prints the armstrong numbers  
System.out.print(i+ ", ");  
}   
}  





15. Find Ncr & Npr
import java.util.Scanner;
class NcrAndNpr
{
	double fact(double n)
	{
	   int i=1;
             	    double fact=1;
	    while(i<=n)
	    {
	   	   fact=fact*i;
		   i++;
 	    }
  	      return fact;
	}
	double permutation(int n,int r )
	{
		double per=fact(n)/fact(n-r);	
		return per;
	}
	double combination(int n,int r)
	{
		double com=fact(n)/(fact(n-r)*fact(r));
		return com;
	}
	public static void main(String arg[])	
	{
		NcrAndNpr p=new NcrAndNpr( );
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
               	int n=sc.nextInt();
		System.out.println("enter value of r");
              		int r=sc.nextInt();
		if(n>=r)
		{
		System.out.println("The value of "+n+"p"+r+" is : "+p.permutation(n,r));	
		System.out.println("The value of "+n+"c"+r+" is : "+p.combination(n,r));
		}
		else
		System.out.println("n value should be greater than or equals to r value");
		
	}	
}





16. Reverse A String In Java

import java.io.*;
import java.util.Scanner;
  
class GFG {
    public static void main (String[] args) {
        
        String str= "Geeks", nstr="";
        char ch;
        
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
  




17. Find if a number is palindrome or not 

import java.util.Scanner;
public class Example24  {

    public static void main(String args[])
    {
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a number: ");
     int n = in.nextInt();
     int sum = 0, r;
	 int temp = n;    
     while(n>0)
	   {    
        r = n % 10;   
        sum = (sum*10)+r;    
        n = n/10;    
       }    
      if(temp==sum)    
        System.out.println("It is a Palindrome number.");    
      else    
        System.out.println("Not a palindrome");    
     }  
}




18. Future Investment Value

import java.lang.*;
import java.util.Scanner;
class FIV
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter present value: ");
	double p=sc.nextInt();
	 System.out.print("Enter the interest rate: ");
	 double r=sc.nextInt();
	System.out.print("Enter the time period in years: ");
	 double y=sc.nextInt();
	double f=p*Math.pow((1+r/100),y);
	System.out.print("value is: "+f);
  }
}





19. HCF Of Two Numbers Program

import java.util.Scanner;
public class GCDOfTwoNumbers {
   public static void main(String args[]){
      int a, b, i, hcf = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number :: ");
      a = sc.nextInt();
      System.out.println("Enter second number :: ");
      b = sc.nextInt();

      for(i = 1; i <= a || i <= b; i++) {
         if( a%i == 0 && b%i == 0 )
         hcf = i;
      }
      System.out.println("HCF of given two numbers is ::"+hcf);
   }
}




20. LCM Of Two Numbers

public class Main {
  public static void main(String[] args) {

    int n1 = 72, n2 = 120, lcm;

    // maximum number between n1 and n2 is stored in lcm
    lcm = (n1 > n2) ? n1 : n2;

    // Always true
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
  }
}



21. Java Program Vowel Or Consonant 

public class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}



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