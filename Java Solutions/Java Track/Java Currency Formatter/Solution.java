import java.util.*;
import java.text.*;

public class Solution {
	/* Java Currency Formatter
	* Problem satetment and tests:
	*https://www.hackerrank.com/challenges/java-currency-formatter/submissions/code/44725250
	*/
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale in_locale = new Locale("en", "in");
        Locale fr_locale = new Locale("fr", "fr");
        Locale cn_locale = new Locale("zh", "cn");
        NumberFormat nf_us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf_india = NumberFormat.getCurrencyInstance(in_locale);
        NumberFormat nf_china = NumberFormat.getCurrencyInstance(cn_locale);
        NumberFormat nf_france = NumberFormat.getCurrencyInstance(fr_locale);
        
        
        
        String us = nf_us.format(payment);
        String india = nf_india.format(payment);
        String china = nf_china.format(payment);
        String france = nf_france.format(payment);
 
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
