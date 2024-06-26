package Oopstaskfly;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		       
		        Flight flight1 = new Flight("FL5555", " delhi", "vilas", "07:00", "10:00");
		      
		        Flight flight2 = new Flight("FL8968", "noyda", "ganesh", "08:00", "11:00");

		       
		        Passenger passenger1 = new Passenger("dhiraj", "P123765");
		        Passenger passenger2 = new Passenger("neha", "P654654");

		       
		        Airline airline = new Airline();

		        
		        airline.addFlight(flight1);
		        airline.addFlight(flight2);

		       
		        airline.registerPassenger(passenger1);
		        airline.registerPassenger(passenger2);

		       
		        airline.bookFlight("P123765", "FL555");
		        airline.bookFlight("P654654", "FL8968");

		        
		        airline.listAvailableflights();
		        airline.listBookedFlights();

		       
		        airline.cancelbooking("P123765", "FL555");

		       
		        airline.listAvailableflights();
		        airline.listBookedFlights();

		        // String manipulation tests
		        System.out.println(Stringutility.countoccurrences("my self vilas", 'l'));
		        System.out.println(Stringutility.reverseString("vilas"));
		        System.out.println(Stringutility.isPalindrome("dhiraj"));
		        System.out.println(Stringutility.capitalizeWords("hello world"));

		        // Wrapper class operations tests
		        Integer[] numbers = {10, 20, 30, 40, 50};
		        System.out.println(Wrapperutility.findMax(numbers));
		        Double[] doubleNumbers = {10.0, 20.0, 30.0, 40.0, 50.0};
		        System.out.println(Wrapperutility.calculateAverage(doubleNumbers));
		        System.out.println(Wrapperutility.convertToBinaryString(new Boolean[]{true, false, true}));
		        System.out.println(Arrays.toString(Wrapperutility.convertToBooleanArray("1101")));
		    }
		


	}


