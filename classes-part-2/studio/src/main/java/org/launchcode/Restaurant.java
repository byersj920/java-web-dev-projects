package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
    MenuItem spaghetti = new MenuItem("Spaghetti", 13.99, "Spaghetti and Meatballs. What's not to love?", "Entree",
            false);
    MenuItem salad = new MenuItem("Salad", 7.99, "A bunch of leaves in a bowl. Perfect for bunnies.",
            "Appetizer", true);

    Date firstDate = new Date();
    ArrayList<MenuItem> foodList = new ArrayList<>();

    Menu JonathansPastaHole = new Menu(firstDate, foodList);

    JonathansPastaHole.printMenuDate();
    JonathansPastaHole.addItem(spaghetti);
    JonathansPastaHole.addItem(salad);
    JonathansPastaHole.printItem(spaghetti);
    JonathansPastaHole.printMenu();
    JonathansPastaHole.printMenuDate();
    }
}
