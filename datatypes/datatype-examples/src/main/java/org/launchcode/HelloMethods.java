package org.launchcode;

public class HelloMethods {

    public static void main(String[] args) {
        /*String message = Message.getMessage("fr");
        System.out.println(message);*/

        StaticMouse m = new StaticMouse();
        System.out.println(m.weight);
        m.weight = 95;
        System.out.println(m.weight);

        m.squeak();
    }

}