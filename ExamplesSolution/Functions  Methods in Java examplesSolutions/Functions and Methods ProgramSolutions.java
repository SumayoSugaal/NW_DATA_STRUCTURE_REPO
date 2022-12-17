program addition of two numbers in java


public class SumOfNumbers4.
{
public static void main(String args[])
{
int x = Integer.parseInt(args[0]); //first arguments.
int y = Integer.parseInt(args[1]); //second arguments.
int sum = x + y;
System.out.println("The sum of x and y is: " +sum);





Greetings Examples :

class Greetings{  
    public static void main(String args[]){  
     System.out.println("Hello Java");  
    }  
}  







Swap two numbers


import java.util.*;
class Swap_With {
public static void main(String[] args) {
int x, y, t;// x and y are to swap.
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of X and Y");
x = sc.nextInt();
y = sc.nextInt();







Program : Pass Value


public class PassValue {
     
 
    int a = 10;
    void call(int a) {
         
        // this local variable a is subject to change in its value
        a = a+10;
    }
     
    public static void main(String[] args) {
 
        Example eg = new Example();
        System.out.println("Before call-by-value: " + eg.a);
         
     
        eg.call(50510);
        System.out.println("After call-by-value: " + eg.a);
         
         
    }
}






Change_Value

public class Main {
    public static void main(String[] args) {
        MyMutableInt i = new MyMutableInt(2);
        setToThree(i);
        System.out.println(i);
    }        

    public static void setToThree(MyMutableInt i) {
        i.set(3);
    }
} 