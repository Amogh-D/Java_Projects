package TaxiBooking;

public class TaxiBooking {
    private int id;
    private int miles;

    public TaxiBooking( int id, int miles) {
        this.id = id;
        this.miles = miles;
    }

    public double calculateFare() {
        return miles * 1.5;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getKilometers() {
        return miles;
    }
    public void setKilometers(int kilometers) {
        this.miles = kilometers;
    }

    @Override
    public String toString() {
        return "Booking id: " + id + " | Kilometers: " + miles + " | Total Fare: $" + calculateFare();
    }
}

