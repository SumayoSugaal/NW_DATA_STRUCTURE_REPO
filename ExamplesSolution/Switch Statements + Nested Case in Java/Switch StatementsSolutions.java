

Program 1 : Describe Fruit

public class ExamplekaQudaartaExample
{
   public static void main(String[] args)
   {
      String userInput;     // String variable to hold the string input.
      char outputchoice;    // char variable to store the value to be displayed
      
      
      //input for type of fruit
      userInput = JOptionPane.showInputDialog("Please enter the letter for the fruit option to purchase:\n1. Watermelon - $8\n2. Basket of Peaches - $6\n3. Basket of Apples - $4\n4. Cantaloupe - $2\n5. Honeydew Melon - $2\n6. Basket of Grapes - $3\n7. Basket of Cherries - $6");

      // Convert the String input to an int.
      outputchoice = userInput.charAt(0);

      //use sitch case to set price accoring to input
      switch(outputchoice)  
         {
               case 'W': 
               JOptionPane.showMessageDialog(null,"You selected "+ outputchoice + ", " + userInput+ "for $2");
               break;
               case 'P': 
               JOptionPane.showMessageDialog(null,"You selected "+ outputchoice + ", " + userInput+ "for $6");
               break;
               case 'A': 
               JOptionPane.showMessageDialog(null,"You selected "+ outputchoice + ", " + userInput+ "for $42");
               break;
               case 'C': 
               JOptionPane.showMessageDialog(null,"You selected "+ outputchoice + ", " + userInput+ "for $2");
               break;
               case 'H': 
               JOptionPane.showMessageDialog(null,"You selected "+ outputchoice + ", " + userInput+ "for $2");
               case 'G': 
               JOptionPane.showMessageDialog(null,"You selected "+ outputchoice + ", " + userInput+ "for $32");
               break;
               case 'B': 
               JOptionPane.showMessageDialog(null,"You selected "+ outputchoice + ", " + userInput+ "for $6");
               break;
               //default case  
               default: 
               JOptionPane.showMessageDialog(null,
                                    "Invalid Selection" + outputchoice); 
          }  
   }
}












Program 2 : Display Day Name b/w 1 & 7


import java.util.Scanner;
public class Exercise5 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }

    // Get the name for the Week
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }

        return dayName;
    }
}








Program 3 : Weekdays and Weekends


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
public class Main
{
    public static void main(final String[] args)
    {
        LocalDate today = LocalDate.now();
        System.out.println("Is weekend : " + isWeekend(today));
        LocalDate someDate = LocalDate.of(2021, 1, 2); // 2nd-Jan-2021
        System.out.println("Is weekend : " + isWeekend(someDate));
    }
    public static boolean isWeekend(final LocalDate ld)
    {
        DayOfWeek day = DayOfWeek.of(ld.get(ChronoField.DAY_OF_WEEK));
        return day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY;
    }
}


