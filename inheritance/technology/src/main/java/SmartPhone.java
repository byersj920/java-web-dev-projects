public class SmartPhone extends Computer{
    private boolean isBlueToothOn = false;

    public boolean isBlueToothOn() {return isBlueToothOn;}

    public void blueToothButton(){isBlueToothOn = !isBlueToothOn;}
    public SmartPhone(int gigsOfRam, double price){
        super(gigsOfRam, price);
    }
}
