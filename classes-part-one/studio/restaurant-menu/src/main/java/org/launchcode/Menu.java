package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public Menu(Date dateUpdated, String restName, ArrayList<MenuItem> itemList) {
        this.dateUpdated = dateUpdated;
        this.restName = restName;
        this.itemList = itemList;
    }

    Date dateUpdated = new Date();
    String restName;
    ArrayList<MenuItem> itemList;
}
