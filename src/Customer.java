
import java.text.DecimalFormat;


public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String yardType;
    private double length;
    private double width;
    private double totalCost;
    
    
    //constructors
    public Customer() {
        customerID = 0;
        name = "no name";
        address = "no address";
        yardType = "no type";
        length = 0.0;
        width = 0.0;
        totalCost = 0.0;      
    }
    
    public Customer(int customerID, String name, String address, String yardType, double length, double width, double totalCost) {
        setCustomerID(customerID);
        setName(name);
        setAddress(address);
        setYardType(yardType);
        setLength(length);
        setWidth(width);
        setTotalCost(totalCost);
    }
    
    //setters and getters
    
    public void setCustomerID(int newCusID) {
        if (newCusID > 99)
            this.customerID = newCusID;
        else
            this.customerID = 0;
    }
    
    public void setName(String newName) {
        if (newName.length() > 0)
            this.name = newName;
        else
            this.name = "no name";
    }
    
    public void setAddress(String newAddress) {
        if (newAddress.length() > 0)
            this.address = newAddress;
        else
            this.address = "no address";
    }
    
    public void setYardType(String newYardType) {
        if (newYardType.length() > 0)
            this.yardType = newYardType;
        else
            this.yardType = "no type";
    }
    
    public void setLength(double newLength) {
        if (newLength > 0.0)
            this.length = newLength;
        else
            this.length = 0.0;                    
    }
    
    public void setWidth(double newWidth) {
        if (newWidth > 0.0)
            this.width = newWidth;
        else
            this.width = 0.0;
    }
    
    public void setTotalCost(double newCost) {
        if (newCost > 0.0)
            this.totalCost = newCost;
        else
            this.totalCost = 0.0;
    }
    
    public int getCustomerID() {
        return customerID;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getYardType() {
        return yardType;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getTotalCost() {
        return totalCost;
    }
    
    //methods
    @Override
    public String toString() {
        return name; //shows customers name
    }
    
    public String getDetails() {
        DecimalFormat fmt = new DecimalFormat( "$#,##0.00" );
        String output = name + "\n";
        output += address + "\n";
        output += "Type: " + yardType + "\n";
        output += "Width: " + width + "\n";
        output += "Length: " + length + "\n";
        output += "Total Cost: " + fmt.format(totalCost); //currency

        return output;

    }
}
