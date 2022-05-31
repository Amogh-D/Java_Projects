package TaxiBooking;
import java.util.ArrayList;

public class Customer {
    private String customerName;
    private String phone;
    private String address;
    private ArrayList<TaxiBooking> list=new ArrayList<>();

    public Customer(String customerName, String phone, String address) {
        this.customerName = customerName;
        this.phone = phone;
        this.address = address;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<TaxiBooking> getList() {
        return list;
    }
    public void setList(ArrayList<TaxiBooking> list) {
        this.list = list;
    }
    @Override
    public String toString() {
        return "Name: " + customerName.toUpperCase() + " | Phone: " + phone + " | Pickup Address: " + address + "\n" + list;
    }
}