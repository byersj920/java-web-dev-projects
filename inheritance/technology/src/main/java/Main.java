public class Main {
    public static void main(String[] args) {
        Laptop thx = new Laptop(16, 399.99, "home");
        Computer homeComputer = new Computer(16, 899.99);
        thx.powerButton();
        System.out.println(thx.getIsOn());
    }
}
