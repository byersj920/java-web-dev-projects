package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void printMenuDate(){
        System.out.println(this.lastUpdated);
    }

    public void addItem(MenuItem newItem){
        this.lastUpdated = new Date();
        this.items.add(newItem);
    }

    public void printItem(MenuItem searchItem){
        int itemLocation = this.items.indexOf(searchItem);
        System.out.println(this.items.get(itemLocation).toString());
    }
    public void printMenu(){
        System.out.println("********* Full Menu *********");
        for (MenuItem item: items){
            System.out.println(item.toString());
        }
    }


}


