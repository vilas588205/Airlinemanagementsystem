package Oopstaskfly;

public class Airline {
	private Flight[] flights;
    private Passenger[] passengers;
    private int flightcount;
    private int passengercount;

    public Airline() {
        this.flights = new Flight[90]; // Assuming the airline can manage up to 100 flights
        this.passengers = new Passenger[90]; // Assuming the airline can manage up to 100 passengers
        this.flightcount = 0;
        this.passengercount = 0;
    }

    public void addFlight(Flight flight) {
        if (flightcount < 90) {
            flights[flightcount++] = flight;
        } else {
            System.out.println("Cannot add more flights.");
        }
    }

    public void removeFlight(String flightnumber) {
        for (int i = 0; i < flightcount; i++) {
            if (flights[i].getflightnumber().equals(flightnumber)) {
                flights[i] = flights[--flightcount];
                flights[flightcount] = null;
                break;
            }
        }
    }

    public void registerPassenger(Passenger passenger) {
        if (passengercount < 90) {
            passengers[passengercount++] = passenger;
        } else {
            System.out.println("Cannot register more passengers.");
        }
    }

    public void unregisterPassenger(String passportnumber) {
        for (int i = 0; i < passengercount; i++) {
            if (passengers[i].getpassportnumber().equals(passportnumber)) {
                passengers[i] = passengers[--passengercount];
                passengers[passengercount] = null;
                break;
            }
        }
    }

    public void bookFlight(String passportnumber, String flightnumber) {
        Passenger passenger = findPassenger(passportnumber);
        Flight flight = findFlight(flightnumber);
        if (passenger != null && flight != null && flight.isAvailable()) {
            passenger.bookflight(flight);
        } else {
            System.out.println("Booking failed.");
        }
    }

    public void cancelbooking(String passportnumber, String flightnumber) {
        Passenger passenger = findPassenger(passportnumber);
        Flight flight = findFlight(flightnumber);
        if (passenger != null && flight != null) {
            passenger.cancelbooking(flight);
        } else {
            System.out.println("Cancellation failed.");
        }
    }

    public void listAvailableflights() {
        for (int i = 0; i < flightcount; i++) {
            if (flights[i].isAvailable()) {
                System.out.println(flights[i]);
            }
        }
    }

    public void listBookedFlights() {
        for (int i = 0; i < flightcount; i++) {
            if (!flights[i].isAvailable()) {
                System.out.println(flights[i]);
            }
        }
    }

    private Passenger findPassenger(String passportnumber) {
        for (int i = 0; i < passengercount; i++) {
            if (passengers[i].getpassportnumber().equals(passportnumber)) {
                return passengers[i];
            }
        }
        return null;
    }

    private Flight findFlight(String flightnumber) {
        for (int i = 0; i < flightcount; i++) {
            if (flights[i].getflightnumber().equals(flightnumber)) {
                return flights[i];
            }
        }
        return null;
    }

	public static void main(String[] args) {
		
	}

}
