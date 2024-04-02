package edu.miu.cs.cs425;

import java.time.LocalDate;
import java.util.List;

import edu.miu.cs.cs425.model.Customer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World of Maven!" );
        var customers = List.of(
            new Customer(1, "Ana Smith", LocalDate.of(1987, 12, 24)),
            new Customer(2, "Bob Jones", LocalDate.of(1942, 6, 17)),
            new Customer(3, "Christian Bale", LocalDate.of(1974, 1, 30))
        );
        customers.forEach(System.out::println);
    }
}
