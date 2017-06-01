import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class Solution {
    /* Java Date and Time
    * Problem description and tests:
    * https://www.hackerrank.com/challenges/java-date-and-time/
    */
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
       
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        

        LocalDate dt = LocalDate.of( y, m, d);


        System.out.println(dt.getDayOfWeek());
        in.close();
    }
}