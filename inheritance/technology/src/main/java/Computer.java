public class Computer {
    //properties
    private int gigsOfRam;
    private double price;
    private boolean isOn = false;

    //methods
    public void powerButton (){
        isOn = !isOn;
    }

    //constructor
    public Computer (int gigsOfRam, double price){
        this.gigsOfRam = gigsOfRam;
        this.price = price;
    }

    //getters and setters
    public int getGigsOfRam() {
        return gigsOfRam;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setGigsOfRam(int gigsOfRam) {
        this.gigsOfRam = gigsOfRam;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean getIsOn(){return isOn;}
}
