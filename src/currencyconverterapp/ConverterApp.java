
package currencyconverterapp;

import static currencyconverterapp.CurrencyConvertorTestConsole.CURRENCIES;
import static currencyconverterapp.CurrencyConvertorTestConsole.convert;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ConverterApp {
    

    
    public static void main(String[] args) {
         MainMenuClass.run();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Available Currencies:");
//        for (int i = 0; i < CURRENCIES.length; i++) {
//            System.out.print(CURRENCIES[i] + " ");
//            // Print a new line after every 10th currency
//            if ((i + 1) % 10 == 0) {
//                System.out.println();
//            }
//        }
//        System.out.println("\n");
//
//        System.out.print("Enter amount to convert: ");
//        double amount = scanner.nextDouble();
//
//        System.out.print("Enter currency to convert from (e.g., USD): ");
//        String fromCurrency = scanner.next().toUpperCase();
//
//        System.out.print("Enter currency to convert to (e.g., EUR): ");
//        String toCurrency = scanner.next().toUpperCase();
//
//        try {
//            double result = convert(amount, fromCurrency, toCurrency);
//            System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, result, toCurrency);
//        } catch (IOException e) {
//            System.err.println("Error while converting: " + e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.err.println("Invalid currency code: " + e.getMessage());
//        }
    
    } 
    
}
