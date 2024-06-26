package Oopstaskfly;

public class Flight {
	private String flightnumber;
    private String origin;
    private String destination;
    private String departuretime;
    private String arrivaltime;
    private boolean isavailable;

    public Flight(String flightnumber, String origin, String destination, String departuretime, String arrivaltime) {
        this.flightnumber = flightnumber;
        this.origin = origin;
        this.destination = destination;
        this.departuretime = departuretime;
        this.arrivaltime = arrivaltime;
        this.isavailable = true;
    }

    public String getflightnumber() {
        return flightnumber;
    }

    public void setFlightNumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getorigin() {
        return origin;
    }

    public void setorigin(String origin) {
        this.origin = origin;
    }

    public String getdestination() {
        return destination;
    }

    public void setdestination(String destination) {
        this.destination = destination;
    }

    public String getdeparturetime() {
        return departuretime;
    }

    public void setdeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public String getarrivaltime() {
        return arrivaltime;
    }

    public void setarrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public boolean isAvailable() {
        return isavailable;
    }

    public void setavailable(boolean available) {
        isavailable = available;
    }

    public void bookflight() {
        this.isavailable = false;
    }

    public void cancelbooking() {
        this.isavailable = true;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightnumber + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departuretime + '\'' +
                ", arrivalTime='" + arrivaltime + '\'' +
                ", isAvailable=" + isavailable +
                '}';
    }
	public static void main(String[] args) {
		
	}

}
