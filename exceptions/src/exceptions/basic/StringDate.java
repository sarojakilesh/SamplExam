package exceptions.basic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringDate {


	  
    // Function to convert String to Date
    public static LocalDate
    getDateFromString(String string, DateTimeFormatter format)
    {
  
        // Convert the String to Date in the specified format
        LocalDate date = LocalDate.parse(string, format);
  
        // return the converted date
        return date;
    }
  
    public static void main(String[] args)
    {
  
        // Get the String
        String string = "17 May, 2021";
  
        // Get the Format
        DateTimeFormatter format = DateTimeFormatter
                                       .ofPattern("d MMMM, yyyy");
  
        try {
  
            // Get the Date from String
            LocalDate date = getDateFromString(string, format);
  
            // Print the converted date
            System.out.println(date);
        }
  
        // If the String pattern is invalid
        catch (IllegalArgumentException e) {
  
            System.out.println("Exception: " + e);
        }
  
        // If the String was unable to be parsed.
        catch (DateTimeParseException e) {
  
            System.out.println("Exception: " + e);
        }
    }
}