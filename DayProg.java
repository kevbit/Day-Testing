/**
 * Display today's date, the Daylight Saving End Day, the number of days until the
 * Daylight Saving End Day, and the year, month and day for the day 19 days later.
 *
 * @author  Kevin Lo
 * @version 2020-8-31
 */
public class DayProg
{
    public static void main(String[] args)
    {
        //Creating a new "Day" object to represent today's date
        Day dateToday = new Day();
        //Formatting how to output the current day
        System.out.print("Today is ");
        System.out.print(dateToday);
        System.out.println(".");
        //Creating and Formatting Daylight Saving End Day
        Day dayLightSavingEnd = new Day(2020, 11, 1); //11-1-2020
        System.out.print("The Daylight Saving End Day is ");
        System.out.print(dayLightSavingEnd);
        System.out.println(".");
        int daysUntilDaylightSavingEnd = dayLightSavingEnd.daysFrom(dateToday);
        System.out.print("There are ");
        System.out.print(daysUntilDaylightSavingEnd);
        System.out.println(" days until the Daylight Saving End Day.");
        //Starting "Date after 19 Days Section"
        dateToday.addDays(19);
        //Formatting Output for Date after Nineteen Days
        System.out.println("The date after 19 days is: ");
        System.out.print("   Year : ");
        System.out.println(dateToday.getYear());
        System.out.print("   Month: ");
        System.out.println(dateToday.getMonth());
        System.out.print("   Day  : ");
        System.out.println(dateToday.getDayOfMonth());
        
        
        
        
        
        
        
        
    }
}