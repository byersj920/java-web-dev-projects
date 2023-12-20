public class Laptop extends Computer{
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String laptopLocation(){
        return String.format("Your laptop is currently at: %s", getLocation());
    }
    public Laptop(int gigsOfRam, double price, String location){
        super(gigsOfRam, price);
        this.location = location;
    }
}
