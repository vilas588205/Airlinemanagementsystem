package Oopstaskfly;

public class Passenger {
	private String name;
    private String passportnumber;
    private Flight[] bookedflights;
    private int bookedflightcount;

    public Passenger(String name, String passportnumber) {
        this.name = name;
        this.passportnumber = passportnumber;
        this.bookedflights = new Flight[9]; 
        this.bookedflightcount = 0;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getpassportnumber() {
        return passportnumber;
    }

    public void setpassportnumber(String passportnumber) {
        this.passportnumber = passportnumber;
    }

    public Flight[] getbookedflights() {
        return bookedflights;
    }

    public int getBookedflightcount() {
        return bookedflightcount;
    }

    public void bookflight(Flight flight) {
        if (bookedflightcount < 9) {
        	bookedflights[bookedflightcount++] = flight;
            flight.bookflight();
        } else {
            System.out.println("i have booked 9 flight"	+ "]"+ ".");
        }
    }

    public void cancelbooking(Flight flight) {
        for (int i = 0; i < bookedflightcount; i++) {
            if (bookedflights[i].equals(flight)) {
            	bookedflights[i].cancelbooking();
            	bookedflights[i] = bookedflights[--bookedflightcount];
            	bookedflights[bookedflightcount] = null;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", passportnumber='" + passportnumber + '\'' +
                ", bookedflightcount=" + bookedflightcount +
                '}';
    }

	public static void main(String[] args) {
		

	}

}
